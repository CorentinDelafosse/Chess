package Jeu;

import javax.swing.JOptionPane;

public class Pion {
	
	Suppression supp = new Suppression();
	String name;
	int xPion;
	int yPion;
	
	// savoir si blanc ou noir
	boolean blanc;
	
	// savoir si le pion à déjà avancé
	boolean PremierCoup = true;
	
	public Pion(String name, int x, int y, boolean blanc) {
		this.name = name;
		this.xPion = x;
		this.yPion = y;
		this.blanc = blanc;
	}
	
	public void DeplacerPion(Chessboard board, int x, int y, int x2, int y2) {				
		
		// vérifie si la saisie est bonne
		if ((!((x == x2) & ((y + 1 == y2) | (y - 1 == y2)))) &
			(!((x + 1 == x2) | (x -1 == x2) & (y + 1 == y2) | (y -1 == y2))) &
			(!(PremierCoup & (x == x2) & ((y + 2 == y2) | (y - 2 == y2))))) {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
		
		else {
			if (this.blanc) {
				if (PremierCoup & x == x2 & y + 2 == y2 & board.board[y2][x2] == "0" & board.board[y2 - 1][x2] == "0") {
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					this.yPion -= 180;
					PremierCoup = false;
				}
				else if(board.board[y2][x2] == "0" & (y + 1 == y2) & (x == x2)) {
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					this.yPion -= 90;
					PremierCoup = false;
				}
				else if (!(board.board[y2 - 1][x2] == "0") & (y + 2 == y2) & (x == x2)) {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
				else if (board.board[y2][x2] == "0" && (x != x2)) {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
				else if (board.board[y2][x2].charAt(1) == 'N' & (x != x2)) {
					supp.SupprimerPieceN(board, y2, x2);
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					if(x < x2) {
						this.xPion += 90;
					}
					else {
						this.xPion -= 90;
					}
					this.yPion -= 90;
					PremierCoup = false;
				}
				else {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
			}
			
			
			else {
				if (PremierCoup & x == x2 & y - 2 == y2 & board.board[y2][x2] == "0" & board.board[y2 + 1][x2] == "0") {
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					this.yPion += 180;
					System.out.print(board.board[y2][x2]);
					PremierCoup = false;
				}
				else if(board.board[y2][x2] == "0" & (y - 1 == y2) & (x == x2)) {
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					this.yPion += 90;
					PremierCoup = false;
				}
				else if (!(board.board[y2 + 1][x2] == "0") & (y - 2 == y2) & (x == x2)) {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
				else if (board.board[y2][x2] == "0" && (x != x2)) {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
				else if (board.board[y2][x2].charAt(1) == 'B' & (x != x2)) {
					supp.SupprimerPieceB(board, y2, x2);
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					if (x < x2) {
						this.xPion += 90;
					}
					else {
						this.xPion -= 90;
					}
					this.yPion += 90;
					PremierCoup = false;
				}
				else {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
			}
			
				
		}
		
		
	}

}
