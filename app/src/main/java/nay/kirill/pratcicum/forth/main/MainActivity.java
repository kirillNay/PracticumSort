package nay.kirill.pratcicum.forth.main;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import nay.kirill.pratcicum.forth.R;
import nay.kirill.pratcicum.forth.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private Button button;

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

    // Сортировка списка
    private void sort() {
        Toast.makeText(this, R.string.sort, Toast.LENGTH_SHORT).show();
    }

    // Тасовка списка
    private void shuffle() {
        Toast.makeText(this, R.string.shuffle, Toast.LENGTH_SHORT).show();
    }

    private void setButtonListener() {
        // TODO добавить обработку нажатия на кнопку
    }

}
