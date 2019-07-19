package com.extractnew.App1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView hello ;
    Button btn;
    ImageView img;
    int left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        img = findViewById(R.id.img);
        img.setVisibility(View.VISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                left = img.getLeft();
                right = img.getRight();
                if(left == 20 && right == 446)
                {
                    img.setLeft(612);
                    img.setRight(1038);
                }
                else if(left == 612 && right == 1038)
                {
                    img.setLeft(20);
                    img.setRight(446);
                }

            }
        });
    }

}
