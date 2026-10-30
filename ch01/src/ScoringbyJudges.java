import java.util.Scanner;

public class ScoringbyJudges {
    public static void main(String[] args) {
        /**
         * 跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，
         * 剩余的分数再求平均数，改平均数为选手最终得分。
         * 要求1:利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
         * 要求2:定义方法分别求数组的最大值和最小值
         * 要求3:计算五名评委的总分
         * 要求4:总分-最大值-最小值，求选手最终平均分
         */
        // 1. 键盘录入 5 个 0~100 的整数存入数组
        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
           while (true){
               System.out.println("请输入第" + (i + 1) + "个评委的分数：");
               int score = scanner.nextInt();
               if (score >= 0 && score <= 100) {
                   scores[i] = score;
                   break;
               } else {
                   System.out.println("输入的分数超出范围，请重新输入！");
               }
           }
        }
        // 2. 调用方法求最大值、最小值
        int max = getMax(scores);
        int min = getMin(scores);

        // 3. 计算五名评委的总分
        int sum =getSum(scores);

        // 4. 总分 - 最大值 - 最小值，再求平均
        double finalScore = (sum - max - min) / 3.0;
        // 输出结果
        System.out.println("--------------------------");
        System.out.println("五位评委打分：" + java.util.Arrays.toString(scores));
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("五位评委打分的总分是：" + sum);
        System.out.println("选手的最终得分是：" + finalScore);


    }
    /** 求数组最大值 */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /** 求数组元素总和 */
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
}
