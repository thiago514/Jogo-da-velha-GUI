package application;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import entitie.Piece;

public class UI extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	public Button exit;
	private GameEngine engine = new GameEngine();
	private String nomeX = JOptionPane.showInputDialog("Digite o nome do jogador X");
	private String nomeY = JOptionPane.showInputDialog("Digite o nome do jogador Y");
	private Piece X = new Piece("X", nomeX);
	private Piece Y = new Piece("O", nomeY);
	private String vezJogador = "Vez do jogador " + ((engine.qualJogador) ? X : Y).getType();
	private JLabel jogador = new JLabel(vezJogador);

	public UI() {
		super("Jogo da velha");
		jogador.setBounds(50, 50, 250, 40);
		b1 = new Button("");
		b1.setBounds(50, 100, 40, 40);
		b2 = new Button("");
		b2.setBounds(100, 100, 40, 40);
		b3 = new Button("");
		b3.setBounds(150, 100, 40, 40);
		b4 = new Button("");
		b4.setBounds(50, 150, 40, 40);
		b5 = new Button("");
		b5.setBounds(100, 150, 40, 40);
		b6 = new Button("");
		b6.setBounds(150, 150, 40, 40);
		b7 = new Button("");
		b7.setBounds(50, 200, 40, 40);
		b8 = new Button("");
		b8.setBounds(100, 200, 40, 40);
		b9 = new Button("");
		b9.setBounds(150, 200, 40, 40);
		exit = new Button("EXIT");
		exit.setBounds(250, 250, 40, 40);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(jogador);
		add(exit);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean jogadaFeita = false;
		if (e.getSource() == b1 && b1.getLabel() == "") {
			b1.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b2 && b2.getLabel() == "") {
			b2.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b3 && b3.getLabel() == "") {
			b3.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b4 && b4.getLabel() == "") {
			b4.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b5 && b5.getLabel() == "") {
			b5.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b6 && b6.getLabel() == "") {
			b6.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b7 && b7.getLabel() == "") {
			b7.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b8 && b8.getLabel() == "") {
			b8.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		} else if (e.getSource() == b9 && b9.getLabel() == "") {
			b9.setLabel(((engine.qualJogador) ? X : Y).getType());
			jogadaFeita = true;

		}
		if (engine.verificaGanhador(b1, b2, b3, b4, b5, b6, b7, b8, b9, ((engine.qualJogador) ? X : Y)))
			limpaCampos();
		if (jogadaFeita) {
			engine.qualJogador = !engine.qualJogador;
			engine.rodadas++;
		}
		vezJogador = "Vez do jogador " + ((engine.qualJogador) ? X : Y).getPlayerName();
		jogador.setText(vezJogador);

	}

	private void limpaCampos() {
		b1.setLabel("");
		b2.setLabel("");
		b3.setLabel("");
		b4.setLabel("");
		b5.setLabel("");
		b6.setLabel("");
		b7.setLabel("");
		b8.setLabel("");
		b9.setLabel("");
	}

}
