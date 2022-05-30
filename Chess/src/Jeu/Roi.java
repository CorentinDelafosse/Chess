package Jeu;

import javax.swing.JOptionPane;

public class Roi {

	Suppression supp = new Suppression();
	
	boolean RockValide = true;
	
	String name;
	int xRoi;
	int yRoi;
	boolean blanc;
	
	public Roi(String name, int x, int y, boolean blanc) {
		this.name = name;
		this.xRoi = x;
		this.yRoi = y;
		this.blanc = blanc;
	}

	
	public void DeplacerRoi(Chessboard board, int x, int y, int x2, int y2) {
		
		System.out.print(" ici ");
		
		if (((x + 1 != x2) & ((y + 1 != y2) | (y - 1 != y2) | (y != y2))) &
			((x - 1 != x2) & ((y + 1 != y2) | (y - 1 != y2) | (y != y2))) &
			((y + 1 != y2) & ((x + 1 != x2) | (x - 1 != x2) | (x != x2))) &
			((y - 1 != y2) & ((x + 1 != x2) | (x - 1 != x2) | (x != x2)))) {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
		
		else {
			
			if(this.blanc) {
				if (x < x2 & y < y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}					
				}
				else if (x < x2 & y > y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x > x2 & y < y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x > x2 & y > y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x < x2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x > x2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (y < y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'N') {
						supp.SupprimerPieceN(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
			}
			else {
				if (x < x2 & y < y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}					
				}
				else if (x < x2 & y > y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x > x2 & y < y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x > x2 & y > y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						this.yRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x < x2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (x > x2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.xRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else if (y < y2) {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi -= 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi -= 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else {
					if (board.board[y2][x2] == "0") {
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi += 90;
						RockValide = false;
					}
					else if (board.board[y2][x2].charAt(1) == 'B') {
						supp.SupprimerPieceB(board, x2, y2);
						board.board[y][x] = "0";
						board.board[y2][x2] = this.name;
						this.yRoi += 90;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
			}
		}	
	}
	
	
	public void rock(Chessboard board, int x, int y, int x2, int y2) {
		
		if (RockValide) {
			if(this.blanc) {
				if (x2 == 0 & y2 == 0) {
					if(board.board[0][0] == "tB1" & board.tB1.RockValide &
					   board.board[0][1] == "0" & board.board[0][2] == "0" &
					   board.board[0][3] == "0") {
						
						board.board[y][x] = "0";
						board.board[0][0] = "0";
						board.board[0][1] = this.name;
						board.board[0][2] = board.tB1.name;
						this.xRoi -= 270;
						board.tB1.xTour += 180;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else {
					if(board.board[0][7] == "tB2" & board.tB2.RockValide &
					   board.board[0][6] == "0" & board.board[0][5] == "0") {
								
						board.board[y][x] = "0";
						board.board[0][7] = "0";
						board.board[0][6] = this.name;
						board.board[0][5] = board.tB1.name;
						this.xRoi += 180;
						board.tB2.xTour -= 180;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
			}
			else {
				if (x2 == 0 & y2 == 7) {
					if(board.board[0][0] == "tN1" & board.tN1.RockValide &
					   board.board[7][1] == "0" & board.board[7][2] == "0" &
					   board.board[7][3] == "0") {
						
						board.board[y][x] = "0";
						board.board[7][0] = "0";
						board.board[7][1] = this.name;
						board.board[7][2] = board.tN1.name;
						this.xRoi -= 270;
						board.tN1.xTour += 180;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
				else {
					if(board.board[7][7] == "tN2" & board.tN2.RockValide &
					   board.board[7][6] == "0" & board.board[7][5] == "0") {
								
						board.board[y][x] = "0";
						board.board[7][7] = "0";
						board.board[7][6] = this.name;
						board.board[7][5] = board.tN1.name;
						this.xRoi += 180;
						board.tN2.xTour -= 180;
						RockValide = false;
					}
					else {
						JOptionPane.showMessageDialog(board, "Coup invalide");
					}
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
		
	}
	
}

