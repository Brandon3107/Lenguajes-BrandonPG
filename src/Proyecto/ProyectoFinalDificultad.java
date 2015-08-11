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
public class ProyectoFinalDificultad extends javax.swing.JFrame {

    ArrayList<JLabel> etiquetas;
    int piezas[]=new int[30];
    int valor=0;
    JLabel imagenes[]=new JLabel[30];
    int piezarr[]=new int[30];
    Random r=new Random();
    int par=0;
    int pares[]=new int[4];
    public ProyectoFinalDificultad() {
        initComponents();
        repaint();
        etiquetas=new ArrayList<JLabel>();
        initComponents();
     //   jPanel1.setSize(384, 384);
        for(int x=0; x<30; x++){
            int arr=(int)(r.nextDouble()*15+1);
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
                        arr=(int)(r.nextDouble()*15+1);
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
                    ImageIcon icon7=new ImageIcon("src/Proyecto/Dino7.png");
                    ImageIcon icon8=new ImageIcon("src/Proyecto/Dino8.png");
                    ImageIcon icon9=new ImageIcon("src/Proyecto/Dino9.png");
                    ImageIcon icon10=new ImageIcon("src/Proyecto/Dino10.png");
                    ImageIcon icon11=new ImageIcon("src/Proyecto/Dino11.png");
                    ImageIcon icon12=new ImageIcon("src/Proyecto/Dino12.png");
                    ImageIcon icon13=new ImageIcon("src/Proyecto/Dino13.png");
                    ImageIcon icon14=new ImageIcon("src/Proyecto/Dino14.png");
                    ImageIcon icon15=new ImageIcon("src/Proyecto/Dino15.png");
                    //ImageIcon icon16=new ImageIcon("src/Proyecto/Dino16.png");
                    //ImageIcon icon17=new ImageIcon("src/Proyecto/Dino17.png");
                    //ImageIcon icon18=new ImageIcon("src/Proyecto/Dino18.png");
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
                    if(piezarr[inte]==7){
                        imagenes[inte].setIcon(icon7);
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
                    if(piezarr[inte]==8){
                        imagenes[inte].setIcon(icon8);
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
                    if(piezarr[inte]==9){
                        imagenes[inte].setIcon(icon9);
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
                    if(piezarr[inte]==10){
                        imagenes[inte].setIcon(icon10);
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
                    if(piezarr[inte]==11){
                        imagenes[inte].setIcon(icon11);
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
                    if(piezarr[inte]==12){
                        imagenes[inte].setIcon(icon12);
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
                    if(piezarr[inte]==13){
                        imagenes[inte].setIcon(icon13);
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
                    if(piezarr[inte]==14){
                        imagenes[inte].setIcon(icon14);
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
                    if(piezarr[inte]==15){
                        imagenes[inte].setIcon(icon15);
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
                    /*
                    if(piezarr[inte]==16){
                        imagenes[inte].setIcon(icon16);
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
                    if(piezarr[inte]==17){
                        imagenes[inte].setIcon(icon17);
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
                    if(piezarr[inte]==18){
                        imagenes[inte].setIcon(icon18);
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
                    //jLabel1.setText(""+inte);
                    */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(5, 6));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(ProyectoFinalDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinalDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinalDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinalDificultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinalDificultad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
