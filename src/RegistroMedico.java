/**Clase madre con nombre,apellido,sexo,altura,
 * peso,fecha,la frecuencia cardiaca esperada y la
 * frecuencia cardiaca maxima*/

    class RegistroMedico {

    private String nombre;
    private String apellido;
    private int sexo;
    private int altura;
    private float peso;
    private FechaNacimiento fecha;
    private int frecuenciaCardiacaMaxima;
    private String frecuenciaCardiacaEsperada;
    private String bmi;
    private int bmiInt;

    public RegistroMedico(String nombre, String apellido, int sexo,
                          int altura, float peso, int frecuenciaCardiacaMaxima,
                          FechaNacimiento fecha, String frecuenciaCardiacaEsperada,String bmi, int bmiInt) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.frecuenciaCardiacaMaxima = frecuenciaCardiacaMaxima;
        this.fecha = fecha;
        this.frecuenciaCardiacaEsperada = frecuenciaCardiacaEsperada;
        this.bmi = bmi;
        this.bmiInt = bmiInt;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public int getBmiInt() {
        return bmiInt;
    }

    public void setBmiInt(int bmiInt) {
        this.bmiInt = bmiInt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public FechaNacimiento getFecha() {
        return fecha;
    }

    public void setFecha(FechaNacimiento fecha) {
        this.fecha = fecha;
    }

    public String getFrecuenciaCardiacaEsperada() {
        return frecuenciaCardiacaEsperada;
    }

    public void setFrecuenciaCardiacaEsperada(String frecuenciaCardiacaEsperada) {
        this.frecuenciaCardiacaEsperada = frecuenciaCardiacaEsperada;
    }

    public int getFrecuenciaCardiacaMaxima() {
        return frecuenciaCardiacaMaxima;
    }

    public void setFrecuenciaCardiacaMaxima(int frecuenciaCardiacaMaxima) {
        this.frecuenciaCardiacaMaxima = frecuenciaCardiacaMaxima;
    }

    //Metodos de para mostrar toda la informacion de los pacientes

    public static String calcularBMIS(int altura, float peso) {
        float alturaM = (float) altura / 100;
        float bmi = peso / (alturaM * alturaM);

        if (bmi < 18.5) {
            return "Bajo peso";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
    }}

    public static float calcularBMIF(int altura, float peso) {
        float alturaM = (float) altura / 100;
        return peso / (alturaM * alturaM);
    }

    public String mostrarFichaPaciente(){
        String fecha = "Ficha Paciente" + "\n"+
                "Nombre del paciente: "+ nombre+ "\n" +
                "Apellido del paciente: " +apellido+ "\n"+
                "Sexo del paciente: "+ sexo+ "\n"+
                "Fecha de nacimiento"+
                "Altura del paciente: "+ altura+ "\n"+
                "Peso del paciente: "+ peso+ "\n"+
                "Indice de masa corporal: "+ bmi+ "("+bmiInt +")"+ "\n"+
                "Frecuencia Cardiaca Maxima: "+ frecuenciaCardiacaMaxima+ "\n"+
                "Frecuencia Cardiaca Esperada: "+ frecuenciaCardiacaEsperada + "\n";
        return fecha;
    }
}
