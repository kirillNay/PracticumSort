package nay.kirill.pratcicum.forth.pages.color;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import nay.kirill.pratcicum.forth.databinding.ItemColorBinding;

public class ListColorAdapter extends RecyclerView.Adapter {

    private List<ColorItem> list;

    ListColorAdapter(List<ColorItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        return new ColorItemViewHolder(ItemColorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        ((ColorItemViewHolder) holder).bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ColorItemViewHolder extends RecyclerView.ViewHolder {

        private ItemColorBinding binding;

        public ColorItemViewHolder(@NonNull final ItemColorBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(ColorItem item) {
            binding.getRoot().setBackgroundColor(item.getColor());
        }
    }
}
