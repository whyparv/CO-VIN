
import covid.log.General;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import one.connect.ConnectionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */


public class Status extends javax.swing.JFrame implements Runnable 
{

    /**
     * Creates new form General
     */
     int i=0,n=0,p=0;
    String str="", str1="";
   CardLayout cardlayout;
    public Status() throws Exception
    {
          initComponents();
     Thread h=new Thread(this);
     h.start();
     
     
     cardlayout=(CardLayout)jPanel8.getLayout();
     jPanel8.setVisible(false);
          jLabel7.setVisible(false);
          jLabel8.setVisible(false);
     }
 
    @Override
    public void run()
{
                if(i==0)
            {
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/welcome (1).wav").toURI().toURL());
                        play.start();
                        i=1;
                        jLabel6.setText("<html>                                                             Welcome to COV-IN. I am Nemo.<br>your personal assistant. to take your self assessment test. \nPlease fill the following form");
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Thread.sleep(8500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                 if(i==1)
            {
                  jPanel8.setVisible(true);
          jLabel7.setVisible(true);
                 cardlayout.show(jPanel8, "card1");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                jButton1.setVisible(true);
                jButton1.setText("yes");
                jButton2.setVisible(true);
                jButton2.setText("no");
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q1.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("Are you experiencing any of the Covid symptoms?");
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                   
                  
            }
                    if(i==2)
            {
                cardlayout.show(jPanel8, "card2");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q2.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("Do you ever had any of the following?");
                        
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                       
            }
          if(i==3)
            {
                cardlayout.show(jPanel8, "card3");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q3.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("Have you travelled internationally in last 10-15 days??");
                        
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                       
            }
           if(i==4)
            {
                cardlayout.show(jPanel8, "card4");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q4.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("Do you smoke or Drink Alcohol?");
                        
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                       
            }
            if(i==5)
            {
                cardlayout.show(jPanel8, "card5");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q5.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("Did you have your covid test in the last 20 Days ?");
                        
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
            }
             if(i==6)
            {
                cardlayout.show(jPanel8, "card6");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q6.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("How many senior citizen(s) do you have at home?( Age 60 or above)");
                        
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                       
            }
              if(i==7)
            {
                cardlayout.show(jPanel8, "card7");
                jLabel7.setVisible(true);
                jLabel6.setVisible(false);
                
                    try {
                        Player play=Manager.createRealizedPlayer(new File("D:/javacode/netbeans/COV-IN/src/q7.wav").toURI().toURL());
                        play.start();
                        jLabel7.setText("Would you ever like to be a volunteer for covid purpose?");
                        
                    } catch (IOException | NoPlayerException |CannotRealizeException ex) {
                        Logger.getLogger(General1.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                       
            }
              if(i==8)
              {
                   jLabel7.setVisible(false);
                      jLabel8.setVisible(true);
                      jPanel8.setVisible(false);
                  if(n<4)
                  {
                    jLabel8.setVisible(true);
                    jLabel8.setEnabled(true);
                      jLabel8.setText("<html>You are at low risk and your Risk Factor is 0.4<br>Please take are of yourself");
                      SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class, Login1.st);
        g.setStatus("low");
        session.update(g);
           tx.commit();
                  
                  }
                  if(n>7)
                  {
                       jLabel8.setVisible(true);
                    jLabel8.setEnabled(true);
                      jLabel8.setText("<html>You are at high risk and your Risk Factor is above 0.7<br>Please stay at home and take care of yourself");
                      SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setStatus("high");
        session.update(g);
           tx.commit();
                    
                  }
                  if(n>=4 && n<=7)
                  {
                      jLabel8.setVisible(true);
                    jLabel8.setEnabled(true);
                     jLabel8.setText("<html>You are at moderate risk and your Risk Factor is between 0.4 and 0.7<br>Please take care of yourself"); 
                      SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setStatus("moderate");
        session.update(g);
           tx.commit();
                    
                  }
                    try {
                        Thread.sleep(7000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Status.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   dispose();
              }
              
 }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.CardLayout());

        jPanel1.setOpaque(false);

        jButton1.setText("YES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("NO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.add(jPanel1, "card1");

        jPanel2.setOpaque(false);

        jButton5.setText("Diabetes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cardiovasculaor disease");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Lung Disease");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("None");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.add(jPanel2, "card2");

        jPanel3.setOpaque(false);

        jButton9.setText("Yes");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("N0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel3, "card3");

        jPanel4.setOpaque(false);

        jButton13.setText("Yes");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("No");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Sometimes");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jPanel8.add(jPanel4, "card4");

        jPanel5.setOpaque(false);

        jButton17.setText("Yes, tested positive");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Yes, tested negative");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("No");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jPanel8.add(jPanel5, "card5");

        jPanel6.setOpaque(false);

        jButton21.setText("0");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("1");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("2");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("3 or above");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.add(jPanel6, "card6");

        jPanel7.setOpaque(false);

        jButton25.setText("Yes");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("No");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("Maybe");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        jPanel8.add(jPanel7, "card7");

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 330, 270));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 530, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 640, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatbot.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 590));
        getContentPane().setBackground(Color.white);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 640, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (25)_1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/covidback.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 588));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 220));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       SessionFactory sf=ConnectionFactory.emergencyconnection();
           Session session=sf.openSession();
           Transaction tx=session.beginTransaction();
           General g=(General)session.get(General.class,  Login1.st);
        g.setQues1("yes");
        session.update(g);
           i=2;
           n=n+1;
           tx.commit();
           run();
           
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       SessionFactory sf=ConnectionFactory.emergencyconnection();
           Session session=sf.openSession();
           Transaction tx=session.beginTransaction();
          General g=(General)session.get(General.class,  Login1.st);
        g.setQues1("No");
        session.update(g);
           i=2;
           tx.commit();
        
           run();
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues2("Diabetes");
        session.update(g);
           tx.commit();
           i=3;
           n=n+1;
           run();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues2("Cardiovascular Disease");
        session.update(g);
           tx.commit();
           i=3;
           n=n+1;
           run();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues2("Lung Disease");
        session.update(g);
           tx.commit();
           i=3;
           n=n+1;
           run();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues2("None");
        session.update(g);
           tx.commit();
           i=3;
           run();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues3("yes");
        session.update(g);
           tx.commit();
           i=4;
           n=n+1;
           run();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues3("no");
        session.update(g);
           tx.commit();
           i=4;
           run();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues4("yes");
        session.update(g);
           tx.commit();
           i=5;
           n=n+2;
           run();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues4("no");
        session.update(g);
           tx.commit();
           i=5;
           run();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues4("sometimes");
        session.update(g);
           tx.commit();
           i=5;
           n=n+1;
           run();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues5("yes, tested positive");
        session.update(g);
           tx.commit();
           i=6;
           n=n+2;
           run();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues5("yes, tested neative");
        session.update(g);
           tx.commit();
           i=6;
           run();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues5("no");
        session.update(g);
           tx.commit();
           i=6;
           n=n+1;
           run();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues6("0");
        session.update(g);
           tx.commit();
           i=7;
           run();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues6( Login1.st);
        session.update(g);
           tx.commit();
           i=7;
           n=n+1;
           run();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues6("2");
        session.update(g);
           tx.commit();
           i=7;
           n=n+2;
           run();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues6("3 or above");
        session.update(g);
           tx.commit();
           i=7;
           n=n+3;
           run();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues7("yes");
        session.update(g);
           tx.commit();
           i=8;
           run();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues7("no");
        session.update(g);
           tx.commit();
           i=8;
           run();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        SessionFactory sf=ConnectionFactory.emergencyconnection();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        General g=(General)session.get(General.class,  Login1.st);
        g.setQues7("maybe");
        session.update(g);
           tx.commit();
           i=8;
           run();
    }//GEN-LAST:event_jButton27ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
       
        
                    new Status().setVisible(true);
                    Status s=new Status();
                    s.setState(ICONIFIED);


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
