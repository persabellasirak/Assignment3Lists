
public class Testing {
    public static void main(String[] args) {
        System.out.println("Running tests on AList, SLList, and DLList...\n");

        runTest(new AList<>(), "AList");
        runTest(new SLList<>(), "SLList");
        runTest(new DLList<>(), "DLList");
    }

    public static void runTest(Object list, String listType) {
        System.out.println("Testing " + listType);

        if (list instanceof AList) {
            testList((AList<Song>) list);
        } else if (list instanceof SLList) {
            testList((SLList<Song>) list);
        } else if (list instanceof DLList) {
            testList((DLList<Song>) list);
        }

        System.out.println("--------------------------------------------------");
    }

    private static <T> void testList(AList<T> list) {
        performTests(list);
    }

    private static <T> void testList(SLList<T> list) {
        performTests(list);
    }

    private static <T> void testList(DLList<T> list) {
        performTests(list);
    }

    private static <T> void performTests(AList<T> list) {
        System.out.println("Initial List: " + list);
        addTestData((AList<Song>) list);
        System.out.println("After Adding Elements:\n" + list);
        list.removy(1);
        System.out.println("After Removing Element at Index 1:\n" + list);
    }

    private static <T> void performTests(SLList<T> list) {
        System.out.println("Initial List: " + list);
        addTestData((SLList<Song>) list);
        System.out.println("After Adding Elements:\n" + list);
        list.removy(1);
        System.out.println("After Removing Element at Index 1:\n" + list);
    }

    private static <T> void performTests(DLList<T> list) {
        System.out.println("Initial List: " + list);
        addTestData((DLList<Song>) list);
        System.out.println("After Adding Elements:\n" + list);
        list.removy(1);
        System.out.println("After Removing Element at Index 1:\n" + list);
    }

    private static void addTestData(AList<Song> list) {
        list.addy(new Song("Coral Crown", "Darren Korb", 4.07));
        list.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        list.addy(new Song("CASANOVA POSSE", "ALI", 4.00));
        list.addy(new Song("Coral Crown", "Darren Korb", 4.07));
    }

    private static void addTestData(SLList<Song> list) {
        list.addy(new Song("Coral Crown", "Darren Korb", 4.07));
        list.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        list.addy(new Song("CASANOVA POSSE", "ALI", 4.00));
        list.addy(new Song("Coral Crown", "Darren Korb", 4.07));
    }

    private static void addTestData(DLList<Song> list) {
        list.addy(new Song("Coral Crown", "Darren Korb", 4.07));
        list.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        list.addy(new Song("CASANOVA POSSE", "ALI", 4.00));
        list.addy(new Song("Coral Crown", "Darren Korb", 4.07));
    }
}
