package teneocto.thiemjason.easymessageeasycall.login.loginFirebase;

import android.util.Log;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class FirebaseLoginViewModel {
    public void test() {
        Observable<Integer> observable = new ObservableCreate<Integer>(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(10);
                emitter.onNext(20);
                emitter.onComplete();
            }
        });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
//                System.out.println("onSubscribe");
                Log.i("RXJAVA","onSubscribe");
            }

            @Override
            public void onNext(Integer o) {
                System.out.println("onNext " + o);
                Log.i("RXJAVA","onSubscribe");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        observable.subscribe(observer);
    }
}
