public class Department {
  private String name;
  
  // contructor untuk mengatur nama department
  public Department(String name) {
    this.name = name;
  }
  
  public void setName(String name) {
    this.name = name.toLowerCase();
  }
  
  public String getName() {
    return name;
  }
  
  public String departmentName() {
    return "Department name is " + name;
  }
  
}
