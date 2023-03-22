package application;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UI extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,exit;
	String XouO = "X";
	String jogadorXouO = "Vez do jogador " + XouO;
	JLabel jogador = new JLabel(jogadorXouO);
	int qualJogador = 1, rodadas = 0;
	UI(){
	    super("Jogo da velha");
	    jogador.setBounds(50, 50, 150, 40);
	    b1=new Button("");  
	    b1.setBounds(50,100,40,40);  
	    b2=new Button("");  
	    b2.setBounds(100,100,40,40);  
	    b3=new Button("");  
	    b3.setBounds(150,100,40,40);  
	    b4=new Button("");  
	    b4.setBounds(50,150,40,40);  
	    b5=new Button("");  
	    b5.setBounds(100,150,40,40);  
	    b6=new Button("");  
	    b6.setBounds(150,150,40,40);  
	    b7=new Button("");  
	    b7.setBounds(50,200,40,40);  
	    b8=new Button("");  
	    b8.setBounds(100,200,40,40);  
	    b9=new Button("");  
	    b9.setBounds(150,200,40,40);  
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
	      
	    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(jogador);add(exit);  
	    setSize(300,300);  
	    setLayout(null);  
	    setVisible(true);  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean modificado = false;
		if(e.getSource() == b1 && b1.getLabel()=="") {
			b1.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b2 && b2.getLabel()=="") {
			b2.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b3 && b3.getLabel()=="") {
			b3.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b4 && b4.getLabel()=="") {
			b4.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b5 && b5.getLabel()=="") {
			b5.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b6 && b6.getLabel()=="") {
			b6.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b7 && b7.getLabel()=="") {
			b7.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b8 && b8.getLabel()=="") {
			b8.setLabel(XouO);
			modificado = true;

		}else if(e.getSource()==b9 && b9.getLabel()=="") {
			b9.setLabel(XouO);
			modificado = true;

		}
		if(rodadas==0 && modificado) {
			qualJogador *=-1;
		}
		verificaGanhador();
		if(qualJogador == 1 && modificado) {
			XouO = "X";
			qualJogador *= -1;
			rodadas++;
		}else if(modificado){
			XouO="O";
			qualJogador *= -1;
			rodadas++;
		}
		jogadorXouO = "Vez do jogador " + XouO;
		jogador.setText(jogadorXouO);
		
		
	}
	
	private void verificaGanhador() {
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
			JOptionPane.showMessageDialog(null, "Jogador " + XouO + " vencedor");
			limpaCampos();
		}
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
