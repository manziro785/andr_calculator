package com.example.bismillah;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView  textView3;
    EditText editTextText1, editTextText2;
    Button button_sum;



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

        textView3 = findViewById(R.id.textView3);
        editTextText1 = findViewById(R.id.editTextText1);
        editTextText2 = findViewById(R.id.editTextText2);
        button_sum = findViewById(R.id.button_sum);

        button_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(editTextText1.getText().toString());
                float num2 = Float.parseFloat(editTextText2.getText().toString());
                float res = num1 +num2;
                textView3.setText(String.valueOf(res));

            }
        });


    }
}