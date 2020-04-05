package directoryManagement;
import java.util.*;
public class Personnel {
	private ArrayList<Person> personList;

	public Personnel() {
	   personList = new ArrayList<Person>();
	}
	
	public Person getPersonFromList(int i) {
		return personList.get(i);
	}

	public void addPersonnel(Person p)
	{
		personList.add(p);
	}
	
	public int getPersonListSize() {
		return personList.size();
	}
	
	public boolean compareFirstName(String firstName, int i) {
		if(firstName.equals(personList.get(i).getFirstName()))
			return true;
		
		else
			return false;
	}

	public boolean compareLastName(String lastName, int i) {
		if(lastName.equals(personList.get(i).getLastName()))
			return true;
		else
			return false;
	}
	
	public void printPersonnel(int i) {
		personList.get(i).printName(0);
	}
	
	public void printPersonnel(int i, int order) {
		personList.get(i).printName(order);
	}
}
