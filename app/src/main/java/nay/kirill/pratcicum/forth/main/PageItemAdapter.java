package nay.kirill.pratcicum.forth.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import nay.kirill.pratcicum.forth.pages.color.PageColorFragment;
import nay.kirill.pratcicum.forth.pages.image.PageImageFragment;
import nay.kirill.pratcicum.forth.pages.text.PageTextFragment;

public class PageItemAdapter extends FragmentStateAdapter {

    public PageItemAdapter(@NonNull final FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(final int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = PageTextFragment.newInstance();
                break;
            case 1:
                fragment = PageImageFragment.newInstance();
                break;
            default:
                fragment = PageColorFragment.newInstance();
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
