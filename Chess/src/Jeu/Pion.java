package Jeu;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pion{
	
	Suppression supp = new Suppression();
	String name;
	int xPion;
	int yPion;
	String upgrade = "none";
	ImageIcon icoPion;
	Image imgPion;
	
	
	// savoir si blanc ou noir
	boolean blanc;
	
	// savoir si le pion à déjà avancé
	boolean PremierCoup = true;
	
	public Pion(String name, int x, int y, boolean blanc, ImageIcon icoPion, Image imgPion) {
		this.name = name;
		this.xPion = x;
		this.yPion = y;
		this.blanc = blanc;
		this.icoPion = icoPion;
		this.imgPion = imgPion;
	}
	
	
	public void PionPasse() {
		
		String passe = "none";
			
		do {
			passe = JOptionPane.showInputDialog("Quel pion ? (dame, cavalier, fou, tour");
		} while(passe != "dame" & passe == "cavalier" & passe == "fou" & passe == "tour") ;
		
		System.out.print(passe);
		
		if (this.blanc) {
			if (passe.equals("dame")) {
				icoPion = new ImageIcon(getClass().getResource("/image/DameB.png"));
				imgPion = this.icoPion.getImage();
			}
			else if (passe.equals("cavalier")) {
				icoPion = new ImageIcon(getClass().getResource("/image/CavalierB.png"));
				imgPion = this.icoPion.getImage();
			}
			else if (passe.equals("tour")) {
				icoPion = new ImageIcon(getClass().getResource("/image/tourB.png"));
				imgPion = this.icoPion.getImage();
			}
			else {
				icoPion = new ImageIcon(getClass().getResource("/image/FouB.png"));
				imgPion = this.icoPion.getImage();
			}
		}
		else {
			if (passe.equals("dame")) {
				icoPion = new ImageIcon(getClass().getResource("/image/DameN.png"));
				imgPion = this.icoPion.getImage();
			}
			else if (passe.equals("cavalier")) {
				icoPion = new ImageIcon(getClass().getResource("/image/CavalierN.png"));
				imgPion = this.icoPion.getImage();
			}
			else if (passe.equals("tour")) {
				icoPion = new ImageIcon(getClass().getResource("/image/tourN.png"));
				imgPion = this.icoPion.getImage();
			}
			else {
				icoPion = new ImageIcon(getClass().getResource("/image/FouN.png"));
				imgPion = this.icoPion.getImage();
			}
		}
		
		this.upgrade = passe;
			
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
				
				if (board.board[7][x2] == this.name) {
					PionPasse();
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
				
				if (board.board[0][x2] == this.name) {
					PionPasse();
				}
			}
		}
		
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
	
	
	public void DeplacerTour(Chessboard board, int x, int y, int x2, int y2) {
		
		if ((x == x2 & y != y2) | (x != x2 & y == y2)) {
			DeplacementLigne(board, x, y, x2, y2);
		}
		else {
			JOptionPane.showMessageDialog(board, "Coup invalide");
		}
	}
	
	
	public void DeplacerFou(Chessboard board, int x, int y, int x2, int y2) {
		
		if ((x2 - x == y2 - y) | (x2 - x == y - y2) | (x - x2 == y2 - y) | (x - x2 == y - y2)) {
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
								this.xPion += ((posx - x) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
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
								this.xPion -= ((x - posx) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion -= ((x - posx) * 90);
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
								this.yPion -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yPion -= ((posy - y) * 90);
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
								this.yPion += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yPion += ((y - posy) * 90);
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
				if(x < x2 && y == y2) {
					while (valide) {
						posx++;
						if (board.board[posy][posx] == "0") {
							if (posx == x2) {
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
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
								this.xPion -= ((x - posx) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion -= ((x - posx) * 90);
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
								this.yPion -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yPion -= ((posy - y) * 90);
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
								this.yPion += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posy == y2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.yPion += ((y - posy) * 90);
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
								this.xPion += ((posx - x) * 90);
								this.yPion -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								this.yPion -= ((posy - y) * 90);
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
								this.xPion += ((posx - x) * 90);
								this.yPion += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								this.yPion += ((y - posy) * 90);
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
								this.xPion -= ((x - posx) * 90);
								this.yPion -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion -= ((x - posx) * 90);
								this.yPion -= ((posy - y) * 90);
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
								this.xPion -= ((x - posx) * 90);
								this.yPion += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'N') {
								supp.SupprimerPieceN(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								this.yPion += ((y - posy) * 90);
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
								this.xPion += ((posx - x) * 90);
								this.yPion -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								this.yPion -= ((posy - y) * 90);
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
								this.xPion += ((posx - x) * 90);
								this.yPion += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								this.yPion += ((y - posy) * 90);
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
								this.xPion -= ((x - posx) * 90);
								this.yPion -= ((posy - y) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion -= ((x - posx) * 90);
								this.yPion -= ((posy - y) * 90);
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
								this.xPion -= ((x - posx) * 90);
								this.yPion += ((y - posy) * 90);
								valide = false;
							}
						}
						else if (posx == x2) {
							if (board.board[posy][posx].charAt(1) == 'B') {
								supp.SupprimerPieceB(board, posy, posx);
								board.board[y][x] = "0";
								board.board[posy][posx] = this.name;
								this.xPion += ((posx - x) * 90);
								this.yPion += ((y - posy) * 90);
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
						this.xPion += ((x2 - x) * 90);
					}
					else {
						this.xPion -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yPion -= ((y2 - y) * 90);
					}
					else {
						this.yPion += ((y - y2) * 90);
					}
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					
				}
				else if (board.board[y2][x2].charAt(1) == 'N') {
					supp.SupprimerPieceN(board, y2, x2);
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					if (x < x2) {
						this.xPion += ((x2 - x) * 90);
					}
					else {
						this.xPion -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yPion -= ((y2 - y) * 90);
					}
					else {
						this.yPion += ((y - y2) * 90);
					}
				}
				else {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
			}
			
			else {
				if (board.board[y2][x2] == "0") {
					if (x < x2) {
						this.xPion += ((x2 - x) * 90);
					}
					else {
						this.xPion -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yPion -= ((y2 - y) * 90);
					}
					else {
						this.yPion += ((y - y2) * 90);
					}
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					
				}
				else if (board.board[y2][x2].charAt(1) == 'B') {
					supp.SupprimerPieceB(board, y2, x2);
					board.board[y][x] = "0";
					board.board[y2][x2] = this.name;
					if (x < x2) {
						this.xPion += ((x2 - x) * 90);
					}
					else {
						this.xPion -= ((x - x2) * 90);
					}
					if (y < y2) {
						this.yPion -= ((y2 - y) * 90);
					}
					else {
						this.yPion += ((y - y2) * 90);
					}
				}
				else {
					JOptionPane.showMessageDialog(board, "Coup invalide");
				}
			}
		}
	}
}
