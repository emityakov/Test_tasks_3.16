package ru.samsung.itacademy.mdev.task3164_solution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText text;
    Button clickme ;
    String Texthere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        clickme = findViewById(R.id.button);
        text = findViewById(R.id.text);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Texthere = text.getText().toString();
                Intent intent = new Intent(FirstActivity.this,
                        SecondActivity.class);
                intent.putExtra("Text",Texthere);
                startActivity(intent);
            }
        });
    }
}