import javax.swing.*;

public class Main {
		public static void main(String[] args) {
				//Start things of
				JFrame frame = new JFrame();
				JPanel panel = new JPanel();
				JButton studentRegistrationBtn = new JButton();
				JButton teacherRegistrationBtn = new JButton();


				//Setting of the things
				//Student
				studentRegistrationBtn.setText("Register a student");
//				studentRegistrationBtn.setAction();

				//Teacher
				teacherRegistrationBtn.setText("Register a Teacher");

				frame.setTitle("Registrations");
				frame.setSize(400, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);

				//Adding the things
				panel.add(studentRegistrationBtn);
				panel.add(teacherRegistrationBtn);
				frame.add(panel);
		}


}
