package nay.kirill.pratcicum.forth.pages.color;

import nay.kirill.pratcicum.forth.pages.ComparableItem;

public class ColorItem implements ComparableItem<ColorItem> {

    public ColorItem(int color) {
        this.color = color;
    }

    private int color;

    public int getColor() {
        return color;
    }

    @Override
    public int compare(final ColorItem item) {
        if(color == item.color) return 0;

        return color > item.color ? 1 : -1;
    }
}
