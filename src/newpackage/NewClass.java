package newpackage;

import java.awt.FlowLayout;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class NewClass extends JFrame{
public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.setVisible(true);
    final DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
    frame.add(new javax.swing.JProgressBar(model));
    Thread t = new Thread(new Runnable() {
        public void run() {
            int i = 1;
            model.setMinimum(0);
            model.setMaximum(100);
            try {
                while (i <= 100 || true) {
                    model.setValue(i);
                    i++;
                    Thread.sleep(50);
                }
            } catch (InterruptedException ex) {
                model.setValue(model.getMaximum());
            }
        }
    });
    t.start();

    Thread.sleep(2000);

    t.interrupt();
}
}