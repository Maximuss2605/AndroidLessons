package ru.mirea.yaninmu.mireaproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;



public class WebViewFragment extends Fragment {

    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web_view, container, false);

        WebView browser= view.findViewById(R.id.webBrowser);
        browser.loadData("<html><body><h2>Привет!Я Макс Янин из группы БСБО-17-20</h2></body></html>", "text/html", "UTF-8");
        return view;
    }
}
