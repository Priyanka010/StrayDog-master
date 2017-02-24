package com.manishab.straydogsapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.manishab.straydogsapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Breedinfofragment extends Fragment {
    ImageView imageView;
    TextView dog_name, information, wght, lifespan;
    String name;
    String info;
    TextView hght;
    String weight;
    String span;
    int image;


    public Breedinfofragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_breed_detail, null);


        Bundle bundle = getArguments();
        String name = bundle.getString("name");
        String info = bundle.getString("info");
        String height = bundle.getString("height");
        String weight = bundle.getString("weight");
        String span = bundle.getString("span");
        int image = bundle.getInt("image");

        imageView = (ImageView) view.findViewById(R.id.imageView1);
        dog_name = (TextView) view.findViewById(R.id.name);
        information = (TextView) view.findViewById(R.id.info1);
        hght = (TextView) view.findViewById(R.id.height);
        wght = (TextView) view.findViewById(R.id.weight);
        lifespan = (TextView) view.findViewById(R.id.lifespan);

        imageView.setImageResource(image);
        dog_name.setText(name);
        information.setText(info);
        hght.setText(height);
        wght.setText(weight);
        lifespan.setText(span);


        return view;
    }

    public static Fragment newInstance(Bundle bundle) {
        Fragment fragment = new Breedinfofragment();
        fragment.setArguments(bundle);
        return fragment;
    }

}
