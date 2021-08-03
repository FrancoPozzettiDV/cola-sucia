package pkgfinal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Mazo {
    
    private ArrayList<Carta> mazo;
    
    public Mazo (){
        this.mazo = new ArrayList<>();
        this.llenarMazo();
    }
    
    private void llenarMazo(){
        for (int i = 0; i < Familia.values().length; i++){
            for (int j = 1; j <= 12; j++){
                this.mazo.add(new CartaFigura(Familia.values()[i],j,"/img/carta"+j+Familia.values()[i].getNombre()+".jpg"));
            }            
        }
        this.mazo.add(new CartaComodin("rojo","/img/cartarojocomodin.jpg"));
        this.mazo.add(new CartaComodin("azul","/img/cartaazulcomodin.jpg"));
        Collections.shuffle(mazo);
    }
    
    public Carta getCarta(){
        Random rnd = new Random();
        int i = rnd.nextInt(this.mazo.size());
        return this.mazo.remove(i);
    }
    
    public int getTamaño(){
        return this.mazo.size();
    }
    
    public boolean estaVacio(){
        return this.mazo.isEmpty();
    }
    
   
    
}
