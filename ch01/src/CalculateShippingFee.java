import java.util.Scanner;

public class CalculateShippingFee {
    public static void main(String[] args) {
        /**
         * 某快递公司的运费规则如下(首重1kg，超出部分按kg计算，不足1kg按1kg算):
         * 首重1kg:10元;
         * 超出1-5kg:每kg加2元;
         * 超出5kg以上:每kg加1.5元。
         * 要求1:快递重量必须大于0，否则重新输入
         * 要求2:不同价位的计算，单独定义一个方法
         */
        Scanner scanner = new Scanner(System.in);
        double weight;

        // 要求1：重量必须 > 0，否则重新录入
        while (true) {
            System.out.print("请输入快递重量(kg)：");
            weight = scanner.nextDouble();
            if (weight > 0) {
                break;
            }
            System.out.println("快递重量必须大于0，请重新输入！");
        }

        double fee = calculateShippingFee(weight);
        System.out.println("快递费用为：" + fee + " 元");
        scanner.close();
    }

    /**
     * 根据重量计算运费
     * 不足1kg按1kg算，用 Math.ceil 向上取整
     */
    public static double calculateShippingFee(double weight) {
        if (weight <= 1) {
            // 首重内
            return 10;
        } else if (weight <= 5) {
            // 超出1kg的部分，向上取整
            int extra = (int) Math.ceil(weight - 1);
            return 10 + extra * 2;
        } else {
            // 1~5kg 固定 4kg，每kg 2元；超出5kg部分向上取整，每kg 1.5元
            int extra = (int) Math.ceil(weight - 5);
            return 10 + 4 * 2 + extra * 1.5;
        }
    }
}