package nay.kirill.pratcicum.forth.pages.text;

public class TextItem {

    private static int counter;

    public TextItem(String text) {this.text = text;}

    private String text;

    private int order = counter++;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
