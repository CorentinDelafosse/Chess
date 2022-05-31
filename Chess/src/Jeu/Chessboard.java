package Jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Chessboard extends JPanel{

	String[][] board = new String[8][8];
	
	// Echiquier
	private ImageIcon icoFond;
	private Image  imgFond1;
	public int xFond1;
	
	// pion Blanc
	private ImageIcon icoTourB;
	private Image imgTourB;
	Tour tB1 = new Tour("tB1", 95, 715, true);
	Tour tB2 = new Tour("tB2", 720, 715, true);
	
	private ImageIcon icoCavB;
	private Image imgCavB;
	Cavalier cB1 = new Cavalier("cB1", 180, 715, true);
	Cavalier cB2 = new Cavalier("cB2", 625, 715, true);
	
	private ImageIcon icoFouB;
	private Image imgFouB;
	Fou fB1 = new Fou("fB1",270, 715, true);
	Fou fB2 = new Fou("fB2",540, 715, true);
	
	private ImageIcon icoDameB;
	private Image imgDameB;
	Dame dB = new Dame("dB", 360, 715, true);
	
	private ImageIcon icoRoiB;
	private Image imgRoiB;
	Roi rB = new Roi("rB", 450, 715, true);
	
	private ImageIcon icoPionB = new ImageIcon(getClass().getResource("/image/PionB.png"));
	private Image imgPionB = this.icoPionB.getImage();;
	Pion pB1 = new Pion("pB1", 95, 625, true, icoPionB, imgPionB);
	Pion pB2 = new Pion("pB2", 185, 625, true, icoPionB, imgPionB);
	Pion pB3 = new Pion("pB3", 275, 625, true, icoPionB, imgPionB);
	Pion pB4 = new Pion("pB4", 360, 625, true, icoPionB, imgPionB);
	Pion pB5 = new Pion("pB5", 450, 625, true, icoPionB, imgPionB);
	Pion pB6 = new Pion("pB6", 540, 625, true, icoPionB, imgPionB);
	Pion pB7 = new Pion("pB7", 630, 625, true, icoPionB, imgPionB);
	Pion pB8 = new Pion("pB8", 720, 625, true, icoPionB, imgPionB);
	
	// pion Noir
	private ImageIcon icoTourN;
	private Image imgTourN;
	Tour tN1 = new Tour("tN1", 95, 90, false);
	Tour tN2 = new Tour("tN2", 720, 90, false);
	
	private ImageIcon icoCavN;
	private Image imgCavN;
	Cavalier cN1 = new Cavalier("cN1", 175, 90, false);
	Cavalier cN2 = new Cavalier("cN2", 620, 90, false);
	
	private ImageIcon icoFouN;
	private Image imgFouN;
	Fou fN1 = new Fou("fN1",270, 90, false);
	Fou fN2 = new Fou("fN2",540, 90, false);

	
	private ImageIcon icoDameN;
	private Image imgDameN;
	Dame dN = new Dame("dN", 360, 90, false);
	
	private ImageIcon icoRoiN;
	private Image imgRoiN;
	Roi rN = new Roi("rN", 450, 90, false);

	private ImageIcon icoPionN = new ImageIcon(getClass().getResource("/image/PionN.png"));
	private Image imgPionN = this.icoPionN.getImage();;
	Pion pN1 = new Pion("pN1", 85, 180, false, icoPionN, imgPionN);
	Pion pN2 = new Pion("pN2", 180, 180, false, icoPionN, imgPionN);
	Pion pN3 = new Pion("pN3", 275, 180, false, icoPionN, imgPionN);
	Pion pN4 = new Pion("pN4", 360, 180, false, icoPionN, imgPionN);
	Pion pN5 = new Pion("pN5", 450, 180, false, icoPionN, imgPionN);
	Pion pN6 = new Pion("pN6", 540, 180, false, icoPionN, imgPionN);
	Pion pN7 = new Pion("pN7", 630, 180, false, icoPionN, imgPionN);
	Pion pN8 = new Pion("pN8", 720, 180, false, icoPionN, imgPionN);
	
	public Chessboard(){
		
		super();
		
		board[0][0] = "tB1";
		icoTourB = new ImageIcon(getClass().getResource("/image/tourB.png"));
		imgTourB = this.icoTourB.getImage();
		board[0][1] = "cB1";
		icoCavB = new ImageIcon(getClass().getResource("/image/CavalierB.png"));
		imgCavB = this.icoCavB.getImage();
		board[0][2] = "fB1";
		icoFouB = new ImageIcon(getClass().getResource("/image/FouB.png"));
		imgFouB = this.icoFouB.getImage();
		board[0][3] = "dB";
		icoDameB = new ImageIcon(getClass().getResource("/image/DameB.png"));
		imgDameB = this.icoDameB.getImage();
		board[0][4] = "rB";
		icoRoiB = new ImageIcon(getClass().getResource("/image/RoiB.png"));
		imgRoiB = this.icoRoiB.getImage();
		board[0][5] = "fB2";
		board[0][6] = "cB2";
		board[0][7] = "tB2";
		board[1][0] = "pB1";
		board[1][1] = "pB2";
		board[1][2] = "pB3";
		board[1][3] = "pB4";
		board[1][4] = "pB5";
		board[1][5] = "pB6";
		board[1][6] = "pB7";
		board[1][7] = "pB8";

		
		
		board[7][0] = "tN1";
		icoTourN = new ImageIcon(getClass().getResource("/image/tourN.png"));
		imgTourN = this.icoTourN.getImage();
		board[7][1] = "cN1";
		icoCavN = new ImageIcon(getClass().getResource("/image/CavalierN.png"));
		imgCavN = this.icoCavN.getImage();
		board[7][2] = "fN1";
		icoFouN = new ImageIcon(getClass().getResource("/image/FouN.png"));
		imgFouN = this.icoFouN.getImage();
		board[7][3] = "dN";
		icoDameN = new ImageIcon(getClass().getResource("/image/DameN.png"));
		imgDameN = this.icoDameN.getImage();
		board[7][4] = "rN";
		icoRoiN = new ImageIcon(getClass().getResource("/image/RoiN.png"));
		imgRoiN = this.icoRoiN.getImage();
		board[7][5] = "fN2";
		board[7][6] = "cN2";
		board[7][7] = "tN2";
		board[6][0] = "pN1";
		board[6][1] = "pN2";
		board[6][2] = "pN3";
		board[6][3] = "pN4";
		board[6][4] = "pN5";
		board[6][5] = "pN6";
		board[6][6] = "pN7";
		board[6][7] = "pN8";
		
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j<8; j++) {
				board[i][j] = "0";
			}
		}

		
		this.xFond1 = -150;
		
		icoFond = new ImageIcon(getClass().getResource("/image/Echiquier.png"));
		this.imgFond1 = this.icoFond.getImage();
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond1,  this.xFond1,  this.xFond1,  null);// Dessin de l'image de fond
		
		// dessin des pions blancs
		g2.drawImage(this.imgTourB, tB1.xTour, tB1.yTour,  null);
		g2.drawImage(this.imgCavB, cB1.xCav, cB1.yCav,  null);
		g2.drawImage(this.imgFouB, fB1.xFou, fB1.yFou,  null);
		g2.drawImage(this.imgDameB, dB.xDame, dB.yDame,  null);
		g2.drawImage(this.imgRoiB, rB.xRoi, rB.yRoi,  null);
		g2.drawImage(this.imgTourB, tB2.xTour, tB2.yTour,  null);
		g2.drawImage(this.imgCavB, cB2.xCav, cB2.yCav,  null);
		g2.drawImage(this.imgFouB, fB2.xFou, fB2.yFou,  null);
		g2.drawImage(pB1.imgPion, pB1.xPion, pB1.yPion,  null);
		g2.drawImage(pB2.imgPion, pB2.xPion, pB2.yPion,  null);
		g2.drawImage(pB3.imgPion, pB3.xPion, pB3.yPion,  null);
		g2.drawImage(pB4.imgPion, pB4.xPion, pB4.yPion,  null);
		g2.drawImage(pB5.imgPion, pB5.xPion, pB5.yPion,  null);
		g2.drawImage(pB6.imgPion, pB6.xPion, pB6.yPion,  null);
		g2.drawImage(pB7.imgPion, pB7.xPion, pB7.yPion,  null);
		g2.drawImage(pB8.imgPion, pB8.xPion, pB8.yPion,  null);
		
		// dessin des pions noirs
		g2.drawImage(this.imgTourN, tN1.xTour, tN1.yTour,  null);
		g2.drawImage(this.imgCavN, cN1.xCav, cN1.yCav,  null);
		g2.drawImage(this.imgFouN, fN1.xFou, fN1.yFou,  null);
		g2.drawImage(this.imgDameN, dN.xDame, dN.yDame,  null);
		g2.drawImage(this.imgRoiN, rN.xRoi, rN.yRoi,  null);
		g2.drawImage(this.imgTourN, tN2.xTour, tN2.yTour,  null);
		g2.drawImage(this.imgCavN, cN2.xCav, cN2.yCav,  null);
		g2.drawImage(this.imgFouN, fN2.xFou, fN2.yFou,  null);
		g2.drawImage(pN1.imgPion, pN1.xPion, pN1.yPion,  null);
		g2.drawImage(pN2.imgPion, pN2.xPion, pN2.yPion,  null);
		g2.drawImage(pN3.imgPion, pN3.xPion, pN3.yPion,  null);
		g2.drawImage(pN4.imgPion, pN4.xPion, pN4.yPion,  null);
		g2.drawImage(pN5.imgPion, pN5.xPion, pN5.yPion,  null);
		g2.drawImage(pN6.imgPion, pN6.xPion, pN6.yPion,  null);
		g2.drawImage(pN7.imgPion, pN7.xPion, pN7.yPion,  null);
		g2.drawImage(pN8.imgPion, pN8.xPion, pN8.yPion,  null);	
		
	}
	
	
	public int[] Coordonne(String coor){
		
		int[] coordonne = new int[2]; 
		int coor1 = -1;
		int coor2 = -1;
	
		switch(coor.charAt(0)) {
		
			case 'A', 'a':
				coor1 = 0;
				break;
			case 'B', 'b':
				coor1 = 1;
				break;
			case 'C', 'c':
				coor1 = 2;
				break;
			case 'D', 'd':
				coor1 = 3;
				break;
			case 'E', 'e':
				coor1 = 4;
				break;
			case 'F', 'f':
				coor1 = 5;
				break;
			case 'G', 'g':
				coor1 = 6;
				break;
			case 'H', 'h':
				coor1 = 7;
				break;
			
		}
		
		switch(coor.charAt(1)) {
		
			case '1':
				coor2 = 0;
				break;
			case '2':
				coor2 = 1;
				break;
			case '3':
				coor2 = 2;
				break;
			case '4':
				coor2 = 3;
				break;
			case '5':
				coor2 = 4;
				break;
			case '6':
				coor2 = 5;
				break;
			case '7':
				coor2 = 6;
				break;
			case '8':
				coor2 = 7;
				break;
		}

		coordonne[0] = coor1;
		coordonne[1] = coor2;
		
		return coordonne;
	}

	
	
	public String[] Input() {
		
		String[] input = new String[2];
		String input1;
		String input2;
		do {
			input1 = JOptionPane.showInputDialog("Quel pièce voulez-vous bouger ?");
		} while(input1 == null) ;
		
		do {
			input2 = JOptionPane.showInputDialog("Vers quel case ?");
		} while(input1 == null) ;
		
		input[0] = input1;
		input[1] = input2;
		
	    return input;
	}
	
	
	
	public String QuiAGagne() {
		
		String gagnant = "aucun";
		boolean rNici = false;
		boolean rBici = false;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == "rN") {
					rNici = true;
				}
				
				if (board[i][j] == "rB") {
					rBici = true;
				}
			}
		}
		
		if (rNici == false) {
			gagnant = "blanc";
		}
		else if (rBici == false) {
			gagnant = "noir";
		}
		
		return gagnant;
	}
	
}
