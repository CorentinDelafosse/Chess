package Jeu;

import javax.swing.JOptionPane;

public class Tour {

	Suppression supp = new Suppression();
	
	boolean RockValide = true;
	
	String name;
	int xTour;
	int yTour;
	boolean blanc;
	
	public Tour(String name, int x, int y, boolean blanc) {
		this.name = name;
		this.xTour = x;
		this.yTour = y;
		this.blanc = blanc;
	}
	
	
	
	
	public void DeplacerTour(Chessboard board, int x, int y, int x2, int y2) {
		
		int posx = x;
		int posy = y;
		
		boolean valide = true;
		
		if((x != x2 && y != y2) || (x == x2 && y == y2)) {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
		else {
			
			// pour les tours blanches
			if(this.blanc) {
				if(x < x2 && y == y2) {
					while (valide) {
						posx++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour += ((posx - x) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour += ((posx - x) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				else if (x > x2 && y == y2) {
					while (valide) {
						posx--;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour -= ((x - posx) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour -= ((x - posx) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				else if (x == x2 && y < y2) {
					while (valide) {
						posy++;
						if (board.board[posy][posx] == "0") {
							if (posy == y2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour -= ((posy - y) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour -= ((posy - y) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				else {
					while (valide) {
						posy--;
						if (board.board[posy][posx] == "0") {
							if (posy == y2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour += ((y - posy) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour += ((y - posy) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
			}
			
			// pour les tours noirs
			else {
				if(x < x2 && y == y2) {
					while (valide) {
						posx++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour += ((posx - x) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour += ((posx - x) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				else if (x > x2 && y == y2) {
					while (valide) {
						posx--;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour -= ((x - posx) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xTour -= ((x - posx) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				else if (x == x2 && y < y2) {
					while (valide) {
						posy++;
						if (board.board[posy][posx] == "0") {
							if (posy == y2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour -= ((posy - y) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour -= ((posy - y) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else {
							JOptionPane.showMessageDialog(board,  "coup invalide");
							valide = false;
						}
					}
				}
				else {
					while (valide) {
						posy--;
						if (board.board[posy][posx] == "0") {
							if (posy == y2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour += ((y - posy) * 90);
								valide = false;
								RockValide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yTour += ((y - posy) * 90);
								valide = false;
								RockValide = false;
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
