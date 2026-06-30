/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maria jose
 */
public class ExcursionCultural extends ServicioTuristico {
    private String LugarHistorico;

    public ExcursionCultural() {
        super();
    }

    public ExcursionCultural(String LugarHistorico) {
        this.LugarHistorico = LugarHistorico;
    }

    public ExcursionCultural(String LugarHistorico, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.LugarHistorico = LugarHistorico;
    }

    public String getLugarHistorico() {
        return LugarHistorico;
    }

    public void setLugarHistorico(String LugarHistorico) {
        this.LugarHistorico = LugarHistorico;
    }

    @Override
    public String toString() {
        return "ExcursionCultural{" + 
               "nombre=" + getNombre() + 
               ", duracionHoras=" + getDuracionHoras() + 
               ", LugarHistorico=" + LugarHistorico + '}';
    }
}

