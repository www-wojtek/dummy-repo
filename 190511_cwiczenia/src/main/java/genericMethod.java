public class genericMethod {
    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Character[] characters = {'a', 'b', 'c', 'd'};

        printMe(integers);
        printMe(characters);

    }


    // generic methods

    public static <T> void printMe(T[] x) {

        for (T b : x)
            System.out.print(b);
        System.out.println();
    }
}
