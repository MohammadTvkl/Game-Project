import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public abstract class Hero {

    private final int Power;
    private int Health;
    private final int Speed;
    public int x_pixel, y_pixel;
    private Image bg;
    private JProgressBar bar;

    public Hero(int power, int health, int speed, int x, int y , String address) {
        Power = power;
        Health = health;
        Speed = speed;
        x_pixel = x;
        y_pixel = y;
        bar = new JProgressBar(0 , Health);
        bar.setValue(Health);
        bar.setSize(30 , 10);
        bar.setLocation(x_pixel , y_pixel);
        bar.setForeground(Color.GREEN);
        bg = new ImageIcon(address).getImage();
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void paint(Graphics g) {
        g.drawImage(bg , x_pixel, y_pixel, 100, 100 , null);
    }
    synchronized public int getHealth() {
        return Health;
    }

    synchronized public void setHealth(int health) {
        Health = health;
    }

    public int getX() {
        return x_pixel;
    }

    public int getY() {
        return y_pixel;
    }
}