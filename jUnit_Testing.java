import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class jUnit_Testing {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  double points[][] = {{0.0, 0.0, 0.0}, {1.0, 0.0, 0.0}, {5.0, 0.0, 0.0}};
  int[] lines = {0, 1};
  Calculations d = new Calculations();

  @Test
  void closestPoints() {
    Assert.assertArrayEquals(d.closestPoints(points), lines);
  }

  @Test
  void getPoints() {
    Assert.assertTrue(d.getPoints(points) == points);
  }

  @Test
  void distance() {
    Assert.assertTrue(d.distance(0, 1, 0, 0, 0, 0) == 1);
  }

}
