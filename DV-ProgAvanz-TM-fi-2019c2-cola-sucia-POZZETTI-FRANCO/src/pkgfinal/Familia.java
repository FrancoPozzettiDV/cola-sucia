package pkgfinal;

public enum Familia {
    ORO,COPA,ESPADA,BASTO;
      
    public String getNombre(){
        return this.name().toLowerCase();
    }
}
