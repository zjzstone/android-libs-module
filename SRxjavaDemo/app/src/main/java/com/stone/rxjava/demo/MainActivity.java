package com.stone.rxjava.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Flowable.fromCallable(() -> {
            Thread.sleep(1000); //  imitate expensive computation
            return "Done";
        }).subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(System.out::println, Throwable::printStackTrace);

        //original usage
      /*  Flowable.fromCallable(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return "Done";
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(Schedulers.single())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println(s);
                    }
                });*/

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

