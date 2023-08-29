package nay.kirill.pratcicum.forth.pages.text;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import nay.kirill.pratcicum.forth.databinding.ItemTextBinding;

public class ListTextAdapter extends RecyclerView.Adapter {

    private List<TextItem> list;

    public ListTextAdapter(List<TextItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        return new TextViewHolder(ItemTextBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        ((TextViewHolder) holder).bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class TextViewHolder extends RecyclerView.ViewHolder {

        private ItemTextBinding binding;

        public TextViewHolder(@NonNull final ItemTextBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(TextItem item) {
            binding.getRoot().setText(item.getText());
        }
    }

}
