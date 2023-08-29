package nay.kirill.pratcicum.forth.pages.items;

import java.util.Arrays;
import java.util.List;

import nay.kirill.pratcicum.forth.pages.color.ColorItem;
import nay.kirill.pratcicum.forth.pages.image.ImageItem;
import nay.kirill.pratcicum.forth.pages.text.TextItem;

public final class ItemsHolder {

    public static final List<TextItem> textItems = Arrays.asList(
            new TextItem("От английского Integrated Development Environment (IDE) - "),
            new TextItem("комплексный набор инструментов"),
            new TextItem("разработчиков и разработчиц"),
            new TextItem("для написания"),
            new TextItem("и отладки кода.")
    );

    public static final List<ImageItem> imageItems = Arrays.asList(
            new ImageItem("1.jpg"),
            new ImageItem("2.jpg"),
            new ImageItem("3.jpg"),
            new ImageItem("4.jpg")
    );

    public static final List<ColorItem> colorItems = Arrays.asList(
            new ColorItem(0xFF005FCC),
            new ColorItem(0xFF4077E9),
            new ColorItem(0xFF6391FF),
            new ColorItem(0xFF83ABFF),
            new ColorItem(0xFFA2C6FF)
    );

    private ItemsHolder() {}
}
