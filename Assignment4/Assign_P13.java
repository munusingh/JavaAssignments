import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
class DigitalClock extends JFrame implements Runnable {
    Thread t;
    JFrame frame;
    JButton btn;
    JLabel label;

    DigitalClock() {
        t = new Thread(this);
        t.start();
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        btn = new JButton("Ok");
        btn.setBounds(50, 50, 150, 150);
        label=new JLabel();
        label.setText("Time ");
        frame.add(label);
        frame.add(btn);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {

            try {
               
                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
               
                btn.setText(LocalTime.now().format(dtf));
               
                t.sleep(1000);

            } catch (Exception e) {
            
            }
        }

    }
}

public class Assign_P13 {
    public static void main(String[] args)
    {
        new DigitalClock();
    }
}