package newpackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TestProgress {

    public static void main(String[] args) {


        final JOptionPane msg = new JOptionPane("Database Already Exist. Do you want to continue...?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
        final JDialog dlg = msg.createDialog("Select Yes or No");
        dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dlg.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e);
                final Timer t = new Timer(5000,new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dlg.setVisible(false);
                    }
                });
                t.start();
                t.stop();
            }
        });
        dlg.setVisible(true);
        System.out.println("Outside code.");
        
    }

}  