public class Parttime extends Employee {
  public Parttime(String nama, String namaDepartmen){
    super(nama, namaDepartmen);
  }
  
  // Kasus Nomor 2
  @Override
  public int getSalary() {
    return super.getSalary();
  }
  
  @Override
  public String toString() {
    return super.toString() +
               "\nSalary: " + getSalary() +
               "\nTipe pegawai: Parttime\n";
  }
}
