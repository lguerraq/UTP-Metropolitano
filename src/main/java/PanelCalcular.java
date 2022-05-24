import Clases.Buses;
import Clases.Paradero;
import Clases.ParaderoxRuta;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PanelCalcular extends javax.swing.JFrame {

    public PanelCalcular() {
        initComponents();
        String ruta="";
        
        //asignovlaores a combo de rutas
        cboRuta1.addItem("--ELEGIR--");
        cboRuta1.addItem("REGULAR A");
        cboRuta1.addItem("REGULAR C");
        cboRuta1.addItem("REGULAR B");
        cboRuta1.addItem("REGULAR D");
        cboRuta1.addItem("EXPRESO 1");
        cboRuta1.addItem("EXPRESO 2");
        cboRuta1.addItem("EXPRESO 3");
        cboRuta1.addItem("EXPRESO 4");
        cboRuta1.addItem("EXPRESO 5");
        cboRuta1.addItem("EXPRESO 6");
        cboRuta1.addItem("EXPRESO 7");
        cboRuta1.addItem("EXPRESO 8");
        cboRuta1.addItem("EXPRESO 9");
        cboRuta1.addItem("SUPER EXPRESO");  
    }
    
    public String[]datos(String datos){
        String[]informacion=new String[50];
        if (datos.equalsIgnoreCase("REGULAR A")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="IZAGUIRRE";
            informacion[3]="PACIFICO";
            informacion[4]="INDEPENDENCIA";
            informacion[5]="LOS JAZMINES";
            informacion[6]="TOMAS VALLE";
            informacion[7]="EL MILAGRO";
            informacion[8]="HONORIO DELGADO";
            informacion[9]="UNI";
            informacion[10]="PARQUE DEL TRABAJO";
            informacion[11]="CAQUETA";
            informacion[12]="RAMON CASTILLA";
            informacion[13]="TACNA";
            informacion[14]="JIRON DE LA UNION";
            informacion[15]="COLMENA";
            informacion[16]="ESTACION CENTRAL";
        }
        if (datos.equalsIgnoreCase("REGULAR C")){
            informacion[0]="--ELEGIR--";
            informacion[1]="RAMON CASTILLA";
            informacion[2]="TACNA";
            informacion[3]="JIRON DE LA UNION";
            informacion[4]="COLMENA";
            informacion[5]="ESTACION CENTRAL";
            informacion[6]="MEXICO";
            informacion[7]="CANADA";
            informacion[8]="JAVIER PRADO";
            informacion[9]="CANAVAL MOREYRA";
            informacion[10]="ARAMBURU";
            informacion[11]="DOMINGO ORUE";
            informacion[12]="ANGAMOS";
            informacion[13]="RICARDO PALMA";
            informacion[14]="BENAVIDES";
            informacion[15]="28 DE JULIO";
            informacion[16]="PLAZA DE FLORES";
            informacion[17]="BALTA";
            informacion[18]="BULEVAR";
            informacion[19]="ESTADIO UNION";
            informacion[20]="ESCUELA MILITAR";
            informacion[21]="TERAN";
            informacion[22]="ROSARIO DE VILLA";
            informacion[23]="MATELLINI";
        }
        if (datos.equalsIgnoreCase("REGULAR B")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="IZAGUIRRE";
            informacion[3]="PACIFICO";
            informacion[4]="INDEPENDENCIA";
            informacion[5]="LOS JAZMINES";
            informacion[6]="TOMAS VALLE";
            informacion[7]="EL MILAGRO";
            informacion[8]="HONORIO DELGADO";
            informacion[9]="UNI";
            informacion[10]="PARQUE DEL TRABAJO";
            informacion[11]="CAQUETA";
            informacion[12]="DOS DE MAYO";
            informacion[14]="QUILCA"; 
            informacion[15]="ESPAÑA"; 
            informacion[16]="ESTACION CENTRAL"; 
            informacion[17]="ESTADIO NACIONAL";
            informacion[18]="MEXICO";
            informacion[19]="CANADA";
            informacion[20]="JAVIER PRADO";
            informacion[21]="CANAVAL MOREYRA";
            informacion[22]="ARAMBURU";
            informacion[23]="DOMINGO ORUE";
            informacion[24]="ANGAMOS";
            informacion[25]="RICARDO PALMA";
            informacion[26]="BENAVIDES";
            informacion[27]="28 DE JULIO";
            informacion[28]="PLAZA DE FLORES";
            informacion[29]="BALTA";
            informacion[30]="BULEVAR";
            informacion[31]="ESTADIO UNION";
            informacion[32]="ESCUELA MILITAR";
            informacion[33]="TERAN";
            informacion[34]="ROSARIO DE VILLA";
            informacion[35]="MATELLINI";
        }
        if (datos.equalsIgnoreCase("REGULAR D")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="IZAGUIRRE";
            informacion[3]="PACIFICO";
            informacion[4]="INDEPENDENCIA";
            informacion[5]="LOS JAZMINES";
            informacion[6]="TOMAS VALLE";
            informacion[7]="EL MILAGRO";
            informacion[8]="HONORIO DELGADO";
            informacion[9]="UNI";
            informacion[10]="PARQUE DEL TRABAJO";
            informacion[11]="CAQUETA";
            informacion[12]="DOS DE MAYO";
            informacion[13]="QUILCA"; 
            informacion[14]="ESPAÑA"; 
            informacion[15]="ESTACION CENTRAL";
        
        }
        if (datos.equalsIgnoreCase("EXPRESO 1")){
            informacion[0]="--ELEGIR--";
            informacion[1]="ESTACION CENTRAL"; 
            informacion[2]="ESTADIO NACIONAL";
            informacion[3]="JAVIER PRADO";
            informacion[4]="CANAVAL MOREYRA";
            informacion[5]="ANGAMOS";
            informacion[6]="28 DE JULIO";
            informacion[7]="BALTA";
            informacion[8]="BULEVAR";
            informacion[9]="ESTADIO UNION";
            informacion[10]="ESCUELA MILITAR";
            informacion[11]="TERAN";
            informacion[12]="ROSARIO DE VILLA";
            informacion[13]="MATELLINI";
        }
        if (datos.equalsIgnoreCase("EXPRESO 2")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="CANADA";
            informacion[3]="JAVIER PRADO";
            informacion[4]="RICARDO PALMA";
            informacion[5]="28 DE JULIO";
            
        }
        if (datos.equalsIgnoreCase("EXPRESO 3")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="ANGAMOS";
            informacion[3]="BENAVIDES";
            informacion[4]="28 DE JULIO";
        }
        if (datos.equalsIgnoreCase("EXPRESO 4")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="IZAGUIRRE";
            informacion[3]="TOMAS VALLE";
            informacion[4]="UNI";
            informacion[5]="CAQUETA";
            informacion[6]="DOS DE MAYO";
            informacion[7]="ESPAÑA"; 
            informacion[8]="ESTACION CENTRAL";
            informacion[9]="JAVIER PRADO";
            informacion[10]="CANAVAL MOREYRA";
            informacion[11]="ANGAMOS";
            informacion[12]="PLAZA DE FLORES";
        }
        if (datos.equalsIgnoreCase("EXPRESO 5")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="PACIFICO";
            informacion[3]="TOMAS VALLE";
            informacion[4]="UNI";
            informacion[5]="ESPAÑA"; 
            informacion[6]="ESTACION CENTRAL";
            informacion[7]="CANADA";
            informacion[8]="JAVIER PRADO";
            informacion[9]="CANAVAL MOREYRA";
            informacion[10]="ANGAMOS";
            informacion[11]="RICARDO PALMA";
            informacion[12]="PLAZA DE FLORES";
        }
        if (datos.equalsIgnoreCase("EXPRESO 6")){
            informacion[0]="--ELEGIR--";
            informacion[1]="IZAGUIRRE";
            informacion[2]="ESTACION CENTRAL";
            informacion[3]="JAVIER PRADO";
            informacion[4]="CANAVAL MOREYRA";
            informacion[5]="ANGAMOS";
            informacion[6]="BENAVIDES";
        }
        if (datos.equalsIgnoreCase("EXPRESO 7")){
            informacion[0]="--ELEGIR--";
            informacion[1]="TOMAS VALLE";
            informacion[2]="ESTACION CENTRAL";
            informacion[3]="JAVIER PRADO";
            informacion[4]="CANAVAL MOREYRA";
            informacion[5]="ANGAMOS";
        }
        if (datos.equalsIgnoreCase("EXPRESO 8")){
            informacion[0]="--ELEGIR--";
            informacion[1]="IZAGUIRRE";
            informacion[2]="INDEPENDENCIA";
            informacion[3]="TOMAS VALLE";
            informacion[4]="UNI";
            informacion[5]="CAQUETA";
            informacion[6]="ESPAÑA"; 
            informacion[7]="ESTACION CENTRAL";
            informacion[8]="JAVIER PRADO";
            informacion[9]="CANAVAL MOREYRA";
            informacion[10]="ANGAMOS";
            informacion[11]="BENAVIDES";
            informacion[12]="PLAZA DE FLORES";
        }
        if (datos.equalsIgnoreCase("EXPRESO 9")){
            informacion[0]="--ELEGIR--";
            informacion[1]="UNI";
            informacion[2]="CAQUETA";
            informacion[3]="CANADA";
            informacion[4]="CANAVAL MOREYRA";
            informacion[5]="ANGAMOS";
            informacion[6]="BENAVIDES";
        }
        if (datos.equalsIgnoreCase("SUPER EXPRESO")){
            informacion[0]="--ELEGIR--";
            informacion[1]="NARANJAL";
            informacion[2]="CANAVAL MOREYRA";
            informacion[3]="ARAMBURU";
            informacion[4]="RICARDO PALMA";
        }
        return informacion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboParaderoDestino = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboParaderoOrigen = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtVelocidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        cboRuta1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Calcula el tiempo de llegada de tu unidad de BUS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Paradero Origen");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Paradero Destino");

        cboParaderoOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboParaderoOrigenActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jButton2.setText("RETORNAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("El tiempo es: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Horas");

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Minutos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Calcula la distancia aproximada de tu unidad de BUS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("La distancia es:");

        txtDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Calcula la velocidad aproximada de tu unidad de BUS");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("La velocidad es:");

        txtVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVelocidadActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Ruta");

        cboRuta1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboRuta1ItemStateChanged(evt);
            }
        });
        cboRuta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboRuta1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Km/h");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Km.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnCalcular)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboParaderoOrigen, 0, 144, Short.MAX_VALUE)
                                    .addComponent(cboParaderoDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboParaderoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cboRuta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboParaderoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PanelPrincipal abrir = new PanelPrincipal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String velocidad = "";
        double distancia= 0.0;
        double tiempo=0.0;
        int longitud1;
        int longitud2;
        int hora=0;
        int minutos=0;

        //obtengo velocidad de ruta
        Buses b =new Buses();
        b.setNombreBus(cboRuta1.getSelectedItem().toString());
        b.obtenerVelocidad();
        velocidad = b.getVelocidad();
        JOptionPane.showMessageDialog(null,velocidad);
        
        //obtengo longitud de paraderos
        Paradero p = new Paradero();
        p.setNombreParadero(cboParaderoOrigen.getSelectedItem().toString());
        p.obtenerLongitud();
        longitud1=p.getLongitudParadero();
        JOptionPane.showMessageDialog(null,longitud1);
        
        p.setNombreParadero(cboParaderoDestino.getSelectedItem().toString());
        p.obtenerLongitud();
        longitud2=p.getLongitudParadero();
        //JOptionPane.showMessageDialog(null,longitud2);
        
        ParaderoxRuta pr = new ParaderoxRuta();
        
        distancia = Math.abs(longitud2-longitud1);
        distancia= distancia /1000;
        //JOptionPane.showMessageDialog(null,distancia);
        
        //hallar tiempo
        tiempo = distancia/Double.parseDouble(velocidad);
        tiempo = Math.round(tiempo*100.0)/100.0;
        tiempo = tiempo*60;
        tiempo = Math.round(tiempo*100.0)/100.0;
        
        //hallar hora minuto
        hora = (int) Math.round(tiempo);
        hora = hora /60;
        txtHora.setText(String.valueOf(hora));
        if(hora>0){
        minutos = (int) Math.round(tiempo);
        minutos = minutos-60;
        txtMinutos.setText(String.valueOf(minutos));
        }
        
        if(hora<=0){
        minutos = (int) Math.round(tiempo);
        txtMinutos.setText(String.valueOf(minutos));
        }
        
        //imprimo distancia y velocidad
        txtDistancia.setText(String.valueOf(distancia));
        txtVelocidad.setText(velocidad);

        //JOptionPane.showMessageDialog(null,tiempo);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanciaActionPerformed

    private void txtVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVelocidadActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void cboParaderoOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboParaderoOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboParaderoOrigenActionPerformed

    private void cboRuta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboRuta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboRuta1ActionPerformed

    private void cboRuta1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboRuta1ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.cboRuta1.getSelectedIndex()>0){
                this.cboParaderoOrigen.setModel(new DefaultComboBoxModel(this.datos(this.cboRuta1.getSelectedItem().toString())));
                this.cboParaderoDestino.setModel(new DefaultComboBoxModel(this.datos(this.cboRuta1.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cboRuta1ItemStateChanged

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
            java.util.logging.Logger.getLogger(PanelCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelCalcular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelCalcular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cboParaderoDestino;
    private javax.swing.JComboBox<String> cboParaderoOrigen;
    private javax.swing.JComboBox<String> cboRuta1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}