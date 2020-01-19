public class Empresa{
    private double ganancia;
    public Directivo directivo;
    public Empleado empleado1;
    public Empleado empleado2;

    public void setGanancia(double gananciaEmpresa){
        this.ganancia=this.ganancia+gananciaEmpresa;
    }
    public double getGanancia(){
        return ganancia;
    }
    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2){
        this.directivo=directivo;
        this.empleado1=empleado1;
        this.empleado2=empleado2;
    }
    public Empresa(Directivo directivo, Empleado empleado1, Empleado empleado2, double ganancia){
        this.directivo=directivo;
        this.empleado1=empleado1;
        this.empleado2=empleado2;
        this.ganancia=ganancia;
    }

}