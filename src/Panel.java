import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    private Timer timer;
    private int n = 0, c = 9;
    private double angle = 137 + Math.random();
    JSlider slider;
    Panel() {
        System.out.println(angle);
        this.setBackground(new Color(29, 29, 29));
        timer = new Timer(10, this);
        timer.start();
        slider = new JSlider(0, 1000, 500);
        add(slider);
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        //

        //*

        //* Phyllotaxis

        //* http://algorithmicbotany.org/papers/abop/abop-ch4.pdf

        //*

        //
        for (int i = 0; i < n; i++) {
            double a = i * angle; // 137.5
            double r = c * Math.sqrt(i);
            double x = (r * Math.cos(a)) + (640 - 1.5);
            double y = (r * Math.sin(a)) + (390 - 1.5);
            g.setColor(Color.getHSBColor((float) (i * 0.0017), 1, 1));
            g.fillOval((int) x, (int) y, 3, 3);
            repaint();
        }

    }
    long timediff = System.currentTimeMillis();
    public void actionPerformed(ActionEvent e) {
        // if (n > 1) timer.stop();
        n += 1;
        /*if (slider.getValueIsAdjusting()) {
            angle =  137 + slider.getValue() / 1000;
        }*/

    }
}
