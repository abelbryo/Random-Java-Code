import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;

public class HelloWorld extends JPanel implements MouseListener{
    
    private Font font;
    private int fontSize = 8;
    static Timer timer;
    public HelloWorld(){
        addMouseListener(this);
        timer = new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(getFontSize() < 200)
                    incrementFontSize();
                 else setFontSize(10);
                repaint();
                
            }
        });
    }

    public int getFontSize(){
        return fontSize;
    }

    public void setFontSize(int size){
        fontSize = size;
    }

    public void incrementFontSize(){
        setFontSize(4 + fontSize);
    }
   


    @Override
    public void mousePressed(MouseEvent e){
        if(timer.isRunning()) timer.stop();
        else timer.start();
    }
    
    @Override
    public void mouseClicked(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}



    public static void main(String [] args){
        JFrame frame = new JFrame("Test");
        frame.getContentPane().add(new HelloWorld());
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       font = new Font("Courier", Font.BOLD, getFontSize() );
       g.setFont(font);
       g.drawString("Testing...", (int) (Math.random() * 100), getHeight() / 2);
    }

}
