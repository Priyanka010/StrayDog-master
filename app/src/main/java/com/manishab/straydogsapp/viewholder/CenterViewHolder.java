package com.manishab.straydogsapp.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.manishab.straydogsapp.R;

public class CenterViewHolder extends RecyclerView.ViewHolder {
    public ImageView centerImage;
    public TextView CenterName;
    public TextView CenterDescription;

    public CenterViewHolder(View itemView) {
        super(itemView);
        centerImage = (ImageView) itemView.findViewById(R.id.center_img);
        CenterName = (TextView) itemView.findViewById(R.id.center_name);
        CenterDescription = (TextView) itemView.findViewById(R.id.center_info);
    }
}
