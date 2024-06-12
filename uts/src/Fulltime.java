public class Fulltime extends Employee implements Koperasi {
  private int tunjanganJabatan;
  private final int tunjanganKomunikasi;
  private int jumlahAnak;
  private int tunjanganAnak;
  private int pinjaman;
  
  public Fulltime(String nama, String namaDepartmen, int jumlahAnak) {
    super(nama, namaDepartmen);
    // mengatur tunjangan jabatan
    switch (namaDepartmen.toLowerCase()) {
      case "manager":
        this.tunjanganJabatan = 5_000_000;
        break;
      case "programmer":
        this.tunjanganJabatan = 2_000_000;
        break;
      case "analis":
        this.tunjanganJabatan = 1_000_000;
        break;
      default:
        this.tunjanganJabatan = 0;
        break;
    }
    
    // Kasus Nomor 6: Tunjangan Komunikasi
    this.tunjanganKomunikasi = 500_000;
    
    // mengatur tunjangan anak
    this.jumlahAnak = jumlahAnak;
    if (jumlahAnak > 2) {
      this.tunjanganAnak = 200_000 * 2;
    }else if(jumlahAnak > 0){
      this.tunjanganAnak = 200_000 * jumlahAnak;
    }else {
      this.tunjanganAnak = 0;
    }
    
    this.pinjaman = 0;
  }
  
  // Kasus Nomor 1
  public int getSalary() {
    return getGajiPokok() + getTunjanganLembur() + getTunjanganJabatan() + getTunjanganKomunikasi() + getTunjanganAnak() - loanMonthly();
  }
  
  @Override
  public int loanMonthly() {
    return getPinjaman();
  }
  
  public int getTunjanganJabatan() {
    return tunjanganJabatan;
  }
  
  public void setTunjanganJabatan() {
    // Kasus Nomor 4: Tunjangan Jabatan
    switch (getDepartemen().getName().toLowerCase()) {
      case "manager":
        this.tunjanganJabatan = 5_000_000;
        break;
      case "programmer":
        this.tunjanganJabatan = 2_000_000;
        break;
      case "analis":
        this.tunjanganJabatan = 1_000_000;
        break;
      default:
        this.tunjanganJabatan = 0;
        break;
    }
  }
  
  public int getTunjanganKomunikasi() {
    return tunjanganKomunikasi;
  }
  
  public int getTunjanganAnak() {
    return tunjanganAnak;
  }
  
  protected void setTunjanganAnak(int jumlahAnak) {
     // Kasus Nomor 8: Tunjangan anak
    if (jumlahAnak > 2) {
      this.tunjanganAnak = 500_000 * 2;
    } else if (jumlahAnak > 0) {
      this.tunjanganAnak = 500_000 * jumlahAnak;
    } else {
      this.tunjanganAnak = 0;
    }
  }
  
  public int getJumlahAnak() {
    return jumlahAnak;
  }
  
  public void setJumlahAnak(int jumlahAnak) {
    this.jumlahAnak = jumlahAnak;
    setTunjanganAnak(jumlahAnak);
  }
  
  public int getPinjaman() {
    return pinjaman;
  }
  
  public void setPinjaman(int pinjaman) {
    this.pinjaman += pinjaman;
  }
  
  // method toString untuk menampilkan semua field dengan override method parent nya
  @Override
  public String toString() {
    return super.toString() +
               "\nTunjangan Jabatan : " + getTunjanganJabatan() +
               "\nTunjangan Komunikasi : " + getTunjanganKomunikasi() +
               "\nTunjangan Anak : " + getTunjanganAnak() +
               "\nPinjaman : " + getPinjaman() +
               "\nGaji Total : " + getSalary() +
               "\nTipe Pegawai : Fulltime\n";
  }
}
