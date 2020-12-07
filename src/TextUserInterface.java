import java.util.Scanner;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface (Scanner reader, Dictionary dictionary){
        this.dictionary = dictionary;
    }

    public Dictionary textInterface (Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        String command = reader.nextLine();

        switch (command.toLowerCase()) {
            case "add":
                String word = reader.nextLine();
                String translate = reader.nextLine();
                dictionary.addWord(word, translate);
            case "translate":
                String translationWord = reader.nextLine();
                dictionary.translate(translationWord);
            case "quit":
                System.out.println("Cheers!");
            default:
                System.out.println("Command unknown!");
        }

        return dictionary;
    }
}
