package nay.kirill.pratcicum.forth.pages.text;

import nay.kirill.pratcicum.forth.pages.ComparableItem;

public class TextItem implements ComparableItem<TextItem> {

    private static int counter;

    private String text;

    private int order = counter++;

    public TextItem(String text) {this.text = text;}

    public String getText() {
        return text;
    }

    @Override
    public int compare(TextItem item) {
        if (item.order == order) return 0;

        return order > item.order ? 1 : -1;
    }

}
