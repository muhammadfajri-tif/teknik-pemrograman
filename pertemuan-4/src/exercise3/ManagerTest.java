package exercise3;

public class ManagerTest {
	public static void main (String[] args){
		Manager[] staff = new Manager[3];
		staff[0] = new Manager("Richard Stallman", 2000000, 1, 10, 1989);
		staff[1] = new Manager("Linus Torvald", 2500000, 1, 12, 1991);
		staff[2] = new Manager("Alan Turing", 3000000, 1, 11, 1993);
		
		Sortable.shell_sort(staff);
		int i;
		for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();
	}
}
