package lv.project.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TopResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_results);
        //TODO jāiegūst labākie rezultāti no Shared preferences un jāuzģenerē saraksts
    }
}