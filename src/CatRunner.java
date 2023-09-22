public class CatRunner {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Johnny", 2, 13);

        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Mary", 11, 9);

        cat2.printCatInfo();
        cat2.introduce();



    }
}
