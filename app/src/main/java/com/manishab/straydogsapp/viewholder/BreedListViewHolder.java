package com.manishab.straydogsapp.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.manishab.straydogsapp.R;


public class BreedListViewHolder extends RecyclerView.ViewHolder {

    public ImageView dogImage;
    public TextView dogName;
    public TextView dogDescription;

    public BreedListViewHolder(View itemView) {
        super(itemView);
        dogImage = (ImageView) itemView.findViewById(R.id.breed_img);
        dogName = (TextView) itemView.findViewById(R.id.breed_name);
        dogDescription = (TextView) itemView.findViewById(R.id.breed_info);
    }
}
