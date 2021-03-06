package com.example.playtime.Cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.bumptech.glide.Glide;
import com.example.playtime.Cards.cards;
import com.example.playtime.R;

import org.w3c.dom.Text;

public class arrayAdapter extends ArrayAdapter<cards>{

    Context context;

    public arrayAdapter(Context context, int resourceId, List<cards> items){
        super(context, resourceId, items);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        cards card_item = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView sportsPlayed = (TextView) convertView.findViewById(R.id.sports);
        TextView accountType = (TextView) convertView.findViewById(R.id.accountType);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        String sports= "Sports Played: unavailable";
        if(card_item.getSportsPlayed()!=null)
            sports = card_item.getSportsPlayed();
        name.setText(card_item.getName());
        sportsPlayed.setText(sports);
        accountType.setText(card_item.getAccountType());
        switch(card_item.getProfileImageUrl()){
            case "default":
                Glide.with(convertView.getContext()).load(R.drawable.androidicon).into(image);
                break;
            default:
                Glide.with(image.getContext()).clear(image);
                Glide.with(convertView.getContext()).load(card_item.getProfileImageUrl()).into(image);
                break;
        }


        return convertView;

    }
}
