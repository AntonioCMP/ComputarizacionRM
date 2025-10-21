
    public class PruebaFecha {

        public static void main(String[] args) {

            System.out.println("--- Probando la clase Fecha ---");

            FechaNacimiento fechaDeHoy = new FechaNacimiento(10, 20, 2025);

            System.out.print("La fecha es: ");
            fechaDeHoy.mostrarFecha();

        }
    }
