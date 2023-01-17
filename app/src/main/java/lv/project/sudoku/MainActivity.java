package lv.project.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNewGame = findViewById(R.id.newGameBtn);
        btnNewGame.setText(R.string.new_game_btn);

        Button btnContinue = findViewById(R.id.continueBtn);
        btnContinue.setText(R.string.continue_btn);

        Button btnTopResults = findViewById(R.id.topResultsBtn);
        btnTopResults.setText(R.string.top_results_btn);

        btnTopResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TopResultsActivity.class));
            }
        });

        //TODO use this https://developer.android.com/develop/ui/views/components/dialogs
        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.difficulty_dialog_title)
                        .setSingleChoiceItems(R.array.difficulty, 0, null)
                        .setPositiveButton(R.string.ok_btn, null)
                        .setNegativeButton(R.string.close_btn, null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        int selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        //TODO selectedPosition jāsaglabā Shared preferences, lai spēles skatā varētu uzlikt

                        Toast toast = Toast.makeText(MainActivity.this, R.string.new_game_started_toast, Toast.LENGTH_SHORT);
                        toast.show();
                        startActivity(new Intent(MainActivity.this, GameActivity.class));
                    }
                });
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO izveidot iesākto spēļu ieguvi no Shared preferences
                String[] startedGames = {};

                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.select_game_dialog_title)
                        .setSingleChoiceItems(startedGames, 0, null)
                        .setPositiveButton(R.string.ok_btn, null)
                        .setNegativeButton(R.string.close_btn, null)
                        .show();

                Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        int selectedGame = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        //TODO selectedGame jāsaglabā Shared preferences, lai spēles skatā varētu uzlikt

                        Toast toast = Toast.makeText(MainActivity.this, R.string.game_txt + " " + startedGames[selectedGame] + " " + R.string.continue_txt, Toast.LENGTH_SHORT);
                        toast.show();
                        startActivity(new Intent(MainActivity.this, GameActivity.class));
                    }
                });
            }
        });
    }
}