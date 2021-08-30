package calculadora;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class Calc extends JFrame {

	public Calc() throws Exception { //declaraçao do construtor
		super("Calculadora");// Super infoca o construtor da SUPER classe
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//UImanage para ficar com cara Windows.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// para fechar qdo teminar,
		setSize(350, 350);// tamanho da janela
		setLocation(400, 200);// localizaçao da janela
		
		setLayout (new BorderLayout());// para colocar o painel na parte superior
		
		
		//para pegar informaçao CLASSE(TextPanel) que esta o painel 
		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);
		
		//para criar os paineis dos numeros e dos operadores.
		JPanel digitsPanel = new JPanel();
		digitsPanel.setLayout(new BorderLayout());
		digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
		digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));
		
		
		
		add(BorderLayout.CENTER, digitsPanel);
		
		setVisible(true);//para aparecer a janela.
		
	}
       public static void main(String[] args) throws Exception {
    	   new Calc();

}
}

