package pkgfinal;

public class CartaComodin extends Carta{
    
    private final static String TIPO = "COMODIN";
    private String color;
    
    public CartaComodin(String color, String imagen){
        super(imagen);
        this.color = color;
    }
    
    @Override
    public String getTipo(){
        return TIPO.toLowerCase();
    }
    @Override
    public String getInstancia(){
        return color;
    }
    
}
