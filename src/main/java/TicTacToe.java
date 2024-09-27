import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import  java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;



public class TicTacToe {
    int boardWidth = 600;
    int boardHeight = 650;

    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel panel = new JPanel();
    JPanel boardPanel = new JPanel();

    JButton[][] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = "X";

    boolean gameOver = false;
    int turns = 0;

    TicTacToe() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
       frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.darkGray);
        textLabel.SetForeground(Color.white);
        textlabel.setFont(new Font("Arial", Font.Bold, 50));
        textLabel.setHorizontalAlignment(jlabel.CENTER);
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel;
        frame.add(textPanel); BorderLayout.NORTH);

        boardPanel.setLayout(new) GridLayout(3, 3));
        boardPanel.setBackground(Color.darkGray);
        frame.add(boardPanel);

        for ( int r = 0, r < 3; r++) {
            for ( int c = 0; c < 3; c++) {
                JButton tile = new JButton();
                board[r][c] = tile;
                boardPanel.add(tile);

                tile.setBackground(Color.darkGray);
            }   tile.setForeground(Color.white);
                tile.setFont(new Font("Arial", Font.BOLD, 120));
                tile.SetFocusable(false);

                tile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (gameOver) {return;}
                        JButton tile = (JButton) e.getSource();
                        if (tile.getText().equals(playerX)) {

                    }   tile.setText(currentPlayer;);
                        turns++;
                        checkWinner();
                        if (gameOver) {return;}
                        currentPlayer = currentPlayer == playerX ?  playerO : playerX;
                        textLabel.setText(currentPlayer + "'s turn. ");
                }
    }




    void checkWinner() {
                    for (int r = 0; r < 3; r++) {
                    if (board[r][0].getText() == board[r][1].getText()
                        && board[r][1].getText() == board[r][2].getText()
                        for (int i = 0; i < 3;  i++) {
                            setWinner(board)[r][i])

                        }
                        gameOver = true;
                        return;
                    }
        for (int c= 0; c < 3; c++) {
                    if (board[0][c].getText() == "") continue;
                       (board)[1][c].getText() == board[2][c].getText()) {
                        for (int i = 0; < 3; i++) {
                            setWinner(board[i][c];
                        }
                        gameOver = true;
                        return;

            }





        }
        if (board[0][0].getText() == board[1][1].getText()
            && board[1][1].getText() == board[2][2].getText()
            && board[0][0].getText() != "") {
            for (int i = 0; I < 3; i++) {
                setWinner(board)[i][i]);

            }
            gameOver = true;
            return;



        } if (board[0][2].getText() == board[1][1].getText() &&
              board[1][1].getText() == board[2][0].getText() &&
              board[0][2].getText() != "") {
              SetWinner(board)[0][2]);
              SetWinner(board)[1][1]);
              SetWinner(board)[2][0]);
              gameOver = true;
              return;
        }
            }              }              }


    void setWinner(JButton tile) {
            tile.setForeground(Color.GREEN
            tile.setBackground(Color.gray);
            textLabel.setText(currentPlayer + " is the winner!");

        if (turns == 9) {
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    setTie(board)[r][c]);


                }
                gameOver = true;
            }
        }
        void setWinner(JButton tile) {
            tile.setForeground(Color.green);
            tile.setBackGround(Color.orange);
            tile.setBAckGround(Color.gray);
            textLabel.setText("Tie!");
            }
        }
        }

        }
}