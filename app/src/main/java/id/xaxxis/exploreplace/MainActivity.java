package id.xaxxis.exploreplace;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButtonFav;
    private RecyclerView recyclerView;

    private ArrayList<Place> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_category);
        recyclerView.setHasFixedSize(true);

        list.addAll(PlaceData.getListPlace());

        showRecycleCardView();



//        toggleButtonFav = findViewById(R.id.toggle_fav);
//        toggleButtonFav.setChecked(false);
//        toggleButtonFav.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_favorite_off_24dp));
//        toggleButtonFav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b)
//                    toggleButtonFav.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_favorite_on_24dp));
//                else
//                    toggleButtonFav.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_favorite_off_24dp));
//            }
//        });
    }

    private void showRecycleCardView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlaceAdapter cardViewPlaceAdapter = new CardViewPlaceAdapter(this);
        cardViewPlaceAdapter.setListPlace(list);
        recyclerView.setAdapter(cardViewPlaceAdapter);

    }

}
