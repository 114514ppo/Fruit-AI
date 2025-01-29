import java.util.Scanner;

public class AI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 获取RGB输入
            System.out.println("请输入红色分量（0 - 255）：");
            int r = scanner.nextInt();
            System.out.println("请输入绿色分量（0 - 255）：");
            int g = scanner.nextInt();
            System.out.println("请输入蓝色分量（0 - 255）：");
            int b = scanner.nextInt();

            RGB userColor = new RGB(r, g, b);

            // 获取味道输入
            System.out.println("请输入水果的味道标识（整数）：");
            int userTaste = scanner.nextInt();

            parameters params = new parameters();
            for (int i = 0; i < params.data.length; i++) {
                Fruit fruit = params.data[i];
                int colorDiff = fruit.color.frgb(userColor);
                boolean colorMatch = colorDiff < params.colorThreshold;
                boolean tasteMatch = fruit.flavor == userTaste;

                if (colorMatch && tasteMatch) {
                    System.out.println("匹配的水果: " + fruit.name);
                }
            }
            System.out.println("是否继续？（y/n）");
            String answer = scanner.next();
            if (answer.equals("n")) {
                break;
            } else if (answer.equals("y")) {
                System.out.println("继续输入...");
            } else {
                System.out.println("输入错误，请重新输入！");
            }
        }
    }
}