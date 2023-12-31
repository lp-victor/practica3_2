/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import AccesoDatos.JDBCUsuario;
import Modelo.Usuario;
import aux.GestionUsuario;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class AgregarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form agregarUsuario
     */
    private static int mouseX, mouseY;
    private static boolean mousePressed;
    private JDBCUsuario aux = new JDBCUsuario();

    public AgregarUsuario() {
        initComponents();
        habilitarArrastre(this);
        DC_FechaNac_AgregarUsuario.setDateFormatString("yyyy-MM-dd");
    }
    
    public AgregarUsuario(Color colorFondo) {
        initComponents();
        habilitarArrastre(this);
        cambiarColorFondo(colorFondo);
        DC_FechaNac_AgregarUsuario.setDateFormatString("yyyy-MM-dd");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_infoNuevoUsuario_AgregarUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        L_Usuario_AgregarUsuario = new javax.swing.JLabel();
        TF_Apellidos_AgregarUsuario = new javax.swing.JTextField();
        L_Contrasena_AgregarUsuario = new javax.swing.JLabel();
        TF_Correo_AgregarUsuario = new javax.swing.JTextField();
        L_RepContrasena_AgregarUsuario = new javax.swing.JLabel();
        TF_Nombre_AgregarUsuario = new javax.swing.JTextField();
        TF_Usuario_AgregarUsuario = new javax.swing.JTextField();
        B_Volver_AgregarUsuario = new javax.swing.JButton();
        TF_Contrasena_AgregarUsuario = new javax.swing.JTextField();
        B_Agregar_AgregarUsuario = new javax.swing.JButton();
        TF_RepContrasena_AgregarUsuario = new javax.swing.JTextField();
        L_infoDatosOpcionales_AgregarUsuario = new javax.swing.JLabel();
        L_Nombre_AgregarUsuario = new javax.swing.JLabel();
        L_Apellidos_AgregarUsuario = new javax.swing.JLabel();
        L_FechaNac_AgregarUsuario = new javax.swing.JLabel();
        S_separador_AgregarUsuario = new javax.swing.JSeparator();
        L_Correo_AgregarUsuario = new javax.swing.JLabel();
        DC_FechaNac_AgregarUsuario = new com.toedter.calendar.JDateChooser();

        L_infoNuevoUsuario_AgregarUsuario.setText("Porfavor, introduzca los datos del nuevo usuario:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(224, 244, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(224, 244, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        L_Usuario_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Usuario_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_Usuario_AgregarUsuario.setText("Usuario:");

        TF_Apellidos_AgregarUsuario.setBackground(new java.awt.Color(135, 196, 255));
        TF_Apellidos_AgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TF_Apellidos_AgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 167, 255), 2, true));
        TF_Apellidos_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Apellidos_AgregarUsuarioActionPerformed(evt);
            }
        });

        L_Contrasena_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Contrasena_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_Contrasena_AgregarUsuario.setText("Contraseña:");

        TF_Correo_AgregarUsuario.setBackground(new java.awt.Color(135, 196, 255));
        TF_Correo_AgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TF_Correo_AgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 167, 255), 2, true));
        TF_Correo_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Correo_AgregarUsuarioActionPerformed(evt);
            }
        });

        L_RepContrasena_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_RepContrasena_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_RepContrasena_AgregarUsuario.setText("Repetir contraseña:");

        TF_Nombre_AgregarUsuario.setBackground(new java.awt.Color(135, 196, 255));
        TF_Nombre_AgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TF_Nombre_AgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 167, 255), 2, true));
        TF_Nombre_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Nombre_AgregarUsuarioActionPerformed(evt);
            }
        });

        TF_Usuario_AgregarUsuario.setBackground(new java.awt.Color(135, 196, 255));
        TF_Usuario_AgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TF_Usuario_AgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 167, 255), 2, true));
        TF_Usuario_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Usuario_AgregarUsuarioActionPerformed(evt);
            }
        });

        B_Volver_AgregarUsuario.setBackground(new java.awt.Color(255, 238, 217));
        B_Volver_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Volver_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        B_Volver_AgregarUsuario.setText("Volver");
        B_Volver_AgregarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B_Volver_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Volver_AgregarUsuarioActionPerformed(evt);
            }
        });

        TF_Contrasena_AgregarUsuario.setBackground(new java.awt.Color(135, 196, 255));
        TF_Contrasena_AgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TF_Contrasena_AgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 167, 255), 2, true));
        TF_Contrasena_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Contrasena_AgregarUsuarioActionPerformed(evt);
            }
        });

        B_Agregar_AgregarUsuario.setBackground(new java.awt.Color(255, 238, 217));
        B_Agregar_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Agregar_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        B_Agregar_AgregarUsuario.setText("Agregar");
        B_Agregar_AgregarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B_Agregar_AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Agregar_AgregarUsuarioActionPerformed(evt);
            }
        });

        TF_RepContrasena_AgregarUsuario.setBackground(new java.awt.Color(135, 196, 255));
        TF_RepContrasena_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TF_RepContrasena_AgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TF_RepContrasena_AgregarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 167, 255), 2, true));

        L_infoDatosOpcionales_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_infoDatosOpcionales_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_infoDatosOpcionales_AgregarUsuario.setText("Introduzca datos opcionales si lo desea:");

        L_Nombre_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Nombre_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_Nombre_AgregarUsuario.setText("Nombre:");

        L_Apellidos_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Apellidos_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_Apellidos_AgregarUsuario.setText("Apellidos:");

        L_FechaNac_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_FechaNac_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_FechaNac_AgregarUsuario.setText("Fecha de nacimiento:");

        L_Correo_AgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Correo_AgregarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        L_Correo_AgregarUsuario.setText("Correo electronico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(L_Usuario_AgregarUsuario)
                        .addGap(114, 114, 114)
                        .addComponent(TF_Usuario_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(L_Contrasena_AgregarUsuario)
                        .addGap(92, 92, 92)
                        .addComponent(TF_Contrasena_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(L_RepContrasena_AgregarUsuario)
                        .addGap(40, 40, 40)
                        .addComponent(TF_RepContrasena_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(S_separador_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(L_infoDatosOpcionales_AgregarUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(L_Nombre_AgregarUsuario)
                        .addGap(131, 131, 131)
                        .addComponent(TF_Nombre_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(L_Correo_AgregarUsuario)
                        .addGap(60, 60, 60)
                        .addComponent(TF_Correo_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(B_Volver_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(B_Agregar_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Apellidos_AgregarUsuario)
                            .addComponent(L_FechaNac_AgregarUsuario))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_Apellidos_AgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(DC_FechaNac_AgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(L_Usuario_AgregarUsuario))
                    .addComponent(TF_Usuario_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(L_Contrasena_AgregarUsuario))
                    .addComponent(TF_Contrasena_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(L_RepContrasena_AgregarUsuario))
                    .addComponent(TF_RepContrasena_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(S_separador_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(L_infoDatosOpcionales_AgregarUsuario)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(L_Nombre_AgregarUsuario))
                    .addComponent(TF_Nombre_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(L_Apellidos_AgregarUsuario))
                    .addComponent(TF_Apellidos_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(L_FechaNac_AgregarUsuario)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DC_FechaNac_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(L_Correo_AgregarUsuario))
                    .addComponent(TF_Correo_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Volver_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Agregar_AgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TF_Apellidos_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Apellidos_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Apellidos_AgregarUsuarioActionPerformed

    private void TF_Correo_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Correo_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Correo_AgregarUsuarioActionPerformed

    private void TF_Nombre_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Nombre_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Nombre_AgregarUsuarioActionPerformed

    private void TF_Usuario_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Usuario_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Usuario_AgregarUsuarioActionPerformed

    private void B_Volver_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Volver_AgregarUsuarioActionPerformed
        this.dispose();
    }//GEN-LAST:event_B_Volver_AgregarUsuarioActionPerformed

    private void TF_Contrasena_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Contrasena_AgregarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Contrasena_AgregarUsuarioActionPerformed

    private void B_Agregar_AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Agregar_AgregarUsuarioActionPerformed
        Usuario user = null;

        String usuario = TF_Usuario_AgregarUsuario.getText();
        String contraseña = TF_Contrasena_AgregarUsuario.getText();
        String nombre = TF_Nombre_AgregarUsuario.getText();
        String apellidos = TF_Apellidos_AgregarUsuario.getText();
        String fecha = String.valueOf(DC_FechaNac_AgregarUsuario.getDate());
        String correo = TF_Correo_AgregarUsuario.getText();

        boolean masDatos = false;

        if (correo != null || fecha != null || apellidos != null || nombre != null) {
            masDatos = true;
        }

        if (verificaciones()) {
            if (masDatos) {
                if (verificacionesOpcionales()) {
                    //Crea el user y se lo pasa a la base de datos
                    user = new Usuario(usuario, contraseña, nombre, apellidos, fecha, correo);
                    guardar(user);
                } else {
                    JOptionPane.showMessageDialog(this, "Los datos opcionales no son correctos.", "Error datos opcionales", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                user = new Usuario(usuario, contraseña);
                guardar(user);
            }
        }
    }//GEN-LAST:event_B_Agregar_AgregarUsuarioActionPerformed

    private boolean verificaciones() {
        String usuario = TF_Usuario_AgregarUsuario.getText();
        String contraseña = TF_Contrasena_AgregarUsuario.getText();
        String contraseña2 = TF_RepContrasena_AgregarUsuario.getText();

        //Verifica que no esten los campos vacios (obligatorios)
        if (usuario.equals("")) {
            JOptionPane.showMessageDialog(this, "El usuario no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (contraseña.equals("")) {
            JOptionPane.showMessageDialog(this, "La contraseña no puede estar vacia.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //Verifica que no existan ya el usuario
        if (!(GestionUsuario.verificarDuplicado(usuario))) {
            //Verifica que coincidan las contras
            if (GestionUsuario.verificarDobleContra(contraseña, contraseña2)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "La contraseña no coincide.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El usuario ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private boolean verificacionesOpcionales() {
        String correo = TF_Correo_AgregarUsuario.getText();

        if (!correo.equals("")) {
            if (GestionUsuario.verificarCorreo(correo)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "El formato del correo es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return false;
    }

    private void guardar(Usuario user) {
        if (aux.altaUsuario(user)) {
            JOptionPane.showMessageDialog(this, "El usuario ha sido creado");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido agregar al usuario.", "Error en la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
    
    public void cambiarColorFondo(Color colorBase){
        jPanel1.setBackground(colorBase);
        B_Agregar_AgregarUsuario.setBackground(colorBase.brighter());
        B_Volver_AgregarUsuario.setBackground(colorBase.brighter());
        TF_Apellidos_AgregarUsuario.setBackground(colorBase.darker());
        TF_Contrasena_AgregarUsuario.setBackground(colorBase.darker());
        TF_Correo_AgregarUsuario.setBackground(colorBase.darker());
        TF_Nombre_AgregarUsuario.setBackground(colorBase.darker());
        TF_RepContrasena_AgregarUsuario.setBackground(colorBase.darker());
        TF_Usuario_AgregarUsuario.setBackground(colorBase.darker());
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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Agregar_AgregarUsuario;
    private javax.swing.JButton B_Volver_AgregarUsuario;
    private com.toedter.calendar.JDateChooser DC_FechaNac_AgregarUsuario;
    private javax.swing.JLabel L_Apellidos_AgregarUsuario;
    private javax.swing.JLabel L_Contrasena_AgregarUsuario;
    private javax.swing.JLabel L_Correo_AgregarUsuario;
    private javax.swing.JLabel L_FechaNac_AgregarUsuario;
    private javax.swing.JLabel L_Nombre_AgregarUsuario;
    private javax.swing.JLabel L_RepContrasena_AgregarUsuario;
    private javax.swing.JLabel L_Usuario_AgregarUsuario;
    private javax.swing.JLabel L_infoDatosOpcionales_AgregarUsuario;
    private javax.swing.JLabel L_infoNuevoUsuario_AgregarUsuario;
    private javax.swing.JSeparator S_separador_AgregarUsuario;
    private javax.swing.JTextField TF_Apellidos_AgregarUsuario;
    private javax.swing.JTextField TF_Contrasena_AgregarUsuario;
    private javax.swing.JTextField TF_Correo_AgregarUsuario;
    private javax.swing.JTextField TF_Nombre_AgregarUsuario;
    private javax.swing.JTextField TF_RepContrasena_AgregarUsuario;
    private javax.swing.JTextField TF_Usuario_AgregarUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
