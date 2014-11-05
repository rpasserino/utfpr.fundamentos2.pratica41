/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author user
 */
public class Elipse {
    private double eixo1;
    private double eixo2;
    
    public Elipse(double eixo1, double eixo2){
        this.eixo1 = 2*eixo1;
        this.eixo2 = 2*eixo2;
    }
    
    public double getArea(){
        return Math.PI*(eixo1/2)*(eixo2/2);
    }
    
    public double getPerimetro(){
        return (3*(eixo1/2+eixo2/2)-Math.sqrt((3*eixo1/2+eixo2/2)*(eixo1/2+3*eixo2/2)))*Math.PI;
    }
    
    public double getEixo(){
        return eixo1;
    }
}
