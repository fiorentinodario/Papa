package com.dario.papa;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;




		
		@SuppressLint({ "Registered", "SetJavaScriptEnabled" })
		public class salerno extends Activity {
		    /** Called when the activity is first created. */
			 @Override
			    public void onCreate(Bundle savedInstanceState) {
			        super.onCreate(savedInstanceState);
			        setContentView(R.layout.napoli);

			        WebView mainWebView = (WebView) findViewById(R.id.mainWebView);

			        WebSettings webSettings = mainWebView.getSettings();
			        webSettings.setJavaScriptEnabled(true);

			        mainWebView.setWebViewClient(new MyCustomWebViewClient());
			        mainWebView.loadUrl("http://www.estrostudiografico.it/papa/salerno.php");
			    }

			    private class MyCustomWebViewClient extends WebViewClient {
			        @Override
			        public boolean shouldOverrideUrlLoading(WebView view, String url) {
			            view.loadUrl(url);
			            return true;
			        }
			    }
			}
