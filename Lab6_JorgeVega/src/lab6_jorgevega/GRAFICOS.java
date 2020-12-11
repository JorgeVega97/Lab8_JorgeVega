package Lab6_JorgeVega;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class GRAFICOS extends javax.swing.JFrame {

public GRAFICOS() {
        initComponents();
        this.setLocationRelativeTo(null);

        GUARDAR_TODO.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CREAR_PROGRAMA = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        NOMBRE_PROGRA = new javax.swing.JTextField();
        L7 = new javax.swing.JLabel();
        PUNTUACIONES = new javax.swing.JSlider();
        L3 = new javax.swing.JLabel();
        LANZAMIENTO = new javax.swing.JSpinner();
        L6 = new javax.swing.JLabel();
        TIPOS = new javax.swing.JTextField();
        L4 = new javax.swing.JLabel();
        GENEROS = new javax.swing.JTextField();
        bt_crearCancion = new javax.swing.JButton();
        L5 = new javax.swing.JLabel();
        jd_mostrarArchivo = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_texto = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        label_playlist = new javax.swing.JLabel();
        modi_program = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_nombreProgra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sl_puntuacion1 = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        sp_anio1 = new javax.swing.JSpinner();
        tipo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bt_modifySong = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bt_nuevaCancion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        programassss = new javax.swing.JTable();
        bt_addToPlaylist = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Claudilist = new javax.swing.JTable();
        bt_nuevaPlaylist = new javax.swing.JButton();
        bt_eliminarCancion = new javax.swing.JButton();
        bt_eliminarDePlaylist = new javax.swing.JButton();
        bt_modificarEnPlaylist = new javax.swing.JButton();
        bt_modificarCancion = new javax.swing.JButton();
        GUARDAR_TODO = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_admin = new javax.swing.JMenu();
        jmi_abrirPlaylist = new javax.swing.JMenuItem();
        jmi_cargarPlaylist = new javax.swing.JMenuItem();

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        L1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setText("AGREGAR PROGRAMA");

        L2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L2.setText("NOMBRE DEL PROGRAMA:");

        L7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        L7.setForeground(new java.awt.Color(255, 255, 255));
        L7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L7.setText("PUNTUACION");

        PUNTUACIONES.setMaximum(10);
        PUNTUACIONES.setMinimum(1);
        PUNTUACIONES.setValue(5);

        L3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        L3.setForeground(new java.awt.Color(255, 255, 255));
        L3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L3.setText("A?O");

        LANZAMIENTO.setModel(new javax.swing.SpinnerNumberModel(2020, null, 2020, 1));

        L6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        L6.setForeground(new java.awt.Color(255, 255, 255));
        L6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L6.setText("TIPO");

        L4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        L4.setForeground(new java.awt.Color(255, 255, 255));
        L4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L4.setText("GENERO");

        bt_crearCancion.setBackground(new java.awt.Color(0, 0, 0));
        bt_crearCancion.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        bt_crearCancion.setForeground(new java.awt.Color(255, 255, 255));
        bt_crearCancion.setText("Crear");
        bt_crearCancion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_crearCancion.setContentAreaFilled(false);
        bt_crearCancion.setOpaque(true);
        bt_crearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearCancionActionPerformed(evt);
            }
        });

        L5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        L5.setForeground(new java.awt.Color(255, 255, 255));
        L5.setText(" 1     2     3      4     5      6     7     8      9     10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GENEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LANZAMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addComponent(NOMBRE_PROGRA, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(L5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PUNTUACIONES, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TIPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L6))
                        .addGap(48, 48, 48)
                        .addComponent(bt_crearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(L7))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(L1)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOMBRE_PROGRA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LANZAMIENTO)
                            .addComponent(L3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GENEROS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(PUNTUACIONES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(TIPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(bt_crearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout CREAR_PROGRAMALayout = new javax.swing.GroupLayout(CREAR_PROGRAMA.getContentPane());
        CREAR_PROGRAMA.getContentPane().setLayout(CREAR_PROGRAMALayout);
        CREAR_PROGRAMALayout.setHorizontalGroup(
            CREAR_PROGRAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CREAR_PROGRAMALayout.setVerticalGroup(
            CREAR_PROGRAMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ta_texto.setEditable(false);
        ta_texto.setColumns(20);
        ta_texto.setRows(5);
        jScrollPane2.setViewportView(ta_texto);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Claudilist field: ");

        label_playlist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_mostrarArchivoLayout = new javax.swing.GroupLayout(jd_mostrarArchivo.getContentPane());
        jd_mostrarArchivo.getContentPane().setLayout(jd_mostrarArchivoLayout);
        jd_mostrarArchivoLayout.setHorizontalGroup(
            jd_mostrarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mostrarArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_mostrarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jd_mostrarArchivoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_playlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_mostrarArchivoLayout.setVerticalGroup(
            jd_mostrarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_mostrarArchivoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jd_mostrarArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_playlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MODIFICAR PROGRAMA");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("NOMBRE");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PUNTUACION");

        sl_puntuacion1.setMaximum(10);
        sl_puntuacion1.setMinimum(1);
        sl_puntuacion1.setValue(5);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("A?O");

        sp_anio1.setModel(new javax.swing.SpinnerNumberModel(2020, null, 2020, 1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("GENERO");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" 1     2     3      4     5      6     7     8      9     10");

        bt_modifySong.setBackground(new java.awt.Color(0, 0, 0));
        bt_modifySong.setForeground(new java.awt.Color(255, 255, 255));
        bt_modifySong.setText("Modificar");
        bt_modifySong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_modifySong.setContentAreaFilled(false);
        bt_modifySong.setOpaque(true);
        bt_modifySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifySongActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("TIPO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nombreProgra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(sp_anio1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sl_puntuacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(bt_modifySong, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11)))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 172, Short.MAX_VALUE)
                        .addComponent(sp_anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(tf_nombreProgra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(3, 3, 3)
                                .addComponent(sl_puntuacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(bt_modifySong, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout modi_programLayout = new javax.swing.GroupLayout(modi_program.getContentPane());
        modi_program.getContentPane().setLayout(modi_programLayout);
        modi_programLayout.setHorizontalGroup(
            modi_programLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        modi_programLayout.setVerticalGroup(
            modi_programLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        bt_nuevaCancion.setBackground(new java.awt.Color(0, 0, 0));
        bt_nuevaCancion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bt_nuevaCancion.setForeground(new java.awt.Color(255, 255, 255));
        bt_nuevaCancion.setText("Anadir Programa");
        bt_nuevaCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevaCancionActionPerformed(evt);
            }
        });

        programassss.setBackground(new java.awt.Color(255, 204, 204));
        programassss.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        programassss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuación", "Año", "Tipo", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(programassss);

        bt_addToPlaylist.setBackground(new java.awt.Color(0, 0, 0));
        bt_addToPlaylist.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bt_addToPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        bt_addToPlaylist.setText("Agregar a la Claudilist");
        bt_addToPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addToPlaylistActionPerformed(evt);
            }
        });

        Claudilist.setBackground(new java.awt.Color(255, 204, 204));
        Claudilist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntuación", "Año", "Tipo", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Claudilist);

        bt_nuevaPlaylist.setBackground(new java.awt.Color(0, 0, 0));
        bt_nuevaPlaylist.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bt_nuevaPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        bt_nuevaPlaylist.setText("Crear Claudilist");
        bt_nuevaPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevaPlaylistActionPerformed(evt);
            }
        });

        bt_eliminarCancion.setBackground(new java.awt.Color(0, 0, 0));
        bt_eliminarCancion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bt_eliminarCancion.setForeground(new java.awt.Color(255, 255, 255));
        bt_eliminarCancion.setText("Eliminar Programa");
        bt_eliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarCancionActionPerformed(evt);
            }
        });

        bt_eliminarDePlaylist.setBackground(new java.awt.Color(0, 0, 0));
        bt_eliminarDePlaylist.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bt_eliminarDePlaylist.setForeground(new java.awt.Color(255, 255, 255));
        bt_eliminarDePlaylist.setText("Eliminar de la Claudillist");
        bt_eliminarDePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarDePlaylistActionPerformed(evt);
            }
        });

        bt_modificarEnPlaylist.setBackground(new java.awt.Color(0, 0, 0));
        bt_modificarEnPlaylist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_modificarEnPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        bt_modificarEnPlaylist.setText("Modificar Claudilist");
        bt_modificarEnPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarEnPlaylistActionPerformed(evt);
            }
        });

        bt_modificarCancion.setBackground(new java.awt.Color(0, 0, 0));
        bt_modificarCancion.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        bt_modificarCancion.setForeground(new java.awt.Color(255, 255, 255));
        bt_modificarCancion.setText("Modificar Programa");
        bt_modificarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarCancionActionPerformed(evt);
            }
        });

        GUARDAR_TODO.setBackground(new java.awt.Color(255, 51, 51));
        GUARDAR_TODO.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        GUARDAR_TODO.setForeground(new java.awt.Color(255, 255, 255));
        GUARDAR_TODO.setText("Guardar ");
        GUARDAR_TODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDAR_TODOActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("CLIK PARA DESCARGAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOY EMPRENDEDOR CLAO Y YA QUE TE GUSTA EL TERROR QUIERO COMPARTIRTE ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MI APLICACION MOVIL FILL APP, ES COMO NETFLIX O AMAZON PRIME ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NADA MAS QUE COMPLETAMENTE GRATIS, SI GUSTA MAS INFO ESCRIBEME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTAMOS CON MAS DE 3000 PELICULAS Y 800 SERIES COMPLETAS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO: cuenta@faplus.com          PASSWORD: 123456  ");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButton2.setText("JUGAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(GUARDAR_TODO, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel2))
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(75, 75, 75))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addGap(52, 52, 52)))
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt_nuevaPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_modificarEnPlaylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_nuevaCancion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_modificarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_eliminarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_eliminarDePlaylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_addToPlaylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_nuevaCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_eliminarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_modificarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_nuevaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_addToPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_eliminarDePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_modificarEnPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GUARDAR_TODO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1271, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jm_admin.setText("AYUDA BESTIAL PARA CLAO");

        jmi_abrirPlaylist.setText("OPEN CLAUDILIST");
        jmi_abrirPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirPlaylistActionPerformed(evt);
            }
        });
        jm_admin.add(jmi_abrirPlaylist);

        jmi_cargarPlaylist.setText("LOADING CLAUDILIST");
        jmi_cargarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cargarPlaylistActionPerformed(evt);
            }
        });
        jm_admin.add(jmi_cargarPlaylist);

        jMenuBar1.add(jm_admin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_nuevaCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevaCancionActionPerformed
        CREAR_PROGRAMA.pack();
        CREAR_PROGRAMA.setModal(true);
        CREAR_PROGRAMA.setLocationRelativeTo(this);
        CREAR_PROGRAMA.setVisible(true);
    }//GEN-LAST:event_bt_nuevaCancionActionPerformed

    private void bt_crearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearCancionActionPerformed
        String NOM, TIPO, GENERO;
        int PUNTUACION, LANZAMINETO;

        try {

            NOM = NOMBRE_PROGRA.getText();
            PUNTUACION = this.PUNTUACIONES.getValue();
            LANZAMINETO = Integer.parseInt(LANZAMIENTO.getValue().toString());
            TIPO = this.TIPOS.getText();
            GENERO = GENEROS.getText();

            if (!NOM.equals("") && !TIPO.equals("") && !GENERO.equals("")) {
                PROGRAMA c = new PROGRAMA(NOM, PUNTUACION, LANZAMINETO, TIPO, GENERO);

                DefaultTableModel model = (DefaultTableModel) programassss.getModel();

                Object[] OBJETO = new Object[]{
                    c,
                    PUNTUACION,
                    LANZAMINETO,
                    TIPO,
                    GENERO
                };

                model.addRow(OBJETO);

                NOMBRE_PROGRA.setText("");
                PUNTUACIONES.setValue(5);
                LANZAMIENTO.setValue(2020);
                TIPOS.setText("");
                GENEROS.setText("");

                JOptionPane.showMessageDialog(CREAR_PROGRAMA, "Programa creado correctamente.", "Programa creado.", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(CREAR_PROGRAMA, "No pueden quedar campos en blanco.", "Error de ingreso.", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_bt_crearCancionActionPerformed

    private void jmi_abrirPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirPlaylistActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filter
                    = new FileNameExtensionFilter(
                            "Arhivos de texto", "txt");
            jfc.setFileFilter(filter);

            int seleccion = jfc.showOpenDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                String linea;

                ta_texto.setText("");

                while ((linea = br.readLine()) != null) {
                    ta_texto.append(linea);
                    ta_texto.append("\n");
                }

                br.close();
                fr.close();

                label_playlist.setText(fichero.getName());

                jd_mostrarArchivo.pack();
                jd_mostrarArchivo.setLocationRelativeTo(this);
                jd_mostrarArchivo.setModal(true);
                jd_mostrarArchivo.setVisible(true);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_abrirPlaylistActionPerformed

    private void bt_addToPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addToPlaylistActionPerformed
        if (programassss.getSelectedRow() >= 0) {

            int[] rows = programassss.getSelectedRows();
            for (int i = 0; i < rows.length; i++) {

                Object[] fila = new Object[]{
                    (PROGRAMA)programassss.getValueAt(rows[i], 0),
                    (Integer)programassss.getValueAt(rows[i], 1),
                    (Integer)programassss.getValueAt(rows[i], 2),
                    (String)programassss.getValueAt(rows[i], 3),
                    (String)programassss.getValueAt(rows[i], 4)
                };

                DefaultTableModel model = (DefaultTableModel) Claudilist.getModel();
                model.addRow(fila);

            }

        }
    }//GEN-LAST:event_bt_addToPlaylistActionPerformed

    private void bt_nuevaPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevaPlaylistActionPerformed
        DefaultTableModel model = (DefaultTableModel) Claudilist.getModel();

        JFileChooser fc = new JFileChooser("./");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        fc.setFileFilter(filter);
        int s = fc.showSaveDialog(this);

        if (s == JFileChooser.APPROVE_OPTION) {

            File file;
            if (fc.getFileFilter().getDescription().equals("Archivos de texto")) {
                file = new File(fc.getSelectedFile().getPath() + ".txt");
            } else {
                file = fc.getSelectedFile();
            }

            CLAUDILIST p = new CLAUDILIST(file);
            for (int i = 0; i < Claudilist.getRowCount(); i++) {
                p.getPROGRAMAS().add((PROGRAMA) model.getValueAt(i, 0));
            }

            p.escribirArchivo(file.getPath());

            JOptionPane.showMessageDialog(this, "La claudilist fue creada de manera correcta.", "Programa cread.", JOptionPane.INFORMATION_MESSAGE);

            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }

        }
    }//GEN-LAST:event_bt_nuevaPlaylistActionPerformed

    private void jmi_cargarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cargarPlaylistActionPerformed
        File fichero = null;

        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filter
                    = new FileNameExtensionFilter(
                            "Arhivos de texto", "txt");
            jfc.setFileFilter(filter);

            int seleccion = jfc.showOpenDialog(this);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();

                selectedFile = fichero;
                CLAUDILIST p = new CLAUDILIST(fichero);
                DefaultTableModel model = (DefaultTableModel) Claudilist.getModel();

                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }

                for (PROGRAMA program : p.getPROGRAMAS()) {

                    Object[] fila = new Object[]{
                        program,
                        program.getPUNTUACION(),
                        program.getLANZAMIENTO(),
                        program.getTIPO(),
                        program.getGENERO()
                    };

                    model.addRow(fila);

                }
                
                GUARDAR_TODO.setVisible(true);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_cargarPlaylistActionPerformed

    private void bt_eliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarCancionActionPerformed
        if (programassss.getSelectedRow() >= 0) {
            DefaultTableModel model = (DefaultTableModel) programassss.getModel();
            model.removeRow(programassss.getSelectedRow());
        }
    }//GEN-LAST:event_bt_eliminarCancionActionPerformed

    private void bt_eliminarDePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarDePlaylistActionPerformed
        if (Claudilist.getSelectedRow() >= 0) {
            DefaultTableModel model = (DefaultTableModel) Claudilist.getModel();
            model.removeRow(Claudilist.getSelectedRow());
        }
    }//GEN-LAST:event_bt_eliminarDePlaylistActionPerformed

    private void bt_modificarEnPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarEnPlaylistActionPerformed
        if (Claudilist.getSelectedRow() >= 0) {
            try {
                DefaultTableModel model = (DefaultTableModel) Claudilist.getModel();
                
                //int n = jtb_canciones.getSelectedColumn();
                int fila = Claudilist.getSelectedRow();
                PROGRAMA c = (PROGRAMA) model.getValueAt(fila, 0);

                selectedProgra = c;
                selectedTable = Claudilist;
                
                tf_nombreProgra.setText(c.getNOMBRE());
                sl_puntuacion1.setValue(c.getPUNTUACION());
                sp_anio1.setValue(c.getLANZAMIENTO());
                tipo.setText(c.getTIPO());
                genero.setText(c.getGENERO());

                modi_program.pack();
                modi_program.setModal(true);
                modi_program.setLocationRelativeTo(this);
                modi_program.setVisible(true);
                
                Claudilist.setModel(model);
                

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_bt_modificarEnPlaylistActionPerformed

    private void bt_modificarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarCancionActionPerformed
        if (programassss.getSelectedRow() >= 0) {
            try {
                DefaultTableModel model = (DefaultTableModel) programassss.getModel();
                

                //int n = jtb_canciones.getSelectedColumn();
                int fila = programassss.getSelectedRow();
                PROGRAMA c = (PROGRAMA) model.getValueAt(fila, 0);

                selectedProgra = c;
                selectedTable = programassss;
                
                tf_nombreProgra.setText(c.getNOMBRE());
                sl_puntuacion1.setValue(c.getPUNTUACION());
                sp_anio1.setValue(c.getLANZAMIENTO());
                tipo.setText(c.getTIPO());
                genero.setText(c.getGENERO());

                modi_program.pack();
                modi_program.setModal(true);
                modi_program.setLocationRelativeTo(this);
                modi_program.setVisible(true);
                
                programassss.setModel(model);
                

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_bt_modificarCancionActionPerformed

    private void bt_crearCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearCancion1ActionPerformed
        bt_modifySongActionPerformed(evt);
    }//GEN-LAST:event_bt_crearCancion1ActionPerformed

    private void bt_modifySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifySongActionPerformed
        String nombre, tip, gene;
        int año, puntuacion;

        try {

            nombre = tf_nombreProgra.getText();
            puntuacion = sl_puntuacion1.getValue();
            año = Integer.parseInt(sp_anio1.getValue().toString());
            tip = tipo.getText();
            gene = genero.getText();

            if (!nombre.equals("") && !tip.equals("") && !gene.equals("")) {
                

                DefaultTableModel model = (DefaultTableModel) selectedTable.getModel();
                

                selectedProgra.setNOMBRE(nombre);
                selectedProgra.setPUNTUACION(puntuacion);
                selectedProgra.setLANZAMIENTO(año);
                selectedProgra.setTIPO(tip);
                selectedProgra.setGENERO(gene);
                
                int row = selectedTable.getSelectedRow();
                
                model.setValueAt(selectedProgra, row, 0);
                model.setValueAt(puntuacion, row, 1);
                model.setValueAt(año, row, 2);
                model.setValueAt(tip, row, 3);
                model.setValueAt(gene, row, 4);
                
                JOptionPane.showMessageDialog(modi_program, "Programa modificado exitosamente.", "Programa modificado.", JOptionPane.INFORMATION_MESSAGE);
                
                modi_program.setVisible(false);
                tf_nombreProgra.setText("");
                sl_puntuacion1.setValue(5);
                sp_anio1.setValue(2020);
                tipo.setText("");
                genero.setText("");

                selectedTable.setModel(model);
                

                
            } else {
                JOptionPane.showMessageDialog(CREAR_PROGRAMA, "Todos los campos deben llenarse.", "Error de ingreso.", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_bt_modifySongActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        URL url=null;
try {
    url = new URL("http://download2337.mediafire.com/i8qwfr91qaag/p7e2ar5z0lv258l/FA_Plus_v1.0.3+%28filmapp.net%29.apk");
    try {
        Desktop.getDesktop().browse(url.toURI());
    } catch (IOException e) {
        e.printStackTrace();
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
} catch (MalformedURLException e1) {
    e1.printStackTrace();
}
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GUARDAR_TODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDAR_TODOActionPerformed
        try {
            CLAUDILIST p = new CLAUDILIST(selectedFile);
            for (int i = p.getPROGRAMAS().size() - 1; i >= 0; i--) {
                p.getPROGRAMAS().remove(i);
            }

            DefaultTableModel model = (DefaultTableModel) Claudilist.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                p.getPROGRAMAS().add((PROGRAMA) model.getValueAt(i, 0));
            }

            p.escribirArchivo(selectedFile.getPath());

            JOptionPane.showMessageDialog(this, "Se han guardado los cambios de la Claudilist.", "Guardado.", JOptionPane.INFORMATION_MESSAGE);
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            GUARDAR_TODO.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al guardar la Claudilist.", "Error.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_GUARDAR_TODOActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        PANTALLA_JUEGO S=new PANTALLA_JUEGO ();
         S.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void actualizarTabla(JTable tabla){
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        
        for (int i = 0; i < model.getRowCount(); i++) {
            
            PROGRAMA c = (PROGRAMA) model.getValueAt(i, 0);
            model.setValueAt((PROGRAMA)c, i, 0);
            model.setValueAt(c.getPUNTUACION(), i, 1);
            model.setValueAt(c.getLANZAMIENTO(), i, 2);
            model.setValueAt(c.getTIPO(), i, 3);
            model.setValueAt(c.getGENERO(), i, 0);
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GRAFICOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CREAR_PROGRAMA;
    private javax.swing.JTable Claudilist;
    private javax.swing.JTextField GENEROS;
    private javax.swing.JButton GUARDAR_TODO;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JSpinner LANZAMIENTO;
    private javax.swing.JTextField NOMBRE_PROGRA;
    private javax.swing.JSlider PUNTUACIONES;
    private javax.swing.JTextField TIPOS;
    private javax.swing.JButton bt_addToPlaylist;
    private javax.swing.JButton bt_crearCancion;
    private javax.swing.JButton bt_eliminarCancion;
    private javax.swing.JButton bt_eliminarDePlaylist;
    private javax.swing.JButton bt_modificarCancion;
    private javax.swing.JButton bt_modificarEnPlaylist;
    private javax.swing.JButton bt_modifySong;
    private javax.swing.JButton bt_nuevaCancion;
    private javax.swing.JButton bt_nuevaPlaylist;
    private javax.swing.JTextField genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_mostrarArchivo;
    private javax.swing.JMenu jm_admin;
    private javax.swing.JMenuItem jmi_abrirPlaylist;
    private javax.swing.JMenuItem jmi_cargarPlaylist;
    private javax.swing.JLabel label_playlist;
    private javax.swing.JDialog modi_program;
    private javax.swing.JTable programassss;
    private javax.swing.JSlider sl_puntuacion1;
    private javax.swing.JSpinner sp_anio1;
    private javax.swing.JTextArea ta_texto;
    private javax.swing.JTextField tf_nombreProgra;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables

    File selectedFile;
    PROGRAMA selectedProgra;
    JTable selectedTable;

}
