import java.util.ArrayList;

public abstract class School {
		private ArrayList<Teacher> _listOfTeachers;
		private ArrayList<Student> _listOfStudents;
		private String _schoolType;
		private ArrayList<String> _curriculum;
		private ArrayList<ClassRoom> _classRoom;

		public School(ArrayList<Teacher> listOfTeachers, ArrayList<Student> listOfStudents, String schoolType, ArrayList<String> curriculum, ArrayList<ClassRoom> classRoom) {
			this._listOfTeachers = listOfTeachers;
			this._listOfStudents = listOfStudents;
			this._schoolType = schoolType;
			this._curriculum = curriculum;
			this._classRoom = classRoom;
		}

		public void addStudent(Student student){
			get_listOfStudents().add(student);
		}

		public void addTeacher(Teacher teacher){
			get_listOfTeachers().add(teacher);
		}

		public ArrayList<Teacher> get_listOfTeachers() {
				return _listOfTeachers;
		}

		public void set_listOfTeachers(ArrayList<Teacher> _listOfTeachers) {
				this._listOfTeachers = _listOfTeachers;
		}

		public ArrayList<Student> get_listOfStudents() {
				return _listOfStudents;
		}

		public void set_listOfStudents(ArrayList<Student> _listOfStudents) {
				this._listOfStudents = _listOfStudents;
		}

		public String get_schoolType() {
				return _schoolType;
		}

		public void set_schoolType(String _schoolType) {
				this._schoolType = _schoolType;
		}

		public ArrayList<String> get_curriculum() {
				return _curriculum;
		}

		public void set_curriculum(ArrayList<String> _curriculum) {
				this._curriculum = _curriculum;
		}

		public ArrayList<ClassRoom> get_classRoom() {
				return _classRoom;
		}

		public void set_classRoom(ArrayList<ClassRoom> _classRoom) {
				this._classRoom = _classRoom;
		}
}
