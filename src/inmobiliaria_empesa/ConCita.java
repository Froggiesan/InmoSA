/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria_empesa;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro y Marta
 */
public class ConCita extends javax.swing.JFrame {

    /**
     * Creates new form ConCita
     */
    
    
    
    public ConCita() {
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

        jLabel10 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        panel1 = new java.awt.Panel();
        jTextField1 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        ComentariosTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        CalleLabel = new javax.swing.JLabel();
        CalleTextField = new javax.swing.JTextField();
        MotivoTextField = new javax.swing.JTextField();
        MotivoLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Lugar = new javax.swing.JComboBox<>();
        FechaHoraLabel = new javax.swing.JLabel();
        MES = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        hora = new javax.swing.JComboBox<>();
        EnviarBotton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        button1.setLabel("button1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel19.setBackground(new java.awt.Color(153, 255, 255));

        ComentariosTextArea.setBackground(new java.awt.Color(255, 255, 255));
        ComentariosTextArea.setColumns(20);
        ComentariosTextArea.setForeground(new java.awt.Color(0, 0, 0));
        ComentariosTextArea.setRows(5);
        jScrollPane10.setViewportView(ComentariosTextArea);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Comentario adicional al motivo( opcional )");

        CalleLabel.setForeground(new java.awt.Color(0, 0, 0));
        CalleLabel.setText("Calle del piso");

        CalleTextField.setBackground(new java.awt.Color(255, 255, 255));
        CalleTextField.setForeground(new java.awt.Color(0, 0, 0));
        CalleTextField.setText("C/");
        CalleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalleTextFieldActionPerformed(evt);
            }
        });

        MotivoTextField.setBackground(new java.awt.Color(255, 255, 255));
        MotivoTextField.setForeground(new java.awt.Color(0, 0, 0));
        MotivoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MotivoTextFieldKeyTyped(evt);
            }
        });

        MotivoLabel.setForeground(new java.awt.Color(0, 0, 0));
        MotivoLabel.setText("Motivo");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Lugar");

        Lugar.setForeground(new java.awt.Color(255, 255, 255));
        Lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vivienda", "Oficina" }));

        FechaHoraLabel.setForeground(new java.awt.Color(0, 0, 0));
        FechaHoraLabel.setText("Fecha y hora");

        MES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        MES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MESActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Mes");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Día");

        Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Hora");

        hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "8:30", "9:00", "9:30", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "16:00", "16:30", "17:30", "18:00", "18:30", "19:00", "19:30" }));

        EnviarBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar_59988.png"))); // NOI18N
        EnviarBotton.setText("Enviar");
        EnviarBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarBottonActionPerformed(evt);
            }
        });

        jLabel16.setText("Se ruega que sea lo más conciso en el motivo");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_empresa/64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EnviarBotton))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MotivoTextField))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(MotivoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaHoraLabel)
                    .addComponent(CalleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 168, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CalleLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaHoraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(MES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotivoLabel)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MotivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnviarBotton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalleTextFieldActionPerformed

    private void EnviarBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarBottonActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable","true"); // TLS para que este en modo true
        propiedad.setProperty("mail smtp.port", "587"); //host
        propiedad.setProperty("mail.smtp.auth", "true"); //autentificación
        
        String mesCita= (String) MES.getSelectedItem();
        String diaCita= (String) Dia.getSelectedItem();
        String horacita = (String)hora.getSelectedItem();
        String lugarCita = (String) Lugar.getSelectedItem();
        
        Session sesion = Session.getDefaultInstance(propiedad);
        //ahora ya podremos utilizar la cuenta previamente creada
        
        String correoEnvia = "inmocitasprog@gmail.com";
        String contrasena = "123123.as";
        String destinatario = "inmocitasprog@gmail.com";
        String asunto = MotivoTextField.getText();
        String mensaje = CalleTextField.getText()+"\n"+"La cita será el día "+diaCita+" de  "+
                mesCita+" a las "+horacita+"."+"\n"+"Será en la "+lugarCita+"\n"+"\n"+"\n"+ComentariosTextArea.getText();
        
        
        
        MimeMessage mail= new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress(correoEnvia)); //aqui pondremos el correo desde el cual se envia
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario)); //con esta linea elegimos el destinatario
            mail.setSubject(asunto); // pondremos el asunto con el argumento
            mail.setText(mensaje); //Aqui aplica el texto de la String del argumento que sera el cuerpo dle mail
            
            
            Transport transporte = sesion.getTransport("smtp"); //protocolo de mail
            transporte.connect(correoEnvia,contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            
            JOptionPane.showMessageDialog(null, "Correo enviado"); //confirmacion del envio del mail.
            
        } catch (AddressException ex) {
            Logger.getLogger(ConCita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(ConCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_EnviarBottonActionPerformed

    private void MESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MESActionPerformed

    private void MotivoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MotivoTextFieldKeyTyped
        // TODO add your handling code here:
        RestrictedTextField r= new RestrictedTextField(MotivoTextField);
        r.setLimit(30);
    }//GEN-LAST:event_MotivoTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(ConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CalleLabel;
    private javax.swing.JTextField CalleTextField;
    private javax.swing.JTextArea ComentariosTextArea;
    private javax.swing.JComboBox<String> Dia;
    private javax.swing.JButton EnviarBotton;
    private javax.swing.JLabel FechaHoraLabel;
    private javax.swing.JComboBox<String> Lugar;
    private javax.swing.JComboBox<String> MES;
    private javax.swing.JLabel MotivoLabel;
    private javax.swing.JTextField MotivoTextField;
    private java.awt.Button button1;
    private javax.swing.JComboBox<String> hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
