package pkgfinal;

public class Principal {

    public static void main(String[] args) {
        VistaMenu men = new VistaMenu("Cola Sucia");
        ColaSucia juego = new ColaSucia(men);
        juego.iniciar();
    }
    
}
