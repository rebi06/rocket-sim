import java.util.Scanner;

public class Rocket {
    /**
     * 高さと重力の変数のフィールド
     * @param g 重力加速度　初期値9.8ms
     * @param h 最高到達高度 
     * @param v 初速度
     * 
     */
    public static void main (String[] args){
        double g = 9.8;
        System.out.print("初速度を入力してください:");
        Scanner sc = new Scanner(System.in); //初速度を入力
        double v = sc.nextDouble();
        int maxT = (int)(2 * v / g) + 1;
        double[] heights = new double[maxT];
        int lastT = 0;
        //値を保存するためのループ
        for(int t = 0; t<maxT;t++ ){
            //tは今の秒数
            double h = v*t -0.5*g*t*t;//t秒の高さを代入する
            if(h <0 )break;
            heights[t] = h;
            lastT = t;// 最後に記録できた時刻を保存


        }
        // 2回目のループで出力
        for (int t = 0; t <= lastT; t++) {
        System.out.printf("%d秒: %.2fm\n", t, heights[t]);
        }
    
    sc.close();
    }


}