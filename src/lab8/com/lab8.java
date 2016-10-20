package lab8.com;

import com.navdrawer.SimpleSideDrawer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class lab8 extends Activity {
	SimpleSideDrawer slide_me;
	Button left_button, right_button,new_btn;
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8);
		slide_me = new SimpleSideDrawer(this);
		slide_me.setLeftBehindContentView(R.layout.activity_lab8_leftmenu);
		slide_me.setRightBehindContentView(R.layout.activity_lab8_rightmenu);
		tv1=(TextView)findViewById(R.id.tv1);
		new_btn=(Button)findViewById(R.id.button1);
		
		left_button = (Button) findViewById(R.id.left_buton);
		right_button = (Button) findViewById(R.id.right_buton);
		
		new_btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv1.setText("Clicked");
				slide_me.toggleLeftDrawer();
			}
		});
		left_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				slide_me.toggleLeftDrawer();
			}
		});
		right_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				slide_me.toggleRightDrawer();
			}
		});
	}

}
