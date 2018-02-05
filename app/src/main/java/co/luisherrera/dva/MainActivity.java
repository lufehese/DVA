package co.luisherrera.dva;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView infoTextView;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoTextView = (TextView) findViewById(R.id.infoTextView);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.homeItem) {
                    infoTextView.setText(R.string.home);
                }   else if (item.getItemId() == R.id.searchItem){
                    infoTextView.setText(R.string.search);
                }   else if (item.getItemId() == R.id.discoverItem){
                    infoTextView.setText(R.string.discover);
                }   else if (item.getItemId() == R.id.notificationItem){
                    infoTextView.setText(R.string.notification);
                }   else if (item.getItemId() == R.id.favoriteItem)
                    infoTextView.setText(R.string.favorite);

                return false;
            }
        });
    }
}
