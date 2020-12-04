import java.util.HashMap;

public class Training {
    public static void main(String[] args) {

        //Exercise n° 5 paragraph 36
        HashMap <String, String> nicknames = new HashMap<>();

        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        System.out.println(nicknames.get("mikael"));


        //Exemple paragraph 36.1/36.2 Book and Library
        HashMap <String, Book> books = new HashMap <>();

        Book senseAndSensibility = new Book("Sense and Sensibility", "...", 1811);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "...", 1813);


        books.put(senseAndSensibility.getName(), senseAndSensibility);
        books.put(prideAndPrejudice.getName(), prideAndPrejudice);

        System.out.println(books.get(prideAndPrejudice.getName()));


        //Exercise n° 6 paragraph 36.3
        PromissoryNote mattiNote = new PromissoryNote("Matti");
        mattiNote.setLoan("Matti", 51.5);
        mattiNote.setLoan("Mikael", 30);

        System.out.println(mattiNote.howMuchIsTheDebt("Matti"));
        System.out.println(mattiNote.howMuchIsTheDebt("Joel"));

        mattiNote.setLoan("Matti", 10.5);

        System.out.println(mattiNote.howMuchIsTheDebt("Matti"));

        Dictionary dictionary = new Dictionary();
        dictionary.addWord("apina", "monkey");
        dictionary.addWord("banaai", "banana");
        dictionary.addWord("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        System.out.println(dictionary.ammountOfWords());

        System.out.println(dictionary.translationList());

    }

}
