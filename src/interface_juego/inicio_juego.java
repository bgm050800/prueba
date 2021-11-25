/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_juego;

import java.awt.Graphics;
import java.awt.Image;


import javax.swing.ImageIcon;

import javax.swing.JPanel;



/**
 *
 * @author Bykgm
 */
public class inicio_juego extends javax.swing.JFrame {

    
//    Constructor del panel inicio
    public inicio_juego() {
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

        panel_fondo_inicio = new fondo_panel_inicio();
        boton_comenzar_inicio = new javax.swing.JPanel();
        campo_texto_comenzar = new javax.swing.JLabel();
        boton_salir_inicio = new javax.swing.JPanel();
        campo_texto_salir = new javax.swing.JLabel();
        boton_historial_inicio = new javax.swing.JPanel();
        campo_texto_historial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_fondo_inicio.setBackground(new java.awt.Color(153, 153, 153));

        boton_comenzar_inicio.setBackground(new java.awt.Color(51, 0, 153));
        boton_comenzar_inicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        boton_comenzar_inicio.setForeground(new java.awt.Color(255, 255, 255));
        boton_comenzar_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_comenzar_inicioMousePressed(evt);
            }
        });

        campo_texto_comenzar.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        campo_texto_comenzar.setForeground(new java.awt.Color(255, 255, 255));
        campo_texto_comenzar.setText("COMENZAR");

        javax.swing.GroupLayout boton_comenzar_inicioLayout = new javax.swing.GroupLayout(boton_comenzar_inicio);
        boton_comenzar_inicio.setLayout(boton_comenzar_inicioLayout);
        boton_comenzar_inicioLayout.setHorizontalGroup(
            boton_comenzar_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_comenzar_inicioLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(campo_texto_comenzar)
                .addGap(43, 43, 43))
        );
        boton_comenzar_inicioLayout.setVerticalGroup(
            boton_comenzar_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_comenzar_inicioLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(campo_texto_comenzar)
                .addGap(17, 17, 17))
        );

        boton_salir_inicio.setBackground(new java.awt.Color(51, 0, 153));
        boton_salir_inicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        boton_salir_inicio.setForeground(new java.awt.Color(255, 255, 255));
        boton_salir_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_salir_inicioMousePressed(evt);
            }
        });

        campo_texto_salir.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        campo_texto_salir.setForeground(new java.awt.Color(255, 255, 255));
        campo_texto_salir.setText("SALIR");

        javax.swing.GroupLayout boton_salir_inicioLayout = new javax.swing.GroupLayout(boton_salir_inicio);
        boton_salir_inicio.setLayout(boton_salir_inicioLayout);
        boton_salir_inicioLayout.setHorizontalGroup(
            boton_salir_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton_salir_inicioLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(campo_texto_salir)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        boton_salir_inicioLayout.setVerticalGroup(
            boton_salir_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_salir_inicioLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(campo_texto_salir)
                .addGap(18, 18, 18))
        );

        boton_historial_inicio.setBackground(new java.awt.Color(51, 0, 153));
        boton_historial_inicio.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        boton_historial_inicio.setForeground(new java.awt.Color(255, 255, 255));
        boton_historial_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_historial_inicioMousePressed(evt);
            }
        });

        campo_texto_historial.setFont(new java.awt.Font("Yu Mincho Demibold", 1, 14)); // NOI18N
        campo_texto_historial.setForeground(new java.awt.Color(255, 255, 255));
        campo_texto_historial.setText("HISTORIAL");

        javax.swing.GroupLayout boton_historial_inicioLayout = new javax.swing.GroupLayout(boton_historial_inicio);
        boton_historial_inicio.setLayout(boton_historial_inicioLayout);
        boton_historial_inicioLayout.setHorizontalGroup(
            boton_historial_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_historial_inicioLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(campo_texto_historial)
                .addGap(43, 43, 43))
        );
        boton_historial_inicioLayout.setVerticalGroup(
            boton_historial_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_historial_inicioLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(campo_texto_historial)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout panel_fondo_inicioLayout = new javax.swing.GroupLayout(panel_fondo_inicio);
        panel_fondo_inicio.setLayout(panel_fondo_inicioLayout);
        panel_fondo_inicioLayout.setHorizontalGroup(
            panel_fondo_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_fondo_inicioLayout.createSequentialGroup()
                .addContainerGap(816, Short.MAX_VALUE)
                .addGroup(panel_fondo_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_historial_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_comenzar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_salir_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        panel_fondo_inicioLayout.setVerticalGroup(
            panel_fondo_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fondo_inicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(boton_comenzar_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_historial_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(boton_salir_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(panel_fondo_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_comenzar_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_comenzar_inicioMousePressed
        // TODO add your handling code here:
        
        
        plantilla_preguntas pregunta_panel = new plantilla_preguntas();
        pregunta_panel.setVisible(true);
        dispose();
        
        
        
        
    }//GEN-LAST:event_boton_comenzar_inicioMousePressed

    private void boton_salir_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_salir_inicioMousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_boton_salir_inicioMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void boton_historial_inicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_historial_inicioMousePressed
        historial_juego panel_historial = new historial_juego();
        panel_historial.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_historial_inicioMousePressed
//    Creacion de de clase para fondo de panel superior de inicio
    class fondo_panel_inicio extends JPanel{
//       Creacion de variable para obtener la imagen incluida en el paquete imagenes_juego
        private Image imagen_superior_inicio;
        
        @Override
        public void paint(Graphics g){
//          Creacion de variable para obtener la imagen incluida en el paquete imagenes_juego
            imagen_superior_inicio = new ImageIcon(getClass().getResource("/imagenes_juego/imgpanel_superior_inicio.jpg")).getImage();
            
//          Se definen los parametros de tamano para la imagen
            g.drawImage(imagen_superior_inicio,0,0,getWidth(),getHeight(),this);
              
//          Muestra la imagen en el panel con este metodo
            setOpaque(false);

//          Evita ocultar los elementos del panel que se encuentren con este metodo
            super.paint(g);
             
        }
//Final de clase para fondo de inicio        
    }
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
            java.util.logging.Logger.getLogger(inicio_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_juego().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boton_comenzar_inicio;
    private javax.swing.JPanel boton_historial_inicio;
    private javax.swing.JPanel boton_salir_inicio;
    private javax.swing.JLabel campo_texto_comenzar;
    private javax.swing.JLabel campo_texto_historial;
    private javax.swing.JLabel campo_texto_salir;
    private javax.swing.JPanel panel_fondo_inicio;
    // End of variables declaration//GEN-END:variables



}

