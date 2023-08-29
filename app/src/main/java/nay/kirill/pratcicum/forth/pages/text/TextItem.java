package nay.kirill.pratcicum.forth.pages.text;

import java.util.Arrays;
import java.util.List;

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

    public static List<TextItem> texts = Arrays.asList(
            new TextItem("От английского Integrated Development Environment (IDE) - "),
            new TextItem("комплексный набор инструментов"),
            new TextItem("разработчиков и разработчиц"),
            new TextItem("для написания"),
            new TextItem("и отладки кода.")
    );
}
