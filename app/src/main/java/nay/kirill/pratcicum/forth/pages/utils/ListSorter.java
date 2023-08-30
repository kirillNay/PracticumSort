package nay.kirill.pratcicum.forth.pages.utils;

import java.util.List;

import nay.kirill.pratcicum.forth.pages.ComparableItem;

public class ListSorter {
    public void sort(List<? extends ComparableItem> list) {
        list.sort((o1, o2) -> o1.compare(o2));
    }

}
