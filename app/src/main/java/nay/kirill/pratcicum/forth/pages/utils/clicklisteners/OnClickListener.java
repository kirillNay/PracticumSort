package nay.kirill.pratcicum.forth.pages.utils.clicklisteners;

/**
 * Слушатель нажатий на кнопку
 */
public interface OnClickListener {

    /**
     * Метод [onClick] обрабатывает обычное нажатие на кнопку
     */
    void onClick();

    /**
     * Метод [onLongClick] обрабатывает длительное нажатие на кнопку
     */
    void onLongClick();

}