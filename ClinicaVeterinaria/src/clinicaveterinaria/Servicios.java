/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

/**
 *
 * @author Booker
 */
public class Servicios {
    private static final double PRECIO_BAÑO_PEQUENO = 10.0;
    private static final double PRECIO_BAÑO_MEDIANO = 20.0;
    private static final double PRECIO_BAÑO_GRANDE = 30.0;
    private static final double PRECIO_MEDICO_PEQUENO = 30.0;
    private static final double PRECIO_MEDICO_MEDIANO = 50.0;
    private static final double PRECIO_MEDICO_GRANDE = 70.0;

    public static double obtenerPrecio(String tamaño, String tipoServicio) {
        switch (tamaño.toLowerCase()) {
            case "pequeño":
                return tipoServicio.equalsIgnoreCase("baño") ? PRECIO_BAÑO_PEQUENO : PRECIO_MEDICO_PEQUENO;
            case "mediano":
                return tipoServicio.equalsIgnoreCase("baño") ? PRECIO_BAÑO_MEDIANO : PRECIO_MEDICO_MEDIANO;
            case "grande":
                return tipoServicio.equalsIgnoreCase("baño") ? PRECIO_BAÑO_GRANDE : PRECIO_MEDICO_GRANDE;
            default:
                return 0.0;
        }
    }
}

