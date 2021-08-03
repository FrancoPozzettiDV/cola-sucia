package pkgfinal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColaSucia {
    private VistaMenu menu;
    private VistaJuego juego = new VistaJuego("Cola Sucia");
    private Mazo mazo;
    private int puntos = 0;

    public ColaSucia(VistaMenu menu){
        this.menu=menu;
        this.mazo = new Mazo();
    }
    
    public void iniciar(){
        this.menu.cambiarListener(new CambiarListener());
        this.menu.salirListener(new SalirListener());
        this.menu.agrandarMEmpezarListener(new AgrandarMEmpezarListener());
        this.menu.agrandarFEmpezarListener(new AgrandarFEmpezarListener());
        this.menu.agrandarMSalirListener(new AgrandarMSalirListener());
        this.menu.agrandarFSalirListener(new AgrandarFSalirListener());
        this.menu.setVisible(true);
    }
    
   private void iniciarJuego(){
        
        this.juego.dameCartaListener(new DameCartaListener());
        this.juego.terminarListener(new TerminarListener());
        this.juego.setPuntuacion(puntos+"");
        this.juego.setContador(this.mazo.getTamaño()+"");
        this.juego.mostrarBotonSalida(false);
        this.juego.setVisible(true);
        this.menu.dispose();
        
    }
    
    private void dameCarta(){
        Carta card = mazo.getCarta();
           juego.ponerImagen(card.getImagen());
           juego.cambiarDescripcion("El "+card.getInstancia()+" de "+card.getTipo());
           juego.setContador(mazo.getTamaño()+"");
           if(card.getTipo().equals("oro") && card.getInstancia().equals("1")){
               juego.desactivar();
               juego.cambiarColorPuntuacion(Color.red);
               juego.mostrarMensaje("Puntuacion: "+juego.getPuntuacion());
               juego.mostrarBotonSalida(true);
           }else{
               puntos++;
               juego.setPuntuacion(puntos+"");
           }
           if(mazo.estaVacio()){
               juego.quitarImagen();
           }
        }

    private void finalizar(){
        VistaMenu nuevoMenu = new VistaMenu("Cola Sucia");
        ColaSucia nuevoJuego = new ColaSucia(nuevoMenu);
        nuevoJuego.iniciar();
        this.juego.dispose();
    }
    
    private void apagar(){
        System.exit(0);
    }
  
     
   private class CambiarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           iniciarJuego();
        }
       
   }
   private class SalirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            apagar();
        }
       
   }
   private class DameCartaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            dameCarta();
        }  
   
   } 
   private class TerminarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            finalizar();
        }
       
   }
   private class AgrandarMEmpezarListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
            menu.fuenteEmpezar(18);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            menu.fuenteEmpezar(12);
        }

   }
   private class AgrandarFEmpezarListener implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            menu.fuenteEmpezar(18);
        }

        @Override
        public void focusLost(FocusEvent e) {
            menu.fuenteEmpezar(12);
        }
       
   }
   private class AgrandarMSalirListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {
            menu.fuenteSalir(18);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            menu.fuenteSalir(12);
        }
   
   }
   private class AgrandarFSalirListener implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            menu.fuenteSalir(18);
        }

        @Override
        public void focusLost(FocusEvent e) {
              menu.fuenteSalir(12);
        }
       
   }
}
