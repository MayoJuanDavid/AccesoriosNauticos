/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;
import java.awt.Color;
import Modelo.Producto;
import Proyecto.AccesoriosNauticos;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Windows 10
 */
public class ModificarProducto extends javax.swing.JFrame {

    
    int xMouse,yMouse;
    private VisualizarProducto padre;
    private static Producto producto;
    /** Creates new form ModificarProducto */
    public ModificarProducto() {
        initComponents();
    }
    
    public ModificarProducto(Producto p, VisualizarProducto padre){
       
        this.padre = padre;
        this.producto = p;
        this.padre.setVisible(false);
        initComponents();
        this.setLocationRelativeTo(null); // medio de la pantalla
        this.setResizable(false); //no se puede modificas
        this.setTitle("Accesorios Nauticos System");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage((new ImageIcon("src/Imagenes/Mini_Logo.png")).getImage());
        setCampos();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        nombretitulo = new javax.swing.JLabel();
        tipoField = new javax.swing.JComboBox<String>();
        nombretitulo2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nombreField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        nombretitulo3 = new javax.swing.JLabel();
        gananciaField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nombretitulo4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nombretitulo5 = new javax.swing.JLabel();
        nombretitulo6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        nombretitulo7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        nombretitulo8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        precioField = new javax.swing.JTextField();
        unidadesField = new javax.swing.JTextField();
        precioDetalField = new javax.swing.JTextField();
        precioMayorField = new javax.swing.JTextField();
        rentabilidadField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(153, 153, 153));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        Titulo.setText("Modificar Producto");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 30));

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

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCir.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 200, 170));

        nombretitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo.setText("Nombre:");
        jPanel1.add(nombretitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 20));

        tipoField.setEditable(true);
        tipoField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tipoField.setForeground(new java.awt.Color(153, 153, 153));
        tipoField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Electronico", "Seguridad", "Motor", "Combustible", "Miscelaneo" }));
        tipoField.setAutoscrolls(true);
        tipoField.setBorder(null);
        tipoField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipoField.setFocusable(false);
        tipoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoFieldActionPerformed(evt);
            }
        });
        jPanel1.add(tipoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        nombretitulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo2.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo2.setText("Tipo:");
        jPanel1.add(nombretitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 20));

        jButton2.setBackground(new java.awt.Color(0, 134, 190));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 120, 40));

        nombreField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        nombreField.setForeground(new java.awt.Color(153, 153, 153));
        nombreField.setBorder(null);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 190, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 20));

        nombretitulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo3.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo3.setText("Ganancia:");
        jPanel1.add(nombretitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, 20));

        gananciaField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        gananciaField.setForeground(new java.awt.Color(153, 153, 153));
        gananciaField.setBorder(null);
        gananciaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciaFieldActionPerformed(evt);
            }
        });
        jPanel1.add(gananciaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 50, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 50, 20));

        nombretitulo4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo4.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo4.setText("Precio:");
        jPanel1.add(nombretitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 50, 20));

        nombretitulo5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo5.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo5.setText("Unidades disponibles:");
        jPanel1.add(nombretitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 20));

        nombretitulo6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo6.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo6.setText("Precio Detal:");
        jPanel1.add(nombretitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 70, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 70, 20));

        nombretitulo7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo7.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo7.setText("Precio al mayor:");
        jPanel1.add(nombretitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 150, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 70, 20));

        nombretitulo8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombretitulo8.setForeground(new java.awt.Color(153, 153, 153));
        nombretitulo8.setText("Rentabilidad:");
        jPanel1.add(nombretitulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 50, 20));

        precioField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        precioField.setForeground(new java.awt.Color(153, 153, 153));
        precioField.setBorder(null);
        precioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFieldActionPerformed(evt);
            }
        });
        jPanel1.add(precioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 50, 20));

        unidadesField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        unidadesField.setForeground(new java.awt.Color(153, 153, 153));
        unidadesField.setBorder(null);
        unidadesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadesFieldActionPerformed(evt);
            }
        });
        jPanel1.add(unidadesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 70, 20));

        precioDetalField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        precioDetalField.setForeground(new java.awt.Color(153, 153, 153));
        precioDetalField.setBorder(null);
        precioDetalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioDetalFieldActionPerformed(evt);
            }
        });
        jPanel1.add(precioDetalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, 20));

        precioMayorField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        precioMayorField.setForeground(new java.awt.Color(153, 153, 153));
        precioMayorField.setBorder(null);
        precioMayorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioMayorFieldActionPerformed(evt);
            }
        });
        jPanel1.add(precioMayorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 70, 20));

        rentabilidadField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        rentabilidadField.setForeground(new java.awt.Color(153, 153, 153));
        rentabilidadField.setBorder(null);
        rentabilidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentabilidadFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rentabilidadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        
        this.dispose();
        limpiar();
        
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

    private void tipoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoFieldActionPerformed

    // boton que modifica el producto
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        String nombre = nombreField.getText();
        String tipo = tipoField.getSelectedItem().toString();
        String precio = precioField.getText();
        String unidades = unidadesField.getText();
        String preciodetal = precioDetalField.getText();
        String preciomayor = precioMayorField.getText();
        String rentabilidad = rentabilidadField.getText();
        String ganancia = gananciaField.getText();
        
        int aux = ValidarCampos(nombre,tipo,precio,unidades,preciodetal,preciomayor,rentabilidad,ganancia);
  
        switch (aux) {
            
            case -1 :
            int op = JOptionPane.showConfirmDialog(null, "           ¿Estás seguro de querer modificar el producto " + producto.getNombre() + "?", "Advertencia",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (op == JOptionPane.YES_OPTION){
                // crear nuevo producto con todos los cambios
                producto.setNombre(nombre);
                producto.setCategoria(tipo);
                producto.setPrecio_compra(Double.parseDouble(precio));
                producto.setDisponibilidad(Integer.parseInt(unidades));
                producto.setPvpdetal(Double.parseDouble(preciodetal));
                producto.setPvp2mayor(Double.parseDouble(preciomayor));
                producto.setPrentabilidad(Double.parseDouble(rentabilidad));
                producto.setGanancia(Double.parseDouble(ganancia));
                for (int i = 0; i < AccesoriosNauticos.getLista_productos().size();i++){
                    if (producto.getCod() == AccesoriosNauticos.getLista_productos().get(i).getCod()){
                        AccesoriosNauticos.modificarProducto(i, producto);
                    }
                }
                this.dispose();
                this.padre.setVisible(true);
            }
            break;
            
            case 1:
                new Mensaje("El nombre no puede estar vacio",jButton2,"ERROR!!").setVisible(true);
                break;
                
            case 2:
                new Mensaje("El tipo no puede estar vacio",jButton2,"ERROR!!").setVisible(true);
                break;
            case 3:
                new Mensaje("El precio debe ser un valor numerico mayor que 0",jButton2,"ERROR!!").setVisible(true);
                break;
            
            case 4:
                new Mensaje("Las unidades deben ser un valor numerico entero mayor que 0",jButton2,"ERROR!!").setVisible(true);
                break;
            case 5:
                new Mensaje("El precio detal debe ser un valor numerico mayor que 0",jButton2,"ERROR!!").setVisible(true);
                break;
                
            case 6:
                new Mensaje("El precio al mayor debe ser un valor numerico mayor que 0",jButton2,"ERROR!!").setVisible(true);
                break;
            case 7 :
                new Mensaje("La rentabilidad debe ser un valor numerico mayor que 0",jButton2,"ERROR!!").setVisible(true);
                break;
               
            case 8:
                new Mensaje("La ganancia debe ser un valor numerico mayor que 0",jButton2,"ERROR!!").setVisible(true);
                break;

            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private int ValidarCampos(String nombre, String tipo, String precio, String unidades, String preciodetal, String preciomayor, String rentabilidad, String ganancia) {
        
       if (nombre.equals("")) {
           return 1;
       }
       
       if (tipo.equals(" ")){
           return 2;
       }
       
       if (!isNumeric(precio,true)){
           return 3;
       }else {
           if (Double.parseDouble(precio) <= 0) {
               return 3;
           }
       }
       
       if (!isNumeric(unidades,false)){
           return 4;
       }
       else {
           if (Integer.parseInt(unidades) <= 0){
               return 4;
           }
       }
       
       if (!isNumeric(preciodetal,true) ){
           return 5;
       }else{
           if(Double.parseDouble(preciodetal) <= 0){
               return 5;
           }
       }
       
       if (!isNumeric(preciomayor,true)){
           return 6;
       }else {
           if(Double.parseDouble(preciomayor) <= 0){
               return 6;
           }
       }
       
       if (!isNumeric(rentabilidad,true) ) {
           return 7;
       }else {
           if(Double.parseDouble(rentabilidad) <= 0){
               return 7;
           }
       }
       
       if (!isNumeric(ganancia,true) && Double.parseDouble(ganancia) <= 0){
           return 8;
       }else{
           if(Double.parseDouble(ganancia) <= 0){
               return 8;
           }
       }
        
       return -1;
        
    }
    
    
    private void gananciaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gananciaFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void precioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFieldActionPerformed

    private void unidadesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesFieldActionPerformed

    private void precioDetalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioDetalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioDetalFieldActionPerformed

    private void precioMayorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioMayorFieldActionPerformed
       
    }//GEN-LAST:event_precioMayorFieldActionPerformed

    private void rentabilidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentabilidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentabilidadFieldActionPerformed

    private void limpiar(){
        
        padre.getInfoCodigo().setText("");
        padre.getCodigoEntrante().setText("Ingrese el código del producto");
        padre.getInfoNombre().setText("");
        padre.getInfoPrecio().setText("");
        padre.getInfoUnidades().setText("");
        padre.getElminar().setEnabled(false);
        padre.getModificar().setEnabled(false);
        padre.getImagen().setEnabled(false);
        padre.setVisible(true);
    }
    
    private void setCampos(){
        nombreField.setText(producto.getNombre());
        tipoField.setSelectedItem(producto.getCategoria());
        precioField.setText(String.valueOf(producto.getPrecio_compra()));
        unidadesField.setText(String.valueOf(producto.getDisponibilidad()));
        precioDetalField.setText(String.valueOf(producto.getPvpdetal()));
        precioMayorField.setText(String.valueOf(producto.getPvp2mayor()));
        rentabilidadField.setText(String.valueOf(producto.getPrentabilidad()));
        gananciaField.setText(String.valueOf(producto.getGanancia()));
        
    }
    
    private boolean isNumeric(String s, boolean flag){
        
        try{
            if (flag){
                Double.parseDouble(s);
                return true;
            }else{
                Integer.parseInt(s);
                return true;
            }
        }
        catch ( NumberFormatException ex){
            return false;
        }
        
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
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JTextField gananciaField;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombretitulo;
    private javax.swing.JLabel nombretitulo2;
    private javax.swing.JLabel nombretitulo3;
    private javax.swing.JLabel nombretitulo4;
    private javax.swing.JLabel nombretitulo5;
    private javax.swing.JLabel nombretitulo6;
    private javax.swing.JLabel nombretitulo7;
    private javax.swing.JLabel nombretitulo8;
    private javax.swing.JTextField precioDetalField;
    private javax.swing.JTextField precioField;
    private javax.swing.JTextField precioMayorField;
    private javax.swing.JTextField rentabilidadField;
    private javax.swing.JComboBox<String> tipoField;
    private javax.swing.JTextField unidadesField;
    // End of variables declaration//GEN-END:variables


}
