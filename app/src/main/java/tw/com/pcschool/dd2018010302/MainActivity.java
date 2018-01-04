package tw.com.pcschool.dd2018010302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv1 = (WebView)findViewById(R.id.webView);
        wv1.setWebViewClient(new WebViewClient());
        //wv1.setWebChromeClient(new WebChromeClient());
        wv1.getSettings().setJavaScriptEnabled(true);
        //wv1.loadUrl("https://tw.yahoo.com/");
        wv1.loadData("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/nSDgHBxUbVQ\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>", "text/html;charset=UTF-8", null);
    }
}
