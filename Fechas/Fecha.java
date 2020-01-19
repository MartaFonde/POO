public class Fecha{
    private int dia;
    private int mes;
    private int ano;

    public Fecha(){
        dia=0;
        mes=0;
        ano=0;
    }
    public Fecha(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    public void setDia(int dia){
        if(dia<1 || dia>31){
            this.dia=1;
        }else{
            this.dia=dia;
        }
    }
    public int getDia(){
        return dia;
    }
    public void setMes(int mes){
        if(mes<1 || mes>12){
            this.mes=1;
        } else{
            this.mes=mes;
        }
    }
    public int getMes(){
        return mes;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public int getAno(){
        return ano;
    }
    public String fechaFormateada(boolean formato){
        String mesLetra="";
        if(formato){
            return dia+"/"+mes+"/"+ano;
        }else{
            switch(mes){
                case 1: mesLetra="xaneiro";
                    break;
                case 2: mesLetra="febreiro";
                    break;
                case 3: mesLetra="marzo";
                    break;
                case 4: mesLetra="abril";
                    break;
                case 5: mesLetra="maio";
                    break;
                case 6: mesLetra="xuño";
                    break;
                case 7: mesLetra="xullo";
                    break;
                case 8: mesLetra="agosto";
                    break;
                case 9: mesLetra="setembro";
                    break;
                case 10: mesLetra="outubro";
                    break;
                case 11: mesLetra="novembro";
                    break;
                case 12: mesLetra="decembro";
                    break;
            }
            return dia+" de "+mesLetra+" de "+ano;
        }
    }
 
    public static int diferenciaFechas(Fecha fecha1, Fecha fecha2){
        return Math.abs(fecha1.getAno()-fecha2.getAno());
    }
}

    
