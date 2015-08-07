/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author T-107
 */
public class ProyectoFinal extends javax.swing.JFrame {
    
    ArrayList<JLabel> etiquetas;
    int piezas[]=new int[12];
    int valor=0;
    JLabel imagenes[]=new JLabel[12];
    int piezarr[]=new int[12];
    Random r=new Random();
    int par=0;
    int pares[]=new int[4];
    

    public ProyectoFinal() {
        
        etiquetas=new ArrayList<JLabel>();
        initComponents();
        jPanel1.setSize(384, 384);
        for(int x=0; x<12; x++){
            int arr=(int)(r.nextDouble()*6+1);
            if(x==0){
                piezarr[x]=arr;
            }
            if(x!=0){
                int xyz=0;
                for(;xyz!=1;){
                    int z=0;
                    for(int y=0; y<piezarr.length; y++){
                        if(arr==piezarr[y]){
                            z++;
                        }
                    }
                    if((z==0)||(z==1)){
                        piezarr[x]=arr;
                        xyz=1;
                    }else{
                        arr=(int)(r.nextDouble()*6+1);
                    }
                }
            }
        }
        for(int i:piezas){
            imagenes[valor]=new JLabel();
            ImageIcon iconx=new ImageIcon("src/Proyecto/yugioh3.png");
            
            imagenes[valor].setIcon(iconx);
            imagenes[valor].setName(""+valor);
            imagenes[valor].setSize(500, 500);
            Integer inte=new Integer(imagenes[valor].getName());
            jPanel1.add(imagenes[valor]);
            imagenes[valor].addMouseListener(new MouseListener() {

                public void mouseClicked(MouseEvent e) {
                    //jLabel1.setText(e.getComponent().getName());
                    ImageIcon icon0=new ImageIcon("src/Proyecto/yugioh3.png");
                    ImageIcon icon1=new ImageIcon("src/Proyecto/Dino1.png");
                    ImageIcon icon2=new ImageIcon("src/Proyecto/Dino2.png");
                    ImageIcon icon3=new ImageIcon("src/Proyecto/Dino3.png");
                    ImageIcon icon4=new ImageIcon("src/Proyecto/Dino4.png");
                    ImageIcon icon5=new ImageIcon("src/Proyecto/Dino5.png");
                    ImageIcon icon6=new ImageIcon("src/Proyecto/Dino6.png");
                    if(piezarr[inte]==1){
                        imagenes[inte].setIcon(icon1);
                        imagenes[inte].setText(null);
                        par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(icon0);
                                imagenes[pares[3]].setIcon(icon0);
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                        }
                        
                    }
                    if(piezarr[inte]==2){
                        imagenes[inte].setIcon(icon2);
                        imagenes[inte].setText(null);
                        par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(icon0);
                                imagenes[pares[3]].setIcon(icon0);
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                        }
                    }
                    if(piezarr[inte]==3){
                        imagenes[inte].setIcon(icon3);
                        imagenes[inte].setText(null);
                        par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(icon0);
                                imagenes[pares[3]].setIcon(icon0);
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                        }
                    }
                    if(piezarr[inte]==4){
                        imagenes[inte].setIcon(icon4);
                        imagenes[inte].setText(null);
                        par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(icon0);
                                imagenes[pares[3]].setIcon(icon0);
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                        }
                    }
                    if(piezarr[inte]==5){
                        imagenes[inte].setIcon(icon5);
                        imagenes[inte].setText(null);
                        par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(icon0);
                                imagenes[pares[3]].setIcon(icon0);
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                        }
                    }
                    if(piezarr[inte]==6){
                        imagenes[inte].setIcon(icon6);
                        imagenes[inte].setText(null);
                        par++;
                        if(par==1){
                            pares[0]=piezarr[inte];
                            Integer paresx=new Integer(imagenes[inte].getName());
                            pares[1]=paresx;
                        }
                        if(par==2){
                            pares[2]=piezarr[inte];
                            Integer paresy=new Integer(imagenes[inte].getName());
                            pares[3]=paresy;
                        }
                        if(par==3){
                            if(pares[0]!=pares[2]){
                                imagenes[pares[1]].setIcon(icon0);
                                imagenes[pares[3]].setIcon(icon0);
                                //imagenes[pares[1]].setText(""+pares[1]);
                                //imagenes[pares[3]].setText(""+pares[3]);
                            }
                            par=1;
                            pares[0]=piezarr[inte];
                            Integer paresz=new Integer(imagenes[inte].getName());
                            pares[1]=paresz;
                        }
                    }
                    //imagenes[inte].setIcon(icon);
                    //imagenes[inte].setText(null);
                    //int alto=icon.getIconHeight();
                    //int ancho=icon.getIconWidth();
                    //jLabel1.setSize(alto, ancho);
                    //jLabel1.setIcon(icon);
                    jLabel1.setText(""+inte);
                }

                public void mousePressed(MouseEvent e) {
                    
                }

                public void mouseReleased(MouseEvent e) {
                    
                }

                public void mouseEntered(MouseEvent e) {
                    
                }

                public void mouseExited(MouseEvent e) {
                    
                }
            });
            valor++;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 1740));
        jPanel1.setLayout(new java.awt.GridLayout(4, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
