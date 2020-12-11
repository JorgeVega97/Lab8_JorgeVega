/*
Jorge Vega
 */
package Lab6_JorgeVega;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CLAUDILIST {
    
    private String NOMBRE;
    private ArrayList<PROGRAMA> PROGRAMAS = new ArrayList<>();

    public CLAUDILIST(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }
    
    public CLAUDILIST(File FIL){
        this.NOMBRE = FIL.getName();
        cargarArchivo(FIL.getPath());
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public ArrayList<PROGRAMA> getPROGRAMAS() {
        return PROGRAMAS;
    }

    public void setPROGRAMAS(ArrayList<PROGRAMA> PROGRAMAS) {
        this.PROGRAMAS = PROGRAMAS;
    }

    @Override
    public String toString() {
        return NOMBRE;
    }
    
    public void escribirArchivo(String path) {
        
        File archivo = new File(path);
        
        try {
            FileWriter fw = new FileWriter(archivo, false);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (PROGRAMA can : PROGRAMAS) {
                
                bw.write(can.getNOMBRE()+"/");
                bw.write(can.getPUNTUACION()+"/");
                bw.write(can.getLANZAMIENTO()+"/");
                bw.write(can.getTIPO()+"/");
                bw.write(can.getGENERO()+"\n");
            
            }
            
            bw.flush();
            
            bw.close();
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarArchivo(String path) {
        
        File archivo = new File(path);
        
        if (archivo.exists()) {
            
            try {
                Scanner sc = new Scanner(archivo);
                
                PROGRAMAS.clear();
                int i=0;
                while(sc.hasNextLine()){
                    
                    String line = sc.nextLine();
                    String[] palabras = line.split("\\-");
                    
                    
                    PROGRAMAS.add(
                            new PROGRAMA(
                                    palabras[0],
                                    Integer.parseInt(palabras[1]),
                                    Integer.parseInt(palabras[2]),
                                    palabras[3],
                                    palabras[4]
                            )
                    );
                    
                }
                
                sc.close();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
        
    }
}
