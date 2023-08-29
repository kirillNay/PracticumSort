package nay.kirill.pratcicum.forth;

import java.util.ArrayList;
import java.util.List;

public class ListenersHolder {

    private static ListenersHolder instance;

    public static ListenersHolder getInstance() {
        if (instance == null) {
            instance = new ListenersHolder();
        }
        return instance;
    }

    private List<OnItemsChanged> listeners = new ArrayList<OnItemsChanged>();

    public void addListener(OnItemsChanged listener) {
        listeners.add(listener);
    }

    public void itemsChanged() {
        for (OnItemsChanged listener : listeners) {
            listener.onItemsChanged();
        }
    }

    public interface OnItemsChanged {

        void onItemsChanged();

    }

}
