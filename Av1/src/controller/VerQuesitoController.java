package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import model.Quesito;
import view.TelaQuesito;

public class VerQuesitoController implements ActionListener{
	JFrame telaApuracao;
	JButton btnVerQuesito;
	static JComboBox<Quesito> comboBox_q;
	
	public VerQuesitoController(JFrame queFrame,JButton btnVerQuesito, JComboBox<Quesito> comboBox_q) {
		this.telaApuracao=queFrame;
		this.btnVerQuesito=btnVerQuesito;
		this.comboBox_q=comboBox_q;
	}
	
	private void montaQuesito(){
		TelaQuesito tq=new TelaQuesito(comboBox_q);
		tq.frame.setVisible(true);
		//TotalDao tdao=new TotalDao();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnVerQuesito){
			montaQuesito();
		//	Escola es=new Escola;
	//consultaTotal(es);
		}
		
	}

	
	
	
}
