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
                System.out.print("Write a word: ");
                String word = reader.nextLine();
                System.out.print("Write the translation: ");
                String translate = reader.nextLine();
                dictionary.addWord(word, translate);
                break;
            case "translate":
                System.out.print("What do you wanna translate: ");
                String translationWord = reader.nextLine();
                System.out.println(dictionary.translate(translationWord));
                break;
            case "quit":
                System.out.println("Cheers!");
                break;
            default:
                System.out.println("Command unknown!");
        }

        return dictionary;
    }
}
