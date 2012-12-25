import java.awt.Dimension; 
import java.awt.Rectangle; 
import java.awt.Robot; 
import java.awt.Toolkit; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
import java.io.File; 

public class ScreenShot implements Runnable{

    public static void main(String [] args){
        Thread thread = new Thread(new ScreenShot());
        thread.start();
    }

    public void run() {
        try {
            captureScreen("ScreenCaptureFromJava"); 
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void captureScreen(String filename) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot(); 
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "png", new File(filename));

    }


}
