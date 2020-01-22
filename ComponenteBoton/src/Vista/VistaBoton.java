
package Vista;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VistaBoton extends javax.swing.JLabel  implements MouseListener{
 List<ImageIcon> imagenes,imagenesPoner;
    
 
    public VistaBoton()        
    {
        super();
        this.setPreferredSize(new Dimension(60,60));
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/boton.png")));
        this.setCursor(new Cursor((Cursor.HAND_CURSOR)));
        this.addMouseListener(this);
        imagenes = new ArrayList<>();
        imagenes.add(new ImageIcon(getClass().getResource("/ico/boton.png")));
        imagenes.add  (new ImageIcon(getClass().getResource( "/ico/botonEntra.png")));
        imagenes.add(new ImageIcon(getClass().getResource( "/ico/botonPresionado.png")));
        imagenesPoner = imagenes;
        
    }
    
 @Override
    public void mousePressed (MouseEvent e)
    {
       
       this.setIcon(imagenesPoner.get(1));
       this.repaint();
       
    }
 @Override
    public void mouseReleased (MouseEvent e)
    {
        this.setIcon(imagenesPoner.get(1));
    }
    
 @Override
    public void mouseEntered (MouseEvent e)
    {
        this.setIcon(imagenesPoner.get(2));
    }
    
 @Override
    public void mouseExited (MouseEvent e)
    {
        this.setIcon(imagenesPoner.get(0));
    }

    
 @Override
    public void mouseClicked(MouseEvent e) {
      this.setIcon(imagenesPoner.get(1));  
    }
    
    
 @Override
    public void setSize(int x, int y)
    {
        super.setSize(x, y);
        imagenes = new ArrayList<>();
        for(ImageIcon imagene : imagenes) {
              Image image = imagene.getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT);
              imagenesPoner.add(new ImageIcon(image));
              this.setIcon((Icon) image);
        }
    }

    
}
