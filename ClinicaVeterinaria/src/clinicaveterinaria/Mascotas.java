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
    public class Mascotas {
    private String nombre;
    private String tamaño;
    private String tiporaza;

    public Mascotas (String nombre, String tamaño, String tiporaza) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.tiporaza = tiporaza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }
    
    public String getTiporaza(){
        return tiporaza;
    }
}

    

