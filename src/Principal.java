import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        Calculos calculos = new Calculos(consulta);
        int opcionElegida =0;
        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas ***
                
                1) Dolar ==>> Peso argentino
                2) Peso argentino ==>> Dolar
                3) Dolar ==>> Real brasileño
                4) Real brasileño ==>> Dolar
                5) Dolar ==>> Peso colombiano
                6) Peso colombiano ==>> Dolar
                
                7) Salir
                
                Elija una opción válida
                ***************************************************
                """;
        while (opcionElegida!=7){
            try {
                System.out.println(menu);
                opcionElegida = Integer.parseInt(lectura.nextLine());
                switch (opcionElegida){
                    case 1:
                        calculos.almacenarValores("USD", "ARS");
                        System.out.println(calculos.obtenerMensajeRespuesta());
                        break;
                    case 2:
                        calculos.almacenarValores("ARS", "USD");
                        System.out.println(calculos.obtenerMensajeRespuesta());
                        break;
                    case 3:
                        calculos.almacenarValores("USD", "BRL");
                        System.out.println(calculos.obtenerMensajeRespuesta());
                        break;
                    case 4:
                        calculos.almacenarValores("BRL", "USD");
                        System.out.println(calculos.obtenerMensajeRespuesta());
                        break;
                    case 5:
                        calculos.almacenarValores("USD", "COP");
                        System.out.println(calculos.obtenerMensajeRespuesta());
                        break;
                    case 6:
                        calculos.almacenarValores("COP", "USD");
                        System.out.println(calculos.obtenerMensajeRespuesta());
                        break;
                    case 7:
                        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 7.");

                }
            }catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");

            }
        }
    }
}
