import java.util.Scanner;
public class Directivo{
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String departamento;
    private float beneficios;

    public Directivo(){
        this.nombre="";
        this.apellidos="";
        this.edad=0;
        this.dni="";
        this.departamento="";
        this.beneficios=0;
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
    public void setDepartamento(String departamento){
        this.departamento=departamento.toUpperCase();
    }
    public String getDepartamento(){
        return "\""+departamento+"\"";
    }
    public void setBeneficios(float beneficios){
        this.beneficios=beneficios;
    }
    public float getBeneficios(){
        return beneficios;
    }
    public void mostrarDatos(double gananciaEmpresa){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("DNI: "+getDni());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("Beneficios: "+getBeneficios());
        System.out.println("Ganancias: "+ganancia((float)gananciaEmpresa));
    }
    public void introduccionDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce nombre: ");
        setNombre(sc.nextLine());
        System.out.print("Introduce apellidos: ");
        setApellidos(sc.nextLine());
        System.out.print("Introduce edad: ");
        setEdad(sc.nextInt());
        System.out.print("Introduce DNI: ");
        sc.nextLine();
        setDni(sc.nextLine());
        System.out.print("Introduce nombre departamento: ");
        setDepartamento(sc.nextLine());
        System.out.print("Introduce beneficios: ");
        setBeneficios(Float.parseFloat(sc.nextLine()));
    }
    public float ganancia(float gananciaEmpresa){
        if(gananciaEmpresa<0){
            return 0;
        }else{
            return gananciaEmpresa*getBeneficios();
        } 
    }


}