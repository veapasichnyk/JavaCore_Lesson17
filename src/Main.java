public class Main {
    public static void main ( String [] args) {
        Number[] array = { 10, 30, 5, 4, 5, 6, 89, 90, 67, 9, 34, 56, 95, 34, 7, 6, 9, 23};
        Collection collection = new Collection ( array );

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("");
        Iterator collectionIterator = collection.outputValueOfArray ();
        while (collectionIterator.hasNext()) {
            System.out.println(collectionIterator.next());
        }

        System.out.println("");
        Iterator collectionIterator1 = collection.outputArray ();
        while (collectionIterator1.hasNext()) {
            System.out.println(collectionIterator1.next());
        }

    }
}
