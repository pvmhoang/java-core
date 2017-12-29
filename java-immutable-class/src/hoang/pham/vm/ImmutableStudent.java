/**
 * 
 */
package hoang.pham.vm;

/**
 * @author hoangpvm
 *
 */
public class ImmutableStudent {
	
	private final int id;
	private final String name;
	private final Age age;
	
	/**
	 * @param id
	 * @param name
	 */
	public ImmutableStudent(int id, String name, Age age) {
		this.id = id;
		this.name = name;
		this.age = cloneAgeObj(age);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public Age getAge() {
		Age cloneAge = new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMonth(this.age.getMonth());
		cloneAge.setYear(this.age.getYear());
		return cloneAge;
	}
	
	Age cloneAgeObj (Age origin){
		Age age = new Age();
		age.setDay(origin.getDay());
		age.setMonth(origin.getMonth());
		age.setYear(origin.getYear());
		return age;
	}
}

