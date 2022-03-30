

package Interface;

import BDD.BDD;
import BDD.Paramtre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JFrame {

ResultSet rs;
BDD db; 
String username1,password1,type;
String id;
    public Login() {
        db = new BDD (Paramtre.HOST_DB, Paramtre.USERNAME_DB,Paramtre.PASSWORD_DB,Paramtre.IPHOST,Paramtre.PORT);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_user = new javax.swing.JTextField();
        d = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_co = new javax.swing.JButton();
        ferme = new javax.swing.JLabel();
        Erreur = new javax.swing.JLabel();
        txt_mdp = new javax.swing.JPasswordField();
        Chargement = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-connexion-80.png"))); 
        login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); 
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Connexion");
        login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-administrateur-homme-26.png"))); 
        jLabel4.setText("Nom D'utilisateur :");
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        text_user.setFont(new java.awt.Font("Roboto", 0, 14)); 
        text_user.setForeground(new java.awt.Color(0, 102, 102));
        text_user.setBorder(null);
        login.add(text_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 230, 30));

        d.setBackground(new java.awt.Color(0, 102, 102));
        login.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 410, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-verrouiller-2-26.png"))); 
        jLabel5.setText("Mot De Passe        : ");
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 410, 20));

        btn_co.setBackground(new java.awt.Color(0, 102, 102));
        btn_co.setFont(new java.awt.Font("Roboto", 0, 12)); 
        btn_co.setForeground(new java.awt.Color(255, 255, 255));
        btn_co.setText("Connexion");
        btn_co.setBorder(null);
        btn_co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coActionPerformed(evt);
            }
        });
        login.add(btn_co, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 220, 120, 30));

        ferme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-effacer-filled-50.png"))); 
        ferme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermeMouseClicked(evt);
            }
        });
        login.add(ferme, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        Erreur.setFont(new java.awt.Font("Roboto", 0, 18)); 
        Erreur.setForeground(new java.awt.Color(255, 0, 0));
        login.add(Erreur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 360, -1));

        txt_mdp.setFont(new java.awt.Font("Roboto", 0, 14)); 
        txt_mdp.setForeground(new java.awt.Color(0, 102, 102));
        txt_mdp.setText("jPasswordField1");
        txt_mdp.setBorder(null);
        txt_mdp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_mdpFocusGained(evt);
            }
        });
        login.add(txt_mdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 230, 30));

        jPanel1.add(login, "card2");

        Chargement.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/lg.rotate-spiral-spinner.gif"))); 

        javax.swing.GroupLayout ChargementLayout = new javax.swing.GroupLayout(Chargement);
        Chargement.setLayout(ChargementLayout);
        ChargementLayout.setHorizontalGroup(
            ChargementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChargementLayout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );
        ChargementLayout.setVerticalGroup(
            ChargementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChargementLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(Chargement, "card3");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 310));

        pack();
    }

    private void fermeMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void btn_coActionPerformed(java.awt.event.ActionEvent evt) {
         Chargement.show();
        login.hide();
       new java.util.Timer().schedule(new TimerTask() {
             @Override
             public void run() {
                try{
                      rs = db.querySelectAll("login","Nom='"+text_user.getText()+ "' and Password='"+ txt_mdp.getText()+"'");
            while(rs.next()){
                username1 = rs.getString("Nom");
                password1 = rs.getString("Password");
               
              
               
            }
        } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
                
        if(username1==null && password1==null){
            Chargement.hide();
            login.show();
            Erreur.setText("Nom d'utilisateur ou Mot de passe Incorrecte");
            Erreur.setVisible(true);
       }
        else{
            EntreClass n = new EntreClass(id);
             
                   Admin a = new Admin();
                   a.setVisible(true);
                dispose();
               
        }
                  
             }
         },300*5);
      
    }

    private void txt_mdpFocusGained(java.awt.event.FocusEvent evt) {/
      txt_mdp.setText("");
    }
    
         
          
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Chargement;
    private javax.swing.JLabel Erreur;
    private javax.swing.JButton btn_co;
    private javax.swing.JSeparator d;
    private javax.swing.JLabel ferme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel login;
    private javax.swing.JTextField text_user;
    private javax.swing.JPasswordField txt_mdp;


}