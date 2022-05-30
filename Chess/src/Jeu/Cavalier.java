package Jeu;

import javax.swing.JOptionPane;

public class Cavalier {

	Suppression supp = new Suppression();
	
	String name;
	int xCav;
	int yCav;
	boolean blanc;
	
	public Cavalier(String name, int x, int y, boolean blanc) {
		this.name = name;
		this.xCav = x;
		this.yCav = y;
		this.blanc = blanc;
	}
	
	
	public void DeplacerCavalier(Chessboard board, int x, int y, int x2, int y2) {
				
		// vérifie si la saisie est bonne
		if ( (!((x + 2 == x2) & ((y + 1 == y2) | (y - 1 == y2)))) &
			 (!((y + 2 == y2) & ((x + 1 == x2) | (x - 1 == x2)))) &
			 (!((x - 2 == x2) & ((y + 1 == y2) | (y - 1 == y2)))) &
			 (!((y - 2 == y2) & ((x + 1 == x2) | (x - 1 == x2))))   ) {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
		
		else {
			if (this.blanc) {
				if (board.board[y2][x2] == "0") {
					if (x < x2) {
						this.xCav += ((x2 - x) * 90);
					}
					else {
						this.xCav -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yCav -= ((y2 - y) * 90);
					}
					else {
						this.yCav += ((y - y2) * 90);
					}
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					
				}
				else if (board.board[y2][x2].charAt(1) == 'N') {
					supp.SupprimerPieceN(board, y2, x2);
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					if (x < x2) {
						this.xCav += ((x2 - x) * 90);
					}
					else {
						this.xCav -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yCav -= ((y2 - y) * 90);
					}
					else {
						this.yCav += ((y - y2) * 90);
					}
				}
				else {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
			}
			
			else {
				if (board.board[y2][x2] == "0") {
					if (x < x2) {
						this.xCav += ((x2 - x) * 90);
					}
					else {
						this.xCav -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yCav -= ((y2 - y) * 90);
					}
					else {
						this.yCav += ((y - y2) * 90);
					}
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					
				}
				else if (board.board[y2][x2].charAt(1) == 'B') {
					supp.SupprimerPieceB(board, y2, x2);
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					if (x < x2) {
						this.xCav += ((x2 - x) * 90);
					}
					else {
						this.xCav -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yCav -= ((y2 - y) * 90);
					}
					else {
						this.yCav += ((y - y2) * 90);
					}
				}
				else {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
			}
			
			
		}
		
		
	}
	
}
