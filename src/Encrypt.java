import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 25/02/2018.
 */
public class Encrypt extends JFrame{
    private JLabel label2;
    private JLabel label3;
    private JPasswordField secretKeyTb;
    private JTextField textField1;
    private JButton encryptBtn;
    private JPanel rootPanel;

    public Encrypt() {

        setTitle("Encrypt");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setBounds(100,50,350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        encryptBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
