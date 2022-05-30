package Jeu;

public class Suppression {
	
public void SupprimerPieceN(Chessboard board, int x, int y) {
	
	
		
		switch(board.board[x][y]) {
			case "tN1":
				board.board[x][y] = "0";
				board.tN1.xTour = -200;
				board.tN1.yTour = -200;
				break;
			case "tN2":
				board.board[x][y] = "0";
				board.tN2.xTour = -200;
				board.tN2.yTour = -200;
				break;
			case "cN1":
				board.board[x][y] = "0";
				board.cN1.xCav = -200;
				board.cN1.yCav = -200;
				break;
			case "cN2":
				board.board[x][y] = "0";
				board.cN2.xCav = -200;
				board.cN2.yCav = -200;
				break;
			case "fN1":
				board.board[x][y] = "0";
				board.fN1.xFou = -200;
				board.fN1.yFou = -200;
				break;
			case "fN2":
				board.board[x][y] = "0";
				board.fN2.xFou = -200;
				board.fN2.yFou = -200;
				break;
			case "dN":
				board.board[x][y] = "0";
				board.dN.xDame = -200;
				board.dN.yDame = -200;
				break;
			case "rN":
				board.board[x][y] = "0";
				board.rN.xRoi = -200;
				board.rN.yRoi = -200;
				break;
			case "pN1":
				board.board[x][y] = "0";
				board.pN1.xPion = -200;
				board.pN1.yPion = -200;
				break;
			case "pN2":
				board.board[x][y] = "0";
				board.pN2.xPion = -200;
				board.pN2.yPion = -200;
				break;
			case "pN3":
				board.board[x][y] = "0";
				board.pN3.xPion = -200;
				board.pN3.yPion = -200;
				break;
			case "pN4":
				board.board[x][y] = "0";
				board.pN4.xPion = -200;
				board.pN4.yPion = -200;
				break;
			case "pN5":
				board.board[x][y] = "0";
				board.pN5.xPion = -200;
				board.pN5.yPion = -200;
				break;
			case "pN6":
				board.board[x][y] = "0";
				board.pN6.xPion = -200;
				board.pN6.yPion = -200;
				break;
			case "pN7":
				board.board[x][y] = "0";
				board.pN7.xPion = -200;
				board.pN7.yPion = -200;
				break;
			case "pN8":
				board.board[x][y] = "0";
				board.pN8.xPion = -200;
				board.pN8.yPion = -200;
				break;
		}
	}	
	
	
	public void SupprimerPieceB(Chessboard board, int x, int y) {
		
		switch(board.board[x][y]) {
			case "tB1":
				board.board[x][y] = "0";
				board.tB1.xTour = -200;
				board.tB1.yTour = -200;
				break;
			case "tB2":
				board.board[x][y] = "0";
				board.tB1.xTour = -200;
				board.tB1.yTour = -200;
				break;
			case "cB1":
				board.board[x][y] = "0";
				board.cB1.xCav = -200;
				board.cB1.yCav = -200;
				break;
			case "cB2":
				board.board[x][y] = "0";
				board.cB2.xCav = -200;
				board.cB2.yCav = -200;
				break;
			case "fB1":
				board.board[x][y] = "0";
				board.fB1.xFou = -200;
				board.fB1.yFou = -200;
				break;
			case "fB2":
				board.board[x][y] = "0";
				board.fB2.xFou = -200;
				board.fB2.yFou = -200;
				break;
			case "dB":
				board.board[x][y] = "0";
				board.dB.xDame = -200;
				board.dB.yDame = -200;
				break;
			case "rB":
				board.board[x][y] = "0";
				board.rB.xRoi = -200;
				board.rB.yRoi = -200;
				break;
			case "pB1":
				board.board[x][y] = "0";
				board.pB1.xPion = -200;
				board.pB1.yPion = -200;
				break;
			case "pB2":
				board.board[x][y] = "0";
				board.pB2.xPion = -200;
				board.pB2.xPion = -200;
				break;
			case "pB3":
				board.board[x][y] = "0";
				board.pB3.xPion = -200;
				board.pB3.xPion = -200;
				break;
			case "pB4":
				board.board[x][y] = "0";
				board.pB4.xPion = -200;
				board.pB4.xPion = -200;
				break;
			case "pB5":
				board.board[x][y] = "0";
				board.pB5.xPion = -200;
				board.pB5.xPion = -200;
				break;
			case "pB6":
				board.board[x][y] = "0";
				board.pB6.xPion = -200;
				board.pB6.xPion = -200;
				break;
			case "pB7":
				board.board[x][y] = "0";
				board.pB7.xPion = -200;
				board.pB7.xPion = -200;
				break;
			case "pB8":
				board.board[x][y] = "0";
				board.pB8.xPion = -200;
				board.pB8.xPion = -200;
				break;
		}
	}
}
