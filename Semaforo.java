
package semaforo;

import java.util.Timer;
import java.util.TimerTask;


public class Semaforo extends javax.swing.JFrame {

    public Semaforo() {
        initComponents();
        rojo.setVisible(false);
        amarillo.setVisible(false);
        verde.setVisible(false);
        jButton2.setVisible(true);
        
    }
public void encender(){
  
    Timer timer = new Timer();
        TimerTask tarea;
        tarea = new TimerTask() {
            @Override
            public void run() {
                rojo.setVisible(true);
                jButton2.setVisible(false);
            }
        };
        timer.schedule(tarea,0,3000);
    
        Timer timer1 = new Timer();
        TimerTask tarea1;
        tarea1 = new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
                rojo.setVisible(false);
                amarillo.setVisible(true);
            }
        };
        timer1.schedule(tarea1,1000,3000);
        
         Timer timer2 = new Timer();
        TimerTask tarea2;
        tarea2 = new TimerTask() {
            @Override
            public void run() {
                timer1.cancel();
                rojo.setVisible(false);
                amarillo.setVisible(true);
                verde.setVisible(true);
            }
        };
        timer2.schedule(tarea2,2000,4000);
        
     Timer timer3 = new Timer();
        TimerTask tarea3;
        tarea3 = new TimerTask() {
            @Override
            public void run() {
                timer2.cancel();
                rojo.setVisible(false);
                amarillo.setVisible(false);
                verde.setVisible(true);
            }
        };
        timer3.schedule(tarea3,3000,2000);    
        
        Timer timer4 = new Timer();
        TimerTask tarea4;
        tarea4 = new TimerTask() {
            @Override
            public void run() {
                timer3.cancel();
              rojo.setVisible(false);
              amarillo.setVisible(true);
              verde.setVisible(false);
            }
        };
        timer4.schedule(tarea4,4000,3000);  
        
       Timer timer5 = new Timer();
        TimerTask tarea5;
        tarea5 = new TimerTask() {
            @Override
            public void run() {
                timer4.cancel();
                rojo.setVisible(true);
                amarillo.setVisible(true);
                verde.setVisible(false);
            }
        };
        timer5.schedule(tarea5,5000,2000);  
        
     Timer timer6 = new Timer();
        TimerTask tarea6;
        tarea6 = new TimerTask() {
            @Override
            public void run() {
                timer5.cancel();
                rojo.setVisible(true);
                jButton2.setVisible(true);
                amarillo.setVisible(false);
                verde.setVisible(false);
            }
        };
        timer6.schedule(tarea6,6000,3000);       
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rojo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        amarillo = new javax.swing.JLabel();
        verde = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rojo.setIcon(new javax.swing.ImageIcon("C:\\POO\\Timer\\src\\iconos\\Imagen4.jpg")); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("encender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        amarillo.setIcon(new javax.swing.ImageIcon("C:\\POO\\Timer\\src\\iconos\\Imagen5.jpg")); // NOI18N

        verde.setIcon(new javax.swing.ImageIcon("C:\\POO\\Timer\\src\\iconos\\Imagen6.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rojo)
                        .addGap(27, 27, 27)
                        .addComponent(amarillo)
                        .addGap(53, 53, 53)
                        .addComponent(verde)
                        .addGap(29, 29, 29)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rojo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(verde)
                            .addComponent(amarillo))))
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        encender();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semaforo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amarillo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rojo;
    private javax.swing.JLabel verde;
    // End of variables declaration//GEN-END:variables
}
