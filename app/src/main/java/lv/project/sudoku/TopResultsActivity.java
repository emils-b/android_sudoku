package lv.project.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TopResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_results);
        //TODO get best results from Shared preferences and create list.
        // https://www.tutorialspoint.com/how-to-make-a-listview-in-android probably can use this for idea how to create list
    }
}