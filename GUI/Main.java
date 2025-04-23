import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new LoginFrame().setVisible(true);  // Show the login window on startup
            }
        });
    }
}
