package com.kevin.baselibrary.utils;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by bailiangjin on 15/8/19.
 */
public class WebViewUtils {

    /**
     * 根据url加载Web界面
     * @param webView
     * @param url
     */
   public static void load(WebView webView,String url ){
       // 开启 localStorage
       webView.getSettings().setDomStorageEnabled(true);
       // 设置支持javascript
       webView.getSettings().setJavaScriptEnabled(true);
       // 启动缓存
       webView.getSettings().setAppCacheEnabled(true);
       // 设置缓存模式
       webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
       //使用自定义的WebViewClient
       webView.setWebViewClient(new WebViewClient() {
           //覆盖shouldOverrideUrlLoading 方法
           @Override
           public boolean shouldOverrideUrlLoading(WebView view, String url) {
               view.loadUrl(url);
               return true;
           }
       });

       webView.loadUrl(url);
    }
}