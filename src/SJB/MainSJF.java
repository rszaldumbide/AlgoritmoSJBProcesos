/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SJB;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rszaldumbide
 */
public class MainSJF extends javax.swing.JFrame {

    metodosSJF m;
    private int cantidad; 
    private DefaultTableModel ordenados, rafaga, resultado, proceso;
    public String[] U, L, nombre;
    
    public MainSJF() {
        initComponents();
        m=new metodosSJF(); 
        this.setExtendedState(MAXIMIZED_BOTH);
        ((DefaultTableCellRenderer) tblProcesos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) tblRafagaDeTiempo.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) tblResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) tblProcesosOrdenados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlALGORITMOFIFO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidadProcesos = new javax.swing.JTextField();
        btnAgregarProceso = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlTABLAPROCESOS = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcesos = new ColorColumnas();
        btnOrdenar = new javax.swing.JButton();
        pnlResultados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblResultados = new ColorColumnas();
        lblPromedioTT = new javax.swing.JLabel();
        lblPromedioW = new javax.swing.JLabel();
        lblPromedioP = new javax.swing.JLabel();
        pnlProcesosOrdenados = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProcesosOrdenados = new ColorColumnas();
        btnEjecutarSJB = new javax.swing.JButton();
        lblValorRafaga = new javax.swing.JLabel();
        pnlRafaga = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRafagaDeTiempo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1540, 879));

        pnlALGORITMOFIFO.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALGORITMO SJB");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de Procesos:");

        btnAgregarProceso.setBackground(new java.awt.Color(51, 51, 255));
        btnAgregarProceso.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAgregarProceso.setForeground(new java.awt.Color(255, 255, 51));
        btnAgregarProceso.setText("Mostrar Procesos");
        btnAgregarProceso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcesoActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 51, 255));
        btnReset.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 51));
        btnReset.setText("Limpiar");
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 255));
        btnSalir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 51));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlALGORITMOFIFOLayout = new javax.swing.GroupLayout(pnlALGORITMOFIFO);
        pnlALGORITMOFIFO.setLayout(pnlALGORITMOFIFOLayout);
        pnlALGORITMOFIFOLayout.setHorizontalGroup(
            pnlALGORITMOFIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlALGORITMOFIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlALGORITMOFIFOLayout.createSequentialGroup()
                .addContainerGap(602, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        pnlALGORITMOFIFOLayout.setVerticalGroup(
            pnlALGORITMOFIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlALGORITMOFIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlALGORITMOFIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProceso)
                    .addComponent(btnReset)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTABLAPROCESOS.setBackground(new java.awt.Color(0, 0, 0));
        pnlTABLAPROCESOS.setPreferredSize(new java.awt.Dimension(750, 350));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TABLA DE LOS PROCESOS DENTRO DE LISTO");

        tblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROCESOS", "TIEMPO LLEGADA (L)", "TIEMPO EJECUCION (U)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcesos.setColumnSelectionAllowed(true);
        tblProcesos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProcesos);
        tblProcesos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnOrdenar.setBackground(new java.awt.Color(51, 51, 255));
        btnOrdenar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 51));
        btnOrdenar.setText("ORDENAR PROCESOS");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTABLAPROCESOSLayout = new javax.swing.GroupLayout(pnlTABLAPROCESOS);
        pnlTABLAPROCESOS.setLayout(pnlTABLAPROCESOSLayout);
        pnlTABLAPROCESOSLayout.setHorizontalGroup(
            pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTABLAPROCESOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTABLAPROCESOSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlTABLAPROCESOSLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnOrdenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTABLAPROCESOSLayout.setVerticalGroup(
            pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTABLAPROCESOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrdenar)
                .addContainerGap())
        );

        pnlResultados.setBackground(new java.awt.Color(0, 0, 0));
        pnlResultados.setPreferredSize(new java.awt.Dimension(750, 350));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESULTADOS DEL PROCESO SJB");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PROMEDIOS:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Procesos", "Tiempo Llegada", "Tiempo Ejecucion", "Tiempo Finalizado", "T", "W", "P"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblResultados);

        lblPromedioTT.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPromedioTT.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPromedioW.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPromedioW.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPromedioP.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPromedioP.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioTT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioW, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPromedioP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPromedioTT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPromedioW, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlProcesosOrdenados.setBackground(new java.awt.Color(0, 0, 0));
        pnlProcesosOrdenados.setPreferredSize(new java.awt.Dimension(750, 350));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TABLA DE LOS PROCESOS DENTRO DE LISTO");

        tblProcesosOrdenados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROCESOS", "TIEMPO LLEGADA (L)", "TIEMPO EJECUCION (U)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcesosOrdenados.setColumnSelectionAllowed(true);
        tblProcesosOrdenados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProcesosOrdenados);

        btnEjecutarSJB.setBackground(new java.awt.Color(51, 51, 255));
        btnEjecutarSJB.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnEjecutarSJB.setForeground(new java.awt.Color(255, 255, 51));
        btnEjecutarSJB.setText("EJECUTAR SJB");
        btnEjecutarSJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarSJBActionPerformed(evt);
            }
        });

        lblValorRafaga.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lblValorRafaga.setForeground(new java.awt.Color(255, 255, 255));
        lblValorRafaga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlProcesosOrdenadosLayout = new javax.swing.GroupLayout(pnlProcesosOrdenados);
        pnlProcesosOrdenados.setLayout(pnlProcesosOrdenadosLayout);
        pnlProcesosOrdenadosLayout.setHorizontalGroup(
            pnlProcesosOrdenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProcesosOrdenadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProcesosOrdenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlProcesosOrdenadosLayout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(btnEjecutarSJB)
                        .addGap(18, 18, 18)
                        .addComponent(lblValorRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlProcesosOrdenadosLayout.setVerticalGroup(
            pnlProcesosOrdenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcesosOrdenadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProcesosOrdenadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEjecutarSJB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorRafaga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlRafaga.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RAFAGA DE TIEMPO");

        tblRafagaDeTiempo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRafagaDeTiempo.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblRafagaDeTiempo);

        javax.swing.GroupLayout pnlRafagaLayout = new javax.swing.GroupLayout(pnlRafaga);
        pnlRafaga.setLayout(pnlRafagaLayout);
        pnlRafagaLayout.setHorizontalGroup(
            pnlRafagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRafagaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRafagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlRafagaLayout.setVerticalGroup(
            pnlRafagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRafagaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRafaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlALGORITMOFIFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlTABLAPROCESOS, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlProcesosOrdenados, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlALGORITMOFIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTABLAPROCESOS, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(pnlProcesosOrdenados, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRafaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1746, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcesoActionPerformed
        // TODO add your handling code here:
        try{
            cantidad=Integer.parseInt(txtcantidadProcesos.getText());
            if(cantidad>0){
                m.imprimirMatriz(m.MatrizChar(cantidad), cantidad, tblProcesos );
                centrarTablaInicial();
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAgregarProcesoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        try{
            proceso = (DefaultTableModel)tblProcesos.getModel();
            resultado = (DefaultTableModel)tblResultados.getModel();
            rafaga = (DefaultTableModel)tblRafagaDeTiempo.getModel();
            ordenados = (DefaultTableModel)tblProcesosOrdenados.getModel();
            
            ordenados.setRowCount(0);
            proceso.setRowCount(0);
            resultado.setRowCount(0);
            rafaga.setRowCount(0);
            rafaga.setColumnCount(0);

            lblPromedioP.setText("");
            lblPromedioTT.setText("");
            lblPromedioW.setText("");
            lblValorRafaga.setText("");

            txtcantidadProcesos.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
    
    try{
        ordenados = (DefaultTableModel)tblProcesosOrdenados.getModel();
        proceso = (DefaultTableModel)tblProcesos.getModel();
        cantidad=Integer.parseInt(txtcantidadProcesos.getText());
        int arrU[]=new int[cantidad];
        int arrL[]=new int[cantidad];
        String arrN[]=new String[cantidad];
        m.imprimirMatriz(m.MatrizString(cantidad), cantidad, tblProcesosOrdenados);
        
        for(int i=0; i<cantidad; i++){
            arrU[i]=Integer.parseInt(proceso.getValueAt(i, 2).toString());
            arrL[i]=Integer.parseInt(proceso.getValueAt(i, 1).toString());
            arrN[i]=proceso.getValueAt(i, 0).toString();
        }

        m.ordenar2(arrU, arrL, arrN, ordenados, proceso, calculoRafaga());
        //m.ordenarTabla(cantidad, ordenados, proceso);
        centrarTablaOrdenada();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed
    
    private void btnEjecutarSJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarSJBActionPerformed
        
    try{
        int inicio=Integer.parseInt(tblProcesosOrdenados.getValueAt(0, 1).toString());
        cantidad=Integer.parseInt(txtcantidadProcesos.getText());
        rafaga = (DefaultTableModel)tblRafagaDeTiempo.getModel();
        ordenados = (DefaultTableModel)tblProcesosOrdenados.getModel();
        resultado = (DefaultTableModel)tblResultados.getModel();
        proceso= (DefaultTableModel)tblProcesosOrdenados.getModel();
          
        //imprimir la matriz de resultados
        m.imprimirMatriz(m.MatrizString(cantidad), cantidad, tblResultados);
        //aplicamos los calculos de la tabla
        calculosTabla();
        //se escribe los resultados en los labels
        lblPromedioTT.setText("T: "+promedioT());
        lblPromedioW.setText("W: "+promedioW());
        lblPromedioP.setText("P: "+promedioP());

        if(inicio!=0){
            lblValorRafaga.setText("La rafaga es igual a: "+(calculoRafaga()-inicio));
        }else{
            lblValorRafaga.setText("La rafaga es igual a: "+calculoRafaga());
        }

        //imprimir la matriz de rafaga
        m.imprimirMatrizRafaga(m.MatrizString(cantidad+1), cantidad, (calculoRafaga()+1), tblRafagaDeTiempo);
        for(int i=0; i<cantidad; i++){
            tblRafagaDeTiempo.setValueAt(tblProcesosOrdenados.getValueAt(i, 0), i, 0);
        }
        
        llenadoRafaga();
        
        centrarTablasCalculos();
        centrarTablaRafaga();
        centrarTablasCalculos();
        //se pinta la matriz
        for(int i=0; i<(calculoRafaga()+1); i++){
            tblRafagaDeTiempo.getColumnModel().getColumn(i).setCellRenderer(new colorCelda());      
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEjecutarSJBActionPerformed
     
    
    private void llenadoRafaga(){
       
        DefaultTableModel rafaga = (DefaultTableModel)tblRafagaDeTiempo.getModel();
        int Tf, L;
        int aux;
        
        int inicio=Integer.parseInt(tblProcesosOrdenados.getValueAt(0, 1).toString());
        
        if(inicio!=0){
            aux=inicio;
            for(int i=0; i<cantidad; i++){
            //llenar los datos de la tabla inicial a la de resultados
                Tf = Integer.parseInt(tblResultados.getValueAt(i, 3).toString());

                while(aux!=Tf){
                    rafaga.setValueAt((tblProcesosOrdenados.getValueAt(i, 0).toString()), i, aux+1); 
                    aux++;
                }   
            }
            for(int i=0; i<cantidad; i++){
            //llenar los datos de la tabla inicial a la de resultados
                L = Integer.parseInt(tblResultados.getValueAt(i, 1).toString());
                Tf = Integer.parseInt(tblResultados.getValueAt(i, 3).toString());
                if(i==0){
                    for(int j= (L+inicio); j<Tf; j++){
                        rafaga.setValueAt((tblProcesosOrdenados.getValueAt(i, 0).toString()), i, (j+1)); 
                    }   
                }
            }
        }else{
            aux=0;
            for(int i=0; i<cantidad; i++){
            //llenar los datos de la tabla inicial a la de resultados
                Tf = Integer.parseInt(tblResultados.getValueAt(i, 3).toString());

                while(aux!=Tf){
                    rafaga.setValueAt((tblProcesosOrdenados.getValueAt(i, 0).toString()), i, aux+1); 
                    aux++;
                }   
            }
            for(int i=0; i<cantidad; i++){
            //llenar los datos de la tabla inicial a la de resultados
                L = Integer.parseInt(tblResultados.getValueAt(i, 1).toString());
                Tf = Integer.parseInt(tblResultados.getValueAt(i, 3).toString());
                if(i==0){
                    for(int j= (L+inicio); j<(Tf+inicio); j++){
                        rafaga.setValueAt((tblProcesosOrdenados.getValueAt(i, 0).toString()), i, (j+1)); 
                    }   
                } 
            }
        } 
    }

    private void calculosTabla(){
        
        DefaultTableModel resultados = (DefaultTableModel)tblResultados.getModel();
        int res=0;
        double L, U, Tf, T, W;
        double P;
        String proceso;
            
        for(int i=0; i<cantidad; i++){
        //llenar los datos de la tabla inicial a la de resultados
            proceso=tblProcesos.getValueAt(i, 0).toString();
            resultados.setValueAt(proceso, i, 0);
            L = Math.round(Double.parseDouble(tblProcesosOrdenados.getValueAt(i, 1).toString()));
            U = Math.round(Double.parseDouble(tblProcesosOrdenados.getValueAt(i, 2).toString()));
            resultados.setValueAt((int)(L), i, 1);                
            resultados.setValueAt((int)(U), i, 2);

            //Tiempo Finalizacion!!
            if(i==0){
                Tf=Math.round(L+U);
                resultados.setValueAt((int)(Tf), 0, 3);
            }else{
                Tf=0;
                U = Math.round(Double.parseDouble(tblProcesosOrdenados.getValueAt(i, 2).toString()));
                Tf=Math.round(Double.parseDouble(tblResultados.getValueAt((i-1), 3).toString()));
                resultados.setValueAt((int)(Tf+U), i, 3);
            }

            //Tiempo de trabajo
            Tf=Math.round(Double.parseDouble(tblResultados.getValueAt((i), 3).toString()));
            T=Math.round(Tf-L);
            resultados.setValueAt((int)(T), i, 4);

            //Tiempo de espera
            T=Math.round(Double.parseDouble(tblResultados.getValueAt((i), 4).toString()));
            W=Math.round(T-U);
            resultados.setValueAt((int)(W), i, 5);

            //tiempo P
            P=(T/U);
            res=round(P);
            resultados.setValueAt(res, i, 6);
        }  
    }
    
    private int calculoRafaga(){ 
        cantidad=Integer.parseInt(txtcantidadProcesos.getText());
        int tmp, rafaga=0, rafaga2;
        
        int inicio=Integer.parseInt(tblProcesos.getValueAt(0, 1).toString());
        
        if(inicio!=0){
            for(int i=0; i<cantidad; i++){
                tmp = Integer.parseInt(tblProcesos.getValueAt(i, 2).toString());
                rafaga=tmp+rafaga;
                }
            rafaga2=inicio+rafaga;
        }else{
            for(int i=0; i<cantidad; i++){
                tmp = Integer.parseInt(tblProcesos.getValueAt(i, 2).toString());
                rafaga=tmp+rafaga;
                }
            rafaga2=rafaga;
        } 
        return rafaga2;
    }
    
    private int round(double d){ 
        double dAbs = Math.abs(d); 
        int i = (int) dAbs; 
        double result = dAbs - (double) i; 
        if(result<0.5){ 
            return d<0 ? -i : i;
        }else{ 
            return d<0 ? -(i+1) : i+1; }
    }
    
    private int promedioT(){
        int res=0;
        double tmp, promedioT=0, suma=0;
        for(int i=0; i<cantidad; i++){
            tmp = Double.parseDouble(tblResultados.getValueAt(i, 4).toString());
            suma=tmp+suma;
            promedioT=suma/cantidad;
        } 
        res=round(promedioT);
        
        return res;
    }
    
    private int promedioW(){
        int res=0;
        double tmp, promedioW=0, suma=0;
        for(int i=0; i<cantidad; i++){
            tmp = Double.parseDouble(tblResultados.getValueAt(i, 5).toString());
            suma=tmp+suma;
            promedioW=suma/cantidad;
        }
        res=round(promedioW);
        
        return res;
    }
    
    private int promedioP(){
        int res=0;
        double tmp, promedioP=0, suma=0;
        for(int i=0; i<cantidad; i++){
            tmp = Math.round(Integer.parseInt(tblResultados.getValueAt(i, 6).toString()));
            suma=Math.round(tmp+suma);    
            promedioP=(suma/cantidad); 
        }
        res=round(promedioP);
        
        return res;
    }
    
    private void centrarTablaInicial(){

        for(int i=0; i< 3; i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblProcesos.getColumnModel().getColumn(i).setCellRenderer(tcr);   
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblProcesos.getColumnModel().getColumn(i).setCellRenderer(tcr);  
            }   
        }          
    }
 
    private void centrarTablaOrdenada(){

        for(int i=0; i< 3; i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblProcesosOrdenados.getColumnModel().getColumn(i).setCellRenderer(tcr);   
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblProcesosOrdenados.getColumnModel().getColumn(i).setCellRenderer(tcr);  
            }   
        }
    }
    
    private void centrarTablasCalculos(){

        for(int i=0; i< 7; i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblResultados.getColumnModel().getColumn(i).setCellRenderer(tcr);  
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblResultados.getColumnModel().getColumn(i).setCellRenderer(tcr); 
            } 
        } 
    }
    
    private void centrarTablaRafaga(){
        //centrar los valores de las tablas   
        for(int i=0; i< (calculoRafaga()+1); i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblRafagaDeTiempo.getColumnModel().getColumn(i).setCellRenderer(tcr); 
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblRafagaDeTiempo.getColumnModel().getColumn(i).setCellRenderer(tcr);
            }
        }             
    }

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
            java.util.logging.Logger.getLogger(MainSJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProceso;
    private javax.swing.JButton btnEjecutarSJB;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblPromedioP;
    private javax.swing.JLabel lblPromedioTT;
    private javax.swing.JLabel lblPromedioW;
    private javax.swing.JLabel lblValorRafaga;
    private javax.swing.JPanel pnlALGORITMOFIFO;
    private javax.swing.JPanel pnlProcesosOrdenados;
    private javax.swing.JPanel pnlRafaga;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JPanel pnlTABLAPROCESOS;
    private javax.swing.JTable tblProcesos;
    private javax.swing.JTable tblProcesosOrdenados;
    public javax.swing.JTable tblRafagaDeTiempo;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtcantidadProcesos;
    // End of variables declaration//GEN-END:variables
}
