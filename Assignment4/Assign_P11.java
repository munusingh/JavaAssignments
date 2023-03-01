import java.applet.*;
import java.awt.*;
public class Assign_P11 extends Applet implements Runnable {
 int x = 80;
 int y = 80;
 int height = 150;
 int width = 150;
 public void init() {
 Thread t = new Thread(this); // Thread creation for animation
 t.start();
 }
 public void paint(Graphics g) {
 g.setColor(Color.RED);
 g.fillOval(80, 80, 150,150);
 }
 public void run() {
 while (true) {
 try {
 repaint();
 Thread.sleep(500);
 if (x < 1500) {
 x += 5;
 }
 } catch (Exception e) {
 }
 }
 }
}
