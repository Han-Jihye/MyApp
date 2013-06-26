package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Input extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.input);
		
		Button btnStill=(Button)findViewById(R.id.btnStill);
		btnStill.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(Input.this,Roading.class);
		    	startActivity(intent);
		    	finish();
			}
		});
	}
}
