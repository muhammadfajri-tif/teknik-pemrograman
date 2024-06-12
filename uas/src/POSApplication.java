public class POSApplication {
  public static void main(String[] args) {
    SalesReport report = new SalesReportProxy("Sales Summary for Q1 2024");
    
    // access sales summmary
    System.out.println("Sales Summary: " + report.getSummary());
    
    // Detailed report will be generated on demand
    System.out.println("Requesting detailed report...");
    String detailedReport = report.getDetailedSalesReport();
    System.out.println(detailedReport);
  }
}
