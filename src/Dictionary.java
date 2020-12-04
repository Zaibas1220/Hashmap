import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary (){
         this.dictionary = new HashMap<>();
    }

    public void addWord (String word, String translation) {
        if (this.dictionary.containsKey(word)){
            System.out.println("The word is already in the dictionary!");
        }
        dictionary.put(word, translation);
    }

    public String translate (String word){
        return dictionary.get(word);
    }

    public Integer ammountOfWords () {
        return dictionary.size();
    }

    public ArrayList<String> translationList () {
        ArrayList <String> translationList = new ArrayList<>();
        for (String key : dictionary.keySet()){
            translationList.add(dictionary.get(key));
        }
        return translationList;
    }
}
