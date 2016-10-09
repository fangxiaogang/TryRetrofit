package com.example.xiaogang.tryretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import rx.Subscriber;


public class MainActivity extends AppCompatActivity {
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv);
        getData(1);

    }


    private void getData(int page) {
        Subscriber<Root> subscriber = new Subscriber<Root>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Root root) {

                System.out.println(root.getResults().get(0).getUrl());
                textView.setText(root.getResults().get(0).getDesc()+root.getResults().get(0).getUrl());
            }
        };
        HttpMethod.getInstance().getGankApi(subscriber,page);
    }
}
