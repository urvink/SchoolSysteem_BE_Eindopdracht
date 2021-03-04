import java.util.ArrayList;
import java.util.List;

public abstract class School {
		private ArrayList<Teacher> _listOfTeachers = new ArrayList<Teacher>();
		private ArrayList<Student> _listOfStudents = new ArrayList<Student>();
		private String _schoolType;
		private ArrayList<String> _curriculum;
		private ArrayList<ClassRoom> _classRoom;

		public School(String schoolType, ArrayList<String> curriculum) {
			this._schoolType = schoolType;
			this._curriculum = curriculum;
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
