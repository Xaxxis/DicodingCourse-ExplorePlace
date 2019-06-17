package id.xaxxis.exploreplace;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPlaceAdapter extends RecyclerView.Adapter<CardViewPlaceAdapter.CardViewHolder> {
    private Context context;
    private ArrayList<Place> listPlace;

    public ArrayList<Place> getListPlace() {
        return listPlace;
    }

    public void setListPlace(ArrayList<Place> listPlace) {
        this.listPlace = listPlace;
    }

    public CardViewPlaceAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.location_list, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {
        final Place place = getListPlace().get(i);

        Glide.with(context)
                .load(place.getPhoto())
                .apply(new RequestOptions().override(350,350))
                .into(cardViewHolder.imgPhoto);

        cardViewHolder.tvPlaceName.setText(place.getPlaceName());
        cardViewHolder.tvLocationName.setText(place.getLocation());

        cardViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListPlace().get(position).getPlaceName(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListPlace().get(position).getPlaceName(), Toast.LENGTH_SHORT).show();
            }
        }));


        cardViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_IMAGE_URI, place.getPhoto());
                intent.putExtra(DetailActivity.EXTRA_PLACE, place.getPlaceName());
                intent.putExtra(DetailActivity.EXTRA_LOCATION, place.getLocation());
                intent.putExtra(DetailActivity.EXTRA_DESC, place.getGeneralDesc());
                intent.putExtra(DetailActivity.EXTRA_TYPE, place.getType());
                intent.putExtra(DetailActivity.EXTRA_LONG_LAT, place.getLonglat());
                intent.putExtra(DetailActivity.EXTRA_SINCE,place.getSince());
                view.getContext().startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPlace().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvPlaceName, tvLocationName;
        Button btnFavorite, btnShare;
        public CardViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.photo_content);
            tvPlaceName = itemView.findViewById(R.id.place_name);
            tvLocationName = itemView.findViewById(R.id.location_name);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);

        }
    }
}
