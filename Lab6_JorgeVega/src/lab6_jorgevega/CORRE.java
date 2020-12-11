/*
Agregado libre a mi lab 6......debilidad, Hilos " Ojala me vaya bien en el examen :( "
 */
package Lab6_JorgeVega;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
Jorge Vega
 */
public class CORRE extends Thread {
    private JLabel eti;
    private PANTALLA_JUEGO p; 
    
    public CORRE(JLabel eti, PANTALLA_JUEGO p){
        this.eti=eti;
        this.p=p;
    }
    
    
    
    
    @Override
    public void run(){
        int c1=0, c2=0, c3=0;
        while (true) {
                try {
                    sleep((int)(Math.random()*1000));
                } catch (InterruptedException ex) {
                    Logger.getLogger(CORRE.class.getName()).log(Level.SEVERE, null, ex);
                }
                c1=p.getlbl1().getLocation().x;
                c2=p.getlbl2().getLocation().x;
                c3=p.getlbl3().getLocation().x;
                if(c1<p.getlbl_barrera().getLocation().x-10&&c2<p.getlbl_barrera().getLocation().x-10&&c3<p.getlbl_barrera().getLocation().x-10){
                    
                    
                    
                    
                    
                    
                    
                    
                    eti.setLocation(eti.getLocation().x+10,eti.getLocation().y);
                    p.repaint();
            }else
            {
                    break;
                    }
        }
        if (eti.getLocation().x>=p.getlbl_barrera().getLocation().x-10){
            if(c1>c2&&c1>c3){
              JOptionPane.showMessageDialog(null, "GANO EL REY DE DINOCO....Tienes talento Hij@!!!");
            }else if(c2>c1&&c2>c3){
                JOptionPane.showMessageDialog(null, "GANO EL RAYO MAQUEEN....KUCHAOOOOO!!!");
            }else if(c3>c1&&c3>c2){
                JOptionPane.showMessageDialog(null, "\"GANO CHIP....Buuuuuuuuuuuu!!!\"");
            }else{
                
                JOptionPane.showMessageDialog(null, "Empate");
            }
            
        }
}
}