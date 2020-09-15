package pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame {
    private JButton MilanB=new JButton("Milan");
    private JButton MadridB=new JButton("Real Madrid");
    private JLabel res=new JLabel("Result: 0 - 0");
    private JLabel scorer=new JLabel("Last Scorer: N/A");
    private JLabel winner =new JLabel("Winner");
    public Football()  {
        final int[] x = {0}; final int[] y = {0};
        setSize(new Dimension(800, 400));
        MilanB.setBounds(80,150,300,70);
        MadridB.setBounds(420,150,300,70);
        res.setBounds(100,100,200,80);
        scorer.setBounds(550,100,200,80);
        winner.setBounds(380,50,200,80);
        MilanB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x[0]++;
                scorer.setText("Last Scorer: Milan");
                if (x[0] > y[0]) {
                    winner.setText("Winner: Milan");
                }
                if (x[0] < y[0]) {
                    winner.setText("Winner: Real Madrid");
                }
                if (x[0] == y[0]) {
                    winner.setText("Draw");
                }
                res.setText("Result: " + x[0] + " - " + y[0]);
            }
        });
        MadridB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                y[0]++;
                scorer.setText("Last Scorer: Real Madrid");
                if (x[0] > y[0]) {
                    winner.setText("Winner: Milan");
                }
                if (x[0] < y[0]) {
                    winner.setText("Winner: Real Madrid");
                }
                if (x[0] == y[0]) {
                    winner.setText("Draw");
                }
                res.setText("Result: " + x[0] + " - " + y[0]);
            }
        });
        setLayout(null);
        this.getContentPane().add(MilanB);
        this.getContentPane().add(MadridB);
        this.getContentPane().add(res);
        this.getContentPane().add(scorer);
        this.getContentPane().add(winner);
    }
    public static void main(String[] args) {
        new Football().setVisible(true);
    }
}