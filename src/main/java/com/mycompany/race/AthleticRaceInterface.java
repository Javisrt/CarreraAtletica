package com.mycompany.race;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AthleticRaceInterface extends javax.swing.JFrame {
    int numero =0;
    
    ThreadRunner corredor;
    
    ArrayList<Runner> corredores = new ArrayList<>();

    public AthleticRaceInterface() {
        initComponents();
        setLocationRelativeTo(null); //posicionar ventana en el centro
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxRegistro = new javax.swing.JTextField();
        buttonRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxCarredoresRegistrados = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxResultado = new javax.swing.JTextArea();
        buttonIniciar = new javax.swing.JButton();
        buttonReiniciar = new javax.swing.JButton();
        buttonTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrera de atletismo");

        boxRegistro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        buttonRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegistrarMouseClicked(evt);
            }
        });
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        boxCarredoresRegistrados.setColumns(20);
        boxCarredoresRegistrados.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        boxCarredoresRegistrados.setRows(5);
        boxCarredoresRegistrados.setEnabled(false);
        jScrollPane1.setViewportView(boxCarredoresRegistrados);

        boxResultado.setColumns(20);
        boxResultado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        boxResultado.setRows(5);
        boxResultado.setEnabled(false);
        jScrollPane2.setViewportView(boxResultado);

        buttonIniciar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonIniciar.setText("Iniciar");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        buttonReiniciar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonReiniciar.setText("Reiniciar");
        buttonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReiniciarActionPerformed(evt);
            }
        });

        buttonTerminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buttonTerminar.setText("Terminar");
        buttonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTerminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Registrar corredor");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Corredores registrados");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Resultados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonReiniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonTerminar)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(boxRegistro))
                        .addGap(12, 12, 12)
                        .addComponent(buttonRegistrar)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRegistrar))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buttonIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonReiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTerminar)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
        if(numero<5){
            JOptionPane.showMessageDialog(null, "Faltan "+(5-numero)+" corredores");
        }else{
            for(Runner c: corredores){
              boxResultado.append(c.getName()+" Tiempo "+c.getSpeed()+" segundos"+"\n");
            }
        }
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void buttonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegistrarMouseClicked
        boxRegistro.setText("");
    }//GEN-LAST:event_buttonRegistrarMouseClicked

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        if(boxRegistro.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Registra un nombre");   
        }else if(numero<5){
            corredor = new ThreadRunner(boxRegistro.getText());
            corredores.add(corredor);
            numero++;
            JOptionPane.showMessageDialog(null, "Corredor registrado");
        }else {
            JOptionPane.showMessageDialog(null, "Cupo completo");
        }
        boxCarredoresRegistrados.setText("");
        for (Runner c: corredores){
            boxCarredoresRegistrados.append(c.getName() + "\n"); //salto de linea
        }
        boxRegistro.setText("");
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReiniciarActionPerformed
        boxRegistro.setText("");
        boxResultado.setText("");
        boxCarredoresRegistrados.setText("");
        corredores.removeAll(corredores);
        numero=0;
    }//GEN-LAST:event_buttonReiniciarActionPerformed

    private void buttonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonTerminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AthleticRaceInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AthleticRaceInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea boxCarredoresRegistrados;
    private javax.swing.JTextField boxRegistro;
    private javax.swing.JTextArea boxResultado;
    public javax.swing.JButton buttonIniciar;
    public javax.swing.JButton buttonRegistrar;
    public javax.swing.JButton buttonReiniciar;
    public javax.swing.JButton buttonTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
