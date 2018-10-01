package e.huini.myapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relLayout = new RelativeLayout(this);

        Button welButton = new Button(this);
        welButton.setText("Welcome to my app");
        welButton.setTextSize(30);
        welButton.setBackgroundColor(Color.MAGENTA);
        welButton.setTextColor(Color.WHITE);
        RelativeLayout.LayoutParams butDet = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        butDet.addRule(RelativeLayout.ABOVE);
        butDet.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        butDet.addRule();

    Button redButton = new Button(this);
//        redButton.setOnClickListener();
        redButton.isClickable();
        redButton.setText("LOGIN");
        redButton.setBackgroundColor(Color.MAGENTA);
        redButton.setId(1);
        redButton.setTextColor(Color.WHITE);

        Button bluButton = new Button(this);
//        redButton.setOnClickListener();
        bluButton.isClickable();
        bluButton.setText("SIGN UP");
        bluButton.setBackgroundColor(Color.BLUE);
        bluButton.setId(2);
        bluButton.setTextSize(20);
        bluButton.setTextColor(Color.WHITE);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        RelativeLayout.LayoutParams buttonDet = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDet.addRule(RelativeLayout.ABOVE, redButton.getId());
        buttonDet.addRule(RelativeLayout.CENTER_HORIZONTAL);




        relLayout.setBackgroundColor(Color.WHITE);

        relLayout.addView(redButton,buttonDetails);//
  relLayout.addView(bluButton,buttonDet);
  relLayout.addView(welButton,butDet);
    setContentView(relLayout);
    }

}
