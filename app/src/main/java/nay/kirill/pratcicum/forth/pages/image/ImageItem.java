package nay.kirill.pratcicum.forth.pages.image;

import nay.kirill.pratcicum.forth.pages.ComparableItem;

public class ImageItem implements ComparableItem<ImageItem> {

    public ImageItem(String url) {
        this.url = url;
    }

    private String url;

    public String getUrl() {
        return url;
    }

    @Override
    public int compare(final ImageItem item) {
        if (url.equals(item.url)) return 0;

        return url.charAt(0) > item.url.charAt(0) ? 1 : -1;
    }
}
