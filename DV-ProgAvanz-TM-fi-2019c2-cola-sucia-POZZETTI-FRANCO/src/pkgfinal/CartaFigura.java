package pkgfinal;

public class CartaFigura extends Carta{
    
    private Familia familia;
    private int numero;
    
    public CartaFigura(Familia familia, int numero, String imagen){
        super(imagen);
        this.familia = familia;
        this.numero = numero;
    }
    
    @Override
    public String getTipo(){
        return familia.getNombre();
    }
    @Override
    public String getInstancia(){
        return numero+"";
    }
    
}
