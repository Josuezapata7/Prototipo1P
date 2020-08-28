package Multibodega;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import keeptoo.Drag;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Langas
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public static String BD = "jdbc:mysql://localhost/Multibodegas";
    public static String Usuario = "root";
    public static String Contaseña = "root";
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kgrant = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Kgrant2 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_Gmail_Usuario = new javax.swing.JTextField();
        txt_Nombre_Usuario = new javax.swing.JTextField();
        txt_Contraseña_Usuario = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kgrant.setkBorderRadius(0);
        Kgrant.setkEndColor(new java.awt.Color(97, 212, 195));
        Kgrant.setkStartColor(new java.awt.Color(97, 212, 195));
        Kgrant.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                KgrantMouseDragged(evt);
            }
        });
        Kgrant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KgrantMousePressed(evt);
            }
        });
        Kgrant.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");
        Kgrant.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Kgrant.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 240, 20));

        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Kgrant.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 290, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calendario_Blanco.png"))); // NOI18N
        Kgrant.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 170));

        getContentPane().add(Kgrant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 590));

        Kgrant2.setkBorderRadius(0);
        Kgrant2.setkEndColor(new java.awt.Color(36, 47, 65));
        Kgrant2.setkStartColor(new java.awt.Color(36, 47, 65));
        Kgrant2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Kgrant2MouseDragged(evt);
            }
        });
        Kgrant2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Kgrant2MousePressed(evt);
            }
        });
        Kgrant2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign in or Sign Up");
        Kgrant2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 50));

        txt_Gmail_Usuario.setBackground(new Color(0,0,0,0));
        txt_Gmail_Usuario.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txt_Gmail_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Gmail_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Gmail_Usuario.setOpaque(false);
        Kgrant2.add(txt_Gmail_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 200, 30));

        txt_Nombre_Usuario.setBackground(new Color(0,0,0,0));
        txt_Nombre_Usuario.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        txt_Nombre_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Nombre_Usuario.setOpaque(false);
        Kgrant2.add(txt_Nombre_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, 30));

        txt_Contraseña_Usuario.setBackground(new Color(0,0,0,0));
        txt_Contraseña_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contraseña_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Contraseña_Usuario.setOpaque(false);
        txt_Contraseña_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Contraseña_UsuarioActionPerformed(evt);
            }
        });
        Kgrant2.add(txt_Contraseña_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        Kgrant2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");
        Kgrant2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gmail");
        Kgrant2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Aceptar Terminos y Condiciones");
        jCheckBox1.setBorder(null);
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        Kgrant2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        kButton1.setText("SignIn");
        kButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kButton1.setkAllowTab(true);
        kButton1.setkBackGroundColor(new java.awt.Color(36, 47, 65));
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(36, 47, 65));
        kButton1.setkFillButton(false);
        kButton1.setkHoverColor(new java.awt.Color(51, 51, 51));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverStartColor(new java.awt.Color(36, 47, 65));
        kButton1.setkIndicatorColor(new java.awt.Color(0, 102, 102));
        kButton1.setkSelectedColor(new java.awt.Color(51, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(0, 204, 204));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        Kgrant2.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, -1, -1));

        kButton2.setText("SignUp");
        kButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kButton2.setkAllowTab(true);
        kButton2.setkBackGroundColor(new java.awt.Color(36, 47, 65));
        kButton2.setkBorderRadius(30);
        kButton2.setkEndColor(new java.awt.Color(36, 47, 65));
        kButton2.setkFillButton(false);
        kButton2.setkHoverColor(new java.awt.Color(51, 51, 51));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 153, 153));
        kButton2.setkHoverStartColor(new java.awt.Color(36, 47, 65));
        kButton2.setkIndicatorColor(new java.awt.Color(0, 102, 102));
        kButton2.setkSelectedColor(new java.awt.Color(51, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(0, 204, 204));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        Kgrant2.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        Kgrant2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 20, 30));

        getContentPane().add(Kgrant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -10, 420, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kgrant2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kgrant2MouseDragged
        // TODO add your handling code here:
    
    }//GEN-LAST:event_Kgrant2MouseDragged

    private void Kgrant2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kgrant2MousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Kgrant2MousePressed

    private void KgrantMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KgrantMouseDragged
        // TODO add your handling code here:
        new Drag(Kgrant).moveWindow(evt);
    }//GEN-LAST:event_KgrantMouseDragged

    private void KgrantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KgrantMousePressed
        // TODO add your handling code here:
        new Drag(Kgrant).onPress(evt);
    }//GEN-LAST:event_KgrantMousePressed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void txt_Contraseña_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Contraseña_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Contraseña_UsuarioActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
            try{
                Connection cn = DriverManager.getConnection(BD,Usuario,Contaseña);

                PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?,?,?,?)");
                //en la variables pst de tipo coneccion a base de datos inserte
                // pst.setString(1, "0");
                pst.setString(1, "0");
                pst.setString(2, txt_Nombre_Usuario.getText().trim());

                pst.setString(3, txt_Contraseña_Usuario.getText().trim());
                pst.setString(4, txt_Gmail_Usuario.getText().trim());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, " USUARIO REGISTRADO CORRECTAMENTE");

                txt_Nombre_Usuario.setText("");

                txt_Contraseña_Usuario.setText("");
                txt_Gmail_Usuario.setText("");

            }catch (Exception e){

            }
        
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            Connection cn = DriverManager.getConnection(BD,Usuario,Contaseña);
            PreparedStatement pst = cn.prepareStatement("select * from Usuarios where Nombre_Usuario = ?");
            pst.setString(1, txt_Nombre_Usuario.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            PreparedStatement pstC = cn.prepareStatement("select * from Usuarios where Contraseña = ?");
            pstC.setString(1, txt_Contraseña_Usuario.getText().trim());
            
            ResultSet rsC = pstC.executeQuery();
            
            if(rs.next()){
                if(rsC.next())
                {
                    JOptionPane.showMessageDialog(null,"Bienvenido "+ txt_Nombre_Usuario.getText());
                    this.dispose();
                    Multibodega Mu = new Multibodega();
                    Mu.setVisible(true);
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no registrado.");
            }
            
        }catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel Kgrant;
    private keeptoo.KGradientPanel Kgrant2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private javax.swing.JPasswordField txt_Contraseña_Usuario;
    private javax.swing.JTextField txt_Gmail_Usuario;
    private javax.swing.JTextField txt_Nombre_Usuario;
    // End of variables declaration//GEN-END:variables
}