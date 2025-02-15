
public class Main {
    public static void main(String[] args) {
        AList<Song> songsAList = new AList<>();
        SLList<Song> songsSLList = new SLList<>();
        DLList<Song> songsDLList = new DLList<>();

        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("CASANOVA POSSE", "ALI", 4.00);
        Song song3 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        // Add songs
        songsAList.addy(song1);
        songsAList.addy(song3);
        songsAList.addy(song2);
        songsAList.addy(song1);

        songsSLList.addy(song1);
        songsSLList.addy(song3);
        songsSLList.addy(song2);
        songsSLList.addy(song1);

        songsDLList.addy(song1);
        songsDLList.addy(song3);
        songsDLList.addy(song2);
        songsDLList.addy(song1);

        // Print lists
        System.out.println("AList:");
        System.out.println(songsAList);

        System.out.println("SLList:");
        System.out.println(songsSLList);

        System.out.println("DLList:");
        System.out.println(songsDLList);

        // Remove element at index 1
        songsAList.removy(1);
        songsSLList.removy(1);
        songsDLList.removy(1);

        // Print lists after removal
        System.out.println("After Removal:");
        System.out.println("AList:");
        System.out.println(songsAList);

        System.out.println("SLList:");
        System.out.println(songsSLList);

        System.out.println("DLList:");
        System.out.println(songsDLList);
    }
}

