public class overloadedMethods {

    public static void main(String[] args) {

        Integer[] integers = { 1, 2, 3, 4, 5, 6};
        Character[] characters = {'a', 'b', 'c', 'd'};

        printMe(integers);
        printMe(characters);

    }

    public static void printMe (Integer[] i){
        for (Integer x : i)
            System.out.print( x);

    }
    public static void printMe (Character[] i){
        for (Character x : i)
            System.out.print( x);
    }


}
