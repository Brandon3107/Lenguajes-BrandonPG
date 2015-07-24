/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author T-107
 */
public class Animales extends javax.swing.JFrame {

    /**
     * Creates new form Animales
     */
    public Animales() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        Ingresar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TipoCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        ArchivoText = new javax.swing.JTextField();
        ComprobarBoton = new javax.swing.JButton();
        GuardarBoton = new javax.swing.JButton();
        ResultadoEtiquita = new javax.swing.JLabel();
        Buscar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        NombreText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Especie");

        TipoCombo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TipoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carnivoro", "Hervivoro" }));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del archivo");

        ArchivoText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ComprobarBoton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ComprobarBoton.setText("Comprobar");
        ComprobarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarBotonActionPerformed(evt);
            }
        });

        GuardarBoton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GuardarBoton.setText("Guardar");
        GuardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotonActionPerformed(evt);
            }
        });

        ResultadoEtiquita.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout IngresarLayout = new javax.swing.GroupLayout(Ingresar);
        Ingresar.setLayout(IngresarLayout);
        IngresarLayout.setHorizontalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarLayout.createSequentialGroup()
                        .addComponent(GuardarBoton)
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ArchivoText, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComprobarBoton)
                        .addGap(104, 104, 104))))
            .addGroup(IngresarLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(ResultadoEtiquita, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        IngresarLayout.setVerticalGroup(
            IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresarLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ArchivoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComprobarBoton))
                .addGap(30, 30, 30)
                .addComponent(GuardarBoton)
                .addGap(18, 18, 18)
                .addComponent(ResultadoEtiquita, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ingresar Animal", Ingresar);

        javax.swing.GroupLayout BuscarLayout = new javax.swing.GroupLayout(Buscar);
        Buscar.setLayout(BuscarLayout);
        BuscarLayout.setHorizontalGroup(
            BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        BuscarLayout.setVerticalGroup(
            BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Mostrar Animales", Buscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprobarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarBotonActionPerformed
        StringBuilder ruta=new StringBuilder();
        ruta.append("D:\\");
        ruta.append(ArchivoText.getText());
        ruta.append(".xxx");
        String archivoruta=ruta.toString();
        try{
            File file=new File(archivoruta);
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            ResultadoEtiquita.setText("El archivo no existe. Puedes continuar.");
        }catch(Exception ex){
            ResultadoEtiquita.setText("El archivo ya existe");
        }
    }//GEN-LAST:event_ComprobarBotonActionPerformed

    private void GuardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotonActionPerformed
        String nombre=NombreText.toString();
        boolean carnivoro;
        if(TipoCombo.getSelectedIndex()==0){
            carnivoro=true;
        }else{
            carnivoro=false;
        }
        Animal a=new Animal(nombre, carnivoro);
        StringBuilder ruta=new StringBuilder();
        ruta.append("D:\\");
        ruta.append(ArchivoText.toString());
        ruta.append(".xxx");
        String archivoruta=ruta.toString();
        ModeloPersistenciaAnimales mpa=new ModeloPersistenciaAnimales();
        mpa.rutanimales=archivoruta;
        mpa.animal=a;
        try{
            mpa.Guardar(a);
        }catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_GuardarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArchivoText;
    private javax.swing.JPanel Buscar;
    private javax.swing.JButton ComprobarBoton;
    private javax.swing.JButton GuardarBoton;
    private javax.swing.JPanel Ingresar;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel ResultadoEtiquita;
    private javax.swing.JComboBox TipoCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
