import java.awt.*;
import java.util.LinkedList;

public class PiData {
    private Circle circle;
    private int insideCircle = 0;
    private LinkedList<Point> points;

    public PiData(Circle circle) {
        this.circle = circle;
        points = new LinkedList<Point>();

    }

    public Circle getCircle() {
        return circle;
    }

    public Point getPoints(int i) {
        if(i < 0 || i >= points.size())
            throw new IllegalArgumentException("out of bound in getPoint!");

        return points.get(i);
    }
    public int getPointsNumber(){
        return points.size();
    }
    public void addPoint(Point p){
        points.add(p);
        if (circle.contain(p))
            insideCircle++;
    }
    public double estimatePi(){
        if(points.size() == 0)
            return 0.0;
        int circleArea = insideCircle;
        int squareArea = points.size();
        return (double)circleArea * 4 / squareArea;
    }
}
