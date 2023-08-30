package nay.kirill.pratcicum.forth.pages;

public interface ComparableItem<T extends ComparableItem> {

    int compare(T item);

}
