package ae.teletronics.sharewithapp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNShareWithAppModule extends ReactContextBaseJavaModule {

    ReactApplicationContext reactContext;

    public RNShareWithAppModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNShareWithApp";
    }

    @ReactMethod
    public void getSharedImage(Callback successCallback) {
        Activity mActivity = getCurrentActivity();
        Intent intent = mActivity.getIntent();
        Uri imageUri = (Uri) intent.getParcelableExtra(Intent.EXTRA_STREAM);
        if (imageUri != null) {

        }
        successCallback.invoke(imageUri);
  }
}
