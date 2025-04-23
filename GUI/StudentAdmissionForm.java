import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class StudentAdmissionForm extends JFrame {

    // UI Components
    private JLabel titleLabel;
    private JTextField nameField, ageField;
    private JTextArea addressArea;
    private JRadioButton male, female, other;
    private ButtonGroup genderGroup;
    private JComboBox<String> courseComboBox;
    private JButton submitButton, resetButton;
    private JPanel formPanel;
    private JLabel animatedLabel;
    private Timer timer;  // Timer for the animation

    // Constructor to set up the frame
    public StudentAdmissionForm() {
        setTitle("Student Admission Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        // Initialize and add form components.
        initUI();
    }

    // A custom border class to create rounded corners on components.
    private class RoundedBorder implements Border {
        private int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 1, this.radius + 1);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    private void initUI() {
        // Create a form panel using GridBagLayout for precise positioning.
        formPanel = new JPanel(new GridBagLayout());
        
formPanel.setBackground(new Color(255, 248, 240)); // Light Beige

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Title Label (with a bold colored theme)
        titleLabel = new JLabel("Student Admission Form");
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0, 102, 204));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        formPanel.add(titleLabel, gbc);
        gbc.gridwidth = 1;  // reset to default

        // Name label and text field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Full Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        nameField.setBorder(new RoundedBorder(10));
        formPanel.add(nameField, gbc);

        // Age label and text field
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Age:"), gbc);
        gbc.gridx = 1;
        ageField = new JTextField(5);
        ageField.setBorder(new RoundedBorder(10));
        formPanel.add(ageField, gbc);

        // Gender selection using radio buttons
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        genderPanel.setOpaque(false); // transparent background
        male = new JRadioButton("Male");
        male.setOpaque(false);
        female = new JRadioButton("Female");
        female.setOpaque(false);
        other = new JRadioButton("Other");
        other.setOpaque(false);
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        formPanel.add(genderPanel, gbc);

        // Course selection using a combo box
        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(new JLabel("Course:"), gbc);
        gbc.gridx = 1;
        String[] courses = {"Computer Science", "Chemistry", "Physics", "Mathematics", "Biology", "Literature"};
        courseComboBox = new JComboBox<>(courses);
        courseComboBox.setBackground(new Color(224, 255, 255));
        formPanel.add(courseComboBox, gbc);

        // Address label and text area (inside a scroll pane)
        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(new JLabel("Address:"), gbc);
        gbc.gridx = 1;
        addressArea = new JTextArea(3, 20);
        addressArea.setLineWrap(true);
        addressArea.setBorder(new RoundedBorder(10));
        JScrollPane scrollPane = new JScrollPane(addressArea);
        formPanel.add(scrollPane, gbc);

        // Submit and Reset buttons panel
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        // Applying a theme to buttons with custom backgrounds and rounded borders
        submitButton.setBackground(new Color(0, 153, 0));
        submitButton.setForeground(Color.white);
        submitButton.setBorder(new RoundedBorder(15));
        resetButton.setBackground(new Color(204, 0, 0));
        resetButton.setForeground(Color.white);
        resetButton.setBorder(new RoundedBorder(15));
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);
        formPanel.add(buttonPanel, gbc);

        add(formPanel, BorderLayout.CENTER);

        // A bottom label to greet users—with a simple animation that cycles the text color.
        animatedLabel = new JLabel("Welcome to our college admission portal!", JLabel.CENTER);
        animatedLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        add(animatedLabel, BorderLayout.SOUTH);

        // Timer to cycle the hue of the animatedLabel for a dynamic color-changing effect.
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float hue = (float) ((System.currentTimeMillis() % 10000L) / 10000.0);
                animatedLabel.setForeground(Color.getHSBColor(hue, 0.7f, 0.8f));
            }
        });
        timer.start();

        // Action handling for the Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String age = ageField.getText().trim();
                String gender = male.isSelected() ? "Male" :
                                (female.isSelected() ? "Female" : (other.isSelected() ? "Other" : "Not selected"));
                String course = (String) courseComboBox.getSelectedItem();
                String address = addressArea.getText().trim();

                String message = "Full Name: " + name +
                                 "\nAge: " + age +
                                 "\nGender: " + gender +
                                 "\nCourse: " + course +
                                 "\nAddress: " + address;
                JOptionPane.showMessageDialog(null, message, "Submission Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Action handling for the Reset button to clear all fields.
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
                genderGroup.clearSelection();
                courseComboBox.setSelectedIndex(0);
                addressArea.setText("");
            }
        });
    }

    public static void main(String[] args) {
        // Use the system look and feel for a native appearance.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StudentAdmissionForm form = new StudentAdmissionForm();
                form.setVisible(true);
            }
        });
    }
}




