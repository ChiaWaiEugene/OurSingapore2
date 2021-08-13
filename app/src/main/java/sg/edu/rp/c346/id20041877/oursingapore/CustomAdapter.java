package sg.edu.rp.c346.id20041877.oursingapore;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layout_id;
    ArrayList<Song> SongList;

    public CustomAdapter(Context context, int resource, ArrayList<Song> SongList) {
        super(context, resource, SongList);

        this.context = context;
        this.layout_id = resource;
        this.SongList = SongList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvSquare = rowView.findViewById(R.id.tvSquare);
        RatingBar rating = rowView.findViewById(R.id.ratingStars);
        TextView tvDescription = rowView.findViewById(R.id.tvDescription);
        //ImageView ivNew = rowView.findViewById(R.id.ivNew);

        Song ItemI = SongList.get(position);

        tvName.setText(ItemI.getName());
        tvSquare.setText("" + ItemI.getSquare());
        tvDescription.setText(ItemI.getDescription());

        tvName.setTextColor(Color.BLUE);
        tvSquare.setTextSize(20f);
        tvDescription.setTextColor(Color.rgb(117,255,255));
        tvSquare.setTextColor(Color.GRAY);

        /*
        if (currItem.getYearReleased() >= 1999) {
            ivNew.setVisibility(View.VISIBLE);
        }
        else {
            ivNew.setVisibility(View.INVISIBLE);
        }

         */

        return rowView;
    }


}
