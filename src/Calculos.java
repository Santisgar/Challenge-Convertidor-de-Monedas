import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;

    static Scanner lectura = new Scanner(System.in);
    ConsultarMoneda conversion;
    public Calculos(ConsultarMoneda conversion) {
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public double getCantidad() {
        return cantidad;
    }
    public void almacenarValores(String monedaBase, String monedaObjetivo){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;

        System.out.println("Ingrese el valor que deseas convertir");

        this.cantidad = Double.parseDouble(lectura.nextLine());
    }
    public String obtenerMensajeRespuesta() {
        String mensaje = getMonedaBase().toUpperCase() + " " + getCantidad() + " equivale a: " + getMonedaObjetivo().toUpperCase() + " " + conversion.buscaMoneda(getMonedaBase(), getMonedaObjetivo(), getCantidad());
        return mensaje;
    }

}