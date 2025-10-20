
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDateTime hoy = LocalDateTime.now();
        FechaNacimiento fechaNacimiento = new FechaNacimiento();
        FrecuenciaCardiaca frecuenciaCardiaca = new FrecuenciaCardiaca();
        RegistroMedico registroMedico = new RegistroMedico();
        Scanner sc = new Scanner(System.in);


        int anioAhora= hoy.getYear();

        // Ingreso de datos del usuarios
        System.out.println("Ingrese los datos del usuario");
        System.out.println("Nombre del usuario: ");
        registroMedico.setNombre(sc.nextLine());


        System.out.println("Apellido del usuario: ");
        registroMedico.setApellido(sc.nextLine());


        System.out.println("Sexo (0 mujer, 1 hombre): ");
        registroMedico.setSexo(sc.nextInt());


        System.out.println("Fecha de nacimiento");
        System.out.println("Dia: ");
        fechaNacimiento.setDia(sc.nextInt());
        System.out.println("Mes: ");
        fechaNacimiento.setMes(sc.nextInt());
        System.out.println("Año: ");
        fechaNacimiento.setAnio(sc.nextInt());

        System.out.println("Altura en cm: ");
        registroMedico.setAltura(sc.nextInt());

        System.out.println("Peso en kg: ");
        registroMedico.setPeso(sc.nextInt());


        }
    }
