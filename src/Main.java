
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime hoy = LocalDateTime.now();
        FechaNacimiento fechaNacimiento = new FechaNacimiento();
        FrecuenciaCardiaca frecuenciaCardiaca = new FrecuenciaCardiaca();


        int anioAhora= hoy.getYear();


        System.out.printf("Hello and welcome!");


        }
    }
