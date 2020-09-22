package lab5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Var3 {
    private int quantity = 8, c = 0;
    private JLabel animationDisplayLabel = new JLabel();
    private Timer animationTimer;
    protected ImageIcon[] images = new ImageIcon[quantity];

    public Var3() {
        for (int t = 0; t < quantity; t++)
            images[t] = new ImageIcon(this.getClass().getResource("/imgs/image_part_00" + (t+1) + ".jpg"));
        startAnimation();
    }

    public void startAnimation() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = (c + 1) % quantity;
                animationDisplayLabel.setIcon(images[c]);
            }
        };
        animationDisplayLabel.setIcon(images[0]);
        animationTimer = new Timer(50, listener);
        animationTimer.start();
    }

    public JComponent getAnimationComponent() {
        return animationDisplayLabel;
    }

    public static void main(String[] args) {
        Runnable go = new Runnable() {
            @Override
            public void run() {
                Var3 v3 = new Var3();
                JFrame jf = new JFrame("Lynx");
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.add(v3.getAnimationComponent());
                jf.pack();
                jf.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(go);
    }
}