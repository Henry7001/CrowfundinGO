package crowdfundingo;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class menuprinc extends javax.swing.JFrame {

    public menuprinc() {
        initComponents();
        setIconImage(getIconImage());
    }
    
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("res/ico.png"));
        return retValue;
    }

    //Login login = new Login();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        funcionalidades = new javax.swing.JMenu();
        inversionistas = new javax.swing.JMenu();
        busproy = new javax.swing.JMenuItem();
        vertransac = new javax.swing.JMenuItem();
        listempr = new javax.swing.JMenuItem();
        invreem = new javax.swing.JMenuItem();
        emprendedor = new javax.swing.JMenu();
        creaproy = new javax.swing.JMenuItem();
        listproy = new javax.swing.JMenuItem();
        listdin = new javax.swing.JMenuItem();
        empreem = new javax.swing.JMenuItem();
        conf = new javax.swing.JMenu();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMaximumSize(new java.awt.Dimension(696, 396));
        setMinimumSize(new java.awt.Dimension(696, 396));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ilus.png"))); // NOI18N

        funcionalidades.setText("Funcionalidades");

        inversionistas.setText("Menú de Inversionista");

        busproy.setText("Buscar Proyecto");
        inversionistas.add(busproy);

        vertransac.setText("Verificar transacciones");
        vertransac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertransacActionPerformed(evt);
            }
        });
        inversionistas.add(vertransac);

        listempr.setText("Listar emprendimientos apoyados");
        inversionistas.add(listempr);

        invreem.setText("Reembolsos");
        inversionistas.add(invreem);

        funcionalidades.add(inversionistas);

        emprendedor.setText("Menú de Emprendedor");

        creaproy.setText("Crear Proyecto");
        emprendedor.add(creaproy);

        listproy.setText("Listar los proyectos");
        emprendedor.add(listproy);

        listdin.setText("Listar dinero recaudado");
        emprendedor.add(listdin);

        empreem.setText("Reembolsos");
        emprendedor.add(empreem);

        funcionalidades.add(emprendedor);

        Menu.add(funcionalidades);

        conf.setText("Configuración");
        Menu.add(conf);

        about.setText("Sobre...");
        Menu.add(about);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vertransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertransacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vertransacActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int op = JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?","Salida del programa",JOptionPane.YES_NO_OPTION);
        if(op==JOptionPane.YES_OPTION){
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(null, "Sesión cerrada");
        }else{
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JOptionPane.showMessageDialog(null, "Sesión iniciada");
    }//GEN-LAST:event_formWindowOpened

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuprinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem busproy;
    private javax.swing.JMenu conf;
    private javax.swing.JMenuItem creaproy;
    private javax.swing.JMenuItem empreem;
    private javax.swing.JMenu emprendedor;
    private javax.swing.JMenu funcionalidades;
    private javax.swing.JLabel image;
    private javax.swing.JMenu inversionistas;
    private javax.swing.JMenuItem invreem;
    private javax.swing.JMenuItem listdin;
    private javax.swing.JMenuItem listempr;
    private javax.swing.JMenuItem listproy;
    private javax.swing.JMenuItem vertransac;
    // End of variables declaration//GEN-END:variables
}
