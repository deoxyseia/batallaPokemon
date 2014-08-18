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
public class Batalla {
    //turno 0 para  oponente 1, turno 1 para oponente 2
    private int turno;
    private Pokemon oponente1;
    private Pokemon oponente2;
    private Pokemon ganador;
    private Pokemon perdedor;

    public Batalla() {
        double prob = Math.random();
        if(prob < 0.5){
            turno = 1;
        }else{
            turno = 0;
        }
    } 
    

    public void duelo(){
       
        while(oponente1.getVida()>0 && oponente2.getVida()>0)
        {
            try {
                  Thread.sleep(2000);
            } catch (Exception e) {
            }          
             
            if(turno==0){
                int vidaOponente2 = oponente2.getVida()-oponente1.getPoderAtaque();                     
                oponente2.setVida(vidaOponente2);
            } 
            else
            {
                oponente1.setVida(oponente1.getVida()-oponente2.getPoderAtaque());
            }
            
            cambiarTurno();
        }
        
        if(oponente1.getVida()<=0)
        {
            ganador=oponente2;
            perdedor=oponente1;
        }
        else
        {
            ganador=oponente1;
            perdedor=oponente2;
        }
    
    }

    public void cambiarTurno(){
        if(turno==0){
            turno=1;
        }else{
              turno=0;
        }         
    }
    public int getTurno() {
        return turno;
    }

    public Pokemon getOponente1() {
        return oponente1;
    }

    public Pokemon getOponente2() {
        return oponente2;
    }

    public Pokemon getGanador() {
        return ganador;
    }

    public Pokemon getPerdedor() {
        return perdedor;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setOponente1(Pokemon oponente1) {
        this.oponente1 = oponente1;
    }

    public void setOponente2(Pokemon oponente2) {
        this.oponente2 = oponente2;
    }

    public void setGanador(Pokemon ganador) {
        this.ganador = ganador;
    }

    public void setPerdedor(Pokemon perdedor) {
        this.perdedor = perdedor;
    }
    
    

}
