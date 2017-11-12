package com.stone.rxjava.demo;

import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by stone on 17-11-12.
 */

public class HelloWorld {
    public static void main(String[] args) {

        Flowable.just("Hello world").subscribe(System.out::println);

       //original usage
       /* Flowable.just("Hello world").subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println(s);
            }
        });*/

    }
}
