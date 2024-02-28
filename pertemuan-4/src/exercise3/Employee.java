package exercise3;

public class Employee extends Sortable {
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
	
	public Employee(String n, double s, int day, int month, int year){
		this.name = n;
		this.salary = s;
		this.hireday = day;
		this.hiremonth = month;
		this.hireyear = year;
	}
	
	@Override
	public int compare(Sortable b) {
		Employee eb = (Employee) b;
		if (salary<eb.salary) return -1;
		if (salary>eb.salary) return +1;
		return 0;
	}
	
	public void print(){
		System.out.println(getName() + " " + getSalary() + " " + hireYear());
	}
	
	public void raiseSalary(double byPercent){
		salary *= 1 + byPercent / 100;
	}
	
	public void setHireyear(int hireyear) {
		this.hireyear = hireyear;
	}
	
	public int hireYear(){
		return hireyear;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setHireday(int hireday) {
		this.hireday = hireday;
	}
	
	public int getHireday() {
		return hireday;
	}
	
	public void setHiremonth(int hiremonth) {
		this.hiremonth = hiremonth;
	}
	
	public int getHiremonth() {
		return hiremonth;
	}
	
}
