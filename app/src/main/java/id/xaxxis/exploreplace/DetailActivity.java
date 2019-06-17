package id.xaxxis.exploreplace;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_PLACE = "extra_place";
    public static final String EXTRA_IMAGE_URI = "extra_image";
    public static final String EXTRA_LOCATION = "extra_location";
    public static final String EXTRA_DESC = "extra_desc";
    public static final String EXTRA_TYPE = "extra_type";
    public static final String EXTRA_LONG_LAT = "extra_longlat";
    public static final String EXTRA_SINCE = "extra_since";

    TextView tvPlaceTitleRcv, tvLocRcv, tvDescRcv, tvTypeRcv, tvLonglatRcv, tvSinceRcv;
    ImageView imgPhotoRcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvPlaceTitleRcv = findViewById(R.id.titlePlace);
        String placeName = getIntent().getStringExtra(EXTRA_PLACE);
        tvPlaceTitleRcv.setText(placeName);


        imgPhotoRcv = findViewById(R.id.img_photo);
        String uriPhoto = getIntent().getStringExtra(EXTRA_IMAGE_URI);
        Glide.with(imgPhotoRcv)
                .load(uriPhoto)
                .apply(new RequestOptions().override(350,350))
                .into(imgPhotoRcv);

        tvLocRcv = findViewById(R.id.location);
        String locationName = getIntent().getStringExtra(EXTRA_LOCATION);
        tvLocRcv.setText(locationName);

        tvDescRcv = findViewById(R.id.general_desc);
        String genDesc = getIntent().getStringExtra(EXTRA_DESC);
        tvDescRcv.setText(genDesc);

        tvTypeRcv = findViewById(R.id.type);
        String type = getIntent().getStringExtra(EXTRA_TYPE);
        tvTypeRcv.setText(type);

        tvLonglatRcv = findViewById(R.id.longlat);
        String longlat = getIntent().getStringExtra(EXTRA_LONG_LAT);
        tvLonglatRcv.setText(longlat);

        tvSinceRcv = findViewById(R.id.since);
        String since = getIntent().getStringExtra(EXTRA_SINCE);
        tvSinceRcv.setText(since);

        setActionBarTitle(placeName);
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);

    }
}
