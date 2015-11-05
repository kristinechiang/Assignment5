
public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int age;

	public String getfirstName() {
		return this.firstName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Person o) {
		Person p = (Person) o;
		if (age == p.age) {
			return 0;
		} else if (age > p.age) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public boolean equals(Object o) {
		Person p = (Person) o;
		if (age == p.age) {
			return true;
		} else {
			return false;
		}
	}

	public int hashcode() {
		return age;
	}

	public String toString() {
		String str = "FirstName" + firstName + " LastName:" + lastName + " Age:" + age;
		return str;
	}
}
