package ru.mirea.sichinskiy.multiactivity;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.snackbar.Snackbar;


public class SecondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()_2act");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()_2act");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()_2act");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()_2act");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()_2act");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()_2act");
    }
}