import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVUtils {
  private static final String CSV_HEADER = "ID|Name|Department|Salary";
  
  public static void writeToCSV(List<Employee> employees, String filePath) {
    try (FileWriter writer = new FileWriter(filePath)) {
      writer.append(CSV_HEADER).append("\n");
      
      for (Employee employee : employees) {
        writer.append(String.valueOf(employee.getId())).append("|");
        writer.append(employee.getName()).append("|");
        writer.append(employee.getDepartment()).append("|");
        writer.append(String.valueOf(employee.getSalary())).append("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
