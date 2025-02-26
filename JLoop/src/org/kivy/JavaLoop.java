package org.kivy;
import org.kivy.PythonCallback;
import android.util.Log;

public class JavaLoop {
    PythonCallback callback;

    public JavaLoop(PythonCallback pythoncallback) {
        this.callback = pythoncallback;
    }

    public void loop(int i ,int n,int inc) {
        callback.onStatus(false);
        for (int j = 0; j < n; j+=inc) {
            callback.onIteration(j);  // Call Python function on each iteration
            //Log.d("python",Integer.toString(j));
        }
        callback.onStatus(true);


    }
}
