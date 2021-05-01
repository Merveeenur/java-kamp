package odev2;

public class UserManager {
	public void add(User user) {
	
		System.out.println( user.getFirstName() +" adlý kullanýcý sisteme eklendi");
	}
	public void delete(User user) {
		System.out.println( user.getFirstName() +" adlý kullanýcý sistemden silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() +" adlý kullanýcý sistemde güncellendi");
	}

}
