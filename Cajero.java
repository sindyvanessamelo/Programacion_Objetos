
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Cajero extends javax.swing.JFrame {

   
    public Cajero() {
        initComponents();
        setLocationRelativeTo(null);
         this.setSize(650,700);
        timerpersona1();
        persona1.setVisible(true);
        persona2.setVisible(true);
        persona3.setVisible(true);
        persona4.setVisible(true);
        persona5.setVisible(true);  
}

     Random random = new Random();
     int number = 1000+random.nextInt(9000);
     int number1 = 2500+random.nextInt(7000);
     int number2 = 3000+random.nextInt(7000);
     int number4 = 3500+random.nextInt(7000);

      public void timerpersona1(){
   
   Timer timer;
    timer = new Timer();
   TimerTask task = new TimerTask()
        {
        @Override
        public void run()
        {
       persona1.setVisible(false);
        }
        };

    timer.schedule(task,number);
     
    Timer timer1 = new Timer();
        TimerTask tarea;
        tarea = new TimerTask() {
            @Override
            public void run() {   

        persona2.setVisible(false);
            }
        };
        timer1.schedule(tarea,number1);
    
        Timer timer2 = new Timer();
        TimerTask tarea2;
        tarea2 = new TimerTask() {
            @Override
            public void run() {
        persona3.setVisible(false);
            }
        };
        timer2.schedule(tarea2,number2);
        
       Timer timer0 = new Timer();
        TimerTask tarea0;
        tarea0 = new TimerTask() {
            @Override
            public void run() {
        persona4.setVisible(false); 
            
            }
        };
        timer0.schedule(tarea0,number4);
        
    Timer timer3 = new Timer();
        TimerTask tarea3;
        tarea3 = new TimerTask() {
            @Override
            public void run() {
        persona5.setVisible(false);
             JOptionPane.showMessageDialog(null,"CERRADO POR PARO \n!VIVA EL PARO NACIONAL¡","Alert",JOptionPane.WARNING_MESSAGE);
             System.exit(0);    
            }
        };
        timer3.schedule(tarea3,9000,number);   
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cajero1 = new javax.swing.JLabel();
        cajero2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        persona1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        persona2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        persona3 = new javax.swing.JLabel();
        persona4 = new javax.swing.JLabel();
        persona5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        cajero1.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\Imagen2.png")); // NOI18N

        cajero2.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\Imagen4.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\Imagen5.jpg")); // NOI18N

        persona1.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\persona1.png")); // NOI18N

        persona2.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\persona2.png")); // NOI18N

        persona3.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\persona3.png")); // NOI18N

        persona4.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\persona4.png")); // NOI18N

        persona5.setIcon(new javax.swing.ImageIcon("C:\\POO\\Ventana\\src\\imagenes\\persona5.png")); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cajero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(cajero2))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel4))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(persona4)
                    .addComponent(persona3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(persona5)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(persona1)
                            .addComponent(persona2))))
                .addGap(52, 52, 52))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajero1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajero2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(persona1)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel4))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(persona2)))
                        .addGap(17, 17, 17)
                        .addComponent(persona5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(persona3)
                        .addGap(51, 51, 51)
                        .addComponent(persona4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cajero1;
    private javax.swing.JLabel cajero2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel persona1;
    private javax.swing.JLabel persona2;
    private javax.swing.JLabel persona3;
    private javax.swing.JLabel persona4;
    private javax.swing.JLabel persona5;
    // End of variables declaration//GEN-END:variables
}
