package nay.kirill.pratcicum.forth.main;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import nay.kirill.pratcicum.forth.R;
import nay.kirill.pratcicum.forth.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

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
    }

    @Override
    protected void onDestroy() {
        mediator.detach();
        super.onDestroy();
    }
}
