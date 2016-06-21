package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class KaupController {
			public static void main(String[] args) {
				
				Kaup k=new Kaup();//
				while (true) {
					switch (JOptionPane.showInputDialog("1: 0:")) {
					case "1":
						
						String name=JOptionPane.showInputDialog("");
						String height=JOptionPane.showInputDialog("");
						String weight=JOptionPane.showInputDialog("");
						k.setName(name);
						k.setHeight(height);
						k.setWeight(weight);
						
						JOptionPane.showMessageDialog(null,k.execute(name));
						break;
						
					default:JOptionPane.showConfirmDialog(null, "Close OK?");
						break;
					}
				}
			}
	
	
}