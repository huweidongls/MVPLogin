package com.a99zan.mvplogin.utils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by 99zan on 2018/4/4.
 */

public abstract class AObserver<T> implements Observer<T> {
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
