/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.factoryMethod;

/**
 *
 * @author Mauricio Ortiz
 */
public abstract class Contrato {
    
    private int maxHoras;
    
    public abstract double calcularSueldo();
    
    public String mostrarContrato(){
        var retorno=this.maxHoras+" ";
        return retorno;
    }

    public int getMaxHoras() {
        return maxHoras;
    }

    public void setMaxHoras(int maxHoras) {
        this.maxHoras = maxHoras;
    }
    
    
    
}
