package edu.temple.tuhub;

import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.courses:
                        // Load appropriate fragment
                        break;
                    case R.id.marketplace:
                        // Load appropriate fragment
                        break;
                    case R.id.maps:
                        // Load appropriate fragment
                        break;
                    case R.id.news:
                        // Load appropriate fragment
                        break;
                    case R.id.account:
                        // Load appropriate fragment
                        break;
                }
                return true;
            }
        });
    }
}
