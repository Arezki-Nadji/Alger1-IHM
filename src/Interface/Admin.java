
package Interface;
import BDD.BDD;
import BDD.Paramtre;
import BDD.ResultSetTableModel;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Admin extends javax.swing.JFrame {
    private DateFormat formadate = DateFormat.getDateInstance();
   ResultSet rs;
   ResultSet bs;
   ResultSet ts;
    BDD db;  
    String type = null;
    String abs =null;
    String t=null;
    Time Entre = null;


    public Admin() {
         db = new BDD (Paramtre.HOST_DB, Paramtre.USERNAME_DB,Paramtre.PASSWORD_DB,Paramtre.IPHOST,Paramtre.PORT);
        initComponents();
        table();
        tableaccu();
        TableauAsence();
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        java.util.Date dati = new java.util.Date();
        Dot.setText(sdf.format(dati));
       
    }
    public void table(){
        String a[] = {"ID","Nom","Prenom","Fonction","Departement","Absence","Retard"};
       rs = db.querySelect(a,"utilisateur");
      Tabel_use.setModel(new ResultSetTableModel(rs));
      
    }
    public void tableaccu(){
        String a[] = {"ID","Nom","Prenom","Fonction","Departement","Absence","Retard"};
     
       
         int n=3;
     
                      rs = db.fcSelectCommand(a,"utilisateur","Absence >= '"+n+"'");
  
         Table_Accu.setModel(new ResultSetTableModel(rs));
      
    }
    public void TableauAsence(){
        
         String a[] = {"ID","Nom","Prenom","Fonction","Departement","Absence","Retard"};
       rs = db.querySelect(a,"utilisateur");
      Tableab.setModel(new ResultSetTableModel(rs));
      
    }
    
    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        BG = new javax.swing.JPanel();
        Coté = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Gest_Emp = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Gest_hor = new javax.swing.JLabel();
        Gest_Po = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Deconnexion = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        statique = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        acc = new javax.swing.JLabel();
        Millieux = new javax.swing.JPanel();
        Acu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date_du_jour = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Nbr_ut = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Accu = new javax.swing.JTable();
        jSeparator10 = new javax.swing.JSeparator();
        Dot = new javax.swing.JLabel();
        Gestion_Employées = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_use = new javax.swing.JTable();
        moddif = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        SUPP = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rech = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        text_pass = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        com_ty = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        text_utili = new javax.swing.JTextField();
        Recherche = new javax.swing.JButton();
        txt_fonction = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        text_pass2 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        text_pass3 = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txt_departement = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        Gesion_Horr = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lundi = new javax.swing.JRadioButton();
        samedi = new javax.swing.JRadioButton();
        dimanche = new javax.swing.JRadioButton();
        vendredi = new javax.swing.JRadioButton();
        mercredi = new javax.swing.JRadioButton();
        mardi = new javax.swing.JRadioButton();
        jeudi = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        s = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        valid = new javax.swing.JButton();
        h = new javax.swing.JTextField();
        m = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        h1 = new javax.swing.JTextField();
        stat = new javax.swing.JPanel();
        panelChart = new javax.swing.JPanel();
        Gestion_Pointage = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tableab = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        id_absence = new javax.swing.JTextField();
        absence = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        btnabs = new javax.swing.JButton();
        entre = new javax.swing.JLabel();
        retard = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 800));
        setLocationByPlatform(true);
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setPreferredSize(new java.awt.Dimension(800, 540));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Coté.setBackground(new java.awt.Color(0, 102, 102));
        Coté.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-administrateur-homme-filled-50 (1).png"))); 
        jLabel1.setText("Adminstration");
        Coté.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, -1));
        Coté.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 20));

        Gest_Emp.setFont(new java.awt.Font("Roboto", 0, 18)); 
        Gest_Emp.setForeground(new java.awt.Color(255, 255, 255));
        Gest_Emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-administrateur-homme-32.png")));
        Gest_Emp.setText("Gestion des Employées");
        Gest_Emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gest_EmpMouseClicked(evt);
            }
        });
        Coté.add(Gest_Emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        Coté.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 20));

        Gest_hor.setFont(new java.awt.Font("Roboto", 0, 18)); 
        Gest_hor.setForeground(new java.awt.Color(255, 255, 255));
        Gest_hor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-calendrier-32.png")));
        Gest_hor.setText("Gestion des horaires");
        Gest_hor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gest_horMouseClicked(evt);
            }
        });
        Coté.add(Gest_hor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Gest_Po.setFont(new java.awt.Font("Roboto", 0, 18)); 
        Gest_Po.setForeground(new java.awt.Color(255, 255, 255));
        Gest_Po.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-aujourd'hui-32.png"))); 
        Gest_Po.setText("Gestion des Pointages ");
        Gest_Po.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gest_PoMouseClicked(evt);
            }
        });
        Coté.add(Gest_Po, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        Coté.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 20));

        Deconnexion.setFont(new java.awt.Font("Roboto", 0, 18)); 
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-déconnexion-filled-50.png"))); 
        Deconnexion.setText("Déconnexion");
        Deconnexion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeconnexionMouseClicked(evt);
            }
        });
        Coté.add(Deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));
        Coté.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 200, 20));
        Coté.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 200, 20));

        statique.setFont(new java.awt.Font("Roboto", 0, 18)); 
        statique.setForeground(new java.awt.Color(255, 255, 255));
        statique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-calendrier-32.png"))); 
        statique.setText("Statstiques Générale");
        statique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statiqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statiqueMouseEntered(evt);
            }
        });
        Coté.add(statique, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        Coté.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 200, 20));
        Coté.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 20));

        acc.setFont(new java.awt.Font("Roboto", 0, 18)); 
        acc.setForeground(new java.awt.Color(255, 255, 255));
        acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-accueil-32.png")));
        acc.setText("Page Acceuil ");
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accMouseClicked(evt);
            }
        });
        Coté.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        BG.add(Coté, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 540));

        Millieux.setBackground(new java.awt.Color(255, 255, 255));
        Millieux.setLayout(new java.awt.CardLayout());

        Acu.setBackground(new java.awt.Color(255, 255, 255));
        Acu.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                AcuHierarchyChanged(evt);
            }
        });
        Acu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); 
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Accueil ");
        Acu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        date_du_jour.setFont(new java.awt.Font("Roboto", 0, 14));
        date_du_jour.setText("Date Du Jour :");
        Acu.add(date_du_jour, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        date.setFont(new java.awt.Font("Roboto", 0, 14));
        Acu.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 80, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14));
        jLabel13.setText("Tableau Des Personne qui ont  plus de 3 jour D'absence :");
        Acu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 400, -1));

        Nbr_ut.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Acu.add(Nbr_ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 80, 20));

        Table_Accu.setBackground(new java.awt.Color(0, 102, 102));
        Table_Accu.setForeground(new java.awt.Color(255, 255, 255));
        Table_Accu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Password", "Fonction", "Département", "Absence"
            }
        ));
        Table_Accu.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Table_Accu);

        Acu.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 490, 130));
        Acu.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 350, 10));

        Dot.setFont(new java.awt.Font("Roboto", 0, 11)); 
        Acu.add(Dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 60, 20));

        Millieux.add(Acu, "card2");

        Gestion_Employées.setBackground(new java.awt.Color(255, 255, 255));
        Gestion_Employées.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 36));
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Gestion Des Employées");
        Gestion_Employées.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Tabel_use.setBackground(new java.awt.Color(0, 102, 102));
        Tabel_use.setFont(new java.awt.Font("Roboto", 0, 11));
        Tabel_use.setForeground(new java.awt.Color(255, 255, 255));
        Tabel_use.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom Utilisateur", "Mot de passe", "Fonction", "Département", "Type", "Absence", "Retard"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel_use.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tabel_use);

        Gestion_Employées.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 70, 500, 120));

        moddif.setFont(new java.awt.Font("Roboto", 0, 18)); 
        moddif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-edition-multiple-filled-50 (2).png"))); 
        moddif.setText("Modifier");
        moddif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moddifMouseClicked(evt);
            }
        });
        Gestion_Employées.add(moddif, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        add.setFont(new java.awt.Font("Roboto", 0, 18)); 
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-plus-filled-50.png"))); 
        add.setText("Ajouter");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        Gestion_Employées.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        SUPP.setFont(new java.awt.Font("Roboto", 0, 18)); 
        SUPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-annuler-filled-50_1.png"))); 
        SUPP.setText("Supprimer");
        SUPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SUPPMouseClicked(evt);
            }
        });
        Gestion_Employées.add(SUPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel7.setText("Nom                          :");
        Gestion_Employées.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        rech.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 140, -1));
        Gestion_Employées.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 10));

        text_pass.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(text_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, -1));
        Gestion_Employées.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 10));
        Gestion_Employées.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 260, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel10.setText("Recherche Par :");
        Gestion_Employées.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 20));

        com_ty.setFont(new java.awt.Font("Roboto", 0, 14)); 
        com_ty.setForeground(new java.awt.Color(0, 102, 102));
        com_ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nom", "Département", "Fonction", "Type" }));
        Gestion_Employées.add(com_ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 140, -1));
        Gestion_Employées.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 260, 10));

        text_utili.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(text_utili, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, -1));

        Recherche.setBackground(new java.awt.Color(0, 102, 102));
        Recherche.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Recherche.setForeground(new java.awt.Color(255, 255, 255));
        Recherche.setText("Recherche");
        Recherche.setBorder(null);
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });
        Gestion_Employées.add(Recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 140, 20));

        txt_fonction.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(txt_fonction, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 140, -1));
        Gestion_Employées.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 260, 10));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel19.setText("Fonction                 :");
        Gestion_Employées.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        text_pass2.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(text_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, -1));
        Gestion_Employées.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 10));

        text_pass3.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(text_pass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 140, -1));
        Gestion_Employées.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 260, 10));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel21.setText("Prénom                    :");
        Gestion_Employées.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        txt_departement.setFont(new java.awt.Font("Roboto", 0, 14)); 
        Gestion_Employées.add(txt_departement, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 140, -1));
        Gestion_Employées.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, 10));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel22.setText("Département        :");
        Gestion_Employées.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 20));

        Millieux.add(Gestion_Employées, "card3");

        Gesion_Horr.setBackground(new java.awt.Color(255, 255, 255));
        Gesion_Horr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 36)); 
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Gestion des Horraires");
        Gesion_Horr.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel15.setText("Selectionner les heures de travaille");
        Gesion_Horr.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lundi.setBackground(new java.awt.Color(255, 255, 255));
        lundi.setFont(new java.awt.Font("Roboto", 0, 12)); 
        lundi.setForeground(new java.awt.Color(0, 102, 102));
        lundi.setText("Lundi");
        Gesion_Horr.add(lundi, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 140, 60, -1));

        samedi.setBackground(new java.awt.Color(255, 255, 255));
        samedi.setFont(new java.awt.Font("Roboto", 0, 12)); 
        samedi.setForeground(new java.awt.Color(0, 102, 102));
        samedi.setText("Samedi");
        Gesion_Horr.add(samedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        dimanche.setBackground(new java.awt.Color(255, 255, 255));
        dimanche.setFont(new java.awt.Font("Roboto", 0, 12)); 
        dimanche.setForeground(new java.awt.Color(0, 102, 102));
        dimanche.setText("Dimanche");
        dimanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimancheActionPerformed(evt);
            }
        });
        Gesion_Horr.add(dimanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        vendredi.setBackground(new java.awt.Color(255, 255, 255));
        vendredi.setFont(new java.awt.Font("Roboto", 0, 12)); 
        vendredi.setForeground(new java.awt.Color(0, 102, 102));
        vendredi.setText("Vendredi");
        Gesion_Horr.add(vendredi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, -1));

        mercredi.setBackground(new java.awt.Color(255, 255, 255));
        mercredi.setFont(new java.awt.Font("Roboto", 0, 12)); 
        mercredi.setForeground(new java.awt.Color(0, 102, 102));
        mercredi.setText("Mercredi");
        Gesion_Horr.add(mercredi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        mardi.setBackground(new java.awt.Color(255, 255, 255));
        mardi.setFont(new java.awt.Font("Roboto", 0, 12)); 
        mardi.setForeground(new java.awt.Color(0, 102, 102));
        mardi.setText("Mardi");
        Gesion_Horr.add(mardi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jeudi.setBackground(new java.awt.Color(255, 255, 255));
        jeudi.setFont(new java.awt.Font("Roboto", 0, 12)); 
        jeudi.setForeground(new java.awt.Color(0, 102, 102));
        jeudi.setText("Jeudi");
        Gesion_Horr.add(jeudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 60, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel16.setText("Selectionner jour de travaille");
        Gesion_Horr.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); 
        jLabel17.setText("Heur D'entrée ");
        Gesion_Horr.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        s.setFont(new java.awt.Font("Roboto", 0, 12)); 
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        Gesion_Horr.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 30, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 12)); 
        jLabel18.setText("Heur De Sortie");
        Gesion_Horr.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        Gesion_Horr.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 200, -1));

        valid.setBackground(new java.awt.Color(0, 102, 102));
        valid.setFont(new java.awt.Font("Roboto", 0, 14)); 
        valid.setForeground(new java.awt.Color(255, 255, 255));
        valid.setText("Validé");
        valid.setBorder(null);
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });
        Gesion_Horr.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, 20));

        h.setFont(new java.awt.Font("Roboto", 0, 12)); 
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        Gesion_Horr.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 30, -1));

        m.setFont(new java.awt.Font("Roboto", 0, 12)); 
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        Gesion_Horr.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 30, -1));

        jLabel4.setText(":");
        Gesion_Horr.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 10, 20));

        jLabel5.setText(":");
        Gesion_Horr.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 10, 20));

        s1.setFont(new java.awt.Font("Roboto", 0, 12)); 
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        Gesion_Horr.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 30, -1));

        jLabel6.setText(":");
        Gesion_Horr.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 10, 20));

        m1.setFont(new java.awt.Font("Roboto", 0, 12)); 
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        Gesion_Horr.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 30, -1));

        jLabel11.setText(":");
        Gesion_Horr.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 10, 20));

        h1.setFont(new java.awt.Font("Roboto", 0, 12)); 
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });
        Gesion_Horr.add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 30, -1));

        Millieux.add(Gesion_Horr, "card4");

        stat.setBackground(new java.awt.Color(255, 255, 255));
        stat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelChart.setLayout(new java.awt.BorderLayout());
        stat.add(panelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 510, 300));

        Millieux.add(stat, "card6");

        Gestion_Pointage.setBackground(new java.awt.Color(255, 255, 255));
        Gestion_Pointage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tableab.setBackground(new java.awt.Color(0, 102, 102));
        Tableab.setForeground(new java.awt.Color(255, 255, 255));
        Tableab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Password", "Fonction", "Département", "Absence", "Retard"
            }
        ));
        Tableab.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(Tableab);

        Gestion_Pointage.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 490, 130));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 36)); 
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setText("Gestion Des Pointages");
        Gestion_Pointage.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("ID Employées           : ");
        Gestion_Pointage.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 247, -1, 30));

        id_absence.setFont(new java.awt.Font("Roboto", 0, 12)); 
        id_absence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_absenceActionPerformed(evt);
            }
        });
        Gestion_Pointage.add(id_absence, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, 30));

        absence.setFont(new java.awt.Font("Roboto", 0, 12)); 
        absence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenceActionPerformed(evt);
            }
        });
        Gestion_Pointage.add(absence, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, 30));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel25.setForeground(new java.awt.Color(0, 102, 102));
        jLabel25.setText("Attribuer Absence  :");
        Gestion_Pointage.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 297, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Afficher Les Employées qui ont une absence");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Gestion_Pointage.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 320, -1));
        Gestion_Pointage.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 260, 10));

        btnabs.setBackground(new java.awt.Color(0, 102, 102));
        btnabs.setFont(new java.awt.Font("Roboto", 0, 14)); 
        btnabs.setForeground(new java.awt.Color(255, 255, 255));
        btnabs.setText("Validé");
        btnabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabsActionPerformed(evt);
            }
        });
        Gestion_Pointage.add(btnabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, -1));

        entre.setFont(new java.awt.Font("Roboto", 0, 14)); 
        entre.setForeground(new java.awt.Color(0, 102, 102));
        entre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/icons8-entrer-filled-50.png"))); 
        entre.setText("Pointer");
        entre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entreMouseClicked(evt);
            }
        });
        Gestion_Pointage.add(entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        retard.setFont(new java.awt.Font("Roboto", 0, 12)); 
        retard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retardActionPerformed(evt);
            }
        });
        Gestion_Pointage.add(retard, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 120, 30));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); 
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("ID Employées           : ");
        Gestion_Pointage.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        Millieux.add(Gestion_Pointage, "card5");

        BG.add(Millieux, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void Gest_EmpMouseClicked(java.awt.event.MouseEvent evt) {
        Gestion_Employées.show();
        Gesion_Horr.hide();
       Gestion_Pointage.hide();
       Acu.hide();
        table();
    }

    private void Gest_horMouseClicked(java.awt.event.MouseEvent evt) {
         Gesion_Horr.show();
        Gestion_Employées.hide();
        Acu.hide();
       Gestion_Pointage.hide();
    }

    private void Gest_PoMouseClicked(java.awt.event.MouseEvent evt) {
       Gestion_Pointage.show();
        Gestion_Employées.hide();
        Gesion_Horr.hide();
         Acu.hide();
         TableauAsence();
     
       
    }

    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
       String HeurE = h.getText();
       String MinuteE = m.getText();
       String SecondeE = s.getText();
       
       int heurE = Integer.parseInt(HeurE);
       int minuteE = Integer.parseInt(MinuteE);
       int secondeE = Integer.parseInt(SecondeE);
       
       String HeurS = h1.getText();
       String MinuteS = m1.getText();
       String SecondeS = s1.getText();
       
       int heurS = Integer.parseInt(HeurS);
       int secondeS = Integer.parseInt(MinuteS);
       int minuteS = Integer.parseInt(SecondeS);
       if(samedi.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("samedi ",b,c,"ID='"+1+"'"));}
       
       else if(dimanche.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("dimanche ",b,c,"ID='"+2+"'"));}
       
       else if(lundi.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("lundi ",b,c,"ID='"+3+"'"));}
       
       else if(mardi.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("mardi ",b,c,"ID='"+4+"'"));}
       
       else if(mercredi.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("mercredi ",b,c,"ID='"+5+"'"));}
       
       else if(jeudi.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("jeudi ",b,c,"ID='"+6+"'"));}
       
       else if(vendredi.isSelected()){
       java.sql.Time k = new  Time(heurE,secondeE,minuteE);
       java.sql.Time d = new  Time(heurS,secondeS,minuteS);
       String b[] = {"Entre","Sort"};
       java.sql.Time c[] ={k,d};
       System.out.println(db.queryUpdate("vendredi ",b,c,"ID='"+7+"'"));}
        
    }

    private void addMouseClicked(java.awt.event.MouseEvent evt) {
            if(text_utili.getText().equals("") || text_pass.getText().equals("")){
         JOptionPane.showMessageDialog(this,"SVP Entrer les Informations Complete");
       }
     
       else{
            
               String [] colon= {"Nom","Prenom","Fonction","Departement","Absence","Retard"};
               String [] inf ={text_utili.getText(),text_pass.getText(),txt_fonction.getText(),txt_departement.getText(),"0","0"};
           System.out.println(db.queryInsert("utilisateur",colon,inf));
              }    
         table();
    }

    private void statiqueMouseClicked(java.awt.event.MouseEvent evt) {
       
        
          try{
                        bs =db.SUm();
                       ts= db.Sum();
                       rs = db.count();
            while(rs.next() && ts.next()&& bs.next()){
                t = bs.getString("pit");
               abs = ts.getString("pit");
                type = rs.getString("pit");
              
               
            }
        } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
          int nbrR=Integer.parseInt(t);
          int nbr = Integer.parseInt(abs);
          int nbremp = Integer.parseInt(type);
         DefaultCategoryDataset barCharData = new DefaultCategoryDataset();
         barCharData.setValue(nbr, "Absence","Absence");
         barCharData.setValue(nbremp, "Absence","Employées");
         barCharData.setValue(nbrR, "Absence","Retard");
         JFreeChart barChart = ChartFactory.createBarChart("Statistique Générale","","Nombre", barCharData ,PlotOrientation.VERTICAL,false,true,false);
         CategoryPlot barchrt = barChart.getCategoryPlot();
         barchrt.setRangeGridlinePaint(Color.BLACK);
         ChartPanel barPanel = new ChartPanel(barChart);
         panelChart.removeAll();
         panelChart.add(barPanel,BorderLayout.CENTER);
         panelChart.validate();
         panelChart.show(true);
         
         
          stat.show();
        Gestion_Pointage.hide();
        Gestion_Employées.hide();
        Gesion_Horr.hide();
         Acu.hide();
        
         
    }

    private void DeconnexionMouseClicked(java.awt.event.MouseEvent evt) {
      this.dispose();
    }

    private void SUPPMouseClicked(java.awt.event.MouseEvent evt) {
           if(text_utili.getText().equals("")){
         JOptionPane.showMessageDialog(this,"Champ Nom D'utilisateur Vide ou Le produit n'existe pas");
       }
     
       else{ 
               String [] colon= {"ID","Nom","Prenom","Fonction","Departement","Absence","Retard"};
               String [] inf ={text_utili.getText(),text_pass.getText(),txt_fonction.getText(),txt_departement.getText()};
           System.out.println(db.queryDelete("utilisateur" ,"Nom='"+inf[0]+"'"));
           
               table();
               
               }
    }

    private void moddifMouseClicked(java.awt.event.MouseEvent evt) {
         if(text_utili.getText().equals("") || text_pass.getText().equals("")){
         JOptionPane.showMessageDialog(this,"SVP Entrer les Informations Complete");
       }
     
       else {
               String [] colon= {"Nom","Prenom","Fonction","Departement","Absence","Retard"};
               String [] inf ={text_utili.getText(),text_pass.getText(),txt_fonction.getText(),txt_departement.getText(),"0","0"};
           System.out.println(db.queryUpdate("utilisateur",colon,inf,"Nom='"+inf[0]+"'"));
              }

         table();
    }

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {
        if(rech.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Champ de recherche vide");}
        else{
           if(com_ty.getSelectedItem().equals("Nom")){
               rs= db.querySelectAll("utilisateur","Nom='"+rech.getText()+"'");
               Tabel_use.setModel(new ResultSetTableModel(rs));
               
           }
           else if(com_ty.getSelectedItem().equals("Fonction")){
                rs= db.querySelectAll("utilisateur","Fonction='"+rech.getText()+"'");
               Tabel_use.setModel(new ResultSetTableModel(rs));
           }
            else if(com_ty.getSelectedItem().equals("Département")){
                rs= db.querySelectAll("utilisateur","Departement='"+rech.getText()+"'");
               Tabel_use.setModel(new ResultSetTableModel(rs));
           }
            
           
        }
       
    }

   

    private void btnabsActionPerformed(java.awt.event.ActionEvent evt) {
 
         String [] colon= {"Absence"};
               String [] inf ={absence.getText()};
           System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+id_absence.getText()+"'"));
            TableauAsence();
            
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
String a[] = {"ID","Nom","Prenom","Fonction","Departement","Absence","Retard"};
       
         String v = "0";
        
     
                      rs = db.fcSelectCommand(a,"utilisateur","Absence<>'"+v+"'");
         
         Tableab.setModel(new ResultSetTableModel(rs));
    }

    private void accMouseClicked(java.awt.event.MouseEvent evt) {
tableaccu();       
        Gestion_Employées.hide();
        Gesion_Horr.hide();
       Gestion_Pointage.hide();
       Acu.show();
      
       
    }

    

    private void entreMouseClicked(java.awt.event.MouseEvent evt) {

        java.sql.Time k=Time.valueOf(LocalTime.MIN);
        Calendar c =Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_WEEK);
 
        String ID = EntreClass.getID();
        try{
            String kh[] = {"Retard"};
            rs = db.fcSelectCommand(kh,"utilisateur", "ID='"+retard.getText()+"'");
            while(rs.next()){

                abs = rs.getString("Retard");

            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
        ;
        if(day == 0){
            try{

                rs = db.selectTime("samedi","ID='"+1+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
              

            }
        }if(day == 1){
            try{

                rs = db.selectTime("dimanche","ID='"+2+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
               

            }
        }
        if(day == 2){
            try{

                rs = db.selectTime("lundi","ID='"+3+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
              

            }
        }
        if(day == 3){
            try{

                rs = db.selectTime("mardi","ID='"+4+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
              

            }
        }

        if(day == 4){
            try{

                rs = db.selectTime("mercredi","ID='"+5+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
               

            }
        }
        if(day == 5){
            try{

                rs = db.selectTime("jeudi","ID='"+6+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
              

            }
        }
        if(day == 6){
            try{

                rs = db.selectTime("samedi","ID='"+7+"'");
                while(rs.next()){

                    Entre = rs.getTime("Entre");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);}
            ;

            System.out.println(abs);
            if(Entre.compareTo(k)>0){
                int compteur=   Integer.parseInt(abs);
                compteur++;
                String cpt = Integer.toString(compteur);
                String [] colon= {"Retard"};
                String [] inf ={cpt};
                System.out.println(db.queryUpdate("utilisateur ",colon,inf,"ID='"+retard.getText()+"'"));
             
 TableauAsence();
            }
        }
    }

  
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

   
    private javax.swing.JPanel Acu;
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Coté;
    private javax.swing.JLabel Deconnexion;
    private javax.swing.JLabel Dot;
    private javax.swing.JPanel Gesion_Horr;
    private javax.swing.JLabel Gest_Emp;
    private javax.swing.JLabel Gest_Po;
    private javax.swing.JLabel Gest_hor;
    private javax.swing.JPanel Gestion_Employées;
    private javax.swing.JPanel Gestion_Pointage;
    private javax.swing.JPanel Millieux;
    private javax.swing.JLabel Nbr_ut;
    private javax.swing.JButton Recherche;
    private javax.swing.JLabel SUPP;
    private javax.swing.JTable Tabel_use;
    private javax.swing.JTable Table_Accu;
    private javax.swing.JTable Tableab;
    private javax.swing.JTextField absence;
    private javax.swing.JLabel acc;
    private javax.swing.JLabel add;
    private javax.swing.JButton btnabs;
    private javax.swing.JComboBox<String> com_ty;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date_du_jour;
    private javax.swing.JRadioButton dimanche;
    private javax.swing.JLabel entre;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField h;
    private javax.swing.JTextField h1;
    private javax.swing.JTextField id_absence;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton jeudi;
    private javax.swing.JRadioButton lundi;
    private javax.swing.JTextField m;
    private javax.swing.JTextField m1;
    private javax.swing.JRadioButton mardi;
    private javax.swing.JRadioButton mercredi;
    private javax.swing.JLabel moddif;
    private javax.swing.JPanel panelChart;
    private javax.swing.JTextField rech;
    private javax.swing.JTextField retard;
    private javax.swing.JTextField s;
    private javax.swing.JTextField s1;
    private javax.swing.JRadioButton samedi;
    private javax.swing.JPanel stat;
    private javax.swing.JLabel statique;
    private javax.swing.JTextField text_pass;
    private javax.swing.JTextField text_pass2;
    private javax.swing.JTextField text_pass3;
    private javax.swing.JTextField text_utili;
    private javax.swing.JTextField txt_departement;
    private javax.swing.JTextField txt_fonction;
    private javax.swing.JButton valid;
    private javax.swing.JRadioButton vendredi;
  
}

