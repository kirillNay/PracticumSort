package nay.kirill.pratcicum.forth.pages.image;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import nay.kirill.pratcicum.forth.R;
import nay.kirill.pratcicum.forth.databinding.FragmentItemBinding;

public class PageImageFragment extends Fragment {

    private FragmentItemBinding binding;

    private ListImageAdapter adapter = new ListImageAdapter(ImageItem.images);

    PageImageFragment() { super(R.layout.fragment_item); }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        binding = FragmentItemBinding.inflate(inflater);
        binding.getRoot().setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        binding = null;
        super.onDestroyView();
    }

    public static PageImageFragment newInstance() {
        PageImageFragment fragment = new PageImageFragment();
        return fragment;
    }

}
