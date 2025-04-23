import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class SignUpFrame extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnSignUp;
    private JButton btnGoToLogin;

    public SignUpFrame() {
        // Set up the frame
        setTitle("Student Sign Up");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel for input fields
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Username field
        panel.add(new JLabel("Username:"));
        txtUsername = new JTextField();
        panel.add(txtUsername);

        // Password field
        panel.add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        panel.add(txtPassword);

        // Sign Up button
        btnSignUp = new JButton("Sign Up");
        panel.add(btnSignUp);

        // Button to navigate back to the login window
        btnGoToLogin = new JButton("Go to Login");
        panel.add(btnGoToLogin);

        add(panel);

        // Action listener for sign-up
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signUp();
            }
        });

        // Navigate back to the login page
        btnGoToLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the signup window
                new LoginFrame().setVisible(true);
            }
        });
    }
  // The signUp method: registers a new student in the DB
    private void signUp() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DBUtil.getConnection()) {
            // First, check if the username already exists
            String checkSql = "SELECT * FROM students WHERE username = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Username already exists. Please choose another.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Insert new student record
            String sql = "INSERT INTO students (username, password) VALUES (?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Clear the fields after successful registration
                txtUsername.setText("");
                txtPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            // Handle potential DB errors gracefully
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
