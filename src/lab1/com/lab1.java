package lab1.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import manhinhdieukhien.com.R;

public class lab1 extends Activity implements OnClickListener{// Khai báo đất mới mua
	Button btnInfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) { // **** Mở móng xây nhà =))***
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);// Set View cho lab1
		
		btnInfo = (Button) findViewById(R.id.btnInfo);
		
		btnInfo.setOnClickListener(this);
		
		
		String doc="https://drive.google.com/file/d/0B8vvzRFgLI0Vc29pcEozZmFoblE/view?usp=sharing";
		WebView wv= (WebView) findViewById(R.id.fileWebView); // Set file activity của Webview
		
		//Khai báo quyền của webview
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		
		wv.loadUrl(doc);
	}
	@Override
	public void onClick(View v) {
		if (v==btnInfo) {
			Intent intent = new Intent(this,lab1_info.class);
			startActivity(intent);
		}
		
	}

}
