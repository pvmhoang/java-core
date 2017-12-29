/**
 * 
 */
package hoang.pham.vm;

/**
 * @author hoangpvm
 *
 */
public class App {
	
	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1984);
		
		ImmutableStudent student = new ImmutableStudent(1, "Hoang", age);
		System.out.println("Hoang age year before modification = " + student.getAge().getYear());
		//age.setYear(1990);
		student.getAge().setYear(1990);
		System.out.println("Hoang age year after modification = " + student.getAge().getYear());
	}
	
}
