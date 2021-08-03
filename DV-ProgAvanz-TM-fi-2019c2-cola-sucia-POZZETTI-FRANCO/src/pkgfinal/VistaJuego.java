package pkgfinal;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class VistaJuego extends javax.swing.JFrame {

    
    public VistaJuego(String titulo) {
        super(titulo);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //Aparece el boton de salir una vez que se acaba el juego
    public void mostrarBotonSalida(boolean bool){
        this.jButtonSalir.setVisible(bool);
        this.jButtonSalir.requestFocus();
    }
    //Desactiva el boton "Dame Carta" una vez que se acaba el juego
    public void desactivar(){
        this.jButtonDameCarta.setEnabled(false);
    }
    
    //GETTERS y SETTERS
    public String getPuntuacion(){
        return this.jLabelPuntos.getText();
    }
    public void setPuntuacion(String punt){
        this.jLabelPuntos.setText(punt);
    } 
    public void setContador(String cont){
        this.jLabelContador.setText(cont);
    }
    public void ponerImagen(String imagen){
        this.jLabelCarta.setIcon(new ImageIcon(getClass().getResource(imagen)));
    }
    public void quitarImagen(){
        this.jLabelCartaDefault.setIcon(null);
    }
    public void cambiarColorPuntuacion(Color color){
        this.jLabelPuntos.setForeground(color);
    }
    public void cambiarDescripcion(String cartadesc){
        this.jLabelDescripcion.setText(cartadesc);
    }
    
    //LISTENERS
    public void dameCartaListener(ActionListener al){
        this.jButtonDameCarta.addActionListener(al);
    }
    public void terminarListener(ActionListener al){
        this.jButtonSalir.addActionListener(al);
    }
   
    //Muestra la ventana de mensaje una vez que se acaba el juego
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje,"Juego Terminado",JOptionPane.INFORMATION_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonDameCarta = new javax.swing.JButton();
        jLabelCartaDefault = new javax.swing.JLabel();
        jLabelCarta = new javax.swing.JLabel();
        jLabelPuntuacion = new javax.swing.JLabel();
        jLabelUstedObtuvo = new javax.swing.JLabel();
        jLabelPuntos = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelContador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("¡¡¡A JUGAR!!!");
        jLabelTitulo.setToolTipText("");

        jButtonDameCarta.setBackground(new java.awt.Color(0, 102, 0));
        jButtonDameCarta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDameCarta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDameCarta.setText("DAME CARTA");
        jButtonDameCarta.setBorderPainted(false);
        jButtonDameCarta.setFocusPainted(false);

        jLabelCartaDefault.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCartaDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartadefault.jpg"))); // NOI18N

        jLabelCarta.setBackground(new java.awt.Color(204, 204, 204));

        jLabelPuntuacion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntuacion.setText("Puntuacion :");

        jLabelUstedObtuvo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUstedObtuvo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUstedObtuvo.setText("Usted obtuvo:");

        jLabelPuntos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelPuntos.setForeground(new java.awt.Color(51, 255, 0));

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));

        jButtonSalir.setBackground(new java.awt.Color(0, 102, 0));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setFocusPainted(false);

        jLabelContador.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelContador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContador.setText("ho");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonDameCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabelContador))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabelPuntos))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabelPuntuacion))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(jLabelUstedObtuvo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCartaDefault))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jButtonDameCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabelContador))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabelPuntos))
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabelPuntuacion))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabelUstedObtuvo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabelCartaDefault))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDameCarta;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCarta;
    private javax.swing.JLabel jLabelCartaDefault;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JLabel jLabelPuntuacion;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUstedObtuvo;
    // End of variables declaration//GEN-END:variables
}
