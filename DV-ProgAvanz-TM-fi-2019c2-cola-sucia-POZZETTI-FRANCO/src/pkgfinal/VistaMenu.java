package pkgfinal;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;


public class VistaMenu extends javax.swing.JFrame {

    public VistaMenu(String titulo) {
        super(titulo);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    //LISTENERS
    public void cambiarListener(ActionListener al){
        this.jButtonEmpezar.addActionListener(al);
    }
    public void salirListener(ActionListener al){
        this.jButtonSalir.addActionListener(al);
    }
    public void agrandarMEmpezarListener(MouseListener ml){
        this.jButtonEmpezar.addMouseListener(ml);
    }
    public void agrandarMSalirListener(MouseListener ml){
        this.jButtonSalir.addMouseListener(ml);
    }
    public void agrandarFEmpezarListener(FocusListener fl){
        this.jButtonEmpezar.addFocusListener(fl);
    }
    public void agrandarFSalirListener(FocusListener fl){
        this.jButtonSalir.addFocusListener(fl);
    }
    
    //Cambia tamaño de la fuente de los botones
    public void fuenteEmpezar(int pixels){
        this.jButtonEmpezar.setFont(new Font("Tahoma",1,pixels));
    }
    public void fuenteSalir(int pixels){
        this.jButtonSalir.setFont(new Font("Tahoma",1,pixels));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonEmpezar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButtonSalir.setBackground(new java.awt.Color(0, 102, 0));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setFocusPainted(false);

        jButtonEmpezar.setBackground(new java.awt.Color(0, 102, 0));
        jButtonEmpezar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEmpezar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmpezar.setText("EMPEZAR");
        jButtonEmpezar.setBorderPainted(false);
        jButtonEmpezar.setFocusPainted(false);

        jLabelTitulo.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("COLA SUCIA");

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabelTitulo))
            .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButtonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelTitulo))
            .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmpezar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
