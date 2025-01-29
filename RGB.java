public class RGB {
    public int r;
    public int g;
    public int b;

    public RGB(int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("RGB值必须在0到255之间");
        }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int frgb(RGB comparators) {
        if (comparators == null) {
            throw new IllegalArgumentException("传入的参数不能为null");
        }
        int diff = 0;
        diff += Math.abs(this.r - comparators.r);
        diff += Math.abs(this.g - comparators.g);
        diff += Math.abs(this.b - comparators.b);
        return diff;
    }
}