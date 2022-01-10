import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Test extends JFrame implements ActionListener {
	JTextField CampoTexto;
	JButton iniciar;
	public Test(){
		  setLayout(null);

		    //Tamaño de la ventana
		    setBounds(10,10,400,300);

		    //Título
		    setTitle("Automata v1.0");

		    //No redimensionable
		    setResizable(true);

		    //Cerrar proceso al cerrar la ventana
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		    setearInicio();
	}
	public void setearInicio(){
		CampoTexto = new JTextField();
		CampoTexto.setBounds(0,0,250,40);
		add(CampoTexto);
		
		iniciar= new JButton("Iniciar");
		iniciar.setBounds(0,80, 150,80);
		add(iniciar);
		iniciar.addActionListener(this);
	}
	public void iniciarRobot() throws AWTException, InterruptedException{
		Thread.sleep(3000);
		String TextoActual=CampoTexto.getText();
		ToDo Analiza = new ToDo(TextoActual);
		Analiza.comparaLetras();
	}
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
test.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	try {
		iniciarRobot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
