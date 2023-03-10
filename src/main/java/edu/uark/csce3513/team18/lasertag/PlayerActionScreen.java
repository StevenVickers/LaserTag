/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.uark.csce3513.team18.lasertag;
import java.util.TimerTask;

/**
 *
 * @author Thomas 3.0
 */
public class PlayerActionScreen extends javax.swing.JFrame {
    int timeLeft = 300;
    /**
     * Creates new form PlayerActionScreen
     */
    public PlayerActionScreen() {
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
        java.util.Timer timer = new java.util.Timer();

        TimerTask timerTask = new TimerTask() {
          public void run(){
            PlayActionTimerLabel.setText("Seconds left: " + Integer.toString(timeLeft));
            timeLeft--;
            if(timeLeft ==-1){
              timer.cancel();
            }   
          }
        };
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);


        BlueTeamLabel = new javax.swing.JLabel();
        RedTeamLabel = new javax.swing.JLabel();
        blueNickname1 = new javax.swing.JTextField();
        blueNickname2 = new javax.swing.JTextField();
        blueNickname3 = new javax.swing.JTextField();
        blueNickname4 = new javax.swing.JTextField();
        blueNickname5 = new javax.swing.JTextField();
        blueNickname6 = new javax.swing.JTextField();
        blueNickname7 = new javax.swing.JTextField();
        blueNickname8 = new javax.swing.JTextField();
        blueNickname9 = new javax.swing.JTextField();
        blueNickname10 = new javax.swing.JTextField();
        blueNickname11 = new javax.swing.JTextField();
        blueNickname12 = new javax.swing.JTextField();
        blueNickname13 = new javax.swing.JTextField();
        blueNickname14 = new javax.swing.JTextField();
        blueNickname15 = new javax.swing.JTextField();
        redNickname1 = new javax.swing.JTextField();
        redNickname2 = new javax.swing.JTextField();
        redNickname3 = new javax.swing.JTextField();
        redNickname4 = new javax.swing.JTextField();
        redNickname5 = new javax.swing.JTextField();
        redNickname6 = new javax.swing.JTextField();
        redNickname7 = new javax.swing.JTextField();
        redNickname8 = new javax.swing.JTextField();
        redNickname9 = new javax.swing.JTextField();
        redNickname10 = new javax.swing.JTextField();
        redNickname11 = new javax.swing.JTextField();
        redNickname12 = new javax.swing.JTextField();
        redNickname13 = new javax.swing.JTextField();
        redNickname14 = new javax.swing.JTextField();
        redNickname15 = new javax.swing.JTextField();
        BlueTeamPointsLabel = new javax.swing.JLabel();
        RedTeamPointsLabel = new javax.swing.JLabel();
        blueNicknamePoints1 = new javax.swing.JLabel();
        blueNicknamePoints2 = new javax.swing.JLabel();
        blueNicknamePoints3 = new javax.swing.JLabel();
        blueNicknamePoints4 = new javax.swing.JLabel();
        blueNicknamePoints5 = new javax.swing.JLabel();
        blueNicknamePoints6 = new javax.swing.JLabel();
        blueNicknamePoints7 = new javax.swing.JLabel();
        blueNicknamePoints8 = new javax.swing.JLabel();
        blueNicknamePoints9 = new javax.swing.JLabel();
        blueNicknamePoints10 = new javax.swing.JLabel();
        blueNicknamePoints11 = new javax.swing.JLabel();
        blueNicknamePoints12 = new javax.swing.JLabel();
        blueNicknamePoints13 = new javax.swing.JLabel();
        blueNicknamePoints14 = new javax.swing.JLabel();
        blueNicknamePoints15 = new javax.swing.JLabel();
        redNicknamePoints1 = new javax.swing.JLabel();
        redNicknamePoints2 = new javax.swing.JLabel();
        redNicknamePoints3 = new javax.swing.JLabel();
        redNicknamePoints4 = new javax.swing.JLabel();
        redNicknamePoints5 = new javax.swing.JLabel();
        redNicknamePoints6 = new javax.swing.JLabel();
        redNicknamePoints7 = new javax.swing.JLabel();
        redNicknamePoints8 = new javax.swing.JLabel();
        redNicknamePoints9 = new javax.swing.JLabel();
        redNicknamePoints10 = new javax.swing.JLabel();
        redNicknamePoints11 = new javax.swing.JLabel();
        redNicknamePoints12 = new javax.swing.JLabel();
        redNicknamePoints13 = new javax.swing.JLabel();
        redNicknamePoints14 = new javax.swing.JLabel();
        redNicknamePoints15 = new javax.swing.JLabel();
        PlayerActionScrollPane = new javax.swing.JScrollPane();
        PlayerActionFeed = new javax.swing.JTextArea();
        PlayActionTimerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BlueTeamLabel.setText("BLUE TEAM");

        RedTeamLabel.setText("RED TEAM");

        blueNickname1.setEditable(false);
        blueNickname1.setFocusable(false);

        blueNickname2.setEditable(false);
        blueNickname2.setFocusable(false);

        blueNickname3.setEditable(false);
        blueNickname3.setFocusable(false);

        blueNickname4.setEditable(false);
        blueNickname4.setFocusable(false);

        blueNickname5.setEditable(false);
        blueNickname5.setFocusable(false);

        blueNickname6.setEditable(false);
        blueNickname6.setFocusable(false);

        blueNickname7.setEditable(false);
        blueNickname7.setFocusable(false);

        blueNickname8.setEditable(false);
        blueNickname8.setFocusable(false);

        blueNickname9.setEditable(false);
        blueNickname9.setFocusable(false);

        blueNickname10.setEditable(false);
        blueNickname10.setFocusable(false);

        blueNickname11.setEditable(false);
        blueNickname11.setFocusable(false);

        blueNickname12.setEditable(false);
        blueNickname12.setFocusable(false);

        blueNickname13.setEditable(false);
        blueNickname13.setFocusable(false);

        blueNickname14.setEditable(false);
        blueNickname14.setFocusable(false);

        blueNickname15.setEditable(false);
        blueNickname15.setFocusable(false);

        redNickname1.setEditable(false);
        redNickname1.setFocusable(false);

        redNickname2.setEditable(false);
        redNickname2.setFocusable(false);

        redNickname3.setEditable(false);
        redNickname3.setFocusable(false);

        redNickname4.setEditable(false);
        redNickname4.setFocusable(false);

        redNickname5.setEditable(false);
        redNickname5.setFocusable(false);

        redNickname6.setEditable(false);
        redNickname6.setFocusable(false);

        redNickname7.setEditable(false);
        redNickname7.setFocusable(false);

        redNickname8.setEditable(false);
        redNickname8.setFocusable(false);

        redNickname9.setEditable(false);
        redNickname9.setFocusable(false);

        redNickname10.setEditable(false);
        redNickname10.setFocusable(false);

        redNickname11.setEditable(false);
        redNickname11.setFocusable(false);

        redNickname12.setEditable(false);
        redNickname12.setFocusable(false);

        redNickname13.setEditable(false);
        redNickname13.setFocusable(false);

        redNickname14.setEditable(false);
        redNickname14.setFocusable(false);

        redNickname15.setEditable(false);
        redNickname15.setFocusable(false);

        BlueTeamPointsLabel.setText("0000");

        RedTeamPointsLabel.setText("0000");

        blueNicknamePoints1.setText("0001");

        blueNicknamePoints2.setText("0002");

        blueNicknamePoints3.setText("0003");

        blueNicknamePoints4.setText("0004");

        blueNicknamePoints5.setText("0005");

        blueNicknamePoints6.setText("0006");

        blueNicknamePoints7.setText("0007");

        blueNicknamePoints8.setText("0008");

        blueNicknamePoints9.setText("0009");

        blueNicknamePoints10.setText("0010");

        blueNicknamePoints11.setText("0011");

        blueNicknamePoints12.setText("0012");

        blueNicknamePoints13.setText("0013");

        blueNicknamePoints14.setText("0014");

        blueNicknamePoints15.setText("0015");

        redNicknamePoints1.setText("0001");

        redNicknamePoints2.setText("0002");

        redNicknamePoints3.setText("0003");

        redNicknamePoints4.setText("0004");

        redNicknamePoints5.setText("0005");

        redNicknamePoints6.setText("0006");

        redNicknamePoints7.setText("0007");

        redNicknamePoints8.setText("0008");

        redNicknamePoints9.setText("0009");

        redNicknamePoints10.setText("0010");

        redNicknamePoints11.setText("0011");

        redNicknamePoints12.setText("0012");

        redNicknamePoints13.setText("0013");

        redNicknamePoints14.setText("0014");

        redNicknamePoints15.setText("0015");

        PlayerActionFeed.setEditable(false);
        PlayerActionFeed.setColumns(20);
        PlayerActionFeed.setRows(5);
        PlayerActionFeed.setText("StaticSoap hit benjamin6817\nDomeDart hit StaticSoap\n\n");
        PlayerActionScrollPane.setViewportView(PlayerActionFeed);

        PlayActionTimerLabel.setText("00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(blueNickname1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BlueTeamLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BlueTeamPointsLabel))))
                        .addComponent(blueNickname7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(blueNickname2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueNickname15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueNicknamePoints1)
                    .addComponent(blueNicknamePoints5)
                    .addComponent(blueNicknamePoints2)
                    .addComponent(blueNicknamePoints4)
                    .addComponent(blueNicknamePoints7)
                    .addComponent(blueNicknamePoints6)
                    .addComponent(blueNicknamePoints8)
                    .addComponent(blueNicknamePoints10)
                    .addComponent(blueNicknamePoints11)
                    .addComponent(blueNicknamePoints12)
                    .addComponent(blueNicknamePoints13)
                    .addComponent(blueNicknamePoints15)
                    .addComponent(blueNicknamePoints3)
                    .addComponent(blueNicknamePoints9)
                    .addComponent(blueNicknamePoints14))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redNickname14)
                    .addComponent(redNickname15)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RedTeamLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RedTeamPointsLabel))
                            .addComponent(redNickname2)
                            .addComponent(redNickname3)
                            .addComponent(redNickname4)
                            .addComponent(redNickname5)
                            .addComponent(redNickname6)
                            .addComponent(redNickname7)
                            .addComponent(redNickname8)
                            .addComponent(redNickname9)
                            .addComponent(redNickname10)
                            .addComponent(redNickname11)
                            .addComponent(redNickname12)
                            .addComponent(redNickname13)
                            .addComponent(redNickname1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redNicknamePoints13)
                            .addComponent(redNicknamePoints14)
                            .addComponent(redNicknamePoints15)
                            .addComponent(redNicknamePoints12)
                            .addComponent(redNicknamePoints11)
                            .addComponent(redNicknamePoints10)
                            .addComponent(redNicknamePoints9)
                            .addComponent(redNicknamePoints8)
                            .addComponent(redNicknamePoints7)
                            .addComponent(redNicknamePoints6)
                            .addComponent(redNicknamePoints5)
                            .addComponent(redNicknamePoints4)
                            .addComponent(redNicknamePoints3)
                            .addComponent(redNicknamePoints2)
                            .addComponent(redNicknamePoints1))
                        .addGap(18, 18, 18)
                        .addComponent(PlayerActionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PlayActionTimerLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlueTeamLabel)
                            .addComponent(BlueTeamPointsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blueNickname15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNicknamePoints15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RedTeamLabel)
                            .addComponent(RedTeamPointsLabel)
                            .addComponent(PlayActionTimerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PlayerActionScrollPane)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints8))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(redNickname14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redNicknamePoints14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redNicknamePoints15)
                                    .addComponent(redNickname15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void showPlayerActionScreen() {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerActionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerActionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerActionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerActionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerActionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BlueTeamLabel;
    private javax.swing.JLabel BlueTeamPointsLabel;
    private javax.swing.JLabel PlayActionTimerLabel;
    private javax.swing.JTextArea PlayerActionFeed;
    private javax.swing.JScrollPane PlayerActionScrollPane;
    private javax.swing.JLabel RedTeamLabel;
    private javax.swing.JLabel RedTeamPointsLabel;
    private javax.swing.JTextField blueNickname1;
    private javax.swing.JTextField blueNickname10;
    private javax.swing.JTextField blueNickname11;
    private javax.swing.JTextField blueNickname12;
    private javax.swing.JTextField blueNickname13;
    private javax.swing.JTextField blueNickname14;
    private javax.swing.JTextField blueNickname15;
    private javax.swing.JTextField blueNickname2;
    private javax.swing.JTextField blueNickname3;
    private javax.swing.JTextField blueNickname4;
    private javax.swing.JTextField blueNickname5;
    private javax.swing.JTextField blueNickname6;
    private javax.swing.JTextField blueNickname7;
    private javax.swing.JTextField blueNickname8;
    private javax.swing.JTextField blueNickname9;
    private javax.swing.JLabel blueNicknamePoints1;
    private javax.swing.JLabel blueNicknamePoints10;
    private javax.swing.JLabel blueNicknamePoints11;
    private javax.swing.JLabel blueNicknamePoints12;
    private javax.swing.JLabel blueNicknamePoints13;
    private javax.swing.JLabel blueNicknamePoints14;
    private javax.swing.JLabel blueNicknamePoints15;
    private javax.swing.JLabel blueNicknamePoints2;
    private javax.swing.JLabel blueNicknamePoints3;
    private javax.swing.JLabel blueNicknamePoints4;
    private javax.swing.JLabel blueNicknamePoints5;
    private javax.swing.JLabel blueNicknamePoints6;
    private javax.swing.JLabel blueNicknamePoints7;
    private javax.swing.JLabel blueNicknamePoints8;
    private javax.swing.JLabel blueNicknamePoints9;
    private javax.swing.JTextField redNickname1;
    private javax.swing.JTextField redNickname10;
    private javax.swing.JTextField redNickname11;
    private javax.swing.JTextField redNickname12;
    private javax.swing.JTextField redNickname13;
    private javax.swing.JTextField redNickname14;
    private javax.swing.JTextField redNickname15;
    private javax.swing.JTextField redNickname2;
    private javax.swing.JTextField redNickname3;
    private javax.swing.JTextField redNickname4;
    private javax.swing.JTextField redNickname5;
    private javax.swing.JTextField redNickname6;
    private javax.swing.JTextField redNickname7;
    private javax.swing.JTextField redNickname8;
    private javax.swing.JTextField redNickname9;
    private javax.swing.JLabel redNicknamePoints1;
    private javax.swing.JLabel redNicknamePoints10;
    private javax.swing.JLabel redNicknamePoints11;
    private javax.swing.JLabel redNicknamePoints12;
    private javax.swing.JLabel redNicknamePoints13;
    private javax.swing.JLabel redNicknamePoints14;
    private javax.swing.JLabel redNicknamePoints15;
    private javax.swing.JLabel redNicknamePoints2;
    private javax.swing.JLabel redNicknamePoints3;
    private javax.swing.JLabel redNicknamePoints4;
    private javax.swing.JLabel redNicknamePoints5;
    private javax.swing.JLabel redNicknamePoints6;
    private javax.swing.JLabel redNicknamePoints7;
    private javax.swing.JLabel redNicknamePoints8;
    private javax.swing.JLabel redNicknamePoints9;
    // End of variables declaration//GEN-END:variables
}
