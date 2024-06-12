import java.util.Arrays;
import java.util.List;
import java.lang.InterruptedException;

public class DetailedSalesReport implements SalesReport {
  private String summary;
  private String detailedSalesReport;
  List<Employee> employees = Arrays.asList(
      new Employee(1, "Ahmad", "Engineering", 10_000_000),
      new Employee(2, "Asep", "Marketing", 10_000_000),
      new Employee(3, "Ujang", "HR", 10_000_000),
      new Employee(4, "Aceng", "Sales", 10_000_000),
      new Employee(53, "Muhammad Fajri", "Engineering", 53 + 10_000_000)
  );
  
  public DetailedSalesReport(String summary) {
    this.summary = summary;
    this.detailedSalesReport = generateDetailedSalesReport();
  }
  
  public String getSummary() {
    return summary;
  }
  
  @Override
  public String getDetailedSalesReport() {
    return detailedSalesReport;
  }
  
  private String generateDetailedSalesReport() {
    // Simulate generating a detailed sales report
    System.out.println("Generating detailed sales report...");
    try {
      String filePath = "/home/fajri/kuliah/teknik-pemrograman/uas/employees.csv"; // linux path
      CSVUtils.writeToCSV(employees, filePath);
      System.out.println("CSV file created: " + filePath);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    return "Detailed sales Report Content";
    
  }
}
