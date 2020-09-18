package chess;

import javax.swing.*;
import java.awt.*;

public class ChessBoard {

static JFrame frame;
static JPanel squares[][] = new JPanel[8][8];
public ChessBoard() {
    frame = new JFrame("Simplified Chess");
    frame.setSize(600, 600);
    frame.setLayout(new GridLayout(8, 8));

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            squares[i][j] = new JPanel();

            if ((i + j) % 2 == 0) {
                squares[i][j].setBackground(Color.GRAY);
            } else {
                squares[i][j].setBackground(Color.white);
            }   
            frame.add(squares[i][j]);
        }
    }
    
  squares[0][0].add(new JLabel(new ImageIcon("C:/Black_Rook.png")));
  squares[0][1].add(new JLabel(new ImageIcon("C:/Black_Knight.png")));
  squares[0][2].add(new JLabel(new ImageIcon("C:/Black_Bishop.png")));
  squares[0][3].add(new JLabel(new ImageIcon("C:/Black_Queen.png")));
  squares[0][4].add(new JLabel(new ImageIcon("C:/Black_King.png")));
  squares[0][5].add(new JLabel(new ImageIcon("C:/Black_Bishop.png")));
  squares[0][6].add(new JLabel(new ImageIcon("C:/Black_Knight.png")));
  squares[0][7].add(new JLabel(new ImageIcon("C:/Black_Rook.png")));
  
  squares[7][0].add(new JLabel(new ImageIcon("C:/White_Rook.png")));
  squares[7][1].add(new JLabel(new ImageIcon("C:/White_Knight.png")));
  squares[7][2].add(new JLabel(new ImageIcon("C:/White_Bishop.png")));
  squares[7][3].add(new JLabel(new ImageIcon("C:/White_Queen.png")));
  squares[7][4].add(new JLabel(new ImageIcon("C:/White_King.png")));
  squares[7][5].add(new JLabel(new ImageIcon("C:/White_Bishop.png")));
  squares[7][6].add(new JLabel(new ImageIcon("C:/White_Knight.png")));
  squares[7][7].add(new JLabel(new ImageIcon("C:/White_Rook.png")));
  
  for (int i = 0; i < 8; i++) {
  	squares[1][i].add(new JLabel(new ImageIcon("C:/Black_Pawn.png")));
      squares[6][i].add(new JLabel(new ImageIcon("C:/White_Pawn.png")));
  }

    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}


public static void main(String[] args) {
    new ChessBoard();
   
  
 }
}