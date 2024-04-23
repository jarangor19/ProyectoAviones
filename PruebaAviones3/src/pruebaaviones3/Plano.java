package pruebaaviones3;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */
public class Plano {
    private JPanel p;
    public Plano(JPanel p) {
        this.p=p;
       
    }
    public void dibujar(){
        Graphics2D g=(Graphics2D) p.getGraphics();
        g.drawLine(190, 0, 190, 500);
        g.drawLine(110, 390, 850, 390);
        for(int x=190;x<850;x+=(200/3)){
            g.drawLine(x, 390, x, 400);
        }
        for(int y=50;y<390;y+=50){
            g.drawLine(190, y, 170, y);
        }
        for(int i=190; i<2000; i +=200){
            g.drawString(Integer.toString(i - 190), 180+(i - 190)/3, 412);
        }
        for(int i=390; i<2000; i +=50){
            g.drawString(Integer.toString(i-390), 170, 390+(-i+390));
        }
    }
    
    public void graficar(int posicion){
        Graphics2D g=(Graphics2D) p.getGraphics();
        g.setColor(Color.red);
        g.drawLine(190, 389, (190 + posicion/3), 389);
    }
    public void despegue(int posicion){
        Graphics2D g=(Graphics2D) p.getGraphics();
        g.setColor(Color.red);
        g.drawLine((posicion/3)+190, 389, 850 , 200);
    }
    
}
