/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyla Reambonanza
 * Tic Tac Toe Game
 */
public class Java_TicTacToe extends javax.swing.JFrame {

    private String start_game = "X";
    private int X_count = 0;
    private int O_count = 0;
    private int Tie_count = 0;
    boolean check;
    //private boolean in_one_player_mode = false;
    //boolean player_1_turn;
    
    
    public Java_TicTacToe() {
        initComponents();
    }

    private void game_score() {
        playerX_score_label.setText(String.valueOf(X_count));
        playerO_score_label.setText(String.valueOf(O_count));
        Tie_score_label.setText(String.valueOf(Tie_count));
    }
    
    private void choose_player() {  
        if(start_game.equalsIgnoreCase("X")){
            start_game = "O";
        }
        else {
            start_game = "X";
        }
    }
    
    private void winning_game() {
        
        String butt_on_1 = grid1.getText();
        String butt_on_2 = grid2.getText();
        String butt_on_3 = grid3.getText();
        String butt_on_4 = grid4.getText();
        String butt_on_5 = grid5.getText();
        String butt_on_6 = grid6.getText();
        String butt_on_7 = grid7.getText();
        String butt_on_8 = grid8.getText();
        String butt_on_9 = grid9.getText();
        
        boolean winner_found = false;
        
   // player "X" winning conditions   
        if (butt_on_1.equals("X") && butt_on_2.equals("X") && butt_on_3.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid1.setBackground(new Color(205,102,102));
            grid2.setBackground(new Color(205,102,102));
            grid3.setBackground(new Color(205,102,102));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_4.equals("X") && butt_on_5.equals("X") && butt_on_6.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid4.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid6.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_7.equals("X") && butt_on_8.equals("X") && butt_on_9.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid7.setBackground(new Color(102,102,255));
            grid8.setBackground(new Color(102,102,255));
            grid9.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_1.equals("X") && butt_on_4.equals("X") && butt_on_7.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid1.setBackground(new Color(102,102,255));
            grid4.setBackground(new Color(102,102,255));
            grid7.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_2.equals("X") && butt_on_5.equals("X") && butt_on_8.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid2.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid8.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_3.equals("X") && butt_on_6.equals("X") && butt_on_9.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid3.setBackground(new Color(102,102,255));
            grid6.setBackground(new Color(102,102,255));
            grid9.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }         

        if (butt_on_1.equals("X") && butt_on_5.equals("X") && butt_on_9.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid1.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid9.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_3.equals("X") && butt_on_5.equals("X") && butt_on_7.equals("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid3.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid7.setBackground(new Color(102,102,255));
            X_count++;
            game_score();
            winner_found = true;
        }
        
        
  // player "O" winning conditions      
        if (butt_on_1.equals("O") && butt_on_2.equals("O") && butt_on_3.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid1.setBackground(new Color(102,102,255));
            grid2.setBackground(new Color(102,102,255));
            grid3.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }  
       
        if (butt_on_4.equals("O") && butt_on_5.equals("O") && butt_on_6.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid4.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid6.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_7.equals("O") && butt_on_8.equals("O") && butt_on_9.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid7.setBackground(new Color(102,102,255));
            grid8.setBackground(new Color(102,102,255));
            grid9.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_1.equals("O") && butt_on_4.equals("O") && butt_on_7.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid1.setBackground(new Color(102,102,255));
            grid4.setBackground(new Color(102,102,255));
            grid7.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_2.equals("O") && butt_on_5.equals("O") && butt_on_8.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid2.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid8.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_3.equals("O") && butt_on_6.equals("O") && butt_on_9.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid3.setBackground(new Color(102,102,255));
            grid6.setBackground(new Color(102,102,255));
            grid9.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_1.equals("O") && butt_on_5.equals("O") && butt_on_9.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid1.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid9.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (butt_on_3.equals("O") && butt_on_5.equals("O") && butt_on_7.equals("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            grid3.setBackground(new Color(102,102,255));
            grid5.setBackground(new Color(102,102,255));
            grid7.setBackground(new Color(102,102,255));
            O_count++;
            game_score();
            winner_found = true;
        }
        
        if (!winner_found &&
            !butt_on_1.equals("") && !butt_on_2.equals("") && !butt_on_3.equals("") && !butt_on_4.equals("") && !butt_on_5.equals("") &&
            !butt_on_6.equals("") && !butt_on_7.equals("") && !butt_on_8.equals("") && !butt_on_9.equals("")) {
            
            JOptionPane.showMessageDialog(this, "It's a Tie! Better luck next time, players.", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Tie_count++;
            game_score();
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

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        scorePanel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        Tie_label = new javax.swing.JLabel();
        playerO_label = new javax.swing.JLabel();
        playerX_label = new javax.swing.JLabel();
        playerX_score_label = new javax.swing.JLabel();
        Tie_score_label = new javax.swing.JLabel();
        playerO_score_label = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        grid9 = new javax.swing.JButton();
        grid1 = new javax.swing.JButton();
        grid2 = new javax.swing.JButton();
        grid3 = new javax.swing.JButton();
        grid4 = new javax.swing.JButton();
        grid5 = new javax.swing.JButton();
        grid6 = new javax.swing.JButton();
        grid7 = new javax.swing.JButton();
        grid8 = new javax.swing.JButton();
        button_panel_2 = new javax.swing.JPanel();
        jPanel145 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        jPanel155 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jPanel158 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        jPanel161 = new javax.swing.JPanel();
        jPanel162 = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        jPanel164 = new javax.swing.JPanel();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        jPanel168 = new javax.swing.JPanel();
        jPanel169 = new javax.swing.JPanel();
        jPanel170 = new javax.swing.JPanel();
        jPanel171 = new javax.swing.JPanel();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        jPanel174 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel177 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        jPanel179 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        jPanel181 = new javax.swing.JPanel();
        jPanel182 = new javax.swing.JPanel();
        jPanel183 = new javax.swing.JPanel();
        jPanel184 = new javax.swing.JPanel();
        jPanel185 = new javax.swing.JPanel();
        jPanel186 = new javax.swing.JPanel();
        jPanel187 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        jPanel189 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jPanel191 = new javax.swing.JPanel();
        jPanel192 = new javax.swing.JPanel();
        jPanel193 = new javax.swing.JPanel();
        jPanel194 = new javax.swing.JPanel();
        jPanel195 = new javax.swing.JPanel();
        jPanel196 = new javax.swing.JPanel();
        jPanel197 = new javax.swing.JPanel();
        jPanel198 = new javax.swing.JPanel();
        jPanel199 = new javax.swing.JPanel();
        jPanel200 = new javax.swing.JPanel();
        jPanel201 = new javax.swing.JPanel();
        jPanel202 = new javax.swing.JPanel();
        jPanel203 = new javax.swing.JPanel();
        jPanel204 = new javax.swing.JPanel();
        jPanel205 = new javax.swing.JPanel();
        jPanel206 = new javax.swing.JPanel();
        jPanel207 = new javax.swing.JPanel();
        jPanel208 = new javax.swing.JPanel();
        jPanel209 = new javax.swing.JPanel();
        jPanel210 = new javax.swing.JPanel();
        jPanel211 = new javax.swing.JPanel();
        jPanel212 = new javax.swing.JPanel();
        jPanel213 = new javax.swing.JPanel();
        jPanel214 = new javax.swing.JPanel();
        jPanel215 = new javax.swing.JPanel();
        jPanel216 = new javax.swing.JPanel();
        jPanel217 = new javax.swing.JPanel();
        jPanel218 = new javax.swing.JPanel();
        jPanel219 = new javax.swing.JPanel();
        jPanel220 = new javax.swing.JPanel();
        jPanel221 = new javax.swing.JPanel();
        jPanel222 = new javax.swing.JPanel();
        jPanel223 = new javax.swing.JPanel();
        jPanel224 = new javax.swing.JPanel();
        jPanel225 = new javax.swing.JPanel();
        jPanel226 = new javax.swing.JPanel();
        jPanel227 = new javax.swing.JPanel();
        jPanel228 = new javax.swing.JPanel();
        jPanel229 = new javax.swing.JPanel();
        jPanel230 = new javax.swing.JPanel();
        jPanel231 = new javax.swing.JPanel();
        jPanel232 = new javax.swing.JPanel();
        jPanel233 = new javax.swing.JPanel();
        jPanel234 = new javax.swing.JPanel();
        jPanel235 = new javax.swing.JPanel();
        jPanel236 = new javax.swing.JPanel();
        jPanel237 = new javax.swing.JPanel();
        jPanel238 = new javax.swing.JPanel();
        jPanel239 = new javax.swing.JPanel();
        jPanel240 = new javax.swing.JPanel();
        jPanel241 = new javax.swing.JPanel();
        jPanel242 = new javax.swing.JPanel();
        jPanel243 = new javax.swing.JPanel();
        jPanel244 = new javax.swing.JPanel();
        jPanel245 = new javax.swing.JPanel();
        jPanel246 = new javax.swing.JPanel();
        jPanel247 = new javax.swing.JPanel();
        jPanel248 = new javax.swing.JPanel();
        jPanel249 = new javax.swing.JPanel();
        jPanel250 = new javax.swing.JPanel();
        jPanel251 = new javax.swing.JPanel();
        jPanel252 = new javax.swing.JPanel();
        jPanel253 = new javax.swing.JPanel();
        jPanel254 = new javax.swing.JPanel();
        jPanel255 = new javax.swing.JPanel();
        jPanel256 = new javax.swing.JPanel();
        jPanel257 = new javax.swing.JPanel();
        jPanel258 = new javax.swing.JPanel();
        jPanel259 = new javax.swing.JPanel();
        jPanel260 = new javax.swing.JPanel();
        jPanel261 = new javax.swing.JPanel();
        jPanel262 = new javax.swing.JPanel();
        jPanel263 = new javax.swing.JPanel();
        jPanel264 = new javax.swing.JPanel();
        jPanel265 = new javax.swing.JPanel();
        jPanel266 = new javax.swing.JPanel();
        jPanel267 = new javax.swing.JPanel();
        jPanel268 = new javax.swing.JPanel();
        jPanel269 = new javax.swing.JPanel();
        jPanel270 = new javax.swing.JPanel();
        jPanel271 = new javax.swing.JPanel();
        newGame_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(255, 199, 0));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 207, 35));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 199, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 199, 0));
        mainPanel.setMaximumSize(new java.awt.Dimension(1410, 680));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scorePanel.setBackground(new java.awt.Color(255, 255, 255));
        scorePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scorePanel.setPreferredSize(new java.awt.Dimension(450, 450));
        scorePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 199, 0));
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scorePanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel18.setBackground(new java.awt.Color(255, 199, 0));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel18.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 199, 0));
        jPanel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel19.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        scorePanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel20.setBackground(new java.awt.Color(255, 199, 0));
        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel20.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 199, 0));
        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel21.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel22.setBackground(new java.awt.Color(255, 199, 0));
        jPanel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel22.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(255, 199, 0));
        jPanel23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel23.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        scorePanel.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        Tie_label.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        Tie_label.setText("TIE");
        scorePanel.add(Tie_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        playerO_label.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        playerO_label.setText("PLAYER(O)");
        scorePanel.add(playerO_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        playerX_label.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        playerX_label.setText("PLAYER(X)");
        scorePanel.add(playerX_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        playerX_score_label.setFont(new java.awt.Font("Poppins SemiBold", 1, 34)); // NOI18N
        playerX_score_label.setText("0");
        scorePanel.add(playerX_score_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        Tie_score_label.setFont(new java.awt.Font("Poppins SemiBold", 1, 34)); // NOI18N
        Tie_score_label.setText("0");
        scorePanel.add(Tie_score_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        playerO_score_label.setFont(new java.awt.Font("Poppins SemiBold", 1, 34)); // NOI18N
        playerO_score_label.setText("0");
        scorePanel.add(playerO_score_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        mainPanel.add(scorePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 460, 120));

        boardPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        boardPanel.setMaximumSize(new java.awt.Dimension(450, 450));
        boardPanel.setMinimumSize(new java.awt.Dimension(450, 450));
        boardPanel.setPreferredSize(new java.awt.Dimension(450, 450));
        boardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 199, 0));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        boardPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        grid9.setBackground(new java.awt.Color(51, 255, 204));
        grid9.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid9ActionPerformed(evt);
            }
        });
        boardPanel.add(grid9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 140, 140));

        grid1.setBackground(new java.awt.Color(51, 255, 204));
        grid1.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid1.setFocusPainted(false);
        grid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid1ActionPerformed(evt);
            }
        });
        boardPanel.add(grid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 140));

        grid2.setBackground(new java.awt.Color(51, 255, 204));
        grid2.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid2ActionPerformed(evt);
            }
        });
        boardPanel.add(grid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 140));

        grid3.setBackground(new java.awt.Color(51, 255, 204));
        grid3.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid3ActionPerformed(evt);
            }
        });
        boardPanel.add(grid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 140));

        grid4.setBackground(new java.awt.Color(51, 255, 204));
        grid4.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid4ActionPerformed(evt);
            }
        });
        boardPanel.add(grid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 140));

        grid5.setBackground(new java.awt.Color(51, 255, 204));
        grid5.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid5ActionPerformed(evt);
            }
        });
        boardPanel.add(grid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, 140));

        grid6.setBackground(new java.awt.Color(51, 255, 204));
        grid6.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid6ActionPerformed(evt);
            }
        });
        boardPanel.add(grid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, 140));

        grid7.setBackground(new java.awt.Color(51, 255, 204));
        grid7.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid7ActionPerformed(evt);
            }
        });
        boardPanel.add(grid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 140));

        grid8.setBackground(new java.awt.Color(51, 255, 204));
        grid8.setFont(new java.awt.Font("Poppins SemiBold", 1, 96)); // NOI18N
        grid8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        grid8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grid8ActionPerformed(evt);
            }
        });
        boardPanel.add(grid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 140, 140));

        mainPanel.add(boardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 460, 460));

        button_panel_2.setBackground(new java.awt.Color(255, 255, 255));
        button_panel_2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        button_panel_2.setPreferredSize(new java.awt.Dimension(450, 450));
        button_panel_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel145.setBackground(new java.awt.Color(255, 199, 0));
        jPanel145.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel145.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel145.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        button_panel_2.add(jPanel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel146.setBackground(new java.awt.Color(255, 199, 0));
        jPanel146.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel146.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel146.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel147.setBackground(new java.awt.Color(255, 199, 0));
        jPanel147.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel147.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel147.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel146.add(jPanel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        button_panel_2.add(jPanel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel148.setBackground(new java.awt.Color(255, 199, 0));
        jPanel148.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel148.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel148.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel149.setBackground(new java.awt.Color(255, 199, 0));
        jPanel149.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel149.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel149.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel148.add(jPanel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel150.setBackground(new java.awt.Color(255, 199, 0));
        jPanel150.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel150.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel150.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel151.setBackground(new java.awt.Color(255, 199, 0));
        jPanel151.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel151.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel151.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel150.add(jPanel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel148.add(jPanel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        button_panel_2.add(jPanel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel152.setBackground(new java.awt.Color(255, 199, 0));
        jPanel152.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel152.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel152.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel153.setBackground(new java.awt.Color(255, 199, 0));
        jPanel153.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel153.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel153.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel152.add(jPanel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel154.setBackground(new java.awt.Color(255, 199, 0));
        jPanel154.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel154.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel154.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel155.setBackground(new java.awt.Color(255, 199, 0));
        jPanel155.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel155.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel155.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel154.add(jPanel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel152.add(jPanel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel156.setBackground(new java.awt.Color(255, 199, 0));
        jPanel156.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel156.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel156.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel157.setBackground(new java.awt.Color(255, 199, 0));
        jPanel157.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel157.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel157.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel156.add(jPanel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel158.setBackground(new java.awt.Color(255, 199, 0));
        jPanel158.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel158.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel158.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel159.setBackground(new java.awt.Color(255, 199, 0));
        jPanel159.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel159.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel159.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel158.add(jPanel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel156.add(jPanel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel152.add(jPanel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        button_panel_2.add(jPanel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel160.setBackground(new java.awt.Color(255, 199, 0));
        jPanel160.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel160.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel160.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel161.setBackground(new java.awt.Color(255, 199, 0));
        jPanel161.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel161.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel161.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel160.add(jPanel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel162.setBackground(new java.awt.Color(255, 199, 0));
        jPanel162.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel162.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel162.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel163.setBackground(new java.awt.Color(255, 199, 0));
        jPanel163.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel163.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel163.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel162.add(jPanel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel160.add(jPanel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel164.setBackground(new java.awt.Color(255, 199, 0));
        jPanel164.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel164.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel164.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel165.setBackground(new java.awt.Color(255, 199, 0));
        jPanel165.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel165.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel165.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel164.add(jPanel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel166.setBackground(new java.awt.Color(255, 199, 0));
        jPanel166.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel166.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel166.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel167.setBackground(new java.awt.Color(255, 199, 0));
        jPanel167.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel167.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel167.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel166.add(jPanel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel164.add(jPanel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel160.add(jPanel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel168.setBackground(new java.awt.Color(255, 199, 0));
        jPanel168.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel168.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel168.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel169.setBackground(new java.awt.Color(255, 199, 0));
        jPanel169.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel169.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel169.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel168.add(jPanel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel170.setBackground(new java.awt.Color(255, 199, 0));
        jPanel170.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel170.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel170.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel171.setBackground(new java.awt.Color(255, 199, 0));
        jPanel171.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel171.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel171.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel170.add(jPanel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel168.add(jPanel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel172.setBackground(new java.awt.Color(255, 199, 0));
        jPanel172.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel172.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel172.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel173.setBackground(new java.awt.Color(255, 199, 0));
        jPanel173.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel173.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel173.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel172.add(jPanel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel174.setBackground(new java.awt.Color(255, 199, 0));
        jPanel174.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel174.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel174.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel175.setBackground(new java.awt.Color(255, 199, 0));
        jPanel175.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel175.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel175.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel174.add(jPanel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel172.add(jPanel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel168.add(jPanel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel160.add(jPanel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        button_panel_2.add(jPanel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        jPanel176.setBackground(new java.awt.Color(255, 199, 0));
        jPanel176.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel176.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel176.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel177.setBackground(new java.awt.Color(255, 199, 0));
        jPanel177.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel177.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel177.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel176.add(jPanel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel178.setBackground(new java.awt.Color(255, 199, 0));
        jPanel178.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel178.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel178.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel179.setBackground(new java.awt.Color(255, 199, 0));
        jPanel179.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel179.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel179.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel178.add(jPanel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel176.add(jPanel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel180.setBackground(new java.awt.Color(255, 199, 0));
        jPanel180.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel180.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel180.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel181.setBackground(new java.awt.Color(255, 199, 0));
        jPanel181.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel181.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel181.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel180.add(jPanel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel182.setBackground(new java.awt.Color(255, 199, 0));
        jPanel182.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel182.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel182.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel183.setBackground(new java.awt.Color(255, 199, 0));
        jPanel183.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel183.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel183.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel182.add(jPanel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel180.add(jPanel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel176.add(jPanel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel184.setBackground(new java.awt.Color(255, 199, 0));
        jPanel184.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel184.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel184.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel185.setBackground(new java.awt.Color(255, 199, 0));
        jPanel185.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel185.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel185.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel184.add(jPanel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel186.setBackground(new java.awt.Color(255, 199, 0));
        jPanel186.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel186.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel186.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel187.setBackground(new java.awt.Color(255, 199, 0));
        jPanel187.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel187.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel187.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel186.add(jPanel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel184.add(jPanel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel188.setBackground(new java.awt.Color(255, 199, 0));
        jPanel188.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel188.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel188.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel189.setBackground(new java.awt.Color(255, 199, 0));
        jPanel189.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel189.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel189.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel188.add(jPanel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel190.setBackground(new java.awt.Color(255, 199, 0));
        jPanel190.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel190.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel190.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel191.setBackground(new java.awt.Color(255, 199, 0));
        jPanel191.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel191.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel191.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel190.add(jPanel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel188.add(jPanel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel184.add(jPanel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel176.add(jPanel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel192.setBackground(new java.awt.Color(255, 199, 0));
        jPanel192.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel192.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel192.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel193.setBackground(new java.awt.Color(255, 199, 0));
        jPanel193.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel193.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel193.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel192.add(jPanel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel194.setBackground(new java.awt.Color(255, 199, 0));
        jPanel194.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel194.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel194.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel195.setBackground(new java.awt.Color(255, 199, 0));
        jPanel195.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel195.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel195.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel194.add(jPanel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel192.add(jPanel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel196.setBackground(new java.awt.Color(255, 199, 0));
        jPanel196.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel196.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel196.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel197.setBackground(new java.awt.Color(255, 199, 0));
        jPanel197.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel197.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel197.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel196.add(jPanel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel198.setBackground(new java.awt.Color(255, 199, 0));
        jPanel198.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel198.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel198.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel199.setBackground(new java.awt.Color(255, 199, 0));
        jPanel199.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel199.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel199.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel198.add(jPanel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel196.add(jPanel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel192.add(jPanel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel200.setBackground(new java.awt.Color(255, 199, 0));
        jPanel200.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel200.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel200.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel201.setBackground(new java.awt.Color(255, 199, 0));
        jPanel201.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel201.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel201.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel200.add(jPanel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel202.setBackground(new java.awt.Color(255, 199, 0));
        jPanel202.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel202.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel202.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel203.setBackground(new java.awt.Color(255, 199, 0));
        jPanel203.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel203.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel203.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel202.add(jPanel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel200.add(jPanel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel204.setBackground(new java.awt.Color(255, 199, 0));
        jPanel204.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel204.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel204.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel205.setBackground(new java.awt.Color(255, 199, 0));
        jPanel205.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel205.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel205.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel204.add(jPanel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel206.setBackground(new java.awt.Color(255, 199, 0));
        jPanel206.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel206.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel206.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel207.setBackground(new java.awt.Color(255, 199, 0));
        jPanel207.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel207.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel207.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel206.add(jPanel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel204.add(jPanel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel200.add(jPanel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel192.add(jPanel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel176.add(jPanel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        button_panel_2.add(jPanel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        jPanel208.setBackground(new java.awt.Color(255, 199, 0));
        jPanel208.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel208.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel208.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel209.setBackground(new java.awt.Color(255, 199, 0));
        jPanel209.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel209.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel209.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel208.add(jPanel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel210.setBackground(new java.awt.Color(255, 199, 0));
        jPanel210.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel210.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel210.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel211.setBackground(new java.awt.Color(255, 199, 0));
        jPanel211.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel211.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel211.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel210.add(jPanel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel208.add(jPanel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel212.setBackground(new java.awt.Color(255, 199, 0));
        jPanel212.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel212.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel212.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel213.setBackground(new java.awt.Color(255, 199, 0));
        jPanel213.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel213.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel213.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel212.add(jPanel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel214.setBackground(new java.awt.Color(255, 199, 0));
        jPanel214.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel214.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel214.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel215.setBackground(new java.awt.Color(255, 199, 0));
        jPanel215.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel215.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel215.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel214.add(jPanel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel212.add(jPanel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel208.add(jPanel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel216.setBackground(new java.awt.Color(255, 199, 0));
        jPanel216.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel216.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel216.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel217.setBackground(new java.awt.Color(255, 199, 0));
        jPanel217.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel217.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel217.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel216.add(jPanel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel218.setBackground(new java.awt.Color(255, 199, 0));
        jPanel218.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel218.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel218.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel219.setBackground(new java.awt.Color(255, 199, 0));
        jPanel219.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel219.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel219.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel218.add(jPanel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel216.add(jPanel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel220.setBackground(new java.awt.Color(255, 199, 0));
        jPanel220.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel220.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel220.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel221.setBackground(new java.awt.Color(255, 199, 0));
        jPanel221.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel221.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel221.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel220.add(jPanel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel222.setBackground(new java.awt.Color(255, 199, 0));
        jPanel222.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel222.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel222.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel223.setBackground(new java.awt.Color(255, 199, 0));
        jPanel223.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel223.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel223.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel222.add(jPanel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel220.add(jPanel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel216.add(jPanel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel208.add(jPanel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel224.setBackground(new java.awt.Color(255, 199, 0));
        jPanel224.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel224.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel224.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel225.setBackground(new java.awt.Color(255, 199, 0));
        jPanel225.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel225.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel225.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel224.add(jPanel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel226.setBackground(new java.awt.Color(255, 199, 0));
        jPanel226.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel226.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel226.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel227.setBackground(new java.awt.Color(255, 199, 0));
        jPanel227.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel227.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel227.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel226.add(jPanel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel224.add(jPanel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel228.setBackground(new java.awt.Color(255, 199, 0));
        jPanel228.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel228.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel228.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel229.setBackground(new java.awt.Color(255, 199, 0));
        jPanel229.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel229.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel229.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel228.add(jPanel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel230.setBackground(new java.awt.Color(255, 199, 0));
        jPanel230.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel230.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel230.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel231.setBackground(new java.awt.Color(255, 199, 0));
        jPanel231.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel231.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel231.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel230.add(jPanel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel228.add(jPanel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel224.add(jPanel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel232.setBackground(new java.awt.Color(255, 199, 0));
        jPanel232.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel232.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel232.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel233.setBackground(new java.awt.Color(255, 199, 0));
        jPanel233.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel233.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel233.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel232.add(jPanel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel234.setBackground(new java.awt.Color(255, 199, 0));
        jPanel234.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel234.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel234.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel235.setBackground(new java.awt.Color(255, 199, 0));
        jPanel235.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel235.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel235.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel234.add(jPanel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel232.add(jPanel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel236.setBackground(new java.awt.Color(255, 199, 0));
        jPanel236.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel236.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel236.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel237.setBackground(new java.awt.Color(255, 199, 0));
        jPanel237.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel237.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel237.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel236.add(jPanel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel238.setBackground(new java.awt.Color(255, 199, 0));
        jPanel238.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel238.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel238.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel239.setBackground(new java.awt.Color(255, 199, 0));
        jPanel239.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel239.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel239.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel238.add(jPanel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel236.add(jPanel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel232.add(jPanel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel224.add(jPanel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel208.add(jPanel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        jPanel240.setBackground(new java.awt.Color(255, 199, 0));
        jPanel240.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel240.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel240.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel241.setBackground(new java.awt.Color(255, 199, 0));
        jPanel241.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel241.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel241.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel240.add(jPanel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel242.setBackground(new java.awt.Color(255, 199, 0));
        jPanel242.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel242.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel242.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel243.setBackground(new java.awt.Color(255, 199, 0));
        jPanel243.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel243.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel243.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel242.add(jPanel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel240.add(jPanel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel244.setBackground(new java.awt.Color(255, 199, 0));
        jPanel244.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel244.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel244.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel245.setBackground(new java.awt.Color(255, 199, 0));
        jPanel245.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel245.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel245.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel244.add(jPanel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel246.setBackground(new java.awt.Color(255, 199, 0));
        jPanel246.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel246.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel246.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel247.setBackground(new java.awt.Color(255, 199, 0));
        jPanel247.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel247.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel247.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel246.add(jPanel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel244.add(jPanel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel240.add(jPanel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel248.setBackground(new java.awt.Color(255, 199, 0));
        jPanel248.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel248.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel248.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel249.setBackground(new java.awt.Color(255, 199, 0));
        jPanel249.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel249.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel249.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel248.add(jPanel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel250.setBackground(new java.awt.Color(255, 199, 0));
        jPanel250.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel250.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel250.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel251.setBackground(new java.awt.Color(255, 199, 0));
        jPanel251.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel251.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel251.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel250.add(jPanel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel248.add(jPanel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel252.setBackground(new java.awt.Color(255, 199, 0));
        jPanel252.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel252.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel252.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel253.setBackground(new java.awt.Color(255, 199, 0));
        jPanel253.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel253.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel253.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel252.add(jPanel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel254.setBackground(new java.awt.Color(255, 199, 0));
        jPanel254.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel254.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel254.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel255.setBackground(new java.awt.Color(255, 199, 0));
        jPanel255.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel255.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel255.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel254.add(jPanel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel252.add(jPanel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel248.add(jPanel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel240.add(jPanel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel256.setBackground(new java.awt.Color(255, 199, 0));
        jPanel256.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel256.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel256.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel257.setBackground(new java.awt.Color(255, 199, 0));
        jPanel257.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel257.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel257.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel256.add(jPanel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel258.setBackground(new java.awt.Color(255, 199, 0));
        jPanel258.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel258.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel258.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel259.setBackground(new java.awt.Color(255, 199, 0));
        jPanel259.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel259.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel259.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel258.add(jPanel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel256.add(jPanel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel260.setBackground(new java.awt.Color(255, 199, 0));
        jPanel260.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel260.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel260.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel261.setBackground(new java.awt.Color(255, 199, 0));
        jPanel261.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel261.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel261.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel260.add(jPanel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel262.setBackground(new java.awt.Color(255, 199, 0));
        jPanel262.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel262.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel262.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel263.setBackground(new java.awt.Color(255, 199, 0));
        jPanel263.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel263.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel263.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel262.add(jPanel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel260.add(jPanel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel256.add(jPanel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel264.setBackground(new java.awt.Color(255, 199, 0));
        jPanel264.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel264.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel264.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel265.setBackground(new java.awt.Color(255, 199, 0));
        jPanel265.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel265.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel265.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel264.add(jPanel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel266.setBackground(new java.awt.Color(255, 199, 0));
        jPanel266.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel266.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel266.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel267.setBackground(new java.awt.Color(255, 199, 0));
        jPanel267.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel267.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel267.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel266.add(jPanel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel264.add(jPanel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel268.setBackground(new java.awt.Color(255, 199, 0));
        jPanel268.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel268.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel268.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel269.setBackground(new java.awt.Color(255, 199, 0));
        jPanel269.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel269.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel269.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel268.add(jPanel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel270.setBackground(new java.awt.Color(255, 199, 0));
        jPanel270.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel270.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel270.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel271.setBackground(new java.awt.Color(255, 199, 0));
        jPanel271.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel271.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel271.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel270.add(jPanel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 470, 480));

        jPanel268.add(jPanel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 470, 180));

        jPanel264.add(jPanel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 470, 180));

        jPanel256.add(jPanel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 840, 390, 70));

        jPanel240.add(jPanel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        jPanel208.add(jPanel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        button_panel_2.add(jPanel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 870, 300, 50));

        newGame_button.setBackground(new java.awt.Color(0, 255, 204));
        newGame_button.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        newGame_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_game.png"))); // NOI18N
        newGame_button.setText("New Game");
        newGame_button.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));
        newGame_button.setBorderPainted(false);
        newGame_button.setContentAreaFilled(false);
        newGame_button.setFocusPainted(false);
        newGame_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGame_buttonActionPerformed(evt);
            }
        });
        button_panel_2.add(newGame_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 60));

        exit_button.setBackground(new java.awt.Color(0, 255, 204));
        exit_button.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        exit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        exit_button.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 0, 0)));
        exit_button.setBorderPainted(false);
        exit_button.setContentAreaFilled(false);
        exit_button.setFocusPainted(false);
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        button_panel_2.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 60));

        reset_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset.png"))); // NOI18N
        reset_button.setBorderPainted(false);
        reset_button.setContentAreaFilled(false);
        reset_button.setFocusPainted(false);
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });
        button_panel_2.add(reset_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 60));

        mainPanel.add(button_panel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 180, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac (2).png"))); // NOI18N
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jPanel1.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1470, 970));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1420, 930));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "EXIT Tic Tac Toe",
               JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void newGame_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGame_buttonActionPerformed

    // sets all grid buttons back to enable/clickable
        grid1.setEnabled(true);
        grid2.setEnabled(true);
        grid3.setEnabled(true);
        grid4.setEnabled(true);
        grid5.setEnabled(true);
        grid6.setEnabled(true);
        grid7.setEnabled(true);
        grid8.setEnabled(true);
        grid9.setEnabled(true);
        
    // sets scores back to zero(0)
        playerX_score_label.setText("0");
        Tie_score_label.setText("0");
        playerO_score_label.setText("0");
       
    // sets all grid buttons empty
        grid1.setText("");
        grid2.setText("");
        grid3.setText("");
        grid4.setText("");
        grid5.setText("");
        grid6.setText("");
        grid7.setText("");
        grid8.setText("");
        grid9.setText("");
        
    // sets all grid buttons back to its original colour
        grid1.setBackground(new Color(51,255,204));
        grid2.setBackground(new Color(51,255,204));
        grid3.setBackground(new Color(51,255,204));
        grid4.setBackground(new Color(51,255,204));
        grid5.setBackground(new Color(51,255,204));
        grid6.setBackground(new Color(51,255,204));
        grid7.setBackground(new Color(51,255,204));
        grid8.setBackground(new Color(51,255,204));
        grid9.setBackground(new Color(51,255,204));
    }//GEN-LAST:event_newGame_buttonActionPerformed

    /*
    private void computers_move() {
        boolean move_made = false;
        
        while(!move_made) {
            int i = new Random().nextInt(3);
            int j = new Random().nextInt(3);
            JButton button = getGridButton(i,j);
            if (button.getText().equals("")) {
                button.setText("O");
                move_made = true;
            }
        }
        player_turn = true; 
    }
    */
    
    
    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        grid1.setEnabled(true);
        grid2.setEnabled(true);
        grid3.setEnabled(true);
        grid4.setEnabled(true);
        grid5.setEnabled(true);
        grid6.setEnabled(true);
        grid7.setEnabled(true);
        grid8.setEnabled(true);
        grid9.setEnabled(true);
        
        grid1.setText("");
        grid2.setText("");
        grid3.setText("");
        grid4.setText("");
        grid5.setText("");
        grid6.setText("");
        grid7.setText("");
        grid8.setText("");
        grid9.setText("");
        
        grid1.setBackground(new Color(51,255,204));
        grid2.setBackground(new Color(51,255,204));
        grid3.setBackground(new Color(51,255,204));
        grid4.setBackground(new Color(51,255,204));
        grid5.setBackground(new Color(51,255,204));
        grid6.setBackground(new Color(51,255,204));
        grid7.setBackground(new Color(51,255,204));
        grid8.setBackground(new Color(51,255,204));
        grid9.setBackground(new Color(51,255,204));
        
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void grid9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid9ActionPerformed
       grid9.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid9ActionPerformed

    private void grid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid1ActionPerformed
        grid1.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid1ActionPerformed

    private void grid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid2ActionPerformed
       grid2.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid2ActionPerformed

    private void grid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid3ActionPerformed
       grid3.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid3ActionPerformed

    private void grid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid4ActionPerformed
        grid4.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid4ActionPerformed

    private void grid5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid5ActionPerformed
        grid5.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid5ActionPerformed

    private void grid6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid6ActionPerformed
        grid6.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid6ActionPerformed

    private void grid7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid7ActionPerformed
       grid7.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid7ActionPerformed

    private void grid8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grid8ActionPerformed
        grid8.setText(start_game);
        
        if(start_game.equalsIgnoreCase("X"))
        {
            check = false;
        }
        else 
        {
            check = true;
        }
        choose_player();
        winning_game();
    }//GEN-LAST:event_grid8ActionPerformed

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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tie_label;
    private javax.swing.JLabel Tie_score_label;
    private javax.swing.JPanel boardPanel;
    private javax.swing.JPanel button_panel_2;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton grid1;
    private javax.swing.JButton grid2;
    private javax.swing.JButton grid3;
    private javax.swing.JButton grid4;
    private javax.swing.JButton grid5;
    private javax.swing.JButton grid6;
    private javax.swing.JButton grid7;
    private javax.swing.JButton grid8;
    private javax.swing.JButton grid9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel222;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel225;
    private javax.swing.JPanel jPanel226;
    private javax.swing.JPanel jPanel227;
    private javax.swing.JPanel jPanel228;
    private javax.swing.JPanel jPanel229;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel230;
    private javax.swing.JPanel jPanel231;
    private javax.swing.JPanel jPanel232;
    private javax.swing.JPanel jPanel233;
    private javax.swing.JPanel jPanel234;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel236;
    private javax.swing.JPanel jPanel237;
    private javax.swing.JPanel jPanel238;
    private javax.swing.JPanel jPanel239;
    private javax.swing.JPanel jPanel240;
    private javax.swing.JPanel jPanel241;
    private javax.swing.JPanel jPanel242;
    private javax.swing.JPanel jPanel243;
    private javax.swing.JPanel jPanel244;
    private javax.swing.JPanel jPanel245;
    private javax.swing.JPanel jPanel246;
    private javax.swing.JPanel jPanel247;
    private javax.swing.JPanel jPanel248;
    private javax.swing.JPanel jPanel249;
    private javax.swing.JPanel jPanel250;
    private javax.swing.JPanel jPanel251;
    private javax.swing.JPanel jPanel252;
    private javax.swing.JPanel jPanel253;
    private javax.swing.JPanel jPanel254;
    private javax.swing.JPanel jPanel255;
    private javax.swing.JPanel jPanel256;
    private javax.swing.JPanel jPanel257;
    private javax.swing.JPanel jPanel258;
    private javax.swing.JPanel jPanel259;
    private javax.swing.JPanel jPanel260;
    private javax.swing.JPanel jPanel261;
    private javax.swing.JPanel jPanel262;
    private javax.swing.JPanel jPanel263;
    private javax.swing.JPanel jPanel264;
    private javax.swing.JPanel jPanel265;
    private javax.swing.JPanel jPanel266;
    private javax.swing.JPanel jPanel267;
    private javax.swing.JPanel jPanel268;
    private javax.swing.JPanel jPanel269;
    private javax.swing.JPanel jPanel270;
    private javax.swing.JPanel jPanel271;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newGame_button;
    private javax.swing.JLabel playerO_label;
    private javax.swing.JLabel playerO_score_label;
    private javax.swing.JLabel playerX_label;
    private javax.swing.JLabel playerX_score_label;
    private javax.swing.JButton reset_button;
    private javax.swing.JPanel scorePanel;
    // End of variables declaration//GEN-END:variables
}
