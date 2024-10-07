package id.ac.binus.javacalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtInput;

    String input="";

    Button btnSatu, btnDua, btnTiga, btnEmpat, btnLima, btnEnam, btnTujuh, btnDelapan, btnSembilan, btnNol, btnTambah, btnKurang, btnKali, btnBagi, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtInput = findViewById(R.id.txtInputan);
        btnSatu = findViewById(R.id.btnSatu);
        btnDua = findViewById(R.id.btnDua);
        btnTiga = findViewById(R.id.btnTiga);
        btnEmpat = findViewById(R.id.btnEmpat);
        btnLima = findViewById(R.id.btnLima);
        btnEnam = findViewById(R.id.btnEnam);
        btnTujuh = findViewById(R.id.btnTujuh);
        btnDelapan = findViewById(R.id.btnDelapan);
        btnSembilan = findViewById(R.id.btnSembilan);
        btnNol = findViewById(R.id.btnNol);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        btnEqual = findViewById(R.id.btnEqual);

        btnSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("1");
            }
        });
        btnDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("2");
            }
        });
        btnTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("3");

            }
        });
        btnEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("4");

            }
        });
        btnLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("5");
            }
        });
        btnEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("6");
            }
        });
        btnTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.concat("7");
            }
        });
        btnDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("8");
            }
        });
        btnSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("9");
            }
        });
        btnNol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("0");
            }
        });
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("+");
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("-");
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("*");
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.concat("/");
            }
        });
        private void appendInput(String value){
            input += value;
            txtInput.setText(input);
        }
        private void setOperator(String operator){
            if (!input.isEmpty()){
                n1 = Double.parseDouble(input);
                this.operator = operator;
                input="";
            }
        }
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!input.isEmpty()){
                    n2 = Double.parseDouble(input);
                    double res=0;

                    switch (operator){
                        case "+":
                            res = n1 + n2;
                            break;

                        case "-":
                            res = n1 - n2;
                            break;

                        case "*":
                            res = n1 * n2;
                            break;

                        case "/":
                            if (n2 != 0){
                                res = n1 / n2;
                            } else {
                                txtInput.setText("Error");
                                return;
                            }
                            break;
                    }
                    txtInput.setText(String.valueOf(res));
                    input="";
                    operator="";
                }
            }
        });
    }
}