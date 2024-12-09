package com.mireia.radiogroupejercicio;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroupColors = findViewById(R.id.radioGroupColors);

        radioGroupColors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);

                String colorName = selectedRadioButton.getText().toString();

                int textColor = Color.BLACK;

                if (checkedId == R.id.radioRed) {
                    textColor = Color.RED;
                } else if (checkedId == R.id.radioBlue) {
                    textColor = Color.BLUE;
                } else if (checkedId == R.id.radioGreen) {
                    textColor = Color.GREEN;
                } else if (checkedId == R.id.radioYellow) {
                    textColor = Color.YELLOW;
                }

                Toast toast = Toast.makeText(MainActivity.this, colorName, Toast.LENGTH_SHORT);
                View view = toast.getView();

                if (view != null) {
                    TextView toastMessage = view.findViewById(android.R.id.message);
                    toastMessage.setTextColor(textColor);
                }

                toast.show();
            }
        });
    }
}