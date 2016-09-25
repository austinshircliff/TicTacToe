package com.example.shircliffa.tictactoe;

import android.graphics.Color;
import android.os.StrictMode;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.Destroyable;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView result;

    int decideturn = 1;
    int counter;
    String Xwin = "PLAYER ONE WINS!";
    String Ywin = "PLAYER TWO WINS!";
    String draw = "DRAW!";
    String X = "X";
    String O = "O";
    String blank = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        result = (TextView) findViewById(R.id.resultText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn1.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn1.setText(X);
                        btn1.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn1.setText(O);
                        btn1.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;
                    }
                }
                evaluateWinner();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn2.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn2.setText(X);
                        btn2.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn2.setText(O);
                        btn2.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn3.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn3.setText(X);
                        btn3.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn3.setText(O);
                        btn3.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn4.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn4.setText(X);
                        btn4.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn4.setText(O);
                        btn4.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn5.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn5.setText(X);
                        btn5.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn5.setText(O);
                        btn5.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn6.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn6.setText(X);
                        btn6.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn6.setText(O);
                        btn6.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn7.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn7.setText(X);
                        btn7.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn7.setText(O);
                        btn7.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn8.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn8.setText(X);
                        btn8.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn8.setText(O);
                        btn8.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;

                    }
                }
                evaluateWinner();


            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn9.getText().toString().equals(blank))
                {
                    if (decideturn == 1) {
                        btn9.setText(X);
                        btn9.setTextColor(Color.BLACK);
                        decideturn = 2;
                        counter++;

                    } else if (decideturn == 2) {
                        btn9.setText(O);
                        btn9.setTextColor(Color.RED);
                        decideturn = 1;
                        counter++;
                    }
                }
                evaluateWinner();

            }
        });

    }

    public void evaluateWinner()
    {

        if(btn1.getText().toString().equals(X) && btn2.getText().toString().equals(X) && btn3.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);


        }
        else if(btn4.getText().toString().equals(X) && btn5.getText().toString().equals(X) && btn6.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);

        }
        else if(btn7.getText().toString().equals(X) && btn8.getText().toString().equals(X) && btn9.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);


        }
        else if(btn1.getText().toString().equals(X) && btn4.getText().toString().equals(X) && btn7.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);

        }
        else if(btn2.getText().toString().equals(X) && btn5.getText().toString().equals(X) && btn8.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);

        }
        else if(btn3.getText().toString().equals(X) && btn6.getText().toString().equals(X) && btn9.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);

        }
        else if(btn1.getText().toString().equals(X) && btn5.getText().toString().equals(X) && btn9.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);

        }
        else if(btn3.getText().toString().equals(X) && btn5.getText().toString().equals(X) && btn7.getText().toString().equals(X))
        {
            result.setText(Xwin);
            result.setTextColor(Color.GREEN);

        }
        else if(btn1.getText().toString().equals(O) && btn2.getText().toString().equals(O) && btn3.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(btn4.getText().toString().equals(O) && btn5.getText().toString().equals(O) && btn6.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(btn7.getText().toString().equals(O) && btn8.getText().toString().equals(O) && btn9.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);


        }
        else if(btn1.getText().toString().equals(O) && btn4.getText().toString().equals(O) && btn7.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(btn2.getText().toString().equals(O) && btn5.getText().toString().equals(O) && btn8.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(btn3.getText().toString().equals(O) && btn6.getText().toString().equals(O) && btn9.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(btn1.getText().toString().equals(O) && btn5.getText().toString().equals(O) && btn9.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(btn3.getText().toString().equals(O) && btn5.getText().toString().equals(O) && btn7.getText().toString().equals(O))
        {
            result.setText(Ywin);
            result.setTextColor(Color.RED);

        }
        else if(counter == 9)
        {
            result.setText(draw);
            result.setTextColor(Color.WHITE);

        }

    }


}
