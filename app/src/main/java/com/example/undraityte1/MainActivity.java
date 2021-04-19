package com.example.undraityte1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onbtnclick(View view) {
        this.tvMain.setText(R.string.changed_label_caption);
    }

    public void onbtnclick2(View view) {
        tvMain.setTextColor(getResources().getColor(R.color.red));
    }

    public void onbtnclick3(View view) {
        this.tvMain.setText(R.string.txt_labas);
        tvMain.setTextColor(getResources().getColor(R.color.yellow));
    }
}