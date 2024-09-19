package gun1.koordinat;

public class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distenceFromOrigin(){

        return Math.sqrt(((double)x*x)+(y*y));
    }
    public double distanceBetweenPoints(Point b){
        double x= this.x-b.x;
        double y= this.y-b.y;

        return Math.sqrt(((double)x*x)+(y*y));
    }

    public Point clone(){
        Point clonePoint= new Point();
        clonePoint.x=this.x;
        clonePoint.y=this.y;

        return clonePoint;
    }
    public String whereIsIt(){
        return "x="+x+" "+"y="+y;
    }



}
