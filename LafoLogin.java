
public class LafoLogin {

	public boolean login(String username, String password) {

		if (username == null || password == null) {
			return false;
		}

		else if (username.equals("") || password.equals("")) {
			return false;
		}

		else if (username.length() < 10) {
			return true;
		} else {
			return false;
		}
	}

}
