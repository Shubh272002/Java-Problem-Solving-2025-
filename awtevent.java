import java.awt.*;
import java.awt.event.*;

public class awtevent extends Frame{
	Button button;
	
	awtevent(){
		setTitle("AWT Events");
		setSize(300,200);
		setLayout(new FlowLayout());
		
		
		button = new Button("CLick Me");
		
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Button Clicked");
			}
		});
		
		
		add(button);
		
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
			
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new awtevent();
	}
	
	
}