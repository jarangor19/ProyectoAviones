/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaaviones3;

/**
 *
 * @author user
 */
public class Movimiento {
    private double peso;
    private double presion;
    private double temperatura;
    

    public Movimiento( double peso,double presion,double temperatura) {
        this.peso = peso;
        this.presion = presion;
        this.temperatura = temperatura;
    }
    public static double CalcularVelocidadDespegue(double peso, double presion, double temperatura) {
        // Cálculo de la velocidad de despegue
        double temperaturaKelvin = temperatura + 273.15;
        double presionAtmosferica = presion * 133.3; // Conversión de mmHg a Pa
        double densidadAire = presionAtmosferica / (287.058 * temperaturaKelvin);
        double areaAlas = 122.6;//AREA ALAS A-320
        double coeficienteSustentacion = 1.3;
        double headwind = 3;
        double v = (int) (Math.sqrt((2 * peso * 9.8) / (densidadAire * areaAlas * coeficienteSustentacion)) - headwind);

        return v;
    }
  static int distanciaDespegue(double velocidad) {
        double aceleracion = velocidad/40;//40 es el tiempo promedio del despegue de un A320
        int x= (int) (aceleracion*Math.pow(40, 2) /2);
        return x;
    }
    
    
}
