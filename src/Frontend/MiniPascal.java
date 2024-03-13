package Frontend;

import javax.swing.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.antlr.v4.runtime.CharStreams.fromString;
import Pascal.pascalLexer;
import Pascal.pascalParser;


public class MiniPascal extends JFrame {
    private JPanel MainPanel;
    private JTextField NameCompilador;
    private JButton Clear;
    private JButton Run;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JScrollPane Panel2;
    private JScrollPane Panel1;

    public MiniPascal ()
    {
        setContentPane(MainPanel);
        setTitle("Mini Pascal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);

        Run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea1.getText();
                CharStream CS = fromString(texto);
                pascalLexer ps = new pascalLexer(CS);
                CommonTokenStream token = new CommonTokenStream(ps);
                pascalParser pp = new pascalParser(token);
                CustomErrorListener errorListener = new CustomErrorListener();
                pp.addErrorListener(errorListener);
                ParseTree tree = pp.main();


                List<String> errores = errorListener.getErrores();
                if(errores.isEmpty())
                {
                    textArea2.setText("");
                    textArea2.setForeground(Color.green);
                    textArea2.setText("Codigo Correcto!");
                }else
                {
                    textArea2.setText("");
                    textArea2.setForeground(Color.red);
                    for (String error : errores) {

                        System.out.println(error);
                        textArea2.append(error+"a\n");
                    }
                }


                System.out.println(tree.toStringTree(pp));


            }
        });
    }

    public static void main(String[] args)
    {
        new MiniPascal();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

class CustomErrorListener extends BaseErrorListener {
    private List<String> errores = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errores.add("Error en línea " + line + ":" + charPositionInLine + " - " + msg);
    }

    public List<String> getErrores() {
        return errores;
    }
}
