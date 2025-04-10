package accessanotherpkg;

import accessspecifier.AccessExample;

public class NewAccess extends AccessExample {

	public static void main(String[] args) {
		NewAccess access=new NewAccess();
		access.show();
		access.showprotected();

	}

}
