package korelkoproject.ianni.mypractice8;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     int display_mode = getResources().getConfiguration().orientation;

        if (display_mode == Configuration.ORIENTATION_LANDSCAPE) {

            this.getSupportActionBar().hide();

        }

        else
        {

            this.getSupportActionBar().show();

        }

        setContentView(R.layout.activity_main);
    }


}
