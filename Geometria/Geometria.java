public class Geometria{
    public boolean figura;
    public double altura;
    public double base;

    public Geometria(){
        figura=false;
        base=2;
        altura=2;
    }
    public Geometria (double base, double altura){
        figura=false;
        this.base=base;
        this.altura=altura;
    }
    public Geometria(boolean figura, double altura, double base){
        this.figura=figura;
        this.altura=altura;
        this.base=base;
    }

    public double area(){
        if(figura){
            return base*altura;
        } else {
            return (base*altura)/2;
        }
    }

    public double perimetro(){
        if(figura){
            return base*2+altura*2;
        } else {
            return base+altura+diagonal();
        }
    }
    public double diagonal(){
        return Math.sqrt(base*base+altura*altura);
    }

}