import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.RatingBar;

import edu.cofc.csci490.inclass_activity_01_rugema.R;

public class ProgressBarMainActivity extends AppCompatActivity {
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setProgress(75);

        RatingBar rate = (RatingBar) findViewById(R.id.ratingBar);
        //rate.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
        //    public void onRatingChange(RatingBar ratingBar, float rating, boolean fromTouch){
        //
         //   }
        //});
    }
}
