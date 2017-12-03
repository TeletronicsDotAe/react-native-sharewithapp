package ae.teletronics.sharewithapp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class RNShareWithAppModule extends ReactContextBaseJavaModule {

    ReactApplicationContext reactContext;

    public RNShareWithAppModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ShareWithApp";
    }

    @ReactMethod
    public void test() {
        System.out.println("ShareWithApp - Test");
    }

   @ReactMethod
    public void getSharedImage(Callback successCallback) {
        Activity mActivity = getCurrentActivity();
        Intent intent = mActivity.getIntent();
        Uri imageUri = (Uri) intent.getParcelableExtra(Intent.EXTRA_STREAM);
    
        if (imageUri != null) {
            System.out.println("ShareWithApp - " + imageUri);
        }
        //successCallback.invoke(imageUri);
  }
}
