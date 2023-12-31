/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import Modelo.Usuario;
import static frames.Bienvenida.habilitarArrastre;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author victo
 */
public class CambiarColorInterfaz extends javax.swing.JFrame {
    
    private static int mouseX, mouseY;
    private static boolean mousePressed;
    private Usuario usuarioLogeado;
    private Color colorElegido;
    /**
     * Creates new form cambiarColorInterfaz
     */
    public CambiarColorInterfaz() {
        initComponents();
        habilitarArrastre(this);        
    }
    
    public CambiarColorInterfaz(Usuario usuarioLogeado_e) {
        this.usuarioLogeado = usuarioLogeado_e;
        initComponents();
        habilitarArrastre(this);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        B_Volver_cambiarColorInterfaz = new javax.swing.JButton();
        B_Cambiar_cambiarColorInterfaz = new javax.swing.JButton();
        CC_elegirColor_cambiarColorInterfaz = new javax.swing.JColorChooser();
        P_panelTop_MenuLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(224, 244, 255));
        jPanel1.setLayout(null);

        B_Volver_cambiarColorInterfaz.setBackground(new java.awt.Color(255, 238, 217));
        B_Volver_cambiarColorInterfaz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Volver_cambiarColorInterfaz.setForeground(new java.awt.Color(0, 0, 0));
        B_Volver_cambiarColorInterfaz.setText("Volver");
        B_Volver_cambiarColorInterfaz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B_Volver_cambiarColorInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Volver_cambiarColorInterfazActionPerformed(evt);
            }
        });
        jPanel1.add(B_Volver_cambiarColorInterfaz);
        B_Volver_cambiarColorInterfaz.setBounds(200, 430, 140, 40);

        B_Cambiar_cambiarColorInterfaz.setBackground(new java.awt.Color(255, 238, 217));
        B_Cambiar_cambiarColorInterfaz.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Cambiar_cambiarColorInterfaz.setForeground(new java.awt.Color(0, 0, 0));
        B_Cambiar_cambiarColorInterfaz.setText("Cambiar");
        B_Cambiar_cambiarColorInterfaz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B_Cambiar_cambiarColorInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cambiar_cambiarColorInterfazActionPerformed(evt);
            }
        });
        jPanel1.add(B_Cambiar_cambiarColorInterfaz);
        B_Cambiar_cambiarColorInterfaz.setBounds(420, 430, 140, 40);

        CC_elegirColor_cambiarColorInterfaz.setBackground(new java.awt.Color(224, 244, 255));
        jPanel1.add(CC_elegirColor_cambiarColorInterfaz);
        CC_elegirColor_cambiarColorInterfaz.setBounds(40, 40, 700, 360);

        P_panelTop_MenuLogin.setBackground(new java.awt.Color(135, 196, 255));
        P_panelTop_MenuLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona el color de la interfaz:");
        P_panelTop_MenuLogin.add(jLabel1);
        jLabel1.setBounds(40, 10, 540, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_panelTop_MenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P_panelTop_MenuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Volver_cambiarColorInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Volver_cambiarColorInterfazActionPerformed
        this.dispose();
        abrirBienvenida(usuarioLogeado, colorElegido);
    }//GEN-LAST:event_B_Volver_cambiarColorInterfazActionPerformed

    private void B_Cambiar_cambiarColorInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cambiar_cambiarColorInterfazActionPerformed
        colorElegido = CC_elegirColor_cambiarColorInterfaz.getColor();
        cambiarColorFondo();
    }//GEN-LAST:event_B_Cambiar_cambiarColorInterfazActionPerformed
    
        public static void habilitarArrastre(JFrame frame) {
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePressed = true;
                mouseX = e.getX();
                mouseY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
            }
        });

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (mousePressed) {
                    int x = e.getXOnScreen();
                    int y = e.getYOnScreen();
                    frame.setLocation(x - mouseX, y - mouseY);
                }
            }
        });
    }  
        
    private void abrirBienvenida(Usuario user, Color colorElegido) {
        Bienvenida bienvenida = new Bienvenida(user, colorElegido);
        bienvenida.setVisible(true);
        bienvenida.setLocationRelativeTo(this);
        bienvenida.pack();
    }    
    
    private void cambiarColorFondo(){
        jPanel1.setBackground(colorElegido);
        B_Cambiar_cambiarColorInterfaz.setBackground(colorElegido.brighter());
        B_Volver_cambiarColorInterfaz.setBackground(colorElegido.brighter());
        P_panelTop_MenuLogin.setBackground(colorElegido.darker());
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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CambiarColorInterfaz.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarColorInterfaz.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarColorInterfaz.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarColorInterfaz.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarColorInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cambiar_cambiarColorInterfaz;
    private javax.swing.JButton B_Volver_cambiarColorInterfaz;
    private javax.swing.JColorChooser CC_elegirColor_cambiarColorInterfaz;
    private javax.swing.JPanel P_panelTop_MenuLogin;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
