package geometria;


public class Circunferencia extends Figura {
    //como Figura implements InterfazUsuario, Circunferencia tb lo implementa
    private double radio;

    public Circunferencia(Punto centro, double radio){
        super(centro, "circunferencia");
        setRadio(radio);
    }

    public Circunferencia(){
        this(new Punto(), 1);
    }

    public void setRadio(double radio) throws ArithmeticException{
        if(radio<0){
            throw new ArithmeticException("El radio no puede ser negativo");
        } 
        this.radio=radio; 
    }

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

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Radio: "+"("+radio+")");
    }

  
}