package com.snape.shiva.dynamicui;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class MainActivity extends AppCompatActivity {

    EditText et2;
    Button button;
    String sId;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout rootLayout = new LinearLayout(this);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT);
        rootLayout.setLayoutParams(params);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setGravity(Gravity.CENTER);

        et2 = new EditText(this);
        et2.setHint("Enter Name");


        button = new Button(this);
        button.setText("Show Toast");

        rootLayout.addView(et2);
        rootLayout.addView(button);
        setContentView(rootLayout);

        rootLayout.setPadding(16, 16, 16, 16);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if(et2.getText().length()!=0)
                    {

                        Toast.makeText(getApplicationContext(),et2.getText().toString(),Toast.LENGTH_SHORT).show();
                    }

            }
        });

    }

}