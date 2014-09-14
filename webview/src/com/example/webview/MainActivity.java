package com.example.webview;
 
import android.app.Activity;
 
import android.os.Bundle;
 
import android.webkit.WebChromeClient;
import android.webkit.WebView;
 
import android.webkit.WebViewClient;
 
public class MainActivity extends Activity {
 
/** Called when the activity is first created. */
 
WebView tarayici;
 
//taray�c� referans�n� olu�tural�m.
 
@Override
 
public void onCreate(Bundle savedInstanceState) {
 
super.onCreate(savedInstanceState);
 
//setContentView(R.layout.main);
setContentView(R.layout.activity_main);

 
tarayici=(WebView)findViewById(R.id.tarayici);
 
//taray�c�m�z� tan�tal�m.
 
tarayici.getSettings().setJavaScriptEnabled(true);
 
//javascriptleri �al��t�rmas�n� sa�layal�m.
 
tarayici.setWebViewClient(new WebViewClient());
 
//bu kodu yazmad���m�z takdirde telefonun taray�c�s�nda a��yor...
tarayici.setWebChromeClient(new WebChromeClient());
//bu kod youtube tarz� sitelerde videoyu oynatmas� i�in. Eski s�r�m androidlerde �al��mayabilir...
 
tarayici.loadUrl("http://fuel2forest.com/app");
 
//bir urlyi �a��rmas�n� istiyoruz.
 
//loaddata metodu ile html kodlar�n� �al��t�rmak da m�mk�n...
 
}
 
}