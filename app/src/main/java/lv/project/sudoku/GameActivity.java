package lv.project.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);

        // all input fields for game
        // 1st row
        EditText input00 = findViewById(R.id.input00);
        EditText input01 = findViewById(R.id.input01);
        EditText input02 = findViewById(R.id.input02);
        EditText input03 = findViewById(R.id.input03);
        EditText input04 = findViewById(R.id.input04);
        EditText input05 = findViewById(R.id.input05);
        EditText input06 = findViewById(R.id.input06);
        EditText input07 = findViewById(R.id.input07);
        EditText input08 = findViewById(R.id.input08);

        // 2nd row
        EditText input10 = findViewById(R.id.input10);
        EditText input11 = findViewById(R.id.input11);
        EditText input12 = findViewById(R.id.input12);
        EditText input13 = findViewById(R.id.input13);
        EditText input14 = findViewById(R.id.input14);
        EditText input15 = findViewById(R.id.input15);
        EditText input16 = findViewById(R.id.input16);
        EditText input17 = findViewById(R.id.input17);
        EditText input18 = findViewById(R.id.input18);

        // 3rd row
        EditText input20 = findViewById(R.id.input20);
        EditText input21 = findViewById(R.id.input21);
        EditText input22 = findViewById(R.id.input22);
        EditText input23 = findViewById(R.id.input23);
        EditText input24 = findViewById(R.id.input24);
        EditText input25 = findViewById(R.id.input25);
        EditText input26 = findViewById(R.id.input26);
        EditText input27 = findViewById(R.id.input27);
        EditText input28 = findViewById(R.id.input28);

        // 4th row
        EditText input30 = findViewById(R.id.input30);
        EditText input31 = findViewById(R.id.input31);
        EditText input32 = findViewById(R.id.input32);
        EditText input33 = findViewById(R.id.input33);
        EditText input34 = findViewById(R.id.input34);
        EditText input35 = findViewById(R.id.input35);
        EditText input36 = findViewById(R.id.input36);
        EditText input37 = findViewById(R.id.input37);
        EditText input38 = findViewById(R.id.input38);

        // 5th row
        EditText input40 = findViewById(R.id.input40);
        EditText input41 = findViewById(R.id.input41);
        EditText input42 = findViewById(R.id.input42);
        EditText input43 = findViewById(R.id.input43);
        EditText input44 = findViewById(R.id.input44);
        EditText input45 = findViewById(R.id.input45);
        EditText input46 = findViewById(R.id.input46);
        EditText input47 = findViewById(R.id.input47);
        EditText input48 = findViewById(R.id.input48);

        // 6th row
        EditText input50 = findViewById(R.id.input50);
        EditText input51 = findViewById(R.id.input51);
        EditText input52 = findViewById(R.id.input52);
        EditText input53 = findViewById(R.id.input53);
        EditText input54 = findViewById(R.id.input54);
        EditText input55 = findViewById(R.id.input55);
        EditText input56 = findViewById(R.id.input56);
        EditText input57 = findViewById(R.id.input57);
        EditText input58 = findViewById(R.id.input58);

        // 7th row
        EditText input60 = findViewById(R.id.input60);
        EditText input61 = findViewById(R.id.input61);
        EditText input62 = findViewById(R.id.input62);
        EditText input63 = findViewById(R.id.input63);
        EditText input64 = findViewById(R.id.input64);
        EditText input65 = findViewById(R.id.input65);
        EditText input66 = findViewById(R.id.input66);
        EditText input67 = findViewById(R.id.input67);
        EditText input68 = findViewById(R.id.input68);

        // 8th row
        EditText input70 = findViewById(R.id.input70);
        EditText input71 = findViewById(R.id.input71);
        EditText input72 = findViewById(R.id.input72);
        EditText input73 = findViewById(R.id.input73);
        EditText input74 = findViewById(R.id.input74);
        EditText input75 = findViewById(R.id.input75);
        EditText input76 = findViewById(R.id.input76);
        EditText input77 = findViewById(R.id.input77);
        EditText input78 = findViewById(R.id.input78);

        // 9th row
        EditText input80 = findViewById(R.id.input80);
        EditText input81 = findViewById(R.id.input81);
        EditText input82 = findViewById(R.id.input82);
        EditText input83 = findViewById(R.id.input83);
        EditText input84 = findViewById(R.id.input84);
        EditText input85 = findViewById(R.id.input85);
        EditText input86 = findViewById(R.id.input86);
        EditText input87 = findViewById(R.id.input87);
        EditText input88 = findViewById(R.id.input88);

        /*
        TODO methods which will be used
         .setText() adds text value to field. Will be needed to populate with generated values. Only needs to block user entries for these fields
         .getText().toString() gets user input value from field
        */

        // TODO Probably could use addTextChangedListener() to catch when user enters value.
        //  Only need to enable for inputs where is there is not automatically generated values
        input00.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}