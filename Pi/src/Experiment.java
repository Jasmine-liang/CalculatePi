import java.awt.*;

public class Experiment {
    private int squareSize;
    private int N;
    private int outputInterval = 100;

    public Experiment(int squareSize, int N) {
        if(squareSize <= 0 || N <= 0 )
            throw new IllegalArgumentException("squareSize and N must larger than 0!");

        this.squareSize = squareSize;
        this.N = N;
    }

    public void setOutputInterval(int interval){
        if (interval <= 0)
            throw new IllegalArgumentException("interval must be larger that 0");
        this.outputInterval = interval;
    }
    public void run(){
        Circle circle = new Circle(squareSize/2, squareSize/2, squareSize/2);
        PiData data = new PiData(circle);
        for (int i = 0; i < N; i++) {
            if (i % outputInterval == 0)
                System.out.println(data.estimatePi());
            int x = (int) (Math.random() * squareSize);
            int y = (int) (Math.random() * squareSize);
            data.addPoint(new Point(x, y));

        }
    }
    public static void main(String[] args) {
        int squareSize = 800;
        int N = 1000000;
        Experiment exp = new Experiment(squareSize, N);
        exp.setOutputInterval(10000);
        exp.run();
    }
}
