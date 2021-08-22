import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario {

	//private JFrame frame;

	public static void main(String[] args) {
		JFrame f = new JFrame();
			f.setTitle("Janela"); // Nome da Janela
			f.setSize(300, 200); // Tamanho da Janela
			f.setLocation(500, 300);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para fechar apois o uso.:
			
		
			
	           JPanel p = new JPanel();  //para adicionar dentro do painel
	           
	           JLabel l = new JLabel("Digite seu nome: "); //para adicionar um texto
	           p.add(l);
	           
	           JTextField t = new JTextField(10); // caixa de texto para a pessoa digitar.
	           p.add(t);
	           
	           JButton b = new JButton("OK");
	           BotaoAction action = new BotaoAction(t);
	           b.addActionListener(action);
	           p.add(b);
	           
	           
	           
	           
	           
	        f.add(p);
	       	f.setVisible(true);                                 
	}
}
