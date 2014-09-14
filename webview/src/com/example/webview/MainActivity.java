package com.example.webview;
 
import android.app.Activity;
 
import android.os.Bundle;
 
import android.webkit.WebChromeClient;
import android.webkit.WebView;
 
import android.webkit.WebViewClient;
 
public class MainActivity extends Activity {
 
/** Called when the activity is first created. */
 
WebView tarayici;
 
//tarayýcý referansýný oluþturalým.
 
@Override
 
public void onCreate(Bundle savedInstanceState) {
 
super.onCreate(savedInstanceState);
 
//setContentView(R.layout.main);
setContentView(R.layout.activity_main);

 
tarayici=(WebView)findViewById(R.id.tarayici);
 
//tarayýcýmýzý tanýtalým.
 
tarayici.getSettings().setJavaScriptEnabled(true);
 
//javascriptleri çalýþtýrmasýný saðlayalým.
 
tarayici.setWebViewClient(new WebViewClient());
 
//bu kodu yazmadýðýmýz takdirde telefonun tarayýcýsýnda açýyor...
tarayici.setWebChromeClient(new WebChromeClient());
//bu kod youtube tarzý sitelerde videoyu oynatmasý için. Eski sürüm androidlerde çalýþmayabilir...
 
tarayici.loadUrl("http://fuel2forest.com/app");
 
//bir urlyi çaðýrmasýný istiyoruz.
 
//loaddata metodu ile html kodlarýný çalýþtýrmak da mümkün...
 
}
 
}