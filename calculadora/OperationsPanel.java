package calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OperationsPanel extends JPanel implements ActionListener {
	
	private JTextField txtText;
	
	private char op;
	private double value1;
	private double value2;
	
	private JButton btnAdd; 
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnEq;
	private JButton btnClear;
	
	public OperationsPanel(JTextField txtText) {
		this.txtText = txtText;
		
		setLayout(new GridLayout(3, 2));
		
		btnAdd = new JButton ("+");
		btnAdd.addActionListener(this);
		add(btnAdd);
		
		btnSub = new JButton ("-");
		btnSub.addActionListener(this);
		add(btnSub);
		
		btnMult = new JButton ("*");
		btnMult.addActionListener(this);
		add(btnMult);
		
		btnDiv = new JButton ("/");
		btnDiv.addActionListener(this);
		add(btnDiv);
		
		btnEq = new JButton ("=");
		btnEq.addActionListener(this);
		add(btnEq);
		
		btnClear = new JButton ("C");
		btnClear.addActionListener(this);
		add(btnClear);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// para fazer o calculo
		if(txtText.getText().isEmpty()) {
			return;
		}
		
		JButton btn = (JButton) e.getSource();// o botao que disparou o evento
		
		if (btn == btnClear) {//para limpa a tela.
			op = '\u0000';
			txtText.setText("");
			
		} else if (btn == btnEq) {// partir para a conta
			value2 = Double.parseDouble(txtText.getText());
			
			double result = 0.0;
			
			if (op == '+') {
				result = value1 + value2;
			} else if (op == '-') {
				result = value1 - value2;
			} else if (op == '*') {
				result = value1 * value2;
			} else if (op == '/') {
				result = value1 / value2;
			} // faz a operaçao e mostra o resultado ;
			txtText.setText(String.valueOf(result));
			op = '\u0000';
			value1 = result;
			value2 = 0;
		} else { 
			op = btn.getText().charAt(0);
			value1 = Double.parseDouble(txtText.getText());
			txtText.setText("");
	}
}

	

}
