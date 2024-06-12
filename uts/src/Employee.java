public class Employee {
  private String nama;
  private Department departemen;
  private int gajiPokok;
  private int tunjanganLembur;
  private int jumlahJamLembur;
  
  public Employee(String nama, String namaDepartmen) {
    this.nama = nama;
    this.departemen = new Department(namaDepartmen);
    // Ketentuan Nomor 3: Gaji Pokok
    switch (namaDepartmen.toLowerCase()) {
      case "manager":
        this.gajiPokok = 5_000_000;
        break;
      case "programmer", "analis":
        this.gajiPokok = 3_000_000;
        break;
      default:
        this.gajiPokok = 0;
        break;
    }
  }
  
  // Default salary employee
  public int getSalary() {
    return gajiPokok + (tunjanganLembur * jumlahJamLembur);
  }
  
  public String getNama() {
    return nama;
  }
  
  public void setNama(String nama) {
    this.nama = nama;
  }
  
  public Department getDepartemen() {
    return departemen;
  }
  
  public void setDepartemen(Department departemen) {
    this.departemen = departemen;
  }
  
  public int getGajiPokok() {
    return gajiPokok;
  }
  
  public void setGajiPokok() {
    // Kasus Nomor 3: Gaji Pokok
    switch (departemen.getName().toLowerCase()) {
      case "manager":
        this.gajiPokok = 5_000_000;
        break;
      case "programmer", "analis":
        this.gajiPokok = 3_000_000;
        break;
      default:
        this.gajiPokok = 0;
        break;
    }
  }
  
  public int getTunjanganLembur() {
    return tunjanganLembur;
  }
  
  public void setTunjanganLembur() {
    this.tunjanganLembur = 30_000 * this.jumlahJamLembur;
  }
  
  public int getJumlahJamLembur() {
    return jumlahJamLembur;
  }
  
  public void setJumlahJamLembur(int jumlahJamLembur) {
    this.jumlahJamLembur += jumlahJamLembur;
    setTunjanganLembur();
  }
  
  @Override
  public String toString() {
    return "Employee" +
               "\nnama : " + nama +
               "\ndepartemen :" + departemen.getName() +
               "\ngajiPokok :" + gajiPokok +
               "\ntunjanganLembur :" + tunjanganLembur +
               "\njumlahJamLembur :" + jumlahJamLembur;
  }
}
