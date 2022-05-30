package Jeu;

import javax.swing.JOptionPane;

public class Fou {

	Suppression supp = new Suppression();
	
	String name;
	int xFou;
	int yFou;
	boolean blanc;
	
	public Fou(String name, int x, int y, boolean blanc) {
		this.name = name;
		this.xFou = x;
		this.yFou = y;
		this.blanc = blanc;
	}
	
	public void DeplacerFou(Chessboard board, int x, int y, int x2, int y2) {				
			
		boolean valide = true;
		int posx = x;
		int posy = y;
		
		// vérifie si la saisie est bonne
		if ((x2 - x != y2 - y) & (x2 - x != y - y2) & (x - x2 != y2 - y) & (x - x2 != y - y2)) {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
			
		else {
			
			// si fou blanc
			if (this.blanc) {
				while(valide) {
					if(x < x2 & y < y2) {
						posx++;
						posy++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
					else if (x < x2 & y > y2) {
						posx++;
						posy--;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
					
					else if (x > x2 & y < y2) {
						posx--;
						posy++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou -= ((x - posx) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou -= ((x - posx) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
					else {
						posx--;
						posy--;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou -= ((x - posx) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				
			}
			
			else {
				while(valide) {
					if(x < x2 & y < y2) {
						posx++;
						posy++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
					else if (x < x2 & y > y2) {
						posx++;
						posy--;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
					
					else if (x > x2 & y < y2) {
						posx--;
						posy++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou -= ((x - posx) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou -= ((x - posx) * 90);
								this.yFou -= ((posy - y) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
					else {
						posx--;
						posy--;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou -= ((x - posx) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xFou += ((posx - x) * 90);
								this.yFou += ((y - posy) * 90);
								valide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
			}
				
		}
			
	}
			
	
	
}
