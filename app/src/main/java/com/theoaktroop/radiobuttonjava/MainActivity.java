package com.theoaktroop.radiobuttonjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        RadioGroup radioGroup = new RadioGroup(this);

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layout.addView(radioGroup, p);

        for(int i=1;i<=5;i++)
        {
            RadioButton radioButton=new RadioButton(this);
            radioButton.setText("RadioButton"+i);
            radioButton.setOnClickListener(mThisButtonListener);
            radioGroup.addView(radioButton,p);
        }



    }
    private View.OnClickListener mThisButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            String s = ((RadioButton) v).getText().toString();
            Toast.makeText(MainActivity.this, "You Click " + s,
                    Toast.LENGTH_SHORT).show();
        }
    };
}
