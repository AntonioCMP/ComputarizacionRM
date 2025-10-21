
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDateTime hoy = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);

        String nombre,apellido;
        int anio,mes,dia,sexo,altura;
        float peso;
        int anioAhora= hoy.getYear();


        // Ingreso de datos del usuarios
        System.out.println("Ingrese los datos del usuario");
        System.out.println("Nombre del usuario: ");
        nombre= sc.nextLine();

        System.out.println("Apellido del usuario: ");
        apellido= sc.nextLine();


        System.out.println("Sexo (0 mujer, 1 hombre): ");
        sexo=sc.nextInt();

        System.out.println("Fecha de nacimiento");
        System.out.println("Dia: ");
        dia= sc.nextInt();

        System.out.println("Mes: ");
        mes= sc.nextInt();

        System.out.println("Año: ");
        anio= sc.nextInt();

        System.out.println("Altura en cm: ");
        altura= sc.nextInt();

        System.out.println("Peso en kg: ");
        peso= sc.nextFloat();

        FechaNacimiento fechaNacimiento = new FechaNacimiento(dia,mes,anio);
        FrecuenciaCardiaca frecuenciaCardiaca = new FrecuenciaCardiaca(anioAhora,fechaNacimiento);

        int edad= frecuenciaCardiaca.obtenerEdadAnios(anioAhora,fechaNacimiento);
        int frecMax= frecuenciaCardiaca.calcularFrecuenciaCardiacaMaxima(edad);
        String frecEsper= frecuenciaCardiaca.obtenerFrecEsp(frecMax);

        String bmiString = RegistroMedico.calcularBMIS(altura, peso);
        float bmiFloat = RegistroMedico.calcularBMIF(altura, peso);
        int bmiInt = Math.round(bmiFloat);

        RegistroMedico registroMedico = new RegistroMedico(nombre, apellido, sexo, altura,
                peso, frecMax, fechaNacimiento, frecEsper, bmiString, bmiInt);

        System.out.println(registroMedico.mostrarFichaPaciente());
        }
    }
