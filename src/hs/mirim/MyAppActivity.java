package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnLook = (Button)findViewById(R.id.btnLook);
        btnLook.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(MyAppActivity.this,Input.class);
		    	startActivity(intent);
			}
		});
    }
}