package nay.kirill.pratcicum.forth.pages.color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorItem {

    ColorItem(int color) {
        this.color = color;
    }

    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(final int color) {
        this.color = color;
    }

    public static List<ColorItem> colors = new ArrayList(
            Arrays.asList(
                    new ColorItem(0xFF005FCC),
                    new ColorItem(0xFF4077E9),
                    new ColorItem(0xFF6391FF),
                    new ColorItem(0xFF83ABFF),
                    new ColorItem(0xFFA2C6FF)
            )

    );
}
