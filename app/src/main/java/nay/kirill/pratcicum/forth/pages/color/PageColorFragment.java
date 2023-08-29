package nay.kirill.pratcicum.forth.pages.color;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import nay.kirill.pratcicum.forth.ListenersHolder;
import nay.kirill.pratcicum.forth.R;
import nay.kirill.pratcicum.forth.databinding.FragmentItemBinding;

public class PageColorFragment extends Fragment implements ListenersHolder.OnItemsChanged {

    private FragmentItemBinding binding;

    private ListColorAdapter adapter = new ListColorAdapter(ColorItem.colors);

    PageColorFragment() { super(R.layout.fragment_item); }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        binding = FragmentItemBinding.inflate(inflater);
        binding.getRoot().setAdapter(adapter);
        ListenersHolder.getInstance().addListener(this);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        binding = null;
        super.onDestroyView();
    }

    @Override
    public void onItemsChanged() {
        adapter.notifyDataSetChanged();
    }

    public static PageColorFragment newInstance() {
        PageColorFragment fragment = new PageColorFragment();
        return fragment;
    }

}
