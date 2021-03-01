import java.util.ArrayList;

public class ClassRoom {
		private String _name;
		private Teacher _mentor;
		private ArrayList<Student> _listOfStudents;

		public ClassRoom(String name, Teacher mentor, ArrayList<Student> listOfStudents) {
				this._name = name;
				this._mentor = mentor;
				this._listOfStudents = listOfStudents;
		}

}
