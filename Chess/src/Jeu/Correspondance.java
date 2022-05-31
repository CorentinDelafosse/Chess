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
			if (board.pN1.upgrade.equals("dame")) {
				board.pN1.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN1.upgrade.equals("cavalier")) {
				board.pN1.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN1.upgrade.equals("fou")) {
				board.pN1.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN1.upgrade.equals("tour")) {
				board.pN1.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN1.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN2":
			if (board.pN2.upgrade.equals("dame")) {
				board.pN2.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN2.upgrade.equals("cavalier")) {
				board.pN2.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN2.upgrade.equals("fou")) {
				board.pN2.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN2.upgrade.equals("tour")) {
				board.pN2.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN2.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN3":
			if (board.pN3.upgrade.equals("dame")) {
				board.pN3.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN3.upgrade.equals("cavalier")) {
				board.pN3.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN3.upgrade.equals("fou")) {
				board.pN3.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN3.upgrade.equals("tour")) {
				board.pN3.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN3.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN4":
			if (board.pN4.upgrade.equals("dame")) {
				board.pN4.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN4.upgrade.equals("cavalier")) {
				board.pN4.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN4.upgrade.equals("fou")) {
				board.pN4.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN4.upgrade.equals("tour")) {
				board.pN4.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN4.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN5":
			if (board.pN5.upgrade.equals("dame")) {
				board.pN5.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN5.upgrade.equals("cavalier")) {
				board.pN5.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN5.upgrade.equals("fou")) {
				board.pN5.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN5.upgrade.equals("tour")) {
				board.pN5.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN5.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN6":
			if (board.pN6.upgrade.equals("dame")) {
				board.pN6.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN6.upgrade.equals("cavalier")) {
				board.pN6.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN6.upgrade.equals("fou")) {
				board.pN6.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN6.upgrade.equals("tour")) {
				board.pN6.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN6.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN7":
			if (board.pN7.upgrade.equals("dame")) {
				board.pN7.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN7.upgrade.equals("cavalier")) {
				board.pN7.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN7.upgrade.equals("fou")) {
				board.pN7.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN7.upgrade.equals("tour")) {
				board.pN7.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN7.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pN8":
			if (board.pN8.upgrade.equals("dame")) {
				board.pN8.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pN8.upgrade.equals("cavalier")) {
				board.pN8.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pN8.upgrade.equals("fou")) {
				board.pN8.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pN8.upgrade.equals("tour")) {
				board.pN8.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pN8.DeplacerPion(board, x, y, x2, y2);
			}
			break;
			
		case "pB1":
			if (board.pB1.upgrade.equals("dame")) {
				board.pB1.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB1.upgrade.equals("cavalier")) {
				board.pB1.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB1.upgrade.equals("fou")) {
				board.pB1.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB1.upgrade.equals("tour")) {
				board.pB1.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB1.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB2":
			if (board.pB2.upgrade.equals("dame")) {
				System.out.print(board.pB2.upgrade);
				board.pB2.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB2.upgrade.equals("cavalier")) {
				System.out.print(board.pB2.upgrade);
				board.pB2.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB2.upgrade.equals("fou")) {
				System.out.print(board.pB2.upgrade);
				board.pB2.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB2.upgrade.equals("tour")) {
				System.out.print(board.pB2.upgrade);
				board.pB2.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				System.out.print(board.pB2.upgrade);
				board.pB2.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB3":
			if (board.pB3.upgrade.equals("dame")) {
				board.pB3.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB3.upgrade.equals("cavalier")) {
				board.pB3.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB3.upgrade.equals("fou")) {
				board.pB3.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB3.upgrade.equals("tour")) {
				board.pB3.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB3.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB4":
			if (board.pB4.upgrade.equals("dame")) {
				board.pB4.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB4.upgrade.equals("cavalier")) {
				board.pB4.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB4.upgrade.equals("fou")) {
				board.pB4.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB4.upgrade.equals("tour")) {
				board.pB4.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB4.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB5":
			if (board.pB5.upgrade.equals("dame")) {
				board.pB5.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB5.upgrade.equals("cavalier")) {
				board.pB5.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB5.upgrade.equals("fou")) {
				board.pB5.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB5.upgrade.equals("tour")) {
				board.pB5.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB5.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB6":
			if (board.pB6.upgrade.equals("dame")) {
				board.pB6.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB6.upgrade.equals("cavalier")) {
				board.pB6.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB6.upgrade.equals("fou")) {
				board.pB6.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB6.upgrade.equals("tour")) {
				board.pB6.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB6.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB7":
			if (board.pB7.upgrade.equals("dame")) {
				board.pB7.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB7.upgrade.equals("cavalier")) {
				board.pB7.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB7.upgrade.equals("fou")) {
				board.pB7.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB7.upgrade.equals("tour")) {
				board.pB7.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB7.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		case "pB8":
			if (board.pB8.upgrade.equals("dame")) {
				board.pB8.DeplacerDame(board, x, y, x2, y2);
			}
			else if (board.pB8.upgrade.equals("cavalier")) {
				board.pB8.DeplacerCavalier(board, x, y, x2, y2);
			}
			else if (board.pB8.upgrade.equals("fou")) {
				board.pB8.DeplacerFou(board, x, y, x2, y2);
			}
			else if (board.pB8.upgrade.equals("tour")) {
				board.pB8.DeplacerTour(board, x, y, x2, y2);
			}
			else {
				board.pB8.DeplacerPion(board, x, y, x2, y2);
			}
			break;
		
		}
	}
	
}
