public class FrecuenciaCardiaca{

    private int hoy;

    public int getHoy() {
        return hoy;
    }

    public void setHoy(int hoy) {
        this.hoy = hoy;
    }

    public int obtenerEdadAnios(int anioHoy, int anioNacimiento){
        return anioHoy - anioNacimiento;
    }

    public int calcularFrecuenciaCardiacaMaxima(int anioNacimiento){
        return 220- anioNacimiento;
    }

    public String obtenerFrecEsp(int frecMaxima){
        double rangoInferior=frecMaxima * 0.5;
        double rangoSuperior=frecMaxima * 0.85;
        return rangoInferior+"-"+rangoSuperior;
    }
}
