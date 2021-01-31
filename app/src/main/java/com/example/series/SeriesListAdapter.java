package com.example.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class SeriesListAdapter extends RecyclerView.Adapter<SeriesListAdapter.ViewHolder>{
    private List<Series> dataList;
    private Context context;

    public SeriesListAdapter(Context context, List<Series> dataList) {
        this.dataList = dataList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView name;
        TextView min_gen;
        TextView rating;

        public ViewHolder(View view) {
            super(view);
            photo = view.findViewById(R.id.image);
            name = view.findViewById(R.id.name);
            min_gen = view.findViewById(R.id.min_gen);
            rating = view.findViewById(R.id.rating);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_series, parent, false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Series item = dataList.get(position);

        Glide.with(context.getApplicationContext())
                .load(item.getPhoto())
                .into(holder.photo);

        holder.name.setText(item.getName());
        holder.min_gen.setText(item.getMin());
        holder.rating.setText(item.getRating());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
