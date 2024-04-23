/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pruebaaviones3;
//import paquete.Movimiento;

/**
 *
 * @author user
 */
public class Interfaz extends javax.swing.JFrame {
    double peso;
    double presion;
    double temperatura;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ingresoPeso = new javax.swing.JTextField();
        ingresoPresion = new javax.swing.JTextField();
        ingresoTemperatura = new javax.swing.JTextField();
        botonIniciar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabelMasa = new javax.swing.JLabel();
        jLabelPresion = new javax.swing.JLabel();
        jLabeltemperatura = new javax.swing.JLabel();
        jLabelVelocidad = new javax.swing.JLabel();
        jLabelMostrarVelocidad = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelMostrarAreaAlas = new javax.swing.JLabel();
        jLabelCoeficineteDeSustentacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPesoActionPerformed(evt);
            }
        });
        jPanel1.add(ingresoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 91, -1));

        ingresoPresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoPresionActionPerformed(evt);
            }
        });
        jPanel1.add(ingresoPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 156, 91, -1));

        ingresoTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(ingresoTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 207, 91, -1));

        botonIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonIniciar.setText("Iniciar");
        botonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIniciarMouseClicked(evt);
            }
        });
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 283, 91, 31));

        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 344, 91, 31));

        jLabelMasa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMasa.setText("Masa (KG):");
        jPanel1.add(jLabelMasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, -1, -1));

        jLabelPresion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPresion.setText("Presión (mmHg)");
        jPanel1.add(jLabelPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        jLabeltemperatura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabeltemperatura.setText("Temperatura (C)");
        jPanel1.add(jLabeltemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 190, -1, -1));
        jPanel1.add(jLabelVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 110, 30));

        jLabelMostrarVelocidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMostrarVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMostrarVelocidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelMostrarVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 120, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tumbas-pista-aeropuerto-Savannah-1.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 750, 500));

        jLabelMostrarAreaAlas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelMostrarAreaAlas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 120, 30));

        jLabelCoeficineteDeSustentacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabelCoeficineteDeSustentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPesoActionPerformed
       
    }//GEN-LAST:event_ingresoPesoActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMouseClicked
        // Codigo que corre cuando se presiona el boton: 
        //javax.swing.JOptionPane.showMessageDialog(this, "Inicio de la simulación");

        String pesoAvion = ingresoPeso.getText();
        String presionAvion = ingresoPresion.getText();
        String temperaturaAvion = ingresoTemperatura.getText();
        double peso = Double.parseDouble(pesoAvion);
        double presion = Double.parseDouble(presionAvion);
        double temperatura = Double.parseDouble(temperaturaAvion);
        double v;
        int x;
        
          
        Movimiento movimiento = new Movimiento(peso,presion,temperatura);
        v= movimiento.CalcularVelocidadDespegue(peso,presion,temperatura);
       x = movimiento.distanciaDespegue(v);
        Plano p=new Plano(this.jPanel1);
        p.dibujar();
        p.graficar(x);
        p.despegue(x);
        //Mostrar la velocidad en la interfaz:
        String velocidadString =Double.toString(v);
        jLabelMostrarVelocidad.setText("Velocidad: " +velocidadString + " m/s");
        //Mostrar Area alas en la interfaz:
        //String areaAlasString = Double.toString(areaAlas);
        //jLabelMostrarAreaAlas.setText("Area Alas: "+ areaAlasString + " " );
        //Mostrar Coeficiente de sustentacion:
        //String coeficienteSustentacionString = Double.toString("Coeficiente de sustentación: "+coeficienteSustentacion);
        
    }//GEN-LAST:event_botonIniciarMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
       System.exit(0);
       
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed

    }//GEN-LAST:event_botonSalirActionPerformed

    private void ingresoPresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoPresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoPresionActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField ingresoPeso;
    private javax.swing.JTextField ingresoPresion;
    private javax.swing.JTextField ingresoTemperatura;
    private javax.swing.JLabel jLabelCoeficineteDeSustentacion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMasa;
    private javax.swing.JLabel jLabelMostrarAreaAlas;
    private javax.swing.JLabel jLabelMostrarVelocidad;
    private javax.swing.JLabel jLabelPresion;
    private javax.swing.JLabel jLabelVelocidad;
    private javax.swing.JLabel jLabeltemperatura;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
