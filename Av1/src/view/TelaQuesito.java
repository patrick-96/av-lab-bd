package view;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QuesitoConsultaController;
import model.Quesito;

public class TelaQuesito {

	public JFrame frame;
	private JTable table_Quesito;
	private JScrollPane scrollPane_1;
	static JComboBox<Quesito> comboBox_q;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaQuesito window = new TelaQuesito(comboBox_q);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaQuesito(JComboBox<Quesito> comboBox_q) {
		this.comboBox_q = comboBox_q;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 300);
				frame.getContentPane().setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 736, 239);
		frame.getContentPane().add(scrollPane_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);

		table_Quesito = new JTable();
		scrollPane.setViewportView(table_Quesito);
		DefaultTableModel modelo=new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
					"Escola", "Quesito", "1\u00BA_Jurado", "2\u00BA_Jurado", "3\u00BA_Jurado", "4\u00BA_Jurado", "5\u00BA_Jurado", "Menor Descartadas", "Menor Descartada", "Total"
				}
			);
		table_Quesito.setModel(modelo);
		
		/*DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "Escola", "Quesito", "Maior descartada", "Menor Descartada", "Total" });*/
		QuesitoConsultaController qcController=new QuesitoConsultaController(table_Quesito, comboBox_q);
		qcController.tabelaVerQuesito();
	}
}
