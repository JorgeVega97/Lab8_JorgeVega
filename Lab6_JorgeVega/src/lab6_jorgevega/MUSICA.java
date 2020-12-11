/*
Este me lo investigue porque no sabia como reproducir musica
 */
package Lab6_JorgeVega;

import java.io.File;

/**
Jorge Vega
 */
public class MUSICA {
    private String open ;
    private String play ;

    public MUSICA() {
    }

    public MUSICA(String File, String file) {
        this.open = open;
        this.play = play;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    @Override
    public String toString() {
        return open ;
    }

    void open(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
