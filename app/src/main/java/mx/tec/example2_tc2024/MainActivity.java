package mx.tec.example2_tc2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // These are the objects that we need to manage the views defined in XML
    // After defining them, we need to add the proper imported packages
    Button buttonManager;
    TextView txtViewManager;
    ImageView imgViewManager;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Here we link the object manager with the precise XML view we want to manage
        //to do it, we use the ID defined in XML
        buttonManager = findViewById(R.id.button);
        txtViewManager = findViewById(R.id.textView);
        imgViewManager = findViewById(R.id.imageView2);

        //This is an event listener for the button defined in XML
        //if you have more than 1 button, we need more than 1 event listener
        buttonManager.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                //Playing with the properties of objects
                txtViewManager.setText("Clicked!");

                //Another example of management of object properties, but illustrating
                //the importance of encapsulation. We cannot access directly the attributes
                //of an object, but we need to use a binding method

                if(imgViewManager.getVisibility() == View.VISIBLE) {
                     imgViewManager.setVisibility(View.INVISIBLE);
                 }
                 else {
                     imgViewManager.setVisibility(View.VISIBLE);
                 }

                 //Intents are objects that bundle your intention to do something and
                 //withhold it until you trigger it. To launch a new activity, one needs to
                 //prepare it in the intent constructor (current_Activity, target_activity)
                 myIntent = new Intent(MainActivity.this, ChildActivity.class);

                //Extras are the mechanism to send parameters from activity to activity.
                //We use the overloaded method putExtra to add all extras we want
                 myIntent.putExtra("myExtra", txtViewManager.getText().toString());

                 //Finally, we start the activity passing the Intent as parameter
                 startActivity(myIntent);
            }
        });

    }
}