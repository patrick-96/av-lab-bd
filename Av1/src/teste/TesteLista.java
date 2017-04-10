package teste;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ComboQuesitoController;
import model.Quesito;
import persistence.QuesitoDao;

public class TesteLista {
	
	static JTextField textFieldNota;
	static JLabel lblEscola;
	JLabel lblJurado;
	static JLabel lblQuesito;
	static JLabel lblNota;
	static JComboBox<Quesito> comboBox_q;
	public TesteLista(JTextField textFieldNota,
			JLabel lblEscola,JLabel lblJurado, JLabel lblQuesito, JLabel lblNota,
			JComboBox<Quesito> comboBox_q){
		this.textFieldNota=textFieldNota;
		this.lblEscola=lblEscola;
		this.lblJurado=lblJurado;
		this.lblQuesito=lblQuesito;
		this.lblNota=lblNota;
		this.comboBox_q=comboBox_q;
		
	}
	public static void main(String[]args) throws ClassNotFoundException, SQLException{
		QuesitoDao q=new QuesitoDao();
		List<Quesito> que =q.consultaQuesitos();
		for(Quesito quesito : que){
			System.out.println("id : "+quesito.getId_q());
			System.out.println("nome : "+quesito.getNome_q());
		
			
		}
	

	JLabel lblEscolaJurado = null;
	ComboQuesitoController qcot=new ComboQuesitoController(textFieldNota, lblEscola, lblEscolaJurado, lblQuesito, lblNota, comboBox_q);

if(comboBox_q.getSelectedItem().toString()==""){
System.out.println("é null");	
}
else{
	System.out.println("não é null");
}
	
}
}
