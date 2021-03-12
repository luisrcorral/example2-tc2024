package mx.tec.example2_tc2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    String anyString;
    TextView myTxtViewMgr;
    Intent intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTxtViewMgr = findViewById(R.id.textView2);
        intentReceiver = getIntent();
        myTxtViewMgr.setText(intentReceiver.getStringExtra("myExtra"));

    }
}