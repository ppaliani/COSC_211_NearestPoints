import java.util.Scanner;

public class FindNearestPoints {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Calculations d = new Calculations();

    System.out.println("Enter the number of points: ");
    int numberOfPoints = input.nextInt();

    double[][] points = new double[numberOfPoints][3];
    System.out.println("Enter " + numberOfPoints + " points: ");

    for (int i = 0; i < points.length; i++) {
      points[i][0] = input.nextDouble();
      points[i][1] = input.nextDouble();
      points[i][2] = input.nextDouble();
    }

    d.getPoints(points);

    int[] indeces = d.closestPoints(points);

    d.getResult(indeces[0], indeces[1], points);
  }
}
