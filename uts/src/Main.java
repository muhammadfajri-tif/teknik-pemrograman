public class Main {
  public static void main(String[] args) {
    Employee[] employees = new Employee[2];
    employees[0] = new Fulltime("Asep", "Programmer", 2);
    ((Fulltime) employees[0]).setPinjaman(500_000);
    employees[0].setJumlahJamLembur(5);
    
    employees[1] = new Parttime("Ujang", "Programmer");
    employees[1].setJumlahJamLembur(3);
    
    // polymorphism dengan employee
    for (Employee employee : employees) {
      System.out.println(employee.toString());
    }
  }
}
