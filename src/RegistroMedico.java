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
}
