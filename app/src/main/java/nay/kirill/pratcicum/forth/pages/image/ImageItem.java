package nay.kirill.pratcicum.forth.pages.image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageItem {

    public ImageItem(String url) {
        this.url = url;
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public static List<ImageItem> images = new ArrayList<ImageItem>(
            Arrays.asList(
                    new ImageItem("1.jpg"),
                    new ImageItem("2.jpg"),
                    new ImageItem("3.jpg"),
                    new ImageItem("4.jpg")
            )
    );
}
