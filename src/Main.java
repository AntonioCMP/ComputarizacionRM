
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDateTime hoy = LocalDateTime.now();
        Scanner sc = new Scanner(System.in);

        String nombre,apellido;
        int anio = 0,mes = 0,dia = 0,sexo = -1,altura = 0;
        float peso=0;
        int anioAhora= hoy.getYear();


        // Ingreso de datos del usuarios
        System.out.println("Ingrese los datos del usuario");
        System.out.println("Nombre del usuario: ");
        nombre= sc.nextLine();

        System.out.println("Apellido del usuario: ");
        apellido= sc.nextLine();

        while(sexo !=1 && sexo!=0) {
            System.out.println("Sexo (0 mujer, 1 hombre): ");
            sexo = sc.nextInt();
            if(sexo !=1 && sexo!=0){
                System.out.println("Ingrese el 0 o el 1");
            };
        };

        System.out.println("Fecha de nacimiento");
        while(dia<1 || dia>31){
            System.out.println("Dia: ");
            dia= sc.nextInt();
            if(dia<1 || dia>31){
                System.out.println("Ingrese un numero del 1-31");
        }
        }

        while(mes<1 || mes>12) {
            System.out.println("Mes: ");
            mes = sc.nextInt();
            if(mes<1 || mes>12) {
                System.out.println("Ingrese un mes del 1-12");
            }
        }

        while (anio<1900 || anio>anioAhora) {
            System.out.println("Año: ");
            anio = sc.nextInt();
            if(anio<1900 || anio>anioAhora) {
                System.out.println("Ingrese un año valido");
            }
        }

        while(altura<1 || altura>300) {
            System.out.println("Altura en cm: ");
            altura = sc.nextInt();
            if(altura<1 || altura>300) {
                System.out.println("Ingrese un altura valida");
            }
        }
        while (peso<1) {
            System.out.println("Peso en kg: ");
            peso = sc.nextFloat();
            if(peso<1) {
                System.out.println("Ingrese un peso valido");
            }
        }

        FechaNacimiento fechaNacimiento = new FechaNacimiento(dia,mes,anio);
        FrecuenciaCardiaca frecuenciaCardiaca = new FrecuenciaCardiaca(anioAhora,fechaNacimiento);

        int edad= frecuenciaCardiaca.obtenerEdadAnios(anioAhora,fechaNacimiento);
        int frecMax= frecuenciaCardiaca.calcularFrecuenciaCardiacaMaxima(edad);
        String frecEsper= frecuenciaCardiaca.obtenerFrecEsp(frecMax);

        RegistroMedico registroMedico = new RegistroMedico(nombre, apellido, sexo, altura,
                peso, frecMax, fechaNacimiento, frecEsper);

        System.out.println(registroMedico.mostrarFichaPaciente());
        }
    }
