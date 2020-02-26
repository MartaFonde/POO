package geometria;

public class Punto{
    public double x;
    public double y;

    /**
     * Inicializa coordernadas (x,y) con los parámetros dados
     * @param x coordenada x
     * @param y coordenada y
     */
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    /**
     * Inicializa las coordenadas (x,y) con (0,0)
     */
    public Punto(){
        this(0,0);
    }

    public String toString(){
        return "("+x+", "+y+")";
    }
}