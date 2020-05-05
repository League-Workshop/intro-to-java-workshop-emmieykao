package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null, "What is your name?");
	JOptionPane.showMessageDialog(null, "Hello and welcome to the classroom, " + name + ". How are you today?");
}
}
