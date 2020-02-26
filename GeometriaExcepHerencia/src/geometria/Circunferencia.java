package geometria;


public class Circunferencia extends Figura {
    //como Figura implements InterfazUsuario, Circunferencia tb lo implementa
    private double radio;

    /**
     * Inicializa Punto de origen, radio y nombre
     * @param centro punto de origen
     * @param radio radio
     */
    public Circunferencia(Punto centro, double radio){
        super(centro, "circunferencia");
        setRadio(radio);
    }

    /**
     * Inicializa el punto de origen a (0,0) y radio a 1
     */
    public Circunferencia(){
        this(new Punto(), 1);
    }

    /**
     * Establece la propiedad radio mayor o igual a cero
     * @param radio radio
     * @throws ArithmeticException si el radio es negativo 
     */
    public void setRadio(double radio) throws ArithmeticException{
        if(radio<0){
            throw new ArithmeticException("El radio no puede ser negativo");
        } 
        this.radio=radio; 
    }

    /**
     * Pide nombre, punto de origen y radio al usuario
     */
    @Override
    public void pedirDatos(){
        boolean error;
        super.pedirDatos();
        do{
            try{
                error=false;
                System.out.println("Introduce radio");
                setRadio(Double.parseDouble(sc.nextLine()));
            }catch(ArithmeticException e){
                System.out.println("El radio no puede ser negativo");
                error=true;
            }
        }while(error);
    }

    /**
     * Muestra nombre, punto de origen y radio
     */
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Radio: "+"("+radio+")");
    }

  
}
