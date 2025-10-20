public class FrecuenciaCardiaca{

    private int hoy;

    public int getHoy() {
        return hoy;
    }

    public void setHoy(int hoy) {
        this.hoy = hoy;
    }

    public int obtenerEdadAnios(int anioHoy, FechaNacimiento fecha){
        return anioHoy - fecha.anio;
    }

    public int calcularFrecuenciaCardiacaMaxima(FechaNacimiento fecha){
        return 220- fecha.anio;
    }

    public String obtenerFrecEsp(int frecMaxima){
        double rangoInferior=frecMaxima * 0.5;
        double rangoSuperior=frecMaxima * 0.85;
        return rangoInferior+"-"+rangoSuperior;
    }
}
