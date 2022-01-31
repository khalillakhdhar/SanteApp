package users;

public class UserImplement extends UserModel implements UserInterface {

	@Override
	public String getAgeCategorie() {
		// TODO Auto-generated method stub
		if(this.getAge()<18)
			return "junior";
		else
			return "sénior";
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
