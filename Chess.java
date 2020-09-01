package chess;

import java.util.Set;
import java.util.HashSet;
class Chess {
  public static void main(String[] args) {
    Board brd = new Board();
    System.out.println(brd);
  }
}
class Board {
  private Set<Piece> pieces = new HashSet<>();
  Board() {
    pieces.add(new Piece(3, 0, false, Type.Q));
    pieces.add(new Piece(3, 7, true , Type.Q));
    pieces.add(new Piece(4, 0, false, Type.K));
    pieces.add(new Piece(4, 7, true , Type.K));
    for (int i = 0; i < 2; i++) {
      pieces.add(new Piece(0 + i * 7, 0, false, Type.R));
      pieces.add(new Piece(0 + i * 7, 7, true , Type.R));
      pieces.add(new Piece(1 + i * 5, 0, false, Type.N));
      pieces.add(new Piece(1 + i * 5, 7, true , Type.N));
      pieces.add(new Piece(2 + i * 3, 0, false, Type.B));
      pieces.add(new Piece(2 + i * 3, 7, true , Type.B));
    }
    for (int i = 0; i < 8; i++) {
      pieces.add(new Piece(i, 1, false, Type.P));
      pieces.add(new Piece(i, 6, true , Type.P));
    }
  }
  Piece pieceAt(int c, int r) {
    for (Piece p : pieces) {
      if (p.c == c && p.r == r) {
        return p;
      }
    }
    return null;
  }
  public String toString() {
    String brdStr = "";
    brdStr += "  a b c d e f g h\n";
    for (int r = 0; r < 8; r++) {
      brdStr += (8 - r) + "";
      for (int c = 0; c < 8; c++) {
        Piece p = pieceAt(c, r);
        if (p == null) {
          brdStr += " .";
        } else {
          switch (p.t) {
          case P: brdStr += p.w ? " P" : " p"; break;
          case R: brdStr += p.w ? " R" : " r"; break;
          case N: brdStr += p.w ? " N" : " n"; break;
          case B: brdStr += p.w ? " B" : " b"; break;
          case Q: brdStr += p.w ? " Q" : " q"; break;
          case K: brdStr += p.w ? " K" : " k"; break;
          }
        }
      }
      brdStr += " " + (8 - r) + "\n";
    }
    brdStr += "  a b c d e f g h\n";
    return brdStr;
  }
}
enum Type {
  P, // pawn
  R, // rook
  N, // knight
  B, // bishop
  Q, // queen
  K, // king
}
class Piece {
  int c; // column
  int r; // row
  boolean w; // isWhite
  Type t;
Piece(int c, int r, boolean w, Type t) {
    this.c = c;
    this.r = r;
    this.w = w;
    this.t = t;
  }
}