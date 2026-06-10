import java.sql.*;
import javax.swing.JOptionPane;

public class TaskDAO {

    // Add a new task
    public boolean addTask(Task task) {
        String query = "INSERT INTO tasks (task_id, task_title, status) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, task.getTaskId());
            stmt.setString(2, task.getTaskTitle());
            stmt.setString(3, task.getStatus());
            
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            // Check if error is due to a duplicate Primary Key
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "Task ID already exists!", "Database Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }
    }

    // Search for a task by ID
    public Task searchTask(int taskId) {
        String query = "SELECT * FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, taskId);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                return new Task(
                    rs.getInt("task_id"),
                    rs.getString("task_title"),
                    rs.getString("status")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    // Update an existing task
    public boolean updateTask(Task task) {
        String query = "UPDATE tasks SET task_title = ?, status = ? WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, task.getTaskTitle());
            stmt.setString(2, task.getStatus());
            stmt.setInt(3, task.getTaskId());
            
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Delete a task
    public boolean deleteTask(int taskId) {
        String query = "DELETE FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, taskId);
            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}