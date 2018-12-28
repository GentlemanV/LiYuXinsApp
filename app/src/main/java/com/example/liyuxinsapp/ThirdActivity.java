package com.example.liyuxinsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private TextView textView;

    private EditText editText;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.police_item:
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:110"));
                startActivity(intent1);
                break;
            case R.id.bd_item:
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("https://www.baidu.com/"));
                startActivity(intent2);
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button button5 = (Button) findViewById(R.id.button_5);
        editText = (EditText) findViewById(R.id.edit_text);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_5:
                        String inputText = editText.getText().toString();
                        Toast.makeText(ThirdActivity.this,inputText,
                        Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }

            }
        });

        Button button4 = (Button) findViewById(R.id.button_4);
        textView = (TextView) findViewById(R.id.text_view);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_4:
                        textView.setText("And Patrick Star!");
                        break;
                    default:
                        break;
                }

            }
        });
    }
}
