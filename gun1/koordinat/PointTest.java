package gun1.koordinat;

public class PointTest {
    public static void main(String[] args) {
        Point point=new Point();
        point.setX(3);
        point.setY(4);
        System.out.println(point.distenceFromOrigin());
        Point point1=new Point();
        point1.setX(6);
        point1.setY(8);
        System.out.println(point.distanceBetweenPoints(point1));
        Point clone = point.clone();
        System.out.println(clone.x+" "+ clone.y);
        String infoPoint=point1.whereIsIt();
        System.out.println(infoPoint);

    }
}
