package lab6_jorgevega;

/**
JorgeVega
 */
public class PROGRAMA {
    private String NOMBRE;
    private int PUNTUACION;
    private int LANZAMIENTO;
    private String TIPO;
    private String GENERO;

    public PROGRAMA(String NOMBRE, int PUNTUACION, int LANZAMIENTO, String TIPO, String GENERO) {
        this.NOMBRE = NOMBRE;
        this.PUNTUACION = PUNTUACION;
        this.LANZAMIENTO = LANZAMIENTO;
        this.TIPO = TIPO;
        this.GENERO = GENERO;
    }

    public String getGENERO() {
        return GENERO;
    }

    public void setGENERO(String GENERO) {
        this.GENERO = GENERO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getPUNTUACION() {
        return PUNTUACION;
    }

    public void setPUNTUACION(int PUNTUACION) {
        this.PUNTUACION = PUNTUACION;
    }

    public int getLANZAMIENTO() {
        return LANZAMIENTO;
    }

    public void setLANZAMIENTO(int LANZAMIENTO) {
        this.LANZAMIENTO = LANZAMIENTO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    @Override
    public String toString() {
        return NOMBRE;
    }
    
}
