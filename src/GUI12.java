import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class GUI12 {
    static int sizeX=0,sizeY=0;
    public static void main(String[] args) throws IOException {
        String[] options = {"800*600", "1024*768", "1200*600", "1280*1024", "1680*1050", "1920*1080"};
        ImageIcon icon = new ImageIcon("src/Son.ico");
        String size = (String) JOptionPane.showInputDialog(null, "Выберите разрешение :", "Разрешение экрана", JOptionPane.QUESTION_MESSAGE, icon,options, options[0]);
        switch (size){
            case ("800*600"):
                sizeX=800;
                sizeY=600;
                break;
            case ("1024*768"):
                sizeX=1024;
                sizeY=768;
                break;
            case ("1200*600"):
                sizeX=1200;
                sizeY=600;
                break;
            case ("1280*1024"):
                sizeX=1280;
                sizeY=1024;
                break;
            case ("1680*1050"):
                sizeX=1680;
                sizeY=1050;
                break;
            case ("1920*1080"):
                sizeX=1920;
                sizeY=1080;
                break;
        }


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("кино");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - sizeX / 2, dim.height / 2 - sizeY / 2, sizeX, sizeY);
        frame.setVisible(true);

    }
}
