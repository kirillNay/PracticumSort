package nay.kirill.pratcicum.forth.pages.utils.clicklisteners;

import android.view.View;
import android.widget.Button;

public final class ClickListenerUtils {

    public static void setListeners(
            Button button,
            OnClickListener listener
    ) {
        button.setOnClickListener((View v) -> listener.onClick());
        button.setOnLongClickListener((View v) -> {
            listener.onLongClick();
            return true;
        });
    }

    private ClickListenerUtils() {}
}
