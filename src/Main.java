import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.*;

public class Main {
		public static void main(String[] args) {
				//Make JFrame
				JFrame frame = new JFrame();
				JPanel panel = new JPanel();
				JPanel panel2 = new JPanel();
				JLabel labelStudent = new JLabel();
				JTextField textField = new JTextField();

				JButton studentBtn = new JButton();
				JButton teacherBtn = new JButton();

				//Set Values
				frame.setTitle("Registration Area");
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				frame.setSize(600,300);
				frame.setVisible(true);

				panel.setVisible(true);
				panel.setBackground(Color.pink);
				panel.setSize(200, 100);

				panel2.setVisible(true);
				panel2.setBackground(Color.RED);
				panel2.setSize(150,150);

				studentBtn.setText("Student");
				studentBtn.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
										out.println("HEY IK BEN HIER");
						}
				});
				teacherBtn.setText("Teacher");

				textField.setSize(40,10);
				textField.setBounds(10,40,50,100);

				//Adding btn to Frame
				panel.add(studentBtn);
				panel.add(labelStudent);
				panel.add(teacherBtn);
				panel2.add(textField);
				frame.add(panel2);
				frame.add(panel);


		}


}
