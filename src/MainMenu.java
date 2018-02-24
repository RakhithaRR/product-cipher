import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 25/02/2018.
 */
public class MainMenu extends JFrame{
    private JButton encryptBtn;
    private JButton decryptBtn;
    private JLabel label1;
    private JPanel rootPanel;

    public MainMenu() {
        setTitle("Product Cipher");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setBounds(100,50,350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        encryptBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Encrypt encr = new Encrypt();
            }
        });
    }
}
