package lab2.com;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhien.com.R;

public class lab2 extends Activity{
	//B1: Khai báo Button cần tương tác tới
	Button btnLogin;
	TextView txtReg,txtPass;
	//Tạo Broadcast Receiver
	BroadcastReceiver Receiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			//Lấy wifi
			ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
			if(connectivityManager.getActiveNetworkInfo() !=null){
				btnLogin.setEnabled(true);
				Toast.makeText(getBaseContext(),"Wifi True", Toast.LENGTH_LONG).show();
			}else{
				btnLogin.setEnabled(false);
				Toast.makeText(getBaseContext(), "Wifi false", Toast.LENGTH_LONG).show();
			}
		}
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab2);
		btnLogin = (Button) findViewById(R.id.btnLogin);
		txtReg = (TextView) findViewById(R.id.txtReg);
		txtPass = (TextView) findViewById(R.id.txtPass);
		
		txtPass.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),quenmatkhau.class);
				startActivity(intent);				
			}
		});
		txtReg.setOnClickListener(new View.OnClickListener(){
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(getApplicationContext(),dangky.class);
				startActivity(intent);				
			}
		});
	}
	@Override
	protected void onResume() {
		super.onResume();
		IntentFilter filterWifi = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
		registerReceiver(Receiver, filterWifi);		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		if (Receiver!=null) {
			unregisterReceiver(Receiver);
		}
	}
}
