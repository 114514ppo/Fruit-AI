public class NeuralNetworkFunctionsGroup {
    public static int fttt(int bit1, int bit2, int bit3, int bit4, int bit5, int bit6, int bit7, int bit8) {
        int[] bits = {bit1, bit2, bit3, bit4, bit5, bit6, bit7, bit8};
        for (int bit : bits) {
            if (bit != 0 && bit != 1) {
                throw new IllegalArgumentException("Invalid binary number");
            }
        }
        int decimal = 0;
        for (int i = 0; i < bits.length; i++) {
            decimal += bits[i] * (int)Math.pow(2, bits.length - 1 - i);
        }
        return decimal;
    }
    // 权重函数Fwx
    public static double Fwx(RGB color1, RGB color2, double[] weights) {
        if (weights.length!= 3) {
            throw new IllegalArgumentException("权重数组长度必须为3");
        }
        double rDiff = Math.abs(color1.r - color2.r);
        double gDiff = Math.abs(color1.g - color2.g);
        double bDiff = Math.abs(color1.b - color2.b);
        return weights[0] * rDiff + weights[1] * gDiff + weights[2] * bDiff;
    }

    // 概率函数fpx，输出布尔值
    public static boolean Fpx(double weightDiff, double threshold) {
        return weightDiff > threshold;
    }
    // 判断函数fx
    public static boolean Fx(int a, int b) {
        if (a != 0 && a != 1) {
            throw new IllegalArgumentException("Invalid binary number");
        } else if (b != 0 && b != 1) {
            throw new IllegalArgumentException("Invalid binary number");
        } else  {
            return a == b;
        }
    }
}
