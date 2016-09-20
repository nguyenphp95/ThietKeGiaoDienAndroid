package lab1.com;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import manhinhdieukhien.com.R;

public class lab1 extends Activity {// Khai báo đất mới mua
	
	@Override
	protected void onCreate(Bundle savedInstanceState) { // **** Mở móng xây nhà =))***
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);// Set View cho lab1
		
		String doc="https://drive.google.com/file/d/0B8vvzRFgLI0VVDdQSVRaTDBnVnc/view?usp=sharing";
		WebView wv= (WebView) findViewById(R.id.fileWebView); // Set file activity của Webview
		
		//Khai báo quyền của webview
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		
		wv.loadUrl(doc);
	}

}
