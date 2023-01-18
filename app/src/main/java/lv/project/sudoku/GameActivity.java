package lv.project.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    // TODO man nav telefona ar ko notestēt outlay priekš sudoku laukuma.
    //  Izveidoju potenciālo variantu, bet nesaliku visus input fieldus, ja nu nestrādā tā.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
}