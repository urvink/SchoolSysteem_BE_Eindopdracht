import java.time.LocalDate;
import java.util.ArrayList;


public class Student extends User{
		//Props
		private String _nationality;
		private ClassRoom _class;
		private ArrayList<String> _grades = new ArrayList<>();
		private String _profile;
		private ArrayList<LocalDate> _datesAbsent;

		//Constructor
		public Student(String name, LocalDate dateOfBirth, String nationality) {
				super(name, dateOfBirth);
				this._nationality = nationality;
		}

		public Student(String name, LocalDate dateOfBirth, String nationality, String profile) {
				super(name, dateOfBirth);
				this._nationality = nationality;
				this._profile = profile;
		}

		public String get_nationality() {
				return _nationality;
		}

		public void set_nationality(String _nationality) {
				this._nationality = _nationality;
		}

		public ClassRoom get_class() {
				return _class;
		}

		public void set_class(ClassRoom _class) {
				this._class = _class;
		}

		public ArrayList<String> get_grades() {
				return _grades;
		}

		public void set_grades(ArrayList<String> _grades) {
				this._grades = _grades;
		}

		public String get_profile() {
				return _profile;
		}

		public void set_profile(String _profile) {
				this._profile = _profile;
		}

		public ArrayList<LocalDate> get_datesAbsent() {
				return _datesAbsent;
		}

		public void set_datesAbsent(ArrayList<LocalDate> _datesAbsent) {
				this._datesAbsent = _datesAbsent;
		}
}
