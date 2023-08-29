package nay.kirill.pratcicum.forth.pages.utils.clicklisteners;

import android.view.View;

public final class ClickListenerUtils {

    public static void setListeners(
            View view,
            OnClickListener listener
    ) {
        view.setOnClickListener((View v) -> listener.onClick());
        view.setOnLongClickListener((View v) -> {
            listener.onLongClick();
            return true;
        });
    }

    private ClickListenerUtils() {}
}
