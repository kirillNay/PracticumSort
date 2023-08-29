package nay.kirill.pratcicum.forth.pages.image;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import nay.kirill.pratcicum.forth.databinding.ItemImageBinding;

public class ListImageAdapter extends RecyclerView.Adapter {

    private List<ImageItem> list;

    ListImageAdapter(List<ImageItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        return new ImageViewHolder(ItemImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        ((ImageViewHolder) holder).bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ImageViewHolder extends RecyclerView.ViewHolder {

        private ItemImageBinding binding;

        public ImageViewHolder(@NonNull final ItemImageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(ImageItem item) {
            try {
                InputStream stream = binding.getRoot().getContext().getAssets().open(item.getUrl());
                Drawable drawable = Drawable.createFromStream(stream, null);
                binding.getRoot().setImageDrawable(drawable);
            } catch (IOException e) {
                Toast.makeText(binding.getRoot().getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
