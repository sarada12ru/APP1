package com.extractnew.App1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
                    ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationX", 100f);
                    animation.setDuration(2000);
                    animation.start();
                }
                else if(left == 612 && right == 1038)
                {
                    img.setLeft(20);
                    img.setRight(446);
                    ObjectAnimator animation = ObjectAnimator.ofFloat(view, "translationX", 100f);
                    animation.setDuration(2000);
                    animation.start();
                }

//                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);
//                img.startAnimation(animation);
//                img.setVisibility(View.VISIBLE);
                /*System.out.println("Left :-"+img.getLeft());
                System.out.println("Right :-"+img.getRight());
                System.out.println("Top :-"+img.getTop());
                System.out.println("Bottom :-"+img.getBottom());*/

            }
        });
    }

}
