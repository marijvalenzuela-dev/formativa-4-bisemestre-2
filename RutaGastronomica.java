/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maria jose
 */
public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas; 

    public RutaGastronomica() {
    }

    public RutaGastronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(int numeroDeParadas, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "RutaGastronomica{" + "numeroDeParadas=" + numeroDeParadas + '}';
    }    
    
}
