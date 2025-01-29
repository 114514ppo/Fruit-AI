public class Fruit {
    public String name;
    public RGB color;
    public int flavor;
    public Fruit(String name, RGB color, int flavor) {
        if (name == null || color == null) {
            throw new IllegalArgumentException("Name and color must not be null");
        } else {
            this.name = name;
            this.color = color;
            this.flavor = flavor;
        }
    }
}
