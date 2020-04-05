package directoryManagement;

public class PersonnelFactory{

	public Person createPersonnel(String input, String first, String middle, String last, int id, double salary) {
		
		if (input == null) {
			return null;
		}
		
		if (input.equals("Employee")) {
			return new Employee(last, first, middle, id, salary);
		}
		else {
			return null;
		}
	}
	
	public Person createPerson(String last, String first) {
		return new Person (last, first, " ");
	}
}
