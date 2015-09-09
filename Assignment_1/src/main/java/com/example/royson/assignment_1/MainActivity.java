package com.example.royson.assignment_1;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;


import static com.example.royson.assignment_1.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        Log.i("MainActivity", "onCreate");

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        final GetTheQuote getTheQuote = new GetTheQuote();
        fragmentTransaction.add(R.id.fragment_container, getTheQuote);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();



    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("MainActivity", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("MainActivity", "onDestroy");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}


