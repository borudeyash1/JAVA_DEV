import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginFrame extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnGoToSignUp;

    public LoginFrame() {
        // Set up the frame
        setTitle("Student Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel using GridLayout for neat alignment
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

        // Login button
        btnLogin = new JButton("Login");
        panel.add(btnLogin);

        // Button to switch to the SignUp window
        btnGoToSignUp = new JButton("Sign Up");
        panel.add(btnGoToSignUp);

        add(panel);

        // Action listener for the login button
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        // Navigate to the sign-up page
        btnGoToSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();  // close the login window
                new SignUpFrame().setVisible(true);
          }
        });
    }

    // The login method: checks if the username and password exist in the DB    
    private void login() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DBUtil.getConnection()) {
            String sql = "SELECT * FROM students WHERE username = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Login successful
                JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Login unsuccessful
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            // Error handling for database connection issues
            JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
