public class Workshop02 {

    public static void main(String[] args) {

        Space3D space3d = new Space3D();
        Point3D startPoint = new Point3D(2, 1, 3);
        Point3D endPoint = new Point3D(0, 0, 6);
        double distance = space3d.rangeCalculate(startPoint, endPoint);
        System.out.println(distance);
    }

}

class Space3D {
    private static final int EXPONENT_TWO = 2;

    double rangeCalculate(Point3D startPoint, Point3D endPoint) {
        double sum1 = Math.pow((startPoint.x - endPoint.x), EXPONENT_TWO);
        double sum2 = Math.pow((startPoint.y - endPoint.y), EXPONENT_TWO);
        double sum3 = Math.pow((startPoint.z - endPoint.z), EXPONENT_TWO);
        double distance = Math.sqrt(sum1 + sum2 + sum3);
        return distance;
    }
}
