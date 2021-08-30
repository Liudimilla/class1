package calculadora;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {
	private JTextField txtNumber;//criaçao de caixa de textp
	// criar um painel (painel superior que ira receber os dados) JFrame
	public TextPanel () {
		setLayout(new FlowLayout());
		
		txtNumber = new JTextField(15);// instaciar a caixa de texto
		txtNumber.setHorizontalAlignment(JTextField.RIGHT);//alinha a caixa de texto
		txtNumber.setEnabled(false);//p/ evitar que seja digita e somente receber o comando do teclado.
		add(txtNumber);
		
		
	}
	public JTextField getTxtNumber() { // para passar informaçoes para outra classe.
		return txtNumber;
	}

}
