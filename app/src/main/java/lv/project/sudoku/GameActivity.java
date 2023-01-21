package lv.project.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.widget.EditText;

import java.util.Arrays;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    EditText[][] boardLayout;
    int[][] board;
    Random rand;
    int K,N;
    int SRN;

    public GameActivity() {
        this.N = 9;
        Double SRNd = Math.sqrt(N);
        SRN = SRNd.intValue();
        board = new int[N][N];
        rand = new Random();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

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

        this.boardLayout = new EditText[][]{
                {input00, input01, input02, input03, input04, input05, input06, input07, input08},
                {input10, input11, input12, input13, input14, input15, input16, input17, input18},
                {input20, input21, input22, input23, input24, input25, input26, input27, input28},
                {input30, input31, input32, input33, input34, input35, input36, input37, input38},
                {input40, input41, input42, input43, input44, input45, input46, input47, input48},
                {input50, input51, input52, input53, input54, input55, input56, input57, input58},
                {input60, input61, input62, input63, input64, input65, input66, input67, input68},
                {input70, input71, input72, input73, input74, input75, input76, input77, input78},
                {input80, input81, input82, input83, input84, input85, input86, input87, input88},
        };

        for (int i = 0; i<9; i++) {
            for (int j = 0; j < 9; j++) {
                boardLayout[i][j].setGravity(Gravity.CENTER | Gravity.BOTTOM);
                boardLayout[i][j].setTextColor(Color.BLACK);
                boardLayout[i][j].setTextSize(12);
            }
        }

        Bundle levels = getIntent().getExtras();
        int level = levels.getInt("level");
        if (level == 0) {
            K = 20;
        } else if (level == 1) {
            K = 30;
        } else { K = 50;}

        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        generate();
        Log.d("gameBoard",Arrays.deepToString(board));

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

    public void generate() {

        // Fill diagonal 3x3 squares with random numbers
        fillDiagonal();

        // Fill remaining cells
        fillRemaining(0,SRN);

        //remove digits
        removeKDigits();

        //insert generated board data into game layout
        updateBoardLayout();
    }

    private void updateBoardLayout() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    boardLayout[i][j].setText("");
                } else {boardLayout[i][j].setText(String.valueOf(board[i][j]));}
            }
        }
    }

    private void fillDiagonal () {
        for (int i = 0; i < N; i=i+SRN) {
            fillSquare(i,i);

        }
    }

    private void fillSquare(int row, int col) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    num = rand.nextInt(9) + 1;
                } while (!isValid(row + i, col + j, num));
                board[row + i][col + j] = num;
            }
        }
    }

    int randomGenerator(int num)
    {
        return (int) Math.floor((Math.random()*num+1));
    }

    boolean fillRemaining(int i, int j)
    {
        //  System.out.println(i+" "+j);
        if (j>=N && i<N-1)
        {
            i = i + 1;
            j = 0;
        }
        if (i>=N && j>=N)
            return true;

        if (i < SRN)
        {
            if (j < SRN)
                j = SRN;
        }
        else if (i < N-SRN)
        {
            if (j==(int)(i/SRN)*SRN)
                j =  j + SRN;
        }
        else
        {
            if (j == N-SRN)
            {
                i = i + 1;
                j = 0;
                if (i>=N)
                    return true;
            }
        }

        for (int num = 1; num<=N; num++)
        {
            if (isValid(i, j, num))
            {
                board[i][j] = num;
                if (fillRemaining(i, j+1))
                    return true;

                board[i][j] = 0;
            }
        }
        return false;
    }

    private boolean isValid(int row, int col, int num) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 square
        int squareRow = row - row % 3;
        int squareCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[squareRow + i][squareCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public void removeKDigits()
    {
        int count = K;
        while (count != 0)
        {
            //generate random cell id
            int cellId = randomGenerator(N*N)-1;

            // extract coordinates i  and j
            int i = (cellId/N);
            int j = cellId%9;
            if (j != 0)
                j = j - 1;

            if (board[i][j] != 0)
            {
                count--;
                board[i][j] = 0;
            }
        }
    }
}