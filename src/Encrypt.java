import javax.swing.*;
import javax.swing.plaf.FileChooserUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
    private JButton importBtn;
    private FileDialog dialog;
    private SystemIO rw = new SystemIO();
    private Substitution sub = new Substitution();
    private Permutation perm = new Permutation();


    public Encrypt() {

        setTitle("Encrypt");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setBounds(100,50,400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        encryptBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String message = rw.readFromFile(textField1.getText());
                System.out.println(message);
                String encSub = sub.encryptWithSub(message,secretKeyTb.getText());
                String encPerm = perm.encryptWithPerm(encSub, secretKeyTb.getText());
                rw.saveToFile(encPerm,"encrypted.txt");
                JOptionPane.showMessageDialog(null,"Message encrypted succesfully");

            }
        });
        importBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog = new FileDialog((Frame)null, "Select a file to encrypt");
                dialog.setMode(FileDialog.LOAD);
                dialog.setVisible(true);
                String file = dialog.getFile();
                textField1.setText(file);
            }
        });
    }
}
