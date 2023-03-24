package application;

import java.awt.Button;

import javax.swing.JOptionPane;

import entitie.Piece;

public class GameEngine {
	public boolean qualJogador = true;
	public int rodadas = 0;
	
	public boolean verificaGanhador(Button b1,Button b2,Button b3,Button b4,Button b5,Button b6,Button b7,Button b8,Button b9, Piece p) {
		if(//horizontal
				b1.getLabel()==b2.getLabel() && b2.getLabel()==b3.getLabel() && b1.getLabel()!="" && b2.getLabel() != "" && b3.getLabel()!="" ||
				b4.getLabel()==b5.getLabel() && b5.getLabel()==b6.getLabel() && b4.getLabel()!="" && b5.getLabel() != "" && b6.getLabel()!=""||
				b7.getLabel()==b8.getLabel() && b8.getLabel()==b9.getLabel() && b7.getLabel()!="" && b8.getLabel() != "" && b9.getLabel()!=""||
				//vertical
				b1.getLabel()==b4.getLabel() && b4.getLabel()==b7.getLabel() && b1.getLabel()!="" && b4.getLabel() != "" && b7.getLabel()!=""||
				b2.getLabel()==b5.getLabel() && b5.getLabel()==b8.getLabel() && b2.getLabel()!="" && b5.getLabel() != "" && b8.getLabel()!=""||
				b3.getLabel()==b6.getLabel() && b6.getLabel()==b9.getLabel() && b3.getLabel()!="" && b6.getLabel() != "" && b9.getLabel()!=""||
				//diagonal
				b1.getLabel()==b5.getLabel() && b5.getLabel()==b9.getLabel() && b1.getLabel()!="" && b5.getLabel() != "" && b9.getLabel()!=""||
				b3.getLabel()==b5.getLabel() && b5.getLabel()==b7.getLabel() && b3.getLabel()!="" && b5.getLabel() != "" && b7.getLabel()!=""
			) {
			JOptionPane.showMessageDialog(null, "Jogador " + p.getPlayerName() + " vencedor");
			return true;
		}else {
			return false;
		}
	}
}
