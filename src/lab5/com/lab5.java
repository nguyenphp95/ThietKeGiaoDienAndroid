package lab5.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import manhinhdieukhien.com.R;

public class lab5 extends Activity {
	TextView ab;
	Spinner spinner1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab5);
		spinner1=(Spinner)findViewById(R.id.spinner1);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
					
				String name=((TextView)view).getText().toString();
				Toast.makeText(getApplicationContext(), "Thong bao:" + position+"-"+name, Toast.LENGTH_LONG).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
