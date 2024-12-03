package clinicaveterinaria;

import java.util.ArrayList;

public class clinica {
    private ArrayList<Mascotas> mascotasAtendidas;
    private double gananciasTotales;

    public clinica () {
        this.mascotasAtendidas = new ArrayList<>();
        this.gananciasTotales = 0.0;
    }

    public void registrarMascota(Mascotas mascotas, String tipoServicio) {
        double costo = Servicios.obtenerPrecio(mascotas.getTamaño(), tipoServicio);
        if (costo > 0) {
            mascotasAtendidas.add(mascotas);
            gananciasTotales += costo;
            System.out.println("Servicio realizado a " + mascotas.getNombre() + ". Costo: $" + costo);
        } else {
            System.out.println("Tamaño no válido para el servicio.");
        }
    }

    public void mostrarResumen() {
        System.out.println("\nResumen del día:");
        System.out.println("Mascotas atendidas: " + mascotasAtendidas.size());
        System.out.println("Ganancias totales: $" + gananciasTotales);
    }
}
