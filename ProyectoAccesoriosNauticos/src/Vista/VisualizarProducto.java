/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;


import Modelo.Producto;
import Proyecto.AccesoriosNauticos;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class VisualizarProducto extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private int codigo = 0;
    private List<Producto> lista_productos = AccesoriosNauticos.getLista_productos();
    private Producto prod = new Producto();
    
    public VisualizarProducto() {
        initComponents();
        //Modificar estado de los botones
        BModificar.setEnabled(false);
        BEliminar.setEnabled(false);
        BVerImagen.setEnabled(false);
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

        popupMenu1 = new java.awt.PopupMenu();
        bg = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        CodigoDelProducto = new javax.swing.JLabel();
        CodigoEntrante = new javax.swing.JTextField();
        nombretitulo = new javax.swing.JLabel();
        Codigotitulo = new javax.swing.JLabel();
        unidadestitulo = new javax.swing.JLabel();
        PrecioTitulo = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        separador3 = new javax.swing.JSeparator();
        separador4 = new javax.swing.JSeparator();
        separador5 = new javax.swing.JSeparator();
        infoPrecio = new javax.swing.JLabel();
        infoNombre = new javax.swing.JLabel();
        infoCodigo = new javax.swing.JLabel();
        infoUnidades = new javax.swing.JLabel();
        BEliminar = new javax.swing.JButton();
        BVerImagen = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(550, 400));
        bg.setMinimumSize(new java.awt.Dimension(550, 400));
        bg.setPreferredSize(new java.awt.Dimension(540, 420));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCir.png"))); // NOI18N
        bg.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 200, 170));

        Producto.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Producto.setForeground(new java.awt.Color(204, 204, 204));
        Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        Producto.setText("Producto");
        bg.add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 170, 30));

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

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        CodigoDelProducto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CodigoDelProducto.setForeground(new java.awt.Color(204, 204, 204));
        CodigoDelProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        CodigoDelProducto.setText("Codigo del Producto");
        bg.add(CodigoDelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 30));

        CodigoEntrante.setBackground(new java.awt.Color(255, 255, 255));
        CodigoEntrante.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        CodigoEntrante.setForeground(new java.awt.Color(153, 153, 153));
        CodigoEntrante.setText("Ingrese el codigo del producto");
        CodigoEntrante.setBorder(null);
        CodigoEntrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoEntranteActionPerformed(evt);
            }
        });
        bg.add(CodigoEntrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, 30));

        nombretitulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombretitulo.setForeground(new java.awt.Color(204, 204, 204));
        nombretitulo.setText("Nombre:");
        bg.add(nombretitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 20));

        Codigotitulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Codigotitulo.setForeground(new java.awt.Color(204, 204, 204));
        Codigotitulo.setText("Codigo:");
        bg.add(Codigotitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 20));

        unidadestitulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        unidadestitulo.setForeground(new java.awt.Color(204, 204, 204));
        unidadestitulo.setText("Unidades:");
        bg.add(unidadestitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 60, 20));

        PrecioTitulo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        PrecioTitulo.setForeground(new java.awt.Color(204, 204, 204));
        PrecioTitulo.setText("Precio:");
        bg.add(PrecioTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 40, 20));

        separador1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 50, 10));

        separador2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 230, 10));

        separador3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 200, 10));

        separador4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 70, 10));

        separador5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 50, 10));

        infoPrecio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        infoPrecio.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(infoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 40, 20));

        infoNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        infoNombre.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(infoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 190, 20));

        infoCodigo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        infoCodigo.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(infoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 60, 20));

        infoUnidades.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        infoUnidades.setForeground(new java.awt.Color(153, 153, 153));
        bg.add(infoUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 40, 20));

        BEliminar.setBackground(new java.awt.Color(37, 134, 218));
        BEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BEliminar.setText("ELIMINAR");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        bg.add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 120, 40));

        BVerImagen.setBackground(new java.awt.Color(37, 134, 218));
        BVerImagen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BVerImagen.setForeground(new java.awt.Color(255, 255, 255));
        BVerImagen.setText("Ver Imagen");
        BVerImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerImagenActionPerformed(evt);
            }
        });
        bg.add(BVerImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        BBuscar.setBackground(new java.awt.Color(37, 134, 218));
        BBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BBuscar.setText("BUSCAR");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });
        bg.add(BBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 120, 40));

        BModificar.setBackground(new java.awt.Color(37, 134, 218));
        BModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BModificar.setForeground(new java.awt.Color(255, 255, 255));
        BModificar.setText("MODIFICAR");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });
        bg.add(BModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        AccesoriosNauticos.getVInventario().setVisible(true);
        AccesoriosNauticos.getVVProductos().setVisible(false);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void CodigoEntranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoEntranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoEntranteActionPerformed
    
    // Accion de Elimnar
    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        // Verificamos si realmente lo quiere eliminar
        int Valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer eliminar el producto \n" + prod.getNombre() + "?", "Advertencia",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (Valor == JOptionPane.YES_OPTION) {
            for (int i = 0; i < lista_productos.size();i++){
                if (lista_productos.get(i).getCod() == codigo) {
                    AccesoriosNauticos.eliminarProducto(i);
                    AccesoriosNauticos.getVInventario().actualizarListaProd();
                    lista_productos = AccesoriosNauticos.getLista_productos();
                    break;
                }
            }
            this.setVisible(false);
            AccesoriosNauticos.setVVProductos();
            AccesoriosNauticos.getVVProductos().setVisible(true);
            JOptionPane.showMessageDialog(null, "¡¡El producto se ha eliminado con exito!!", "Confirmacion",
                JOptionPane.OK_OPTION, new ImageIcon("src/Imagenes/Visto.jpg"));
        }
        
    }//GEN-LAST:event_BEliminarActionPerformed

    // Accion para mostrar la imagen
    private void BVerImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BVerImagenActionPerformed

    // Accion para buscar
    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        try{
            codigo = Integer.parseInt(CodigoEntrante.getText());
            prod = null;
            for (Producto auxprod: lista_productos){
                if (auxprod.getCod() == codigo) {
                    prod = auxprod;
                    break;
                }
            }
            // Verificamos si se consiguio
            if (prod != null)
            // Actualizamos los datos
                actualizarDatos(prod);
            else
                JOptionPane.showMessageDialog(null, "El producto buscado no existe", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Debe de colocar un código numérico válido para poder buscar", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BBuscarActionPerformed

    // Acccion de modifocar
    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BModificarActionPerformed

    // Metodo para actualizar los datos de la vista
    public void actualizarDatos(Producto prod){
        // Actualizamos los textos
        infoCodigo.setText("" + codigo);
        infoNombre.setText(prod.getNombre());
        infoPrecio.setText("" + prod.getPrecio_compra() + "$");
        infoUnidades.setText("" + prod.getDisponibilidad());
        // Habilitamos los botones
        BModificar.setEnabled(true);
        BEliminar.setEnabled(true);
        BVerImagen.setEnabled(true);
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
            java.util.logging.Logger.getLogger(VisualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton BVerImagen;
    private javax.swing.JLabel CodigoDelProducto;
    private javax.swing.JTextField CodigoEntrante;
    private javax.swing.JLabel Codigotitulo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel PrecioTitulo;
    private javax.swing.JLabel Producto;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel infoCodigo;
    private javax.swing.JLabel infoNombre;
    private javax.swing.JLabel infoPrecio;
    private javax.swing.JLabel infoUnidades;
    private javax.swing.JLabel nombretitulo;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JSeparator separador5;
    private javax.swing.JLabel unidadestitulo;
    // End of variables declaration//GEN-END:variables
}
