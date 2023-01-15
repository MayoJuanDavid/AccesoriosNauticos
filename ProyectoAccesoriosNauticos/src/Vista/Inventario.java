package Vista;

import Controlador.ControladorBDProductos;
import Proyecto.AccesoriosNauticos;
import Modelo.Producto;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Inventario extends JFrame {
    
    // Atributos
    //ESTRUCTURAS DE CONTROL
    public int ContDescripcion = 0;                                     //Determina la Descripcion que hay que Mostrar
    public List<Producto> Lista = new ArrayList<Producto>();   //Representa la lista de Productos que se muestra en cada Pagina de un Catalogo
    public String Categoria = "Electronico";                                //Determina la Categoria que se esta Trabajando
    
        //PANELES DEL LADO DERECHO
    public JPanel PPedido = new JPanel();
    public JPanel PInfo = new JPanel();
    public JPanel PMonto = new JPanel();
    public JPanel PGestion = new JPanel();
    public JPanel PArticulos = new JPanel();

        //PANELES DEL LADO IXQUIERDO
    public JPanel PLogo = new JPanel();
    public JPanel PCategorias = new JPanel();

        //PANELES DEL LADO SUPERIOR
    public JPanel PFoto_Usuario = new JPanel();
    public JPanel PUsuario = new JPanel();
    public JPanel PBusqueda = new JPanel();

        //MARCOS
    public JPanel MarcoVDerecha = new JPanel();
    public JPanel MarcoHArriba = new JPanel();
    public JPanel MarcoHInfo = new JPanel();
    public JPanel MarcoHMonto = new JPanel();
    public JPanel MarcoVIzquierda = new JPanel();
    public JPanel MarcoHLogo = new JPanel();
    public JPanel MarcoFotoUsuario = new JPanel();
    public JPanel MarcoUsuario = new JPanel();

        //BOTONES DE LOS CATALOGOS 
    public JButton Electronicos = new JButton(new ImageIcon("src/Imagenes/fondo_cat.jpg"));
    public JButton Seguridad = new JButton(new ImageIcon("src/Imagenes/fondo_cat.jpg"));
    public JButton Combustibles = new JButton(new ImageIcon("src/Imagenes/fondo_cat.jpg"));
    public JButton Motores = new JButton(new ImageIcon("src/Imagenes/fondo_cat.jpg"));
    public JButton Miscelaneos = new JButton(new ImageIcon("src/Imagenes/fondo_cat.jpg"));
    public JButton Gestionar = new JButton(new ImageIcon("src/Imagenes/fondo.jpg"));
    public JButton Pedidos = new JButton(new ImageIcon("src/Imagenes/fondo.jpg"));
    public JButton Buscar = new JButton(new ImageIcon("src/Imagenes/fondo.jpg"));
    
        //botones para la ventan de delivery
    public JButton Cancelar=new JButton();      //boton para cancelar delivery
    public JButton Informacion=new JButton();   //boton para ver la informacion del uber
    public JButton Ruta= new JButton();         //boton para ver la ruta
    public JButton Contactar = new JButton();   //boton para contactar
    
    public JButton Enviado = new JButton();
    
        //BOTONES DEL CAMBIO DE PAGINA
    public JButton Anterior = new JButton();
    public JButton Posterior = new JButton();

        //BOTONES PARA AGREGAR Y ELIMINAR DESDE EL CATALOGO
    public JButton Accion1 = new JButton();
    public JButton Accion2 = new JButton();
    public JButton Accion3 = new JButton();
    public JButton Accion4 = new JButton();
    public JButton Accion5 = new JButton();
    public JButton Accion6 = new JButton();

        //BOTONES PARA LA INFORMACION DE UNA PRENDA
    public JButton Info1 = new JButton();
    public JButton Info2 = new JButton();
    public JButton Info3 = new JButton();
    public JButton Info4 = new JButton();
    public JButton Info5 = new JButton();
    public JButton Info6 = new JButton();
    public JButton Detalles = new JButton();

        //TEXTOS DEL PANES DE CATEGORIAS
    public JLabel TextoElectronicos = new JLabel();
    public JLabel EtiquetaElectronicos = new JLabel(new ImageIcon("src/Imagenes/Electronicos.png"));
    public JLabel TextoSeguridad = new JLabel();
    public JLabel EtiquetaSeguridad = new JLabel(new ImageIcon("src/Imagenes/Seguridad.png"));
    public JLabel TextoCombustible = new JLabel();
    public JLabel EtiquetaCombustible = new JLabel(new ImageIcon("src/Imagenes/Combustible.png"));
    public JLabel TextoMotores = new JLabel();
    public JLabel EtiquetaMotores = new JLabel(new ImageIcon("src/Imagenes/Motores.png"));
    public JLabel TextoMiscelaneos = new JLabel();
    public JLabel EtiquetaMiscelaneos = new JLabel(new ImageIcon("src/Imagenes/Miscelaneos.png"));

        //TEXTO QUE CONTIENEN LA INFORMACION DE UN ARTICULO Y DEL MONTO TOTAL EN EL CARRITO DEL PANEL DE INFORMACION
    public JLabel TInformacion = new JLabel("Información:", SwingConstants.CENTER);
    public JLabel TCodigo = new JLabel("Código: ");
    public JLabel TNombre = new JLabel("Nombre: ");
    public JLabel TCategoria = new JLabel("Categoría: ");
    public JLabel TCosto = new JLabel("Costo: ");
    public JLabel TDisponibles = new JLabel("Disponibles: ");
    public JLabel TPRentabilidad = new JLabel("% Rentabilidad: ");
    public JLabel TPVPDetal = new JLabel("PVP Detallado: ");
    public JLabel TPVP2Mayor = new JLabel("PVP2 al Mayor: ");
    public JLabel TGanancia = new JLabel("Ganancia: " + 0.0 + "$");

        //IMAGENES DE LOS ARTICULOS
    public JLabel Articulo1 = new JLabel();
    public JLabel Articulo2 = new JLabel();
    public JLabel Articulo3 = new JLabel();
    public JLabel Articulo4 = new JLabel();
    public JLabel Articulo5 = new JLabel();
    public JLabel Articulo6 = new JLabel();
    public JLabel foto1 = new JLabel();
    public JLabel foto2 = new JLabel();
    public JLabel foto3 = new JLabel();
    public JLabel foto4 = new JLabel();
    public JLabel foto5 = new JLabel();
    public JLabel foto6 = new JLabel();
    

        //TEXTOS E IMAGENES PARA REPRESENTAR LOS BOTONES DE ACCION DE LOS CATALOGOS
    public JLabel TextoPedido = new JLabel();
    public JLabel EtiquetaPedido = new JLabel(new ImageIcon("src/Imagenes/pedido_blanco.png"));
    public JLabel TextoRegresar = new JLabel();
    public JLabel TextoActualizar = new JLabel();
    public JLabel TextoCrear = new JLabel();
    public JLabel TextoGestionar = new JLabel();
    public JLabel TextoPagar = new JLabel();
    public JLabel TextoBusqueda = new JLabel();
    public JLabel EtiquetaBusqueda = new JLabel(new ImageIcon("src/Imagenes/lupa_80x80.png"));
    public JLabel Falta = new JLabel(new ImageIcon("src/Imagenes/Sin_Articulos.png"));
    public JLabel TextoDeliverys = new JLabel();
    public JLabel fondo_categoria= new JLabel();
    
    //para los pedidos
    public JLabel TextoCancelar = new JLabel();
    public JLabel TextoInformacion = new JLabel();
    public JLabel TextoInformacionUber= new JLabel();
    public JLabel TextoRuta = new JLabel();
    public JLabel TextoContactar = new JLabel();
    
    public JLabel TextoSolicitado = new JLabel();
    public JLabel TextoEnviado = new JLabel();
    public JLabel TextoRecibido = new JLabel();
    
        //TEXTOS PARA REPRESENTAR EL ENCABEZADO DEL INVITADO
    public JLabel EtiquetaFondo = new JLabel(new ImageIcon("src/Imagenes/fondo.jpeg"));
    public JLabel EtiquetaCliente = new JLabel(new ImageIcon("src/Imagenes/usuario cliente.png"));
    public JLabel Etiqueta_Empresa = new JLabel(new ImageIcon("src/Imagenes/usuario empresa.png"));
    public JLabel Etiqueta_Uber = new JLabel (new ImageIcon("src/Imagenes/uber.png"));
        //TEXTOS PARA REPRESENTAR LA INFORMACION DEL INVITADO
    public JLabel EtiquetaFondoTexto = new JLabel(new ImageIcon("src/Imagenes/fondo.jpg"));
    public JLabel TextoInvitado = new JLabel();
    public JLabel TextoUsuario = new JLabel();
    public JLabel TextoEmpresas = new JLabel();
    public JLabel TextoUber = new JLabel();

        //IMAGENES A UTILIZAR EN LA PRESENTACION DE LOS CATALOGOS
    public JLabel EtiquetaLogo = new JLabel(new ImageIcon("src/Imagenes/Logo-Principal.png"));
    public ImageIcon ImagenMas = new ImageIcon("src/Imagenes/+.png");//Imagen de agregar
    public ImageIcon ImagenEquis = new ImageIcon("src/Imagenes/x.png");//Imagen de eliminar
    public ImageIcon ImagenLupa = new ImageIcon("src/Imagenes/lupa.png");//Imagen de informacion

        //PARA EL MENU DE INICIAR SESION, CERRAR SESION Y ACERCA DE
    public JMenuBar MenuBar = new JMenuBar();
    public JMenu Flecha = new JMenu();
    public JMenuItem Iniciar = new JMenuItem();
    public JMenuItem Cerrar = new JMenuItem();
    public JMenuItem Acerca = new JMenuItem();
    public JMenuItem Proveedores = new JMenuItem();
    public JMenuItem Uber = new JMenuItem();
    public JMenuItem Ped = new JMenuItem();
    public JMenuItem IPersonal = new JMenuItem();
    
    public ImageIcon fondo = new ImageIcon("src/Imagenes/fondo.jpeg");
    
    public int limite = 0;
    
    // Constructor
    public Inventario(){
        this.setSize(1315, 839); //tamano
        this.setLocationRelativeTo(null); // medio de la pantalla
        this.setResizable(false); //no se puede modificas
        this.setTitle("Accesorios Nauticos System");
        this.setLayout(null);
        this.parteDerecha();
        this.parteIzquierda();
        this.parteCentro();
        this.panelArticulos();
        this.accionBotones();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setIconImage((new ImageIcon("src/Imagenes/Mini_Logo.png")).getImage());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int Valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer salir del Sistema?", "Advertencia",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (Valor == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        fondo_categoria.setLayout(null);
        fondo_categoria.setBounds(0,0,220,395);
        PCategorias.add(fondo_categoria);
        fondo_categoria.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(fondo_categoria.getWidth(), fondo_categoria.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    //LADO DERECHO
    //Metodo que Gestiona la Parte Derecha de la Ventana
    public void parteDerecha() {
        this.panelPedido();
        this.panelInfo();
        this.panelGanancia();
        this.panelGestion();
    }
    //Metodo que Gestiona el Panel de Pedidos (Pedidos)
    public void panelPedido() { 
        //Se establece la configuracion del Panel
        PPedido.setLayout(null);                                               //Borrar Configuracion por Defecto
        PPedido.setBounds(1030, 0, 270, 100);                                  //Posicion y Dimension
        
        //Marco vertical
        MarcoVDerecha.setBounds(1025, 0, 5, 800);                               //Posicion y Dimension
        MarcoVDerecha.setBackground(Color.BLACK);                               //Color de Fondo
        
        //Marco Horizontal
        MarcoHArriba.setBounds(220, 100, 1080, 5);                              //Posicion y Dimension
        MarcoHArriba.setBackground(Color.BLACK);                                //Color de Fondo

        //Boton de Pedidos
        Pedidos.setBounds(0, 0, 270, 100);                                      //Posicion y Dimension
        Pedidos.setLayout(null);                                                //Borrar Configuracion por Defecto
        TextoPedido.setText("Pedidos");                                       //Texto
        TextoPedido.setFont(new Font("Agency FB", Font.PLAIN, 47));           //Estilo y Fuente de Letra
        TextoPedido.setForeground(Color.WHITE);                               //Color de letra
        TextoPedido.setBounds(100, 30, 130, 40);                              //Posicion y Dimension
        EtiquetaPedido.setBounds(10, 10, 110, 70);                             //Posicion y Dimension
        EtiquetaPedido.setBackground(new Color(255, 255, 255, 0));            //Color de Fondo      
        
        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.add(PPedido);
        this.add(MarcoVDerecha);
        this.add(MarcoHArriba);
            //Agregar a Textos y Etiquetas
        Pedidos.add(TextoPedido);
        Pedidos.add(EtiquetaPedido); 
            //Agregar a Panel
        PPedido.add(Pedidos);
            //Visibilidad
        PPedido.setVisible(true);
        MarcoHArriba.setVisible(true);
        MarcoVDerecha.setVisible(true);
    }
    //Metodo que Gestiona la Informacion de los Articulos
    public void panelInfo() {
        //Se establece la configuracion del Panel
        PInfo.setLayout(null);                                                  //Borrar Configuracion por Defecto              
        PInfo.setBounds(1030, 105, 270, 490);                                   //Posicion y Dimension
        
        //Marco Horizontal
        MarcoHInfo.setBounds(1030, 595, 270, 5);                                //Posicion y Dimension
        MarcoHInfo.setBackground(Color.BLACK);

        //Texto del Titulo
        TInformacion.setBounds(32, 15, 210, 50);                                //Posicion y Dimension
        TInformacion.setFont(new Font("Agency FB", 0, 45));                     //Estilo y Fuente de Letra
        //Texto del Codigo
        TCodigo.setBounds(20, 75, 220, 35);                                     //Posicion y Dimension
        TCodigo.setFont(new Font("Agency FB", 0, 30));                          //Estilo y Fuente de Letra
        //Texto del Nombre
        TNombre.setBounds(20, 125, 220, 35);                                    //Posicion y Dimension
        TNombre.setFont(new Font("Agency FB", 0, 30));                          //Estilo y Fuente de Letra
        //Texto de la Categoria 
        TCategoria.setBounds(20, 175, 220, 35);                                 //Posicion y Dimension
        TCategoria.setFont(new Font("Agency FB", 0, 30));                       //Estilo y Fuente de Letra
        //Texto del Costo
        TCosto.setBounds(20, 225, 220, 35);                                     //Posicion y Dimension
        TCosto.setFont(new Font("Agency FB", 0, 30));                           //Estilo y Fuente de Letra
        //Texto de Disponibles
        TDisponibles.setBounds(20, 275, 220, 35);                               //Posicion y Dimension
        TDisponibles.setFont(new Font("Agency FB", 0, 30));                     //Estilo y Fuente de Letra
        //Texto de % Rentabilidad
        TPRentabilidad.setBounds(20, 325, 220, 35);                             //Posicion y Dimension
        TPRentabilidad.setFont(new Font("Agency FB", 0, 30));                   //Estilo y Fuente de Letra
        //Texto de PVP Detallado
        TPVPDetal.setBounds(20, 375, 220, 35);                                  //Posicion y Dimension
        TPVPDetal.setFont(new Font("Agency FB", 0, 30));                        //Estilo y Fuente de Letra
        //Texto de PVP2 al Mayor
        TPVP2Mayor.setBounds(20, 425, 220, 35);                                 //Posicion y Dimension
        TPVP2Mayor.setFont(new Font("Agency FB", 0, 30));                       //Estilo y Fuente de Letra

        //Configuraciones de Visibilidad y Agregacion
            //Agregar a Objeto actual
        this.add(MarcoHInfo);
        this.add(PInfo);
            //Agregar al Panel
        PInfo.add(Detalles);
        PInfo.add(TInformacion);
        PInfo.add(TCodigo);
        PInfo.add(TNombre);
        PInfo.add(TCategoria);
        PInfo.add(TCosto);
        PInfo.add(TDisponibles);
        PInfo.add(TPRentabilidad);
        PInfo.add(TPVP2Mayor);
        PInfo.add(TPVPDetal);
            //Visibilidad
        PInfo.setVisible(true);
        MarcoHInfo.setVisible(true);
    }
    //Metodo que Gestiona el Ganancia Total 
    public void panelGanancia() {
        //Se establece la configuracion del Panel
        PMonto.setLayout(null);                                                 //Borrar Configuracion por Defecto    
        PMonto.setBounds(1030, 600, 270, 80);                                   //Posicion y Dimension
        
        //Marco Horizontal
        MarcoHMonto.setBounds(1030, 680, 270, 5);                               //Posicion y Dimension
        MarcoHMonto.setBackground(Color.BLACK);
        
        //Texo del Monto            
        TGanancia.setBounds(10, 14, 250, 50);                                      //Posicion y Dimension
        TGanancia.setFont(new Font("Agency FB", 0, 40));                           //Estilo y Fuente de Letra
        TGanancia.setForeground(new Color(0, 102, 0));                             //Color de Letra
        
        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.add(MarcoHMonto);
        this.add(PMonto);
            //Agregar al Panel
        PMonto.add(TGanancia);
            //Visibilidad
        PMonto.setVisible(true);
        MarcoHMonto.setVisible(true);
    }
    //Metodo que Gestiona el Inventario
    public void panelGestion() {
        //Se establece la configuracion del Panel
        PGestion.setLayout(null);                                          //Borrar Configuracion por Defecto  
        PGestion.setBounds(1030, 685, 270, 115);                           //Posicion y Dimension
        
        //Boton de Gestionar
        Gestionar.setLayout(null);                                              //Borrar Configuracion por Defecto  
        Gestionar.setBounds(0, 0, 270, 115);                                    //Posicion y Dimension
        
        //Texto de Gestionar
        TextoGestionar.setText("Gestionar");                                   //Texto
        TextoGestionar.setFont(new Font("Agency FB", Font.PLAIN, 45));         //Estilo y Fuente de Letra
        TextoGestionar.setBounds(70, 30, 170, 50);                             //Posicion y Dimension
        TextoGestionar.setForeground(Color.WHITE);                             //Color de Fondo

        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.add(PGestion);
            //Configuraciones
        /*confPagar();                    
        confActualizarCrear(); 
        confPedidos(); // VER PEDIDOS DE LE EMPRESA
        confDeliverys(); //VER DELIVERIES PARA EL UBER
        configEnviado();
        
        configCancelar(); //CANCELAR DELIVERY
        configInformacionRutaContactar(); // Informacion del delivery*/
            //Agregar Texto y Etiquetas
        Gestionar.add(TextoGestionar);   
            //Agegrar al Panel
        PGestion.add(Gestionar); 
            //Visibilidad
        PGestion.setVisible(true);
     
    }
    
    //LADO IZQUIERDO
    //Metodo que Gestiona la Parte Izquierda de la Ventana
    public void parteIzquierda() {
        this.panelLogo();
        this.panelCategorias();
    }
    //Metodo que Gestiona el Logo de la Aplicacion
    private void panelLogo() {
        //Se establece la configuracion del Panel
        PLogo.setLayout(null);                                                  //Borrar Configuracion por Defecto 
        PLogo.setBounds(0, 0, 220, 400);                                        //Posicion y Dimension
        PLogo.setBackground(Color.BLACK);                                       //Color de Fondo

        //Marco Vertical
        MarcoVIzquierda.setBounds(220, 0, 5, 800);                              //Posicion y Dimension
        MarcoVIzquierda.setBackground(Color.BLACK);                             //Color de Fondo

        //Marco Horizontal
        MarcoHLogo.setBounds(0, 400, 220, 5);                                   //Posicion y Dimension
        MarcoHLogo.setBackground(Color.BLACK);                                  //Color de Fondo

        //Etiqueta del Logo
        EtiquetaLogo.setBounds(3, 0, 220, 400);                                //Posicion y Dimension
        
        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.add(MarcoVIzquierda);
        this.add(MarcoHLogo);
        this.add(PLogo);
            //Agregar al Panel
        PLogo.add(EtiquetaLogo);
            //Visibilidad
        PLogo.setVisible(true);
        MarcoHLogo.setVisible(true);
        MarcoVIzquierda.setVisible(true);
    }
    //Metodo que Gestiona las Categorias
    private void panelCategorias() {
        //Se establece la configuracion del Panel
        PCategorias.setLayout(null);                                            //Borrar Configuracion por Defecto
        PCategorias.setBounds(0, 405, 220, 395);                                //Posicion y Dimension
        PCategorias.setBackground(Color.BLACK);
        
        //Boton de Electronicos
        Electronicos.setLayout(null);                                                //Borrar Configuracion por Defecto
        Electronicos.setBounds(4, 0, 220, 79);                                       //Posicion y Dimension
        TextoElectronicos.setText("Electronicos");                                        //Texto
        TextoElectronicos.setFont(new Font("Agency FB", Font.PLAIN, 30));            //Estilo y Fuente de Letra
        TextoElectronicos.setForeground(Color.WHITE);                                //Color de Letra
        TextoElectronicos.setBounds(70, 20, 120, 39);                                //Posicion y Dimension
        EtiquetaElectronicos.setBounds(20, 20, 40, 40);                             //Posicion y Dimension

        //Boton de Seguridad
        Seguridad.setLayout(null);                                             //Borrar Configuracion por Defecto
        Seguridad.setBounds(4, 79, 220, 79);                                   //Posicion y Dimension
        TextoSeguridad.setText("Seguridad");                                   //Texto
        TextoSeguridad.setFont(new Font("Agency FB", Font.PLAIN, 30));          //Estilo y Fuente de Letra
        TextoSeguridad.setForeground(Color.WHITE);                              //Color de Letra
        TextoSeguridad.setBounds(70, 20, 120, 39);                              //Posicion y Dimension
        EtiquetaSeguridad.setBounds(20, 20, 40, 40);                          //Posicion y Dimension

        //Boton de Combustibles
        Combustibles.setLayout(null);                                                //Borrar Configuracion por Defecto
        Combustibles.setBounds(4, 158, 220, 79);                                     //Posicion y Dimension
        TextoCombustible.setText("Combustible");                                        //Texto
        TextoCombustible.setFont(new Font("Agency FB", Font.PLAIN, 30));            //Estilo y Fuente de Letra
        TextoCombustible.setForeground(Color.WHITE);                                //Color de Letra
        TextoCombustible.setBounds(70, 20, 120, 39);                                //Posicion y Dimension
        EtiquetaCombustible.setBounds(20, 20, 40, 40);                             //Posicion y Dimension

        //Boton de Motores
        Motores.setLayout(null);                                                //Borrar Configuracion por Defecto
        Motores.setBounds(4, 237, 220, 79);                                     //Posicion y Dimension
        TextoMotores.setText("Motores");                                        //Texto
        TextoMotores.setFont(new Font("Agency FB", Font.PLAIN, 30));            //Estilo y Fuente de Letra
        TextoMotores.setForeground(Color.WHITE);                                //Color de Letra
        TextoMotores.setBounds(70, 20, 120, 39);                                //Posicion y Dimension
        EtiquetaMotores.setBounds(20, 20, 40, 40);                             //Posicion y Dimension

        //Boton de Miscelaneos 
        Miscelaneos.setLayout(null);                                               //Borrar Configuracion por Defecto
        Miscelaneos.setBounds(4, 316, 220, 79);                                    //Posicion y Dimension
        TextoMiscelaneos.setText("Miscelaneos");                                     //Texto
        TextoMiscelaneos.setFont(new Font("Agency FB", Font.PLAIN, 30));          //Estilo y Fuente de Letra
        TextoMiscelaneos.setForeground(Color.WHITE);                              //Color de Letra
        TextoMiscelaneos.setBounds(70, 20, 120, 39);                              //Posicion y Dimension
        EtiquetaMiscelaneos.setBounds(20, 20, 40, 40);                            //Posicion y Dimension

        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.add(PCategorias);
            //Agregar a Textos
        Electronicos.add(TextoElectronicos); 
        Electronicos.add(EtiquetaElectronicos);
        Seguridad.add(TextoSeguridad); 
        Seguridad.add(EtiquetaSeguridad); 
        Combustibles.add(TextoCombustible);
        Combustibles.add(EtiquetaCombustible);
        Motores.add(TextoMotores);
        Motores.add(EtiquetaMotores);
        Miscelaneos.add(TextoMiscelaneos);
        Miscelaneos.add(EtiquetaMiscelaneos);
            //Agregar a Panel
        PCategorias.add(Seguridad);
        PCategorias.add(Electronicos); 
        PCategorias.add(Combustibles); 
        PCategorias.add(Motores);
        PCategorias.add(Miscelaneos); 
            //Visibilidad
        PCategorias.setVisible(true);
        Electronicos.setVisible(true);
        Seguridad.setVisible(true);
        Combustibles.setVisible(true);
        Motores.setVisible(true);
        Miscelaneos.setVisible(true);
    }
    
    //CENTRO
    //Metodo que Gestiona la Parte Central de la Ventana
    public void parteCentro() {
        panelFotoUsuario();
        panelUsuario();
        //confBarraOpciones();
        panelBusqueda();
    }
    //Metodo que Gestiona el Encabezado de Usuario
    private void panelFotoUsuario() {
        //Se establece la configuracion del Panel
        PFoto_Usuario.setLayout(null);                                          //Borrar Configuracion por Defecto 
        PFoto_Usuario.setBounds(225, 0, 100, 100);                              //Posicion y Dimension
        PFoto_Usuario.setBackground(Color.BLACK);
        
        //Marco del Usuario
        MarcoFotoUsuario.setBounds(325, 0, 5, 100);                             //Posicion y Dimension
        MarcoFotoUsuario.setBackground(Color.BLACK);                            //Color de Fondo
        
        //Etiqueta del Fonto
        EtiquetaFondo.setLayout(null);                                         //Borrar Configuracion por Defecto 
        EtiquetaFondo.setSize(100, 100);                                       //Dimension

        //Etiqueta del Cliente
        EtiquetaCliente.setLayout(null);                                       //Borrar Configuracion por Defecto 
        EtiquetaCliente.setSize(100, 100);                                     //Dimension

        //Etiqueta de la Empresa
        Etiqueta_Empresa.setLayout(null);                                       //Borrar Configuracion por Defecto 
        Etiqueta_Empresa.setSize(100, 100);                                     //Dimension

        //Etiqueta del Uber
        Etiqueta_Uber.setLayout(null);
        Etiqueta_Uber.setSize(100, 100);
       
     
        //Configuraciones de Visibilidad y Agregacion
            //Agrego al Objeto Actual
        this.add(PFoto_Usuario);
        this.add(MarcoFotoUsuario);
            //Agrego al Panel
        PFoto_Usuario.add(EtiquetaCliente);
        PFoto_Usuario.add(Etiqueta_Empresa);
        PFoto_Usuario.add(Etiqueta_Uber);
        PFoto_Usuario.add(EtiquetaFondo);
        
            //visibilidad
        Etiqueta_Empresa.setVisible(false);
        Etiqueta_Uber.setVisible(false);
        PFoto_Usuario.setVisible(true);
     
        MarcoFotoUsuario.setVisible(true);
    }
    //Metodo que Gestiona la Infornmacion de Usuario
    private void panelUsuario() {
        //Se establece la configuracion del Panel
        PUsuario.setLayout(null);                                               //Borrar Configuracion por Defecto 
        PUsuario.setBounds(330, 0, 330, 100);                                   //Posicion y Dimension

        //Marco del Usuario
        MarcoUsuario.setBounds(660, 0, 5, 100);                                 //Posicion y Dimension
        MarcoUsuario.setBackground(Color.BLACK);                                //Color de Fondo

        //Etiqueta Invitado
        TextoInvitado.setText("Administrador");                                     //Texto
        TextoInvitado.setFont(new Font("Agency FB", Font.PLAIN, 50));          //Estilo y Fuente de Letra
        TextoInvitado.setBounds(20, 0, 300, 100);                              //Posicion y Dimension
        TextoInvitado.setForeground(Color.WHITE);                              //Color de Letra
        
        //Etiqueta Fondo Texto
        EtiquetaFondoTexto.setLayout(null);                                   //Borrar Configuracion por Defecto 
        EtiquetaFondoTexto.setSize(330, 100);                                 //Dimension
        
        //Configuraciones de Visibilidad y Agregacion
            //Agrego al Objeto Actual
        this.getContentPane().add(MarcoUsuario);
        this.getContentPane().add(PUsuario);
            //Configuraciones
        //confBarraOpciones();
            //Agrego al Panel
        PUsuario.add(TextoInvitado);
        PUsuario.add(TextoUsuario);
        PUsuario.add(TextoEmpresas);
        PUsuario.add(TextoUber);
        PUsuario.add(EtiquetaFondoTexto);
            //Visibilidad
        TextoUsuario.setVisible(false);
        TextoInvitado.setVisible(true);
        TextoEmpresas.setVisible(false);
        TextoUber.setVisible(false);
        PUsuario.setVisible(true);
        MarcoUsuario.setVisible(true);
        EtiquetaFondoTexto.setVisible(true);
    }
    //Metodo que Gestiona la Busqueda
    private void panelBusqueda() {
        //Se establece la configuracion del Panel
        PBusqueda.setLayout(null);                                              //Borrar Configuracion por Defecto 
        PBusqueda.setBounds(665, 0, 360, 100);                                  //Posicion y Dimension
        
        //Boton de Buscar
        Buscar.setLayout(null);                                                 //Borrar Configuracion por Defecto
        Buscar.setBounds(0, 0, PBusqueda.getWidth(), PBusqueda.getHeight());    //Posicion y Dimension
        
        //Texto de Buscar
        TextoBusqueda.setText("Buscar Productos");                             //Texto
        TextoBusqueda.setFont(new Font("Agency FB", Font.PLAIN, 39));          //Estilo y Fuente de Letra
        TextoBusqueda.setForeground(Color.WHITE);                              //Color de Letra
        TextoBusqueda.setBounds(105, 25, 230, 50);                             //Posicion y Dimension
        
        //Etiquetas de Buscar
        EtiquetaBusqueda.setLayout(null);                                      //Borrar Configuracion por Defecto
        EtiquetaBusqueda.setBounds(25, 12, 80, 80);                            //Posicion y Dimension
        
        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.getContentPane().add(PBusqueda);
            //Agregar Texto y Etiquetas
        Buscar.add(EtiquetaBusqueda);
        Buscar.add(TextoBusqueda);
            //Visibilidad
        PBusqueda.setVisible(true);
        PBusqueda.add(Buscar);
    }
    //Metodo que Gestiona los Articulos que se colocan en el Catalogo
    public void panelArticulos() {
        //Se crea una Lista sobre una Categoria con Respecto a un Catalogo
        limite = 0;
        Lista = ControladorBDProductos.listaProductosVisiblesPost(0, Categoria);
        
        //Se establece la configuracion del Panel
        PArticulos.setLayout(null);
        PArticulos.setBounds(225, 105, 800, 686);
        
        //Imagen "No hay articulos que Mostrar"
        Falta.setBounds(150, 80, 500, 500);
        
        //Agregamos los Botones de Agregar o Eliminar
            //Configuraciones
        confAgregarEliminar(1, Accion1);
        confAgregarEliminar(2, Accion2);
        confAgregarEliminar(3, Accion3);
        confAgregarEliminar(4, Accion4);
        confAgregarEliminar(5, Accion5);
        confAgregarEliminar(6, Accion6);
        
        //Agregando Botones de Informacion
            //Configuraciones
        confInformacion(1, Info1);
        confInformacion(2, Info2);
        confInformacion(3, Info3);
        confInformacion(4, Info4);
        confInformacion(5, Info5);
        confInformacion(6, Info6);
        
        //Configurando Botones de Info 
        confiBotonesinfo(1, 0, Info1);
        confiBotonesinfo(2, 1, Info2);
        confiBotonesinfo(3, 2, Info3);
        confiBotonesinfo(4, 3, Info4);
        confiBotonesinfo(5, 4, Info5);
        confiBotonesinfo(6, 5, Info6);
        
        //Agregando los articulos
        agregarArticulos();
        PArticulos.add(foto1);
        PArticulos.add(foto2);
        PArticulos.add(foto3);
        PArticulos.add(foto4);
        PArticulos.add(foto5);
        PArticulos.add(foto6);
        PArticulos.add(Articulo6);
        PArticulos.add(Articulo5);
        PArticulos.add(Articulo4);
        PArticulos.add(Articulo3);
        PArticulos.add(Articulo1);
        PArticulos.add(Articulo2);
        
        //Determinamos el Comportamineto de los Botones de Anterior y Posterior
        confPosAnt(1, Posterior);
        confPosAnt(2, Anterior);
        detPosAnt();
        
        //Boton Anterior
        Anterior.setBounds(1, 25, 23, 635);                                     //Posicion y Dimension  
        Anterior.setBackground(Color.WHITE);                                    //Color de Fondo
        Anterior.setHorizontalAlignment(SwingConstants.CENTER);                 //Alineacion
        Anterior.setIcon(new ImageIcon("src/Imagenes/Flecha_Pre.png"));         //Imagen
        Anterior.setFont(new Font("times new roman", Font.ITALIC, 25));         //Estilo y Fuente de Letra
        
        //Boton Posterior
        Posterior.setBounds(776, 25, 23, 635);                                  //Posicion y Dimension 
        Posterior.setBackground(Color.WHITE);                                   //Color de Fondo
        Posterior.setHorizontalAlignment(SwingConstants.CENTER);                //Alineacion
        Posterior.setIcon(new ImageIcon("src/Imagenes/Flecha_Pos.png"));        //Imagen
        Posterior.setFont(new Font("times new roman", Font.ITALIC, 25));        //Estilo y Fuente de Letra
        
        //Configuraciones de Visibilidad y Agregacion
            //Agregar al Objeto Actual
        this.add(PArticulos);
            //Agregar al Panel
        PArticulos.add(Anterior);
        PArticulos.add(Posterior);
        PArticulos.add(Falta);
            //Visibilidad
        Anterior.setEnabled(false);                                             //Por Pagina 0
        Falta.setVisible(false);
    }

    //ACCIONES BOTONES
    //Metodo que Gestiona las Acciones de todos los Botones
    public void accionBotones() {
        // Accion del boton pedidos
        accionPedidos(Pedidos);
        // Accion del boton buscar producto
        accionBuscarProducto(Buscar);
        // Accion del boton de gestionar
        accionGestioar(Gestionar);
        //Aciones de los Botones de Agregar y Eliminar
        accionEliminar();
        //Accciondes de las categorias
        accionCategorias();
    }
    //Accion del boton de pedidos
    public void accionPedidos(JButton Accion){
        ActionListener b = (ActionEvent e) -> {
            this.setVisible(false);
            AccesoriosNauticos.getVVPedidos().setVisible(true);
        };
        Accion.addActionListener(b);
    }
    //Accion Botones de Agregar y Eliminar
    public void accionEliminar(){
        confEliminar(0, Accion1);
        confEliminar(1, Accion2);
        confEliminar(2, Accion3);
        confEliminar(3, Accion4);
        confEliminar(4, Accion5);
        confEliminar(5, Accion6);
    } 
    //Metodo que Determina el Comportamiento de los Botones Agregar y Eliminar
    public void confEliminar(int Pos, JButton Accion){
        ActionListener b = (ActionEvent e) -> {
            int Valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer eliminar el producto " + Lista.get(Pos).getNombre() + "?", "Advertencia",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (Valor == JOptionPane.YES_OPTION) {                
                ControladorBDProductos.eliminarProducto(Lista.get(Pos).getCod());

                Lista = ControladorBDProductos.listaProductosVisiblesPost(0, Categoria);
                agregarArticulos();
                deshabilitarBotones();
                Anterior.setEnabled(false);
                Posterior.setEnabled(false);
                
                if (!Lista.isEmpty()){
                    Posterior.setEnabled(true);
                    detPosAnt();
                }
                
                // Mostrar mensaje de confirmacion
                JOptionPane.showMessageDialog(null, "¡¡El producto se ha eliminado con exito!!", "Confirmacion",
                JOptionPane.OK_OPTION, new ImageIcon("src/Imagenes/Visto.jpg"));
            }
        };
        Accion.addActionListener(b);
    }
    //Metodo para configurar la accion de los botones de info
    public void confiBotonesinfo(int Lim, int Pos, JButton Info) {
        //Accion del Boton de Informacion
        ActionListener Acccion = (ActionEvent e) -> {
            ContDescripcion = Lim;
            Producto prod = Lista.get(Pos);
            actualizarInfo(prod.getCod(), prod.getNombre(), prod.getCategoria(), prod.getPrecio_compra(), prod.getDisponibilidad(),
                    prod.getPrentabilidad(), prod.getPvpdetal(), prod.getPvp2mayor(), prod.getGanancia());
        };
        Info.addActionListener(Acccion);
    }
    //Metodo para la accion de buscar producto
    public void accionBuscarProducto(JButton Info) {
        //Accion del Boton de Informacion
        ActionListener Acccion = (ActionEvent e) -> {
            AccesoriosNauticos.getVInventario().setVisible(false);
            AccesoriosNauticos.getVVProductos().setVisible(true);
        };
        Info.addActionListener(Acccion); 
    }
    //Metodo para la accion del boton de gestionar
    public void accionGestioar(JButton Info) {
        //Accion del Boton de Informacion
        ActionListener Acccion = (ActionEvent e) -> {
            AccesoriosNauticos.getVInventario().setVisible(false);
            AccesoriosNauticos.getVGestionar().setVisible(true);
        };
        Info.addActionListener(Acccion);
    }
    //Metodo para la asignar la accion de las categorias
    public void accionCategorias(){
        cambiarCategoria(Electronicos, "Electronico");
        cambiarCategoria(Seguridad, "Seguridad");
        cambiarCategoria(Combustibles, "Combustible");
        cambiarCategoria(Motores, "Motor");
        cambiarCategoria(Miscelaneos, "Miscelaneo");
    }
    //Metodo de accion de las categorias
    public void cambiarCategoria(JButton Categoria, String cat){
        //Accion del Boton de categorias
        ActionListener Acccion = (ActionEvent e) -> {
            this.Categoria = cat;
            Lista = ControladorBDProductos.listaProductosVisiblesPost(0, cat);
            Anterior.setEnabled(false);
            Posterior.setEnabled(false);
            limite = 0;
            if (!Lista.isEmpty()){
                Posterior.setEnabled(true);          
                detPosAnt();
            }
            agregarArticulos();
            deshabilitarBotones();
            limpiarInfo();            
        };
        Categoria.addActionListener(Acccion);
    }
    
    //METODOS DE FUNCIONALIDAD
    //Metodo que Agrega las Imagenes en un Catalogo
    public void agregarArticulos() {
        confImagenes(1, 0, Articulo1, foto1);
        confImagenes(2, 1, Articulo2, foto2);
        confImagenes(3, 2, Articulo3, foto3);
        confImagenes(4, 3, Articulo4, foto4);
        confImagenes(5, 4, Articulo5, foto5);
        confImagenes(6, 5, Articulo6, foto6);
    }
    //Configuracion de los Botones de Agregar y Eliminar
    public void confAgregarEliminar(int Lim, JButton Accion){
        //Determinamos si es Neceasario Imprimir el Boton, Gracias a la Longitud de la Lista
        if (Lista.size() >= Lim) {
            //Determinamos la posicion del Boton
            if (Lim==1) Accion.setBounds(210, 275, 40, 40);
            if (Lim==2) Accion.setBounds(465, 275, 40, 40);
            if (Lim==3) Accion.setBounds(720, 275, 40, 40);
            if (Lim==4) Accion.setBounds(210, 605, 40, 40);
            if (Lim==5) Accion.setBounds(465, 605, 40, 40);
            if (Lim==6) Accion.setBounds(720, 605, 40, 40);
            //Configuracion del Boton
            Accion.setIcon(ImagenEquis);
            Accion.setBackground(new Color(255, 255, 255, 0));
            Accion.setBorderPainted(false);
            Accion.setOpaque(false);
            //Agregar al Panel
            PArticulos.add(Accion);
        }
    }
    //Configuracion de los Botones de Informacion
    public void confInformacion(int Lim, JButton Info){
        //Determinamos si es Neceasario Imprimir el Boton, Gracias a la Longitud de la Lista
        if (Lista.size() >= Lim) {
            //Determinamos la Posicion del Boton
            if (Lim == 1) Info.setBounds(40, 275, 45, 45);
            if (Lim == 2) Info.setBounds(295, 275, 45, 45);
            if (Lim == 3) Info.setBounds(550, 275, 45, 45);
            if (Lim == 4) Info.setBounds(40, 605, 45, 45);
            if (Lim == 5) Info.setBounds(295, 605, 45, 45);
            if (Lim == 6) Info.setBounds(550, 605, 45, 45);
            //Configuracion del Boton
            Info.setIcon(ImagenLupa);
            Info.setBackground(new Color(255, 255, 255, 0));
            Info.setBorderPainted(false);
            Info.setOpaque(false);
            //Agragar al Panel
            PArticulos.add(Info);
        }
    }
    //Metodo que Determina el Estado de las Fotos de los Articulos
    public void confImagenes(int Lim, int Pos, JLabel Imagen, JLabel Foto){
        if (Lista.size() >= Lim) {
            if (Lim == 1){ 
                Imagen.setBounds(25, 25, 240, 305);
                Foto.setBounds(30,30,230,230);
            }
            if (Lim == 2){
                Imagen.setBounds(280, 25, 240, 305);
                Foto.setBounds(285,30,230,230);
            }
            if (Lim == 3){
                Imagen.setBounds(535, 25, 240, 305);
                Foto.setBounds(540,30,230,230);
            }
            if (Lim == 4) {
                Imagen.setBounds(25, 355, 240, 305);
                Foto.setBounds(30,360,230,230);
            }
            if (Lim == 5) {
                Imagen.setBounds(280, 355, 240, 305);
                Foto.setBounds(285,360,230,230);
            }
            if (Lim == 6) {
                Imagen.setBounds(535, 355, 240, 305);
                Foto.setBounds(540,360,230,230);
            }
            if (!Lista.get(Pos).getImagen().equals("")){
                rsscalelabel.RSScaleLabel.setScaleLabel(Foto, "src/Imagenes/Productos/" + Lista.get(Pos).getImagen());
                Foto.setVisible(true);
            }
            else Foto.setVisible(false);
            Imagen.setIcon(new ImageIcon("src/Imagenes/NO.png"));
            Imagen.setVisible(true);
            
        }else{
            Imagen.setVisible(false);
            Foto.setVisible(false);
        }
    }
    //Configuracion de las Acciones de Botones Posterior y Anterios
    public void confPosAnt(int ID, JButton Direccion){
        ActionListener Accion = (ActionEvent e) -> {
            if (ID == 1) {
                Anterior.setEnabled(true);
                cambioDePaginaF();
            }else{
                Posterior.setEnabled(false);
                cambioDePaginaB();
            }
        };
        Direccion.addActionListener(Accion);
    }
    //Metodo que Determina el Comportamiento al Cambiar de Pagina Posterior
    public void cambioDePaginaF() {
        Lista = ControladorBDProductos.listaProductosVisiblesPost(Lista.get(Lista.size()-1).getCod(), Categoria);
        agregarArticulos();
        deshabilitarBotones();
        Anterior.setEnabled(true);
        limite += 1;
        detPosAnt();
        limpiarInfo(); 
    }
    //Metodo que Determina el Comportamiento al Cambiar de Pagina Anterior
    public void cambioDePaginaB() {
        Lista = ControladorBDProductos.listaProductosVisiblesAnt(Lista.get(0).getCod(), Categoria);
        agregarArticulos();
        deshabilitarBotones();
        limite -= 1;
        Anterior.setEnabled(false);
        Posterior.setEnabled(true);
        detPosAnt();
        limpiarInfo();
    }
    //Metodo que Determina que Botones Estaran Disponibles y Cuales no
    public void deshabilitarBotones() {
        cofiVisiAgreEli(1, Accion1, Info1);
        cofiVisiAgreEli(2, Accion2, Info2);
        cofiVisiAgreEli(3, Accion3, Info3);
        cofiVisiAgreEli(4, Accion4, Info4);
        cofiVisiAgreEli(5, Accion5, Info5);
        cofiVisiAgreEli(6, Accion6, Info6);
    }
    //Configuracion de los Botones de Agregar y Eliminar
    public void cofiVisiAgreEli(int Lim, JButton Accion, JButton Info){
        if (Lista.size() < Lim) {
            Accion.setVisible(false);
            Info.setVisible(false);
        }else{
            Accion.setVisible(true);
            Info.setVisible(true);
        }
    }
    //Metodo para determinar si un boton de cambiar pestaña está habilitado o no
    public void detPosAnt(){
        try{
            if (ControladorBDProductos.verificarUltimoProducto(Lista.get(Lista.size()-1).getCod(), Categoria)) Posterior.setEnabled(false);
            else Posterior.setEnabled(true);
            if (limite == 0) Anterior.setEnabled(false);
            else Anterior.setEnabled(true);
        }catch(Exception e){
            Posterior.setEnabled(false);
        }
    }
    //Metodo que Actualiza la Informacion que se Muestra de los Articulos
    public void actualizarInfo(int cod, String nom, String cate, double cos, int dis, double prent, double pvpd, double pvpm, double ganancia) {
        TCodigo.setText("Código: " + cod);
        TNombre.setText("Nombre: " + nom);
        TCategoria.setText("Categoría: " + cate);
        TCosto.setText("Costo: " + "$" + cos);
        TDisponibles.setText("Disponibles: " + dis);
        TPRentabilidad.setText("% Rentabilidad: " + (prent*100) + "%");
        TPVP2Mayor.setText("PVP2 al Mayor: " + pvpm + "$");
        TPVPDetal.setText("PVP Detallado: " + pvpd + "$");
        TGanancia.setText("Ganancia: " + ganancia + "$");
    }
    
    // Limpiar informacion
    public void limpiarInfo(){
        TCodigo.setText("Código: ");
        TNombre.setText("Nombre: ");
        TCategoria.setText("Categoría: ");
        TCosto.setText("Costo: ");
        TDisponibles.setText("Disponibles: ");
        TPRentabilidad.setText("% Rentabilidad: ");
        TPVP2Mayor.setText("PVP2 al Mayor: ");
        TPVPDetal.setText("PVP Detallado: ");
        TGanancia.setText("Ganancia: 0.0$");
    }
    
    //METODOS VARIOS
    //Configuracion que cambia el aspecto general de los botones
    //public void confGeneral(){
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }*/
}
