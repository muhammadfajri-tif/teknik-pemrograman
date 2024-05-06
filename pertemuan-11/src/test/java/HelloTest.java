import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class HelloTest {
  @DisplayName("Hello Test")
  @Test
  void testHello() {
    Assertions.assertEquals(2,2);
  }
}
