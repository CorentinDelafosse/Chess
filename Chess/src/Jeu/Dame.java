package Jeu;

import javax.swing.JOptionPane;

public class Dame{

	Suppression supp = new Suppression();
	
	String name;
	int xDame;
	int yDame;
	boolean blanc;
	
	public Dame(String name, int x, int y, boolean blanc) {
		this.name = name;
		this.xDame = x;
		this.yDame = y;
		this.blanc = blanc;
	}
	
	
	public void DeplacerDame(Chessboard board, int x, int y, int x2, int y2) {
		
		if ((x == x2 & y != y2) | (x != x2 & y == y2)) {
			DeplacementLigne(board, x, y, x2, y2);
		}
		else if ((x2 - x == y2 - y) | (x2 - x == y - y2) | (x - x2 == y2 - y) | (x - x2 == y - y2)) {
			DeplacementDiagonale(board, x, y, x2, y2);
		}
		else {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
	}
	
	
	
	public void DeplacementLigne(Chessboard board, int x, int y, int x2, int y2) {
		
		boolean valide = true;
		int posx = x;
		int posy = y;
		
		if((x != x2 && y != y2) || (x == x2 && y == y2)) {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
		else {
			if(this.blanc) {
				if(x < x2 && y == y2) {
					while (valide) {
						posx++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								valide = false;
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
								this.xDame -= ((x - posx) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame -= ((x - posx) * 90);
								valide = false;
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
								this.yDame -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yDame -= ((posy - y) * 90);
								valide = false;
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
								this.yDame += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yDame += ((y - posy) * 90);
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
	
	
	
	
	public void DeplacementDiagonale(Chessboard board, int x, int y, int x2, int y2) {
		
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
								this.xDame += ((posx - x) * 90);
								this.yDame -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								this.yDame -= ((posy - y) * 90);
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
								this.xDame += ((posx - x) * 90);
								this.yDame += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								this.yDame += ((y - posy) * 90);
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
								this.xDame -= ((x - posx) * 90);
								this.yDame -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame -= ((x - posx) * 90);
								this.yDame -= ((posy - y) * 90);
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
								this.xDame -= ((x - posx) * 90);
								this.yDame += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								this.yDame += ((y - posy) * 90);
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
								this.xDame += ((posx - x) * 90);
								this.yDame -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								this.yDame -= ((posy - y) * 90);
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
								this.xDame += ((posx - x) * 90);
								this.yDame += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								this.yDame += ((y - posy) * 90);
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
								this.xDame -= ((x - posx) * 90);
								this.yDame -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame -= ((x - posx) * 90);
								this.yDame -= ((posy - y) * 90);
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
								this.xDame -= ((x - posx) * 90);
								this.yDame += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xDame += ((posx - x) * 90);
								this.yDame += ((y - posy) * 90);
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
