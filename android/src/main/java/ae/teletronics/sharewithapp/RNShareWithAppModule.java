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
}
