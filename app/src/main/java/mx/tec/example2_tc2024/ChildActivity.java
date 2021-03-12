package mx.tec.example2_tc2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    //Again we prepare our objects
    String anyString;
    TextView myTxtViewMgr;
    Intent intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTxtViewMgr = findViewById(R.id.textView2);

        //We acquire control of the Intent currently alive
        intentReceiver = getIntent();

        //To extract the Extras, the method is NOT overloadad. You need to use
        //the specific get<Datatype>Extra method. In the example: getStringExtra
        myTxtViewMgr.setText(intentReceiver.getStringExtra("myExtra"));

    }
}