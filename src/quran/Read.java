/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;


public class Read extends javax.swing.JFrame {

    /**
     * Creates new form Read
     */
    public Read() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setResizable(true);
        this.setVisible(true);
        initComponents();
        Toolkit tk= Toolkit.getDefaultToolkit();
        int xsize=(int) tk.getScreenSize().getWidth();
        int ysize= (int)tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
        int rowCnt=4;
       matrixPanel.setLayout(new BoxLayout(this.matrixPanel,BoxLayout.PAGE_AXIS)); // matrixPanel is the dedicated JPanel
      //  setContentPane(new JLabel(new ImageIcon("images/sky.jpg")));
     boolean trans=false;
       if(checkBox.isSelected()){
            trans=true;
        }
       this.display(trans);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Selected = new javax.swing.JButton();
        SurahList = new javax.swing.JComboBox();
        checkBox = new javax.swing.JCheckBox();
        name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrixPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Selected1 = new javax.swing.JButton();
        Selected2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 232, 232));
        jLabel2.setText("Read Quran");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1440, 40, 380, 70);

        Selected.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Selected.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        Selected.setText("Selected");
        Selected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedActionPerformed(evt);
            }
        });
        getContentPane().add(Selected);
        Selected.setBounds(990, 14, 200, 40);

        SurahList.setBackground(new java.awt.Color(255, 255, 204));
        SurahList.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        SurahList.setForeground(new java.awt.Color(0, 0, 102));
        SurahList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1.AL-FATIHA (THE OPENING) 7 Ayahs", "2.AL-BAQARA (THE COW) 286 Ayahs", "3.AAL-E-IMRAN (THE FAMILY OF 'IMRAN, THE HOUSE OF 'IMRAN) 200 Ayahs", "4.AN-NISA (WOMEN) 176 Ayahs", "5.AL-MAEDA (THE TABLE, THE TABLE SPREAD) 120 Ayahs", "6.AL-ANAAM (CATTLE, LIVESTOCK) 165 Ayahs", "7.AL-ARAF (THE HEIGHTS) 206 Ayahs", "8.AL-ANFAL (SPOILS OF WAR, BOOTY) 75 Ayahs", "9.AT-TAWBA (REPENTANCE, DISPENSATION) 129 Ayahs", "10.YUNUS (JONAH) 109 Ayahs", "11.HUD (HUD) 123 Ayahs", "12.YUSUF (JOSEPH) 111 Ayahs", "13.AR-RAD (THE THUNDER) 43 Ayahs", "14.IBRAHIM (ABRAHAM) 52 Ayahs", "15.AL-HIJR (AL-HIJR, STONELAND, ROCK CITY) 99 Ayahs", "16.AN-NAHL (THE BEE) 128 Ayahs", "17.AL-ISRA (ISRA', THE NIGHT JOURNEY, CHILDREN OF ISRAEL) 111 Ayahs", "18.AL-KAHF (THE CAVE) 110 Ayahs", "19.MARYAM (MARY) 98 Ayahs", "20.TA-HA (TA-HA) 135 Ayahs", "21.AL-ANBIYA (THE PROPHETS) 112 Ayahs", "22.AL-HAJJ (THE PILGRIMAGE) 78 Ayahs", "23.AL-MUMENOON (THE BELIEVERS) 118 Ayahs", "24.AN-NOOR (THE LIGHT) 64 Ayahs", "25.AL-FURQAN (THE CRITERION, THE STANDARD) 77 Ayahs", "26.ASH-SHUARA (THE POETS) 227 Ayahs", "27.AN-NAML (THE ANT, THE ANTS) 93 Ayahs", "28.AL-QASAS (THE STORY, STORIES) 88 Ayahs", "29.AL-ANKABOOT (THE SPIDER) 69 Ayahs", "30.AR-ROOM (THE ROMANS, THE BYZANTINES) 60 Ayahs", "31.LUQMAN (LUQMAN) 34 Ayahs", "32.AS-SAJDA (THE PROSTRATION,WORSHIP, ADORATION) 30 Ayahs", "33.AL-AHZAB (THE CLANS, THE COALITION,THE COMBINED FORCES) 73 Ayahs", "34.SABA (SABA, SHEBA) 54 Ayahs", "35.FATIR (THE ANGELS, ORIGNATOR) 45 Ayahs", "36.YA-SEEN (YA-SEEN) 83 Ayahs", "37.AS-SAAFFAT (THOSE WHO SET THE RANKS,DRAWN UP IN RANKS) 182 Ayahs", "38.SAD (THE LETTER SAD) 88 Ayahs", "39.AZ-ZUMAR (THE TROOPS, THRONGS) 75 Ayahs", "40.AL-GHAFIR (THE FORGIVER (GOD) ) 85 Ayahs", "41.FUSSILAT (EXPLAINED IN DETAIL) 54 Ayahs", "42.ASH-SHURA (COUNCIL, CONSULTATION) 53 Ayahs", "43.AZ-ZUKHRUF (ORNAMENTS OF GOLD, LUXURY) 89 Ayahs", "44.AD-DUKHAN (SMOKE) 59 Ayahs", "45.AL-JATHIYA (CROUCHING) 37 Ayahs", "46.AL-AHQAF (THE WIND-CURVED SANDHILLS, THE DUNES) 35 Ayahs", "47.MUHAMMAD (MUHAMMAD) 38 Ayahs", "48.AL-FATH (VICTORY, CONQUEST) 29 Ayahs", "49.AL-HUJRAAT (THE PRIVATE APARTMENTS, THE INNER APARTMENTS) 18 Ayahs", "50.QAF (THE LETTER QAF) 45 Ayahs", "51.ADH-DHARIYAT (THE WINNOWING WINDS) 60 Ayahs", "52.AT-TUR (THE MOUNT) 49 Ayahs", "53.AN-NAJM (THE STAR) 62 Ayahs", "54.AL-QAMAR (THE MOON) 55 Ayahs", "55.AR-RAHMAN (THE BENEFICENT, THE MERCY GIVING) 78 Ayahs", "56.AL-WAQIA (THE EVENT, THE INEVITABLE) 96 Ayahs", "57.AL-HADID (THE IRON) 29 Ayahs", "58.AL-MUJADILA (SHE THAT DISPUTETH, THE PLEADING WOMAN) 22 Ayahs", "59.AL-HASHR (EXILE, BANISHMENT) 24 Ayahs", "60.AL-MUMTAHINA (SHE THAT IS TO BE EXAMINED, EXAMINING HER) 13 Ayahs", "61.AS-SAFF (THE RANKS, BATTLE ARRAY) 14 Ayahs", "62.AL-JUMUA (THE CONGREGATION, FRIDAY) 11 Ayahs", "63.AL-MUNAFIQOON (THE HYPOCRITES) 11 Ayahs", "64.AT-TAGHABUN (MUTUAL DISILLUSION, HAGGLING) 18 Ayahs", "65.AT-TALAQ (DIVORCE) 12 Ayahs", "66.AT-TAHRIM (BANNING, PROHIBITION) 12 Ayahs", "67.AL-MULK (THE SOVEREIGNTY, CONTROL) 30 Ayahs", "68.AL-QALAM (THE PEN) 52 Ayahs", "69.AL-HAAQQA (THE REALITY) 52 Ayahs", "70.AL-MAARIJ (THE ASCENDING STAIRWAYS) 44 Ayahs", "71.NOOH (NOOH) 28 Ayahs", "72.AL-JINN (THE JINN) 28 Ayahs", "73.AL-MUZZAMMIL (THE ENSHROUDED ONE, BUNDLED UP) 20 Ayahs", "74.AL-MUDDATHTHIR (THE CLOAKED ONE, THE MAN WEARING A CLOAK) 56 Ayahs", "75.AL-QIYAMA (THE RISING OF THE DEAD, RESURRECTION) 40 Ayahs", "76.AL-INSAN (MAN) 31 Ayahs", "77.AL-MURSALAT (THE EMISSARIES, WINDS SENT FORTH) 50 Ayahs", "78.AN-NABA (THE TIDINGS, THE ANNOUNCEMENT) 40 Ayahs", "79.AN-NAZIAT (THOSE WHO DRAG FORTH, SOUL-SNATCHERS) 46 Ayahs", "80.ABASA (HE FROWNED) 42 Ayahs", "81.AT-TAKWIR (THE OVERTHROWING) 29 Ayahs", "82.AL-INFITAR (THE CLEAVING, BURSTING APART) 19 Ayahs", "83.AL-MUTAFFIFIN (DEFRAUDING, THE CHEATS, CHEATING) 36 Ayahs", "84.AL-INSHIQAQ (THE SUNDERING, SPLITTING OPEN) 25 Ayahs", "85.AL-BUROOJ (THE MANSIONS OF THE STARS, CONSTELLATIONS) 22 Ayahs", "86.AT-TARIQ (THE MORNING STAR, THE NIGHTCOMER) 17 Ayahs", "87.AL-ALA (THE MOST HIGH, GLORY TO YOUR LORD IN THE HIGHEST) 19 Ayahs", "88.AL-GHASHIYA (THE OVERWHELMING, THE PALL) 26 Ayahs", "89.AL-FAJR (THE DAWN, DAYBREAK) 30 Ayahs", "90.AL-BALAD (THE CITY, THIS COUNTRYSIDE) 20 Ayahs", "91.ASH-SHAMS (THE SUN) 15 Ayahs", "92.AL-LAIL (THE NIGHT) 21 Ayahs", "93.AD-DHUHA (THE MORNING HOURS, MORNING BRIGHT) 11 Ayahs", "94.AL-INSHIRAH (SOLACE, CONSOLATION, RELIEF) 8 Ayahs", "95.AT-TIN (THE FIG, THE FIGTREE) 8 Ayahs", "96.AL-ALAQ (THE CLOT, READ) 19 Ayahs", "97.AL-QADR (POWER, FATE) 5 Ayahs", "98.AL-BAYYINA (THE CLEAR PROOF, EVIDENCE) 8 Ayahs", "99.AZ-ZALZALA (THE EARTHQUAKE) 8 Ayahs", "100.AL-ADIYAT (THE COURSER, THE CHARGERS) 11 Ayahs", "101.AL-QARIA (THE CALAMITY, THE STUNNING BLOW, THE DISASTER 11 Ayahs", "102.AT-TAKATHUR (RIVALRY IN WORLD INCREASE, COMPETITION) 8 Ayahs", "103.AL-ASR (THE DECLINING DAY, EVENTIDE, THE EPOCH) 3 Ayahs", "104.AL-HUMAZA (THE TRADUCER, THE GOSSIPMONGER) 9 Ayahs", "105.AL-FIL (THE ELEPHANT) 5 Ayahs", "106.QURAISH (WINTER, QURAYSH) 4 Ayahs", "107.AL-MAUN (SMALL KINDNESSES, ALMSGIVING, HAVE YOU SEEN) 7 Ayahs", "108.AL-KAUTHER (ABUNDANCE, PLENTY) 3 Ayahs", "109.AL-KAFIROON (THE DISBELIEVERS, ATHEISTS) 6 Ayahs", "110.AN-NASR (SUCCOUR, DIVINE SUPPORT) 3 Ayahs", "111.AL-MASADD (PALM FIBRE, THE FLAME) 5 Ayahs", "112.AL-IKHLAS (SINCERITY) 4 Ayahs", "113.AL-FALAQ (THE DAYBREAK, DAWN) 5 Ayahs", "114.AN-NAS (MANKIND) 6 Ayahs" }));
        SurahList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SurahListActionPerformed(evt);
            }
        });
        getContentPane().add(SurahList);
        SurahList.setBounds(90, 30, 839, 36);

        checkBox.setBackground(new java.awt.Color(51, 51, 0));
        checkBox.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        checkBox.setForeground(new java.awt.Color(204, 255, 255));
        checkBox.setText("Translation");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox);
        checkBox.setBounds(60, 80, 141, 43);

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        name.setForeground(new java.awt.Color(220, 234, 238));
        getContentPane().add(name);
        name.setBounds(170, 120, 1199, 40);

        matrixPanel.setBackground(new java.awt.Color(242, 244, 245));
        matrixPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout matrixPanelLayout = new javax.swing.GroupLayout(matrixPanel);
        matrixPanel.setLayout(matrixPanelLayout);
        matrixPanelLayout.setHorizontalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2038, Short.MAX_VALUE)
        );
        matrixPanelLayout.setVerticalGroup(
            matrixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(matrixPanel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 1250, 550);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/desktopwallpapers.org.ua-6378.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 1010);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/desktopwallpapers.org.ua-6378.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(990, 130, 1030, 720);

        BACK.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        BACK.setForeground(new java.awt.Color(14, 7, 7));
        BACK.setText("Back");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK);
        BACK.setBounds(990, 70, 200, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quran/desktopwallpapers.org.ua-6378.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(970, 0, 760, 130);

        Selected1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Selected1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        Selected1.setText("Selected");
        Selected1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selected1ActionPerformed(evt);
            }
        });
        getContentPane().add(Selected1);
        Selected1.setBounds(990, 30, 200, 34);

        Selected2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Selected2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        Selected2.setText("Selected");
        Selected2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selected2ActionPerformed(evt);
            }
        });
        getContentPane().add(Selected2);
        Selected2.setBounds(990, 30, 200, 34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SurahListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SurahListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SurahListActionPerformed

    public void display(boolean trans){
          String selected[]=((String)SurahList.getSelectedItem()).split(" ");

            selected[0]=selected[0].replaceAll("[.-]", "");
            selected[0]=selected[0].replaceAll("[0-9]","");
            selected[0]=selected[0]+".txt";
            try {
            
                File file = new File((selected[0]));
                BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String read=(String)bf.readLine();
                name.setText(read);
                bf.readLine();
                read=(String)bf.readLine();
                if(read.equals(" ")){              
                   read=(String)bf.readLine();
                
                }
                JTextArea SurahDisplayx = new JTextArea();
                     Font fontx = new Font("B Fantezy", Font.ITALIC, 42);
        SurahDisplayx.setFont(fontx);
        SurahDisplayx.setForeground(Color.BLUE);
                    SurahDisplayx.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    matrixPanel.add(SurahDisplayx);       
                    SurahDisplayx.setText("");

            SurahDisplayx.setLineWrap(true);
            SurahDisplayx.setWrapStyleWord(true);
            SurahDisplayx.setEditable(false);
                    SurahDisplayx.append(read);
                    
                    if(trans==true){
                    JTextArea SurahDisplayy = new JTextArea();
               Font fonty = new Font("Angsana New", Font.ITALIC, 22);   
        SurahDisplayy.setFont(fonty);
        SurahDisplayy.setForeground(Color.BLUE);
                    SurahDisplayy.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                    matrixPanel.add(SurahDisplayy);       
                    SurahDisplayy.setText("[1:1] In the name of Allah, the Beneficent, the Merciful.");

            
            SurahDisplayy.setWrapStyleWord(true);
            SurahDisplayy.setEditable(false);
                    }

                while ((read=(String)bf.readLine()) != null) {
                    
                    JTextArea SurahDisplay = new JTextArea();
                     Font font = new Font("B Fantezy", Font.ITALIC, 42);
        SurahDisplay.setFont(font);
        SurahDisplay.setForeground(Color.BLACK);
                    SurahDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                          
                    SurahDisplay.setText("");

            SurahDisplay.setLineWrap(true);
            SurahDisplay.setWrapStyleWord(true);
            SurahDisplay.setEditable(false);
                    SurahDisplay.append(read);
                    matrixPanel.add(SurahDisplay); 
                    read=(String)bf.readLine();
                    
                    if(trans==true){
                        JTextArea SurahDisplay2 = new JTextArea();
                    
              Font font2 = new Font("Angsana New", Font.ITALIC, 22);    
        SurahDisplay2.setFont(font2);
        SurahDisplay2.setForeground(Color.BLACK);
                    SurahDisplay2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                    matrixPanel.add(SurahDisplay2);       
                    SurahDisplay2.setText("");

            SurahDisplay2.setLineWrap(true);
            SurahDisplay2.setWrapStyleWord(true);
            SurahDisplay2.setEditable(false);
                    SurahDisplay2.append(read);
                    }
                }
                SurahDisplayx.append(".");
                bf.close();
            }
            catch (IOException e) {
                System.out.println("file nahe mili");

            }
       
    }
    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        
    }//GEN-LAST:event_checkBoxActionPerformed

    private void Selected1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selected1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Selected1ActionPerformed

    private void Selected2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selected2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Selected2ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new menuPage().setVisible(true);
        
    }//GEN-LAST:event_BACKActionPerformed

    private void SelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedActionPerformed

        matrixPanel.removeAll();
        boolean trans=false;
        if(checkBox.isSelected()){
            trans=true;
        }
        this.display(trans);
    }//GEN-LAST:event_SelectedActionPerformed

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
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Read().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton Selected;
    private javax.swing.JButton Selected1;
    private javax.swing.JButton Selected2;
    private javax.swing.JComboBox SurahList;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel matrixPanel;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
