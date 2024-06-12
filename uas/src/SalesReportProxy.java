public class SalesReportProxy implements SalesReport {
  private String summary;
  private DetailedSalesReport detailedSalesReport;
  
  public SalesReportProxy(String summary) {
    this.summary = summary;
  }
  
  @Override
  public String getSummary() {
    return summary;
  }
  
  @Override
  public String getDetailedSalesReport() {
    if (detailedSalesReport == null) {
      detailedSalesReport = new DetailedSalesReport(summary);
    }
    return detailedSalesReport.getDetailedSalesReport();
  }
}
