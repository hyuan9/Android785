package com.Hunter.hunterclass;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void calculate(View v){
    	EditText number1text=(EditText)findViewById(R.id.num1txt);
    	EditText number2text=(EditText)findViewById(R.id.num2txt);
    	Integer num1=Integer.parseInt(number1text.getText().toString()),num2=Integer.parseInt(number2text.getText().toString());
    	Integer ans=num1+num2;
    	
    	TextView answer=(TextView)findViewById(R.id.answertxt);
    	answer.setText("Answer:"+ans.toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
