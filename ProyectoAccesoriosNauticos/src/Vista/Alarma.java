/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Proyecto.AccesoriosNauticos;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class Alarma extends javax.swing.JFrame {

    int xMouse,yMouse;
    public Alarma() {
        initComponents();
        //Configuraciones
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage((new ImageIcon("src/Imagenes/Mini_Logo.png")).getImage());
        this.setLocationRelativeTo(null); // medio de la pantalla
        this.setResizable(false); //no se puede modificas
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
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        nombretitulo = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        nombretitulo2 = new javax.swing.JLabel();
        userTxt1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nombretitulo3 = new javax.swing.JLabel();
        userTxt2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCir.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 200, 170));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(153, 153, 153));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        Titulo.setText("Configuración de Alarma");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 30));

        jButton2.setBackground(new java.awt.Color(0, 134, 190));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VER ALARMAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 150, 40));

        jButton3.setBackground(new java.awt.Color(0, 134, 190));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("AGREGAR ALARMAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 40));

        nombretitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo.setText("Nombre:");
        jPanel1.add(nombretitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 120, 20));

        userTxt.setBackground(new java.awt.Color(255, 255, 255));
        userTxt.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        userTxt.setForeground(new java.awt.Color(153, 153, 153));
        userTxt.setText("Ingrese nombre");
        userTxt.setBorder(null);
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 170, 20));

        nombretitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo2.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo2.setText("Fecha (dd/mm/aa):");
        jPanel1.add(nombretitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 170, 20));

        userTxt1.setBackground(new java.awt.Color(255, 255, 255));
        userTxt1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        userTxt1.setForeground(new java.awt.Color(153, 153, 153));
        userTxt1.setText("Ingrese fecha");
        userTxt1.setBorder(null);
        userTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(userTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 0));

        nombretitulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo3.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo3.setText("Unidades Minimas:");
        jPanel1.add(nombretitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 170, 20));

        userTxt2.setBackground(new java.awt.Color(255, 255, 255));
        userTxt2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        userTxt2.setForeground(new java.awt.Color(153, 153, 153));
        userTxt2.setText("Ingrese Unidades");
        userTxt2.setBorder(null);
        jPanel1.add(userTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 180, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 130, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Accion para agregar una alarma
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Accion para ver la lista de alarmas
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Esta funcionalidad esta en mantenimiento", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    // Accion de salir
    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.setVisible(false);
        AccesoriosNauticos.getVGestionar().setVisible(true);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void userTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxt1ActionPerformed

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
            java.util.logging.Logger.getLogger(Alarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alarma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nombretitulo;
    private javax.swing.JLabel nombretitulo2;
    private javax.swing.JLabel nombretitulo3;
    private javax.swing.JTextField userTxt;
    private javax.swing.JTextField userTxt1;
    private javax.swing.JTextField userTxt2;
    // End of variables declaration//GEN-END:variables
}
