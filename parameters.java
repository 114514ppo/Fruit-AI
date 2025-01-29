public class parameters {
    public final Fruit data[];
    public final int colorThreshold = 50;
    public parameters() {
        data = new Fruit[]{
                new Fruit("Apple", new RGB(255,0,0), 1),
                new Fruit("Banana", new RGB(227,207,87), 1),
                new Fruit("Orange", new RGB(255,165,0), 2),
                new Fruit("Mango", new RGB(255,165,0), 1),
                new Fruit("Pineapple", new RGB(255,215,0), 1),
                new Fruit("Grapes", new RGB(128,0,128), 2),
                new Fruit("Watermelon", new RGB(0, 128, 0), 1),
                new Fruit("Pear", new RGB(255,255,102), 1),
                new Fruit("Cherry", new RGB(255,0,51), 2),
                new Fruit("Strawberry", new RGB(255,0,0), 2),
                new Fruit("Blueberry", new RGB(25,25,112), 2),
        };
    }
    public Fruit getFruit(int index) {
        return data[index];
    }
}
