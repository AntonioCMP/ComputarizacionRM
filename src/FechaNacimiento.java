

public class FechaNacimiento {

    private int mes;
    private int dia;
    private int anio;

    //Constructor principal
    public FechaNacimiento(int mes, int dia, int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    //Getters y Setters
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Metodo para mostrar la fecha como string
    public String mostrarFecha(){
        return mes + "/" + dia + "/" + anio;
    }

}
