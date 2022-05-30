package Jeu;

import javax.swing.*;

public class Main {
	
	public static Chessboard chess;
	
	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame("chess");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(925,950);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(false);
		
		chess = new Chessboard();
		
		fenetre.setContentPane(chess); // Association de la scene à la fenêtre de l'application
		fenetre.setVisible(true);
		
		
		Correspondance coup = new Correspondance();
		String[] b = new String[2];
		
		String gagnant;
		int[] c = new int[2];
		int[] d = new int[2];
		boolean x = true;
		while(x) {
			b = chess.Input();
			
			
			// contrôle de saisie
			if (b[0].length() == 4) {
				if(b[0].charAt(0) == 's' & b[0].charAt(1) == 't' & b[0].charAt(2) == 'o' & b[0].charAt(3) == 'p') {
					x = false;
					c[0] = -1;
					c[1] = -1;
					d[0] = -1;
					d[1] = -1;
				}
			}
			else if (b[1].length() == 4) {
				if(b[1].charAt(0) == 's' & b[1].charAt(1) == 't' & b[1].charAt(2) == 'o' & b[1].charAt(3) == 'p') {
					x = false;
					c[0] = -1;
					c[1] = -1;
					d[0] = -1;
					d[1] = -1;
				}
			}
			else if (b[0].length() <= 1 | b[1].length() <= 1) {
				c[0] = 0;
				c[1] = 0;
				d[0] = 0;
				d[1] = -1;
			}
			else {
				c = chess.Coordonne(b[0]);
				d = chess.Coordonne(b[1]);
			}
			
			
			// savoir si stop / case invalide / ou case valide
			if(c[0] == -1 & c[1] == -1 & d[0] == -1 & d[1] == -1) {
				JOptionPane.showMessageDialog(fenetre, "partie mise en arrêt");
			}
			else if(c[0] == -1 | c[1] == -1 | d[0] == -1 | d[1] == -1) {
				JOptionPane.showMessageDialog(fenetre, "Case incorrecte");
			}
			else {
				coup.ProchainCoup(chess, c[0], c[1], d[0], d[1]);
			}
			
			gagnant = chess.QuiAGagne();
			
			if (gagnant == "blanc") {
				JOptionPane.showMessageDialog(fenetre, "Les blancs ont gagnés");
				x = false;
			}
			else if (gagnant == "noir") {
				JOptionPane.showMessageDialog(fenetre, "Les noirs ont gagnés");
				x = false;
			}
			
			fenetre.setContentPane(chess); // Association de la scene à la fenêtre de l'application
		}
		
    }
}

