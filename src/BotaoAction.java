import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

// Criando o evento;

public class BotaoAction implements ActionListener{
	
	private static final String JOptionePane = null;
	private JTextField t;
	
	public BotaoAction(JTextField t) {
		this.t = t;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String nome = t.getText(); // retorna a mensagem da caixa de texto.
		JOptionPane.showMessageDialog(null, "Foi digitado: "+nome);
		
		
		
	}

}
