/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package batallapokemon;

/**
 *
 * @author Lab09-Pc15
 */
public abstract class Pokemon {
   private String nombre;
   private int vida;
   private int poderAtaque;
   

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }  
}
