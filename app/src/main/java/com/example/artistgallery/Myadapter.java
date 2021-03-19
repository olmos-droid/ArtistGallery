package com.example.artistgallery;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    private static final String TAG = "TAG";
    private ArrayList<Artist> artists;
    private Context context;

    public Myadapter(ArrayList<Artist> artists, Context context) {
        this.artists = artists;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageRow.setImageResource(artists.get(position).getImageProfile());
        holder.textRow.setText(artists.get(position).getName());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: artist " + holder.textRow.getText() +
                        "");
                Intent intent = new Intent(context, ViewPagerActivity.class);
                intent.putIntegerArrayListExtra("fotosObres", artists.get(position).getImageObra());
                intent.putExtra("nom", artists.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageRow;
        TextView textRow;
        ConstraintLayout layout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageRow = itemView.findViewById(R.id.imageViewRecycle);
            textRow = itemView.findViewById(R.id.textViewNomArtist);
            layout = itemView.findViewById(R.id.layoutMasterRow);
        }
    }
}
