import javax.swing.*;

public class simpleUI {
    //Declaring Variables
    private static JFrame jf = new JFrame("New App");
    private static JPanel jp = new JPanel();
    //private static JTextField text = new JTextField("random Text");
    //private static JButton button = new JButton("Click me");

    //main Method
    public static void main(String[] args) {

        options();
        Init();

    }

    private static void Init() {
        jf.add(jp);
    }

    private static void options() {
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 400);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);

        jf.setVisible(true);
    }
}
