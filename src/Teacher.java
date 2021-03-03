import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Teacher extends User {
		private ArrayList<String> _curriculum;
		private ClassRoom _mentor;

		public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum) {
				super(name, dateOfBirth);
				this._curriculum = curriculum;
		}

		public Teacher(String name, Date dateOfBirth, ArrayList<String> curriculum, ClassRoom mentor) {
				super(name, dateOfBirth);
				this._curriculum=curriculum;
				this._mentor = mentor;
		}

		public ArrayList<String> get_curriculum() {
				return _curriculum;
		}

		public void set_curriculum(ArrayList<String> _curriculum) {
				this._curriculum = _curriculum;
		}

		public void set_mentor(ClassRoom _mentor) {
				this._mentor = _mentor;
		}

		public static void main(String[] args) {
				ArrayList<String> java = new ArrayList<String>();
				java.add("Java");

				Teacher igor = new Teacher("Igor", new Date(1950-03-02), java);

//				System.out.println("Igor: "+igor.get_curriculum());
		}
}

