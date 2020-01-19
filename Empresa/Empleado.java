import java.util.Scanner;
public class Empleado{
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salarioAnual;
    private double irpf;

    public Empleado(){
        this.nombre="";
        this.apellidos="";
        this.edad=0;
        this.dni="";
        this.salarioAnual=0;
        this.irpf=0;
    }
    public Empleado(String nombre, String apellidos, int edad, String dni, double salarioAnual, double irpf){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
        setSalarioAnual(salarioAnual);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public String getDni(){
        return dni;
    }
    public void setSalarioAnual(double salarioAnual){
        this.salarioAnual=salarioAnual;
        if(salarioAnual<6000){
            this.irpf = 7.5;
        }else if(salarioAnual>=6000 && salarioAnual<30000){
            this.irpf = 15;
        }else{
            this.irpf = 20;
        }
    }
    public double getSalarioAnual(){
        return salarioAnual;
    }
    public double getIrpf(){
        return irpf;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("DNI: "+getDni());
        System.out.println("Salario anual: "+getSalarioAnual());
        System.out.println("IRPF: "+getIrpf());
    }
    public void introduccionDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce nombre: ");
        setNombre(sc.nextLine());
        System.out.print("Introduce apellidos: ");
        setApellidos(sc.nextLine());
        System.out.print("Introduce edad: ");
        setEdad(Integer.parseInt(sc.nextLine()));
        System.out.print("Introduce DNI: ");
        setDni(sc.nextLine());
        System.out.print("Introduce salario anual: ");
        setSalarioAnual(sc.nextDouble());
    }
    public void mostrarDatos(int campo){
        switch(campo){
            case 1: System.out.printf("Nombre: %s\nApellidos: %s\n", getNombre(), getApellidos());
            break;
            case 2: System.out.printf("Edad: %d\n",getEdad());
            break;
            case 3: System.out.printf("DNI: %s\n", getDni());
            break;
            case 4: System.out.printf("Salario Anual: %f\nIRPF: %f\n", getSalarioAnual(), getIrpf());
        }
    }
    public double hacienda(){
        return (getIrpf()/100) * getSalarioAnual();
    }
}