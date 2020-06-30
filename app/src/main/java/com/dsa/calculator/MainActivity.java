package com.dsa.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Buttons for numbers
        Button btn0= findViewById(R.id.button0);
        Button btn1= findViewById(R.id.button1);
        Button btn2= findViewById(R.id.button2);
        Button btn3= findViewById(R.id.button3);
        Button btn4= findViewById(R.id.button4);
        Button btn5= findViewById(R.id.button5);
        Button btn6= findViewById(R.id.button6);
        Button btn7= findViewById(R.id.button7);
        Button btn8= findViewById(R.id.button8);
        Button btn9= findViewById(R.id.button9);
       //Buttons for operations
        Button btnClear = findViewById(R.id.buttonClear);
        Button btnEqual= findViewById(R.id.buttonEqual);
        Button btnAdd= findViewById(R.id.buttonAdd);
        Button btnMinus= findViewById(R.id.buttonMinus);
        Button btnMult=findViewById(R.id.buttonMult);
        Button btnDiv= findViewById(R.id.buttonDiv);
        Button btnSin= findViewById(R.id.buttonSin);
        Button btnCos= findViewById(R.id.buttonCos);
        final String operation="";
        final float[] n1 = new float[1];
        float n2;
        float acumulado;
        float solucion;
        final int[] operacion1 = {0};
        int operacion2=0;

        final TextView Solver= findViewById(R.id.SolutionView);

        //Setters buttons 0-9 numbers
        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText(Solver.getText().toString()+"+");
            }
        });

               //Functions of add,substract,multiply...
        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Solver.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
               // Solver.setText(Solver.getText()+"+");
                float operand1 = Float.parseFloat((String) Solver.getText());
                Solver.setText(Solver.getText()+"+");
                float operand2=0;
                float sol;
                sol= operand1 + operand2;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n1[0] =Float.parseFloat(Solver.getText().toString());

                Solver.setText(Solver.getText().toString()+ "+");
                operacion1[0] =1;

            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Solver.setText(Solver.getText().toString() + "x");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Solver.setText(Solver.getText().toString()+ "/");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Solver.setText(Solver.getText().toString()+ "=");
                switch(operation) {
                    case "+":
                        Solver.setText(Solver.getText().toString());
                        break;

                    case "-":
                        Solver.setText(Solver.getText().toString());
                        break;

                    case "x":
                        Solver.setText(Solver.getText().toString());
                        break;

                    case "/":
                        Solver.setText(Solver.getText().toString());
                        break;

                    default:
                        Solver.setText(Solver.getText().toString());
                        break;
                }

            }
        }
        //Clear.s
           // Solver.setText("");
        });

    }
    /*public static void buttonenabler()
    {

        btnMinus.setEnabled(true);
        btnMult.setEnabled(true);
        btnDiv.setEnabled(true);}*/
    public void ClearScreen(View view){
        Solver.setText("");
    }
}
