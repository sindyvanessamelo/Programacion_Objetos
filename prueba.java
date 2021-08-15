
import java.util.Timer;
import java.util.TimerTask;


public class prueba extends javax.swing.JFrame {

    public int  contador = 0;
     public int  contador1 = 0;
    public prueba() {
        initComponents();
        red.setEnabled(false);
        yellow.setEnabled(false);
        green.setEnabled(false);
        carro1.setVisible(false);
        carro3.setVisible(false);
        carro4.setVisible(false);
        carro5.setVisible(false);
        
        red1.setEnabled(false);
        yellow1.setEnabled(false);
        green1.setEnabled(false);
        auto.setVisible(false);
        auto1.setVisible(false);
        auto2.setVisible(false);
        auto3.setVisible(false);
        
        red2.setEnabled(false);
        yellow2.setEnabled(false);
        green2.setEnabled(false);
        automovil.setVisible(false);
        automovil1.setVisible(false);
        automovil2.setVisible(false);
        automovil3.setVisible(false);
        
        red3.setEnabled(false);
        yellow3.setEnabled(false);
        green3.setEnabled(false);
        car1.setVisible(false);
        car2.setVisible(false);
        car3.setVisible(false);
        car4.setVisible(false); 
        car5.setVisible(false);
        car6.setVisible(false);
         
        semaforos_arriba_abajo();
        semaforos_izq_der();
    }

     public void semaforos_arriba_abajo(){
        int velocidad = 2;//segundos
        int tiempo = velocidad * 1000;
        
        Timer timer = new Timer();
        TimerTask tarea;
        tarea = new TimerTask() {
            @Override
            public void run() {
                
                switch(contador)
                {
                  case 0:
                  contador = 1;
                   red.setEnabled(true); 
                   red1.setEnabled(true);
                   yellow1.setEnabled(false);
                   yellow.setEnabled(false);
                   auto.setVisible(true);
                   carro1.setVisible(true);
                   break;  
                  
                  case 1:
                  contador = 2;
                   red.setEnabled(true); 
                   yellow.setEnabled(true);
                   red1.setEnabled(true); 
                   yellow1.setEnabled(true);
                   break; 
                  
                   case 2:
                  contador = 3;
                   red.setEnabled(false); 
                   yellow.setEnabled(true);
                   red1.setEnabled(false); 
                   yellow1.setEnabled(true);
                   
                   break; 
                    
                   case 3:
                  contador = 4;
                   green.setEnabled(true); 
                   yellow.setEnabled(true);
                   green1.setEnabled(true); 
                   yellow1.setEnabled(true);
                   
                   auto.setVisible(false);
                   carro1.setVisible(false);
                   auto1.setVisible(true);
                   carro3.setVisible(true);
                   break; 
                    
                   case 4:
                  contador = 5;
                   green.setEnabled(true); 
                   yellow.setEnabled(false);
                   green1.setEnabled(true); 
                   yellow1.setEnabled(false);
                   
                   auto1.setVisible(false);
                   carro3.setVisible(false);
                   auto2.setVisible(true);
                   carro4.setVisible(true);
                   break; 
                   
                  case 5:
                  contador = 6;
                   green.setEnabled(true); 
                   yellow.setEnabled(true);
                   green1.setEnabled(true); 
                   yellow1.setEnabled(true);
                   
                   auto2.setVisible(false);
                   carro4.setVisible(false);
                   auto3.setVisible(true);
                   carro5.setVisible(true);
                   
                   break; 
                   
                 case 6:
                  contador = 7;
                   green.setEnabled(false); 
                   yellow.setEnabled(true);
                    green1.setEnabled(false); 
                   yellow1.setEnabled(true);
                   
                   auto3.setVisible(false);
                   carro5.setVisible(false);
                   break; 
                   
                   case 7:
                  contador = 0;
                   red.setEnabled(true); 
                   yellow.setEnabled(true);
                   red1.setEnabled(true); 
                   yellow1.setEnabled(true);

                   break;  
                }
            }
        };
        timer.scheduleAtFixedRate(tarea,tiempo,tiempo);
         
     }
    
     public void semaforos_izq_der(){
        int velocidad1 = 2;//segundos
        int tiempo1 = velocidad1 * 1000;
        
         Timer timer1 = new Timer();
        TimerTask tarea1;
        tarea1 = new TimerTask() {
            @Override
            public void run() {
                
                switch(contador1)
                {
                  case 0:
                  contador1 = 1;
                   green3.setEnabled(true); 
                   green2.setEnabled(true);
                   yellow3.setEnabled(false);
                   yellow2.setEnabled(false);
                   
                   car1.setVisible(false);
                   automovil.setVisible(false);
                   car2.setVisible(true);
                   automovil1.setVisible(true);
                   break;  
                  
                  case 1:
                  contador1 = 2;
                   green3.setEnabled(true); 
                   yellow2.setEnabled(true);
                   green2.setEnabled(true); 
                   yellow3.setEnabled(true);
                   
                   car2.setVisible(false);
                   automovil1.setVisible(false);
                   car3.setVisible(true);
                   automovil2.setVisible(true);
                   
                   break; 
                  
                   case 2:
                  contador1 = 3;
                   green2.setEnabled(false); 
                   yellow2.setEnabled(true);
                   green3.setEnabled(false);
                   yellow3.setEnabled(true);
                   
                   car3.setVisible(false);
                   automovil2.setVisible(false);
                   car4.setVisible(true);
                   automovil3.setVisible(true);
                 
                   break; 
                    
                   case 3:
                  contador1 = 4;
                   red2.setEnabled(true); 
                   yellow2.setEnabled(true);
                   red3.setEnabled(true); 
                   yellow3.setEnabled(true);
                   
                   car4.setVisible(false);
                   automovil2.setVisible(false);
                   car5.setVisible(true);
                   automovil3.setVisible(true);
                   break; 
                    
                   case 4:
                  contador1 = 5;
                   red2.setEnabled(true); 
                   yellow2.setEnabled(false);
                   red3.setEnabled(true); 
                   yellow3.setEnabled(false);
                   
                   car5.setVisible(false);
                   automovil3.setVisible(false);
                   car6.setVisible(true);                 
                   break; 
                   
                  case 5:
                  contador1 = 6;
                   red2.setEnabled(true); 
                   yellow2.setEnabled(true);
                   red3.setEnabled(true); 
                   yellow3.setEnabled(true);
                   
                   car6.setVisible(false);
                 
                   
                   break; 
                   
                 case 6:
                  contador1 = 7;
                   red2.setEnabled(false); 
                   yellow2.setEnabled(true);
                   red3.setEnabled(false); 
                   yellow3.setEnabled(true);
                   
                   car1.setVisible(true);
                   automovil.setVisible(true);
                   break; 
                   
                   case 7:
                  contador1 = 0;
                   green2.setEnabled(true); 
                   yellow2.setEnabled(true);
                   green3.setEnabled(true); 
                   yellow3.setEnabled(true);
                   
                   break;  
                }
            }
        };
        timer1.scheduleAtFixedRate(tarea1,tiempo1,tiempo1);
     }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        red = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        green = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        red1 = new javax.swing.JButton();
        yellow1 = new javax.swing.JButton();
        green1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        red2 = new javax.swing.JButton();
        yellow2 = new javax.swing.JButton();
        green2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        red3 = new javax.swing.JButton();
        yellow3 = new javax.swing.JButton();
        green3 = new javax.swing.JButton();
        carro1 = new javax.swing.JLabel();
        car1 = new javax.swing.JLabel();
        automovil = new javax.swing.JLabel();
        auto = new javax.swing.JLabel();
        carro3 = new javax.swing.JLabel();
        carro4 = new javax.swing.JLabel();
        carro5 = new javax.swing.JLabel();
        auto1 = new javax.swing.JLabel();
        auto2 = new javax.swing.JLabel();
        auto3 = new javax.swing.JLabel();
        car2 = new javax.swing.JLabel();
        car3 = new javax.swing.JLabel();
        car4 = new javax.swing.JLabel();
        car5 = new javax.swing.JLabel();
        car6 = new javax.swing.JLabel();
        automovil1 = new javax.swing.JLabel();
        automovil2 = new javax.swing.JLabel();
        automovil3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        red.setBackground(new java.awt.Color(255, 0, 51));

        yellow.setBackground(new java.awt.Color(255, 255, 102));
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });

        green.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(green, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(yellow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(red, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        red1.setBackground(new java.awt.Color(255, 0, 51));

        yellow1.setBackground(new java.awt.Color(255, 255, 102));
        yellow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellow1ActionPerformed(evt);
            }
        });

        green1.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(green1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yellow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(red1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(red1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yellow1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(green1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        red2.setBackground(new java.awt.Color(255, 0, 51));

        yellow2.setBackground(new java.awt.Color(255, 255, 102));
        yellow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellow2ActionPerformed(evt);
            }
        });

        green2.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(green2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yellow2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(red2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(green2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(red2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellow2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        red3.setBackground(new java.awt.Color(255, 0, 51));

        yellow3.setBackground(new java.awt.Color(255, 255, 102));
        yellow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellow3ActionPerformed(evt);
            }
        });

        green3.setBackground(new java.awt.Color(102, 255, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(green3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yellow3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(red3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(green3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(red3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellow3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        carro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        car1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N

        automovil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro1.jpg"))); // NOI18N

        auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        carro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        carro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        carro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        auto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        auto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        auto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        car2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N

        car3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N

        car4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N

        car5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N

        car6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro.jpg"))); // NOI18N

        automovil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro1.jpg"))); // NOI18N

        automovil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro1.jpg"))); // NOI18N

        automovil3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carro1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(car2)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(automovil3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(car1)))
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(auto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(automovil2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(auto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(automovil1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(automovil)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(carro5)
                                                .addGap(158, 158, 158)))
                                        .addGap(37, 37, 37))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(car5)
                                        .addGap(64, 64, 64)
                                        .addComponent(car6))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(carro4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(auto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carro1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(auto2)
                                .addGap(18, 18, 18)
                                .addComponent(car3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(car4)
                                .addGap(18, 18, 18)
                                .addComponent(carro3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carro5)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(auto1))
                                            .addComponent(automovil2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(automovil)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(automovil1)
                                                .addGap(36, 36, 36)
                                                .addComponent(carro4)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                                        .addComponent(auto2)
                                                        .addGap(48, 48, 48))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addComponent(carro3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(carro1)
                                                    .addComponent(auto3)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(car4)
                                                    .addComponent(car3)
                                                    .addComponent(car5)
                                                    .addComponent(car6))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(automovil3)
                                        .addGap(89, 89, 89)
                                        .addComponent(car1)
                                        .addGap(8, 8, 8)
                                        .addComponent(car2)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(auto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
       
    }//GEN-LAST:event_yellowActionPerformed

    private void yellow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellow1ActionPerformed

    private void yellow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellow2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellow2ActionPerformed

    private void yellow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellow3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellow3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel auto;
    private javax.swing.JLabel auto1;
    private javax.swing.JLabel auto2;
    private javax.swing.JLabel auto3;
    private javax.swing.JLabel automovil;
    private javax.swing.JLabel automovil1;
    private javax.swing.JLabel automovil2;
    private javax.swing.JLabel automovil3;
    private javax.swing.JLabel car1;
    private javax.swing.JLabel car2;
    private javax.swing.JLabel car3;
    private javax.swing.JLabel car4;
    private javax.swing.JLabel car5;
    private javax.swing.JLabel car6;
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro3;
    private javax.swing.JLabel carro4;
    private javax.swing.JLabel carro5;
    private javax.swing.JButton green;
    private javax.swing.JButton green1;
    private javax.swing.JButton green2;
    private javax.swing.JButton green3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton red;
    private javax.swing.JButton red1;
    private javax.swing.JButton red2;
    private javax.swing.JButton red3;
    private javax.swing.JButton yellow;
    private javax.swing.JButton yellow1;
    private javax.swing.JButton yellow2;
    private javax.swing.JButton yellow3;
    // End of variables declaration//GEN-END:variables
}
