import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Decrypt extends JFrame {
    private JPanel rootPanel;
    private JTextField textField1;
    private JButton importButton;
    private JButton decryptButton;
    private JPasswordField secretKeyTb;
    private FileDialog dialog;
    private SystemIO rw = new SystemIO();
    private Substitution sub = new Substitution();
    private Permutation perm = new Permutation();

    public Decrypt() {

        setTitle("Decypt");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setBounds(100,50,400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        importButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog = new FileDialog((Frame)null, "Select a file to decrypt");
                dialog.setMode(FileDialog.LOAD);
                dialog.setVisible(true);
                String file = dialog.getFile();
                textField1.setText(file);
            }
        });
        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = rw.readFromFile(textField1.getText());
                System.out.println(message);
                String decPerm = perm.decryptWithPerm(message, secretKeyTb.getText());
                System.out.println(decPerm);
                if(decPerm.equals("Invalid secret key")){
                    JOptionPane.showMessageDialog(null,decPerm);
                }
                else{
                    String decSub = sub.decryptwithSub(decPerm,secretKeyTb.getText());

                    rw.saveToFile(decSub,"decrypted.txt");
                    JOptionPane.showMessageDialog(null,"Message decrypted succesfully");
                }

            }
        });
    }
}
