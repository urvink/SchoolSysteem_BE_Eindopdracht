
import java.time.LocalDate;
import java.util.Date;


public abstract class User {
		private String _name;
		private LocalDate _dateOfBirth;

		/**
		 * @param name
		 * @param dateOfBirth (format: dd/MM/yyyy)
		 */
		public User(String name, Date dateOfBirth) {
				this._name = name;
//				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//				String formattedDOB = dateFormat.format(dateOfBirth);
				//this._dateOfBirth = get_dateOfBirth(dateOfBirth.getYear(),dateOfBirth.getMonth(),dateOfBirth.getDayOfMonth());
		}

		public String get_name() {
				return _name;
		}

		public void set_name(String _name) {
				this._name = _name;
		}

		public LocalDate get_dateOfBirth() {
				return _dateOfBirth;
		}

		public void set_dateOfBirth(LocalDate _dateOfBirth) {
				this._dateOfBirth = _dateOfBirth;
		}
}
