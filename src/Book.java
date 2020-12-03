public class Book {
    private String name;
    private String contents;
    private int pubblishingYear;

    public Book(String name, String contents, int pubblishingYear){
        this.name = name;
        this.contents = contents;
        this.pubblishingYear = pubblishingYear;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getPubblishingYear () {
        return this.pubblishingYear;
    }

    public void setPubblishingYear (int pubblishingYear) {
        this.pubblishingYear = pubblishingYear;
    }

    public String getContents () {
        return this.contents;
    }

    public void setContents (String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.pubblishingYear + ")\n" + "Contents: " + this.contents;
    }
}
