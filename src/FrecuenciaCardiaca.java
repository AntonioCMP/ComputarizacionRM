public class FrecuenciaCardiaca{

    private int hoy;
    private FechaNacimiento fechaNacimiento;

    //Constructor principal
    public FrecuenciaCardiaca(int hoy, FechaNacimiento fechaNacimiento) {
        this.hoy = hoy;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters y Setters
    public FechaNacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getHoy() {
        return hoy;
    }

    public void setHoy(int hoy) {
        this.hoy = hoy;
    }


    //Metodos propios de la clase
    public int obtenerEdadAnios(int anioHoy, FechaNacimiento fechaNacimiento){
        int anioNacimiento= fechaNacimiento.getAnio();
        return anioHoy - anioNacimiento;
    }

    public int calcularFrecuenciaCardiacaMaxima(int edad){
        return 220- edad;
    }

    public String obtenerFrecEsp(int frecMaxima){
        double rangoInferior=frecMaxima * 0.5;
        double rangoSuperior=frecMaxima * 0.85;
        return rangoInferior+"-"+rangoSuperior;
    }
}
