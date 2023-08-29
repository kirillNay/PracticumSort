package nay.kirill.pratcicum.forth.main;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import nay.kirill.pratcicum.forth.ListenersHolder;
import nay.kirill.pratcicum.forth.R;
import nay.kirill.pratcicum.forth.databinding.ActivityMainBinding;
import nay.kirill.pratcicum.forth.pages.color.ColorItem;
import nay.kirill.pratcicum.forth.pages.image.ImageItem;
import nay.kirill.pratcicum.forth.pages.text.TextItem;
import nay.kirill.pratcicum.forth.pages.utils.ListShuffler;
import nay.kirill.pratcicum.forth.pages.utils.ListSorter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private Button button;

    private ListSorter sorter = new ListSorter();

    private ListShuffler shuffler = new ListShuffler();

    private PageItemAdapter adapter = new PageItemAdapter(this);

    private TabLayoutMediator mediator;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pager.setAdapter(adapter);
        mediator = new TabLayoutMediator(binding.tabLayout, binding.pager, (tab, position) -> {
            String name;
            switch (position) {
                case 0:
                    name = getString(R.string.first_item);
                    break;
                case 1:
                    name = getString(R.string.second_item);
                    break;
                default:
                    name = getString(R.string.third_item);
            }
            tab.setText(name);
        });
        mediator.attach();

        button = binding.button;
        setButtonListener();
    }

    @Override
    protected void onDestroy() {
        mediator.detach();
        super.onDestroy();
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    // Сортировка списка
    private void sort() {
        showMessage("Отсортировано!");

        ListenersHolder.getInstance().itemsChanged();
    }

    // Тасовка списка
    private void shuffle() {
        showMessage("Перетасовано!");
        shuffler.shuffle(TextItem.texts);
        shuffler.shuffle(ImageItem.images);
        shuffler.shuffle(ColorItem.colors);
        ListenersHolder.getInstance().itemsChanged();
    }

    private void setButtonListener() {
        // TODO добавить обработку нажатия на кнопку
    }

}
