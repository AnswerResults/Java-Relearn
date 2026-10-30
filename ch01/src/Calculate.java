import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        /**
         * 班主任需要统计10名学生的数学成绩(0-100分)，
         * 计算及格率，平均分，并找出最高分。
         * 要求1:键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”
         * 要求2:定义方法，求及格人数，根据及格人数，求及格率。
         * 要求3:定义方法求总分，根据总分求平均分
         * 要求4:定义方法求最大值，根据最大值，找出最高分。
         */
        int[] scores = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            while (true){
                System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
                int score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    scores[i] = score;
                    break;
                } else {
                    System.out.println("成绩无效，请重新输入！");
                }
            }
        }
        System.out.println("及格人数是：" + getPassCount(scores));
        System.out.println("及格率是：" + getPassRate(scores));
        System.out.println("总分是：" + getSum(scores));
        System.out.println("平均分是：" + getAverage(scores));
        System.out.println("最高分是：" + getMax(scores));
    }
    public static int getPassCount(int[] scores) {
        int passCount = 0;
        for (int score : scores) {
            if (score >= 60) {
                passCount++;
            }
        }
        return passCount;
    }
    public static double getPassRate(int[] scores) {
        return (double) getPassCount(scores) / scores.length;
    }
    public static int getSum(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
    public static double getAverage(int[] scores) {
        return (double) getSum(scores) / scores.length;
    }
    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    public static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

}
