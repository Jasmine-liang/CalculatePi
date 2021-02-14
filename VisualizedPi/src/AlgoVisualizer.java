import java.awt.*;
import java.util.LinkedList;

public class AlgoVisualizer {

    // TODO: 创建自己的数据
    private PiData data;
    private AlgoFrame frame;    // 视图
    private int N;
    private static int DELAY = 40;
    public AlgoVisualizer(int sceneWidth, int sceneHeight, int N){

        // 初始化数据
        // TODO: 初始化数据
        this.N = N;
        Circle circle = new Circle(sceneWidth/2, sceneHeight/2, sceneHeight/2);
        data = new PiData(circle);

        // 初始化视图
        EventQueue.invokeLater(() -> {
            frame = new AlgoFrame("Get Pi with Monte Carlo", sceneWidth, sceneHeight);

            new Thread(() -> {
                run();
            }).start();
        });
    }

    // 动画逻辑
    private void run(){

        for (int i = 0; i < N; i++) {
            if( i % 100 == 0){
                frame.render(data);
                AlgoVisHelper.pause(DELAY);
                System.out.println(data.estimatePi());
            }

            int x = (int) (Math.random() * frame.getCanvasWidth());
            int y = (int) (Math.random() * frame.getCanvasHeight());
            data.addPoint(new Point(x, y));

        }

    }


    public static void main(String[] args) {

        int sceneWidth = 800;
        int sceneHeight = 800;
        int N = 10000;
        // TODO: 根据需要设置其他参数，初始化visualizer
        AlgoVisualizer visualizer = new AlgoVisualizer(sceneWidth, sceneHeight, N);
    }
}
