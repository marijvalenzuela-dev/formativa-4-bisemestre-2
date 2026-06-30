/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

/**
 * @author maria jose
 */
public class GestionDeServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica(4, "Sabores asia", 5);
        RutaGastronomica ruta2 = new RutaGastronomica(3, "Cocina coreana", 4);

        PaseoLacustre paseo1 = new PaseoLacustre("Cayac", "Navegación río Maule", 2);
        PaseoLacustre paseo2 = new PaseoLacustre("Vela ligera", "Pesca lago Villarrica", 3);

        ExcursionCultural excursion1 = new ExcursionCultural("Tren Ramal Constitución", "Historia de la región", 3);
        ExcursionCultural excursion2 = new ExcursionCultural("Museo Historia Natural", "Exposición talentos locales", 5);

        System.out.println(ruta1.toString());
        System.out.println(ruta2.toString());
        System.out.println(paseo1.toString());
        System.out.println(paseo2.toString());
        System.out.println(excursion1.toString());
        System.out.println(excursion2.toString());
    }
}
