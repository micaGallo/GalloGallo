package traveller.interfaz.panel;

import traveller.dominio.Viaje;
import traveller.dominio.ISistema;
import traveller.excepciones.evento.EventoException;
import traveller.excepciones.fecha.FechaException;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.border.LineBorder;


public class PanelNuevoEvento extends javax.swing.JPanel {

    private ISistema sistema= null;
    
    public PanelNuevoEvento(ISistema sistema) {
        initComponents();
        this.sistema = sistema;
        actualizarComboBox();

        ArrayList<Viaje> lista = new ArrayList<Viaje>();
        Iterator<Viaje> it = sistema.getUsuarioIdentificado().getListaViajes().iterator();
        while (it.hasNext()) {
            lista.add(it.next());
        }
        listaViajes.setListData(lista.toArray());
         if (this.sistema.esModoDesarrollador()) {
            this.txtNombre.requestFocusInWindow();
            this.txtNombre.setText("Paseo al museo");
            this.txtDescripcion.setText("Visita al Museo Thyssen-Bornemisza.");
            this.txtDia.setText("28");
            this.txtMes.setText("12");
            this.txtAño.setText("2012");
            this.txtLugar.setText("Museo Thyssen-Bornemisza");
            this.listaViajes.setSelectedIndex(0);
        } else {
            this.txtNombre.requestFocusInWindow();
        }
    }

     public void actualizarComboBox() {
        for(int i=0;i<this.sistema.getListaTiposEvento().size();i++){
            comboTipo.addItem(this.sistema.getListaTiposEvento().get(i));
          //  String tipo = sistema.getListaTiposEvento().get(i);
        }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        nuevasCiudadesLbl = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        panelCrearJugador = new javax.swing.JPanel();
        txtMes = new javax.swing.JTextField();
        etqTipo = new javax.swing.JLabel();
        etqFecha = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        etqError = new javax.swing.JLabel();
        etqCorrecto = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        txtDia = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etqDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        etqNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        scrollListaViajes = new javax.swing.JScrollPane();
        listaViajes = new javax.swing.JList();
        etqViaje = new javax.swing.JLabel();
        etqLugar = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        etqFechas = new javax.swing.JLabel();
        etqAclaracion = new javax.swing.JLabel();
        nuevoTipoEventoLbl = new javax.swing.JLabel();
        nuevoTipoEventoTxt = new javax.swing.JTextField();
        agregarTipoEventoBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        nuevasCiudadesLbl.setText("Agregar nuevos destinos:");

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(460, 679));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Nuevo evento");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrearJugador.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));
        panelCrearJugador.setMaximumSize(new java.awt.Dimension(380, 290));
        panelCrearJugador.setPreferredSize(new java.awt.Dimension(380, 290));

        txtMes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtMes.setText("MM");
        txtMes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        txtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesFocusGained(evt);
            }
        });
        txtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMes.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMes.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtMes.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtMes.isFocusOwner()) {
                    txtMes.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtMes.isFocusOwner()) {
                    txtMes.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqTipo.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqTipo.setText("Tipo:");

        etqFecha.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqFecha.setText("Fecha:");

        btnAceptar.setBackground(new java.awt.Color(242, 242, 242));
        btnAceptar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAceptar.setText("Crear evento");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etqError.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqError.setForeground(new java.awt.Color(204, 0, 0));
        etqError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        etqCorrecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etqCorrecto.setForeground(new java.awt.Color(0, 153, 0));

        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        txtDia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDia.setText("DD");
        txtDia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaFocusGained(evt);
            }
        });
        txtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDia.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDia.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtDia.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtDia.isFocusOwner()) {
                    txtDia.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtDia.isFocusOwner()) {
                    txtDia.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        txtAño.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtAño.setText("AAAA");
        txtAño.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAñoFocusGained(evt);
            }
        });
        txtAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAño.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAño.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtAño.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtAño.isFocusOwner()) {
                    txtAño.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtAño.isFocusOwner()) {
                    txtAño.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        jLabel2.setText("/");

        etqDescripcion.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqDescripcion.setText("Descripción:");

        jScrollPane2.setViewportView(txtDescripcion);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcion.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcion.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtDescripcion.isFocusOwner()) {
                    txtDescripcion.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtDescripcion.isFocusOwner()) {
                    txtDescripcion.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqNombre.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombre.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombre.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtNombre.isFocusOwner()) {
                    txtNombre.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtNombre.isFocusOwner()) {
                    txtNombre.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        listaViajes.setFocusable(false);
        listaViajes.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaViajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaViajesValueChanged(evt);
            }
        });
        scrollListaViajes.setViewportView(listaViajes);

        etqViaje.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqViaje.setText("Viaje:");

        etqLugar.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqLugar.setText("Lugar:");

        txtLugar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtLugar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLugarKeyReleased(evt);
            }
        });
        txtLugar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLugar.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLugar.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtLugar.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtLugar.isFocusOwner()) {
                    txtLugar.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtLugar.isFocusOwner()) {
                    txtLugar.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqFechas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        etqAclaracion.setText("* El proceso de creación del evento prodría demorar unos segundos.");

        nuevoTipoEventoLbl.setText("Agregar nuevos destinos:");

        agregarTipoEventoBtn.setText("Agregar");
        agregarTipoEventoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTipoEventoBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("/");

        javax.swing.GroupLayout panelCrearJugadorLayout = new javax.swing.GroupLayout(panelCrearJugador);
        panelCrearJugador.setLayout(panelCrearJugadorLayout);
        panelCrearJugadorLayout.setHorizontalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqNombre)
                            .addComponent(etqLugar)
                            .addComponent(etqFecha)
                            .addComponent(etqDescripcion))
                        .addGap(75, 75, 75)
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(134, 134, 134))
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                                .addComponent(nuevoTipoEventoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevoTipoEventoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(agregarTipoEventoBtn)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134))))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(etqFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(etqViaje))
                                            .addComponent(etqTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scrollListaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(etqAclaracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelCrearJugadorLayout.setVerticalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(etqViaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollListaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqLugar)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoTipoEventoLbl)
                    .addComponent(nuevoTipoEventoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarTipoEventoBtn))
                .addGap(35, 35, 35)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(etqAclaracion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    private void txtLugarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarKeyReleased

    private void txtDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusGained
        if (txtDia.getText().equals("DD")) {
            txtDia.setText("");
        }
    }//GEN-LAST:event_txtDiaFocusGained

    private void txtMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFocusGained
        if (txtMes.getText().equals("MM")) {
            txtMes.setText("");
        }
    }//GEN-LAST:event_txtMesFocusGained

    private void txtAñoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoFocusGained
        if (txtAño.getText().equals("AAAA")) {
            txtAño.setText("");
        }
    }//GEN-LAST:event_txtAñoFocusGained

    private void listaViajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaViajesValueChanged
        if (!listaViajes.isSelectionEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIni = dateFormat.format(((Viaje) listaViajes.getSelectedValue()).getFechaInicio());
            String fechaFin = dateFormat.format(((Viaje) listaViajes.getSelectedValue()).getFechaFin());
            etqFechas.setText(fechaIni + " - " + fechaFin);
        } else {
            etqFechas.setText("");
        }
    }//GEN-LAST:event_listaViajesValueChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String tipoEvento = comboTipo.getSelectedItem().toString();

        String nombre = txtNombre.getText();
        String dia = txtDia.getText();
        String mes = txtMes.getText();
        String año = txtAño.getText();
        String lugar = txtLugar.getText();
        if (!listaViajes.isSelectionEmpty()) {
            String descripcion = txtDescripcion.getText();

            try {
                ((Viaje) listaViajes.getSelectedValue()).altaEvento(nombre, dia, mes, año, lugar, descripcion, tipoEvento);
                String accion = "<html><b>" + this.sistema.getUsuarioIdentificado().getNombre() + " "
                        + this.sistema.getUsuarioIdentificado().getApellido() + "</b> agregó el evento <i>" + nombre + "</i> al viaje.";
                SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
                Date hoy = new Date();
                String strDia = sdfDate.format(hoy);
                ((Viaje) listaViajes.getSelectedValue()).agregarLogAViaje(accion,strDia);
                etqCorrecto.setText("Registro exitoso.");
                etqError.setText(null);
                inhabilitarCampos();
		
		String mensaje = this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " agrego el evento " + nombre + " al viaje " + 
			((Viaje) listaViajes.getSelectedValue()).getNombre();
                
                String mensajeEmail = "Le notificamos que el usuario "+this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " agrego el evento " + nombre + " al viaje " + 
			((Viaje) listaViajes.getSelectedValue()).getNombre() + "\n\n Le recordamos que si no desea ser notificado mediante este medio puede darse"
                        + "de baja seleccionando la opción en 'Mi Cuenta' \n\nGracias,\n\nTraveller.";
                String titulo = this.sistema.getUsuarioIdentificado().getNombre() + " "+this.sistema.getUsuarioIdentificado().getApellido() + " ha modificado un viaje.";
		this.sistema.notificarNovedad(mensaje, mensajeEmail, titulo, (Viaje) listaViajes.getSelectedValue());
                
            } catch (EventoException e) {
                etqError.setText(e.toString());
            } catch (FechaException e) {
                etqError.setText(e.toString());
            }
        } else {
            etqError.setText("Debe seleccionar un viaje.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void agregarTipoEventoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTipoEventoBtnActionPerformed
        String nuevoTipoEvento = nuevoTipoEventoTxt.getText();
        try{
            sistema.altaTipoEvento(nuevoTipoEvento.toLowerCase());    
            etqError.setText("");
            etqCorrecto.setText("Nuevo tipo de evento agregado correctamente.");
            actualizarComboBox();
        }catch(EventoException e){
           etqCorrecto.setText("");
           etqError.setText(e.toString());
         }
        nuevoTipoEventoTxt.setText("");
    }//GEN-LAST:event_agregarTipoEventoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarTipoEventoBtn;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel etqAclaracion;
    private javax.swing.JLabel etqCorrecto;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqError;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqFechas;
    private javax.swing.JLabel etqLugar;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTipo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqViaje;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaViajes;
    private javax.swing.JLabel nuevasCiudadesLbl;
    private javax.swing.JLabel nuevoTipoEventoLbl;
    private javax.swing.JTextField nuevoTipoEventoTxt;
    private javax.swing.JPanel panelCrearJugador;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JScrollPane scrollListaViajes;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    /**
     * Inhabilita los campos de ingeso de datos.
     */
    private void inhabilitarCampos() {
        txtDia.setEditable(false);
        txtMes.setEditable(false);
        txtAño.setEditable(false);
        txtDia.setEditable(false);
        txtMes.setEditable(false);
        txtAño.setEditable(false);
        txtNombre.setEditable(false);
        txtLugar.setEditable(false);
        txtDescripcion.setEditable(false);
        btnAceptar.setEnabled(false);
    }
}
