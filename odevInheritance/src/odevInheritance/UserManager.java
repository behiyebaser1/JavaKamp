package odevInheritance;

public class UserManager {
	
	
	public void add(User user) {
		
		System.out.println(user.getFirstName() +" " + user.getLastName() +" sisteme eklendi.");
		
	}
	
	public void addMultiple(User[] user) {
		
		for(User users  : user) {
			
			add(users);
			
		}
		
	}
	
	public void list(User[] user) {
		

		System.out.println("\nSistemdeki e�itmen ve ��renciler : \n");
		
		for(User users : user) {
			
			System.out.println(users.getFirstName() +" " + users.getLastName() );
			
		}
	
	}
	

}
