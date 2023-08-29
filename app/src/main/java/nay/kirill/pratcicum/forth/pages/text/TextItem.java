package nay.kirill.pratcicum.forth.pages.text;

public class TextItem {

    private static int counter;

    private String text;

    private int order = counter++;

    public TextItem(String text) {this.text = text;}

    public String getText() {
        return text;
    }

}
