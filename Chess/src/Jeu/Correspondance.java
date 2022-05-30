package Jeu;

public class Correspondance {
	
	public Correspondance() {
		
	}
	
	public void ProchainCoup(Chessboard board, int x, int y, int x2, int y2) {
		
		switch (board.board[y][x]) {
		
		// déplacement si une tour
		/*case "tN1", "tN2", "tB1", "tB2":
			tour.DeplacerTour(board, x, y, x2, y2);
			break;*/
			
		// déplacement si une tour
		case "tB1":
			board.tB1.DeplacerTour(board, x, y, x2, y2);
			break;
		case "tB2":
			board.tB2.DeplacerTour(board, x, y, x2, y2);
			break;
		case "tN1":
			board.tN1.DeplacerTour(board, x, y, x2, y2);
			break;
		case "tN2":
			board.tN2.DeplacerTour(board, x, y, x2, y2);
			break;
			
			
			
		// déplacement si un fou
		case "fB1":
			board.fB1.DeplacerFou(board, x, y, x2, y2);
			break;
		case "fB2":
			board.fB2.DeplacerFou(board, x, y, x2, y2);
			break;
		case "fN1":
			board.fN1.DeplacerFou(board, x, y, x2, y2);
			break;
		case "fN2":
			board.fN2.DeplacerFou(board, x, y, x2, y2);
			break;

			
			
		// déplacement si un cavalier
		case "cB1":
			board.cB1.DeplacerCavalier(board, x, y, x2, y2);
			break;
		case "cB2":
			board.cB2.DeplacerCavalier(board, x, y, x2, y2);
			break;
		case "cN1":
			board.cN1.DeplacerCavalier(board, x, y, x2, y2);
			break;
		case "cN2":
			board.cN2.DeplacerCavalier(board, x, y, x2, y2);
			break;
			
			
			
		// déplacement si une dame
		case "dB":
			board.dB.DeplacerDame(board, x, y, x2, y2);
			break;
		case "dN":
			board.dN.DeplacerDame(board, x, y, x2, y2);
			break;
						
						
		// déplacement si un roi
		case "rB":
			if ((x == 4 & y == 0) & ((x2 == 0 & y2 == 0) | (x2 == 7 & y2 == 0))){
				board.rB.rock(board, x, y, x2, y2);
			}
			else {
				board.rB.DeplacerRoi(board, x, y, x2, y2);
			}
			break;
		case "rN":
			if ((x == 4 & y == 7) & ((x2 == 0 & y2 == 7) | (x2 == 7 & y2 == 7))){
				board.rN.rock(board, x, y, x2, y2);
			}
			else {
				board.rN.DeplacerRoi(board, x, y, x2, y2);
			}
			break;	
			
			
			
		// déplacement si un pion
		case "pN1":
			board.pN1.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN2":
			board.pN2.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN3":
			board.pN3.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN4":
			board.pN4.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN5":
			board.pN5.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN6":
			board.pN6.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN7":
			board.pN7.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pN8":
			board.pN8.DeplacerPion(board, x, y, x2, y2);
			break;
			
		case "pB1":
			board.pB1.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB2":
			board.pB2.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB3":
			board.pB3.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB4":
			board.pB4.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB5":
			board.pB5.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB6":
			board.pB6.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB7":
			board.pB7.DeplacerPion(board, x, y, x2, y2);
			break;
		case "pB8":
			board.pB8.DeplacerPion(board, x, y, x2, y2);
			break;
		
		}
	}
	
}
