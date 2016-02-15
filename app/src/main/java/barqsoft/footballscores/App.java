package barqsoft.footballscores;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Saquib on 14-Feb-16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
