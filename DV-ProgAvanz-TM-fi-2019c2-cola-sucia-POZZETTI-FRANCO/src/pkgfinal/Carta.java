package pkgfinal;

public abstract class Carta {
    
    private String imagen;
    
    public Carta(String imagen){
        this.imagen = imagen;
    }
    
    public String getImagen(){
        return imagen;
    }
    
    public abstract String getTipo();
    
    public abstract String getInstancia();
   
}
