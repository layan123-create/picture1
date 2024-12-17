package com.example.picture1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView2;
    private int sum=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2=findViewById(R.id.imageView);
    }
    public void arrowR(View view) {
        if(sum==1){
            sum++;
            imageView2.setImageResource(R.drawable.lion);
        }
        else {
            if (sum == 2) {
                sum++;
                imageView2.setImageResource(R.drawable.tiger);
            } else {
                if (sum == 3) {
                    sum++;
                    imageView2.setImageResource(R.drawable.ghazal);
                } else {
                    if (sum == 4) {
                        sum++;
                        imageView2.setImageResource(R.drawable.giraffe);
                    }
                }
            }
        }
    }


    public void arrowL (View view){
        if (sum == 5) {
            sum--;
            imageView2.setImageResource(R.drawable.ghazal);
        } else {
            if (sum == 4) {
                sum--;
                imageView2.setImageResource(R.drawable.tiger);
            } else {
                if (sum == 3) {
                    sum--;
                    imageView2.setImageResource(R.drawable.lion);
                } else {
                    if (sum == 2) {
                        sum--;
                        imageView2.setImageResource(R.drawable.cat);
                    }
                }
            }

        }
    }
}