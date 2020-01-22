
package Vista;
import java.awt.Image;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Ralex-Pc
 */
public class VistaBoton  extends javax.swing.JLabel implements MouseListener{
    public VistaBoton()
    {
        super();
        this.setPreferredSize(new Dimension(60,60));
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/play.png")));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.addMouseListener(this);
        
    }
    public void mousePressed(MouseEvent e)
    {
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/botonPresionado.png")));
    }
    
    public void mouseReleased(MouseEvent e)
    {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/play.png")));
    }
    
    public void mouseEntered(MouseEvent e)
    {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/playPresionado.png")));
    }
    
    public void mouseExited(MouseEvent e)
    {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/play.png")));
    }
    
    public void mouseClicked(MouseEvent e)
    {
//        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/botonPresionado.png")));
    }
    @Override
    public void setSize(int x, int y)
    {
        ImageIcon icotmp = new ImageIcon(getClass().getResource("/ico/play.png"));
        ImageIcon ico = new ImageIcon(icotmp.getImage().getScaledInstance(x, y,Image.SCALE_DEFAULT ));
        this.setIcon(ico);
    }
}
