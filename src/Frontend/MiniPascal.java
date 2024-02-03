package Frontend;

import javax.swing.*;

public class MiniPascal extends JFrame {
    private JPanel MainPanel;
    private JTextField NameCompilador;
    private JButton button1;
    private JButton button2;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public MiniPascal ()
    {
        setContentPane(MainPanel);
        setTitle("Mini Pascal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new MiniPascal();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
