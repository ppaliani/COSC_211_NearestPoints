
public class Calculations {

  Calculations() {

  }

  // Same as inputArray
  public double[][] getPoints(double[][] points) {
    return points;
  }

  public int[] closestPoints(double points[][]) {
    int p1 = 0;
    int p2 = 1;
    double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0],
        points[p2][1], points[p2][2]);

    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0],
            points[j][1], points[j][2]);
        if (shortestDistance > distance) {
          p1 = i;
          p2 = j;
          shortestDistance = distance;
        }
      }
    }
    int l1 = p1;
    int l2 = p2;
    int[] closestPointsLines = {l1, l2};
    return closestPointsLines;
  }

  // Calculates the distance between 2 given points
  public static double distance(double x1, double x2, double y1, double y2, double z1, double z2) {

    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
  }

  // Same as displayClosestPoints
  public void getResult(int p1, int p2, double[][] points) {
    System.out.println(
        "The closest two points are (" + points[p1][0] + "," + points[p1][1] + "," + points[p1][2]
            + ") and (" + points[p2][0] + "," + points[p2][1] + "," + points[p2][2] + ")");
  }
}
