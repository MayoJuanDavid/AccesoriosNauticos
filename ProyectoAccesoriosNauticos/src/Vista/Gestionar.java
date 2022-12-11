/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Proyecto.AccesoriosNauticos;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Windows 10
 */
public class Gestionar extends javax.swing.JFrame {

    int xMouse,yMouse;
    public Gestionar() {
        initComponents();
        this.setLocationRelativeTo(null); // medio de la pantalla
        this.setResizable(false); //no se puede modificas
        this.setTitle("Accesorios Nauticos System");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage((new ImageIcon("src/Imagenes/Mini_Logo.png")).getImage());
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
        BAgregar = new javax.swing.JButton();
        BAlarma = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        nombretitulo = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        infoNombre = new javax.swing.JLabel();
        nombretitulo1 = new javax.swing.JLabel();
        Codigotitulo1 = new javax.swing.JLabel();
        separador5 = new javax.swing.JSeparator();
        separador6 = new javax.swing.JSeparator();
        infoNombre1 = new javax.swing.JLabel();
        infoCodigo1 = new javax.swing.JLabel();
        CodigoDelProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BAgregar.setBackground(new java.awt.Color(37, 134, 218));
        BAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BAgregar.setText("AGREGAR PRODUCTO");
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 40));

        BAlarma.setBackground(new java.awt.Color(37, 134, 218));
        BAlarma.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BAlarma.setForeground(new java.awt.Color(255, 255, 255));
        BAlarma.setText("ESTABLECER ALARMA");
        BAlarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlarmaActionPerformed(evt);
            }
        });
        jPanel1.add(BAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCir.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 200, 170));

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

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        nombretitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo.setText("Total Ventas:");
        jPanel1.add(nombretitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 20));

        separador3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 60, 10));

        infoNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        infoNombre.setForeground(new java.awt.Color(153, 153, 153));
        infoNombre.setText("0.0$");
        jPanel1.add(infoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 60, -1));

        nombretitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo1.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo1.setText("Inversion Inicial:");
        jPanel1.add(nombretitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 20));

        Codigotitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Codigotitulo1.setForeground(new java.awt.Color(153, 153, 153));
        Codigotitulo1.setText("Compras en Transito:");
        jPanel1.add(Codigotitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 20));

        separador5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 60, 10));

        separador6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 10));

        infoNombre1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        infoNombre1.setForeground(new java.awt.Color(153, 153, 153));
        infoNombre1.setText("0.0$");
        jPanel1.add(infoNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 60, -1));

        infoCodigo1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        infoCodigo1.setForeground(new java.awt.Color(153, 153, 153));
        infoCodigo1.setText("0.0$");
        jPanel1.add(infoCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 60, -1));

        CodigoDelProducto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CodigoDelProducto.setForeground(new java.awt.Color(153, 153, 153));
        CodigoDelProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        CodigoDelProducto.setText("Gestion de Sistema");
        jPanel1.add(CodigoDelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        AccesoriosNauticos.getVInventario().setVisible(true);
        AccesoriosNauticos.getVGestionar().setVisible(false);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    //Accion de crea producto
    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        this.setVisible(false);
        AccesoriosNauticos.getVAProducto().setVisible(true);
    }//GEN-LAST:event_BAgregarActionPerformed

    //Accion de establecer alarma
    private void BAlarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlarmaActionPerformed
        this.setVisible(false);
        AccesoriosNauticos.getVAlarma().setVisible(true);
    }//GEN-LAST:event_BAlarmaActionPerformed

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
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BAlarma;
    private javax.swing.JLabel CodigoDelProducto;
    private javax.swing.JLabel Codigotitulo1;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel infoCodigo1;
    private javax.swing.JLabel infoNombre;
    private javax.swing.JLabel infoNombre1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombretitulo;
    private javax.swing.JLabel nombretitulo1;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador5;
    private javax.swing.JSeparator separador6;
    // End of variables declaration//GEN-END:variables
}
