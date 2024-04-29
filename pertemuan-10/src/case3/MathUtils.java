package case3;

public class MathUtils {
  public static int factorial(int n) throws IllegalArgumentException {
    // throw error if param n is less than 0
    if(n <= 0)
      throw new IllegalArgumentException("Value must be a positive number.");
    // throw error if param n is more than 16
    if(n > 16)
      throw new IllegalArgumentException("Value must be less than equals 16.");
    
    int fac = 1;
    for (int i=n; i>0; i--)
      fac *= i;
    
    return fac;
  }
}
