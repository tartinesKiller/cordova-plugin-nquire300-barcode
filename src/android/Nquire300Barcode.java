package cordova.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

public class Nquire300Barcode extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        Boolean enable = data.getBoolean(0);
        switch(action) {
            case "enableReader":
                barcodeReader(enable);
                break;
            case "enableContinuousMode":
                continuousMode(enable);
                break;
            case "enableGoodReadLed":
                goodReadLed(enable);
                break;
            case "enableGoodReadSound":
                goodReadSound(enable);
                break;
            default:
                return false;
        }
        return true;
    }

    private void barcodeReader(Boolean activate) {
        Intent intent = new Intent ("ACTION_BAR_SCANCFG");
        intent.putExtra("EXTRA_SCAN_POWER", activate ? 1 : 0);
        super.webView.getContext().sendBroadcast(intent);
    }

    private void continuousMode(Boolean activate) {
        Intent intent = new Intent ("ACTION_BAR_SCANCFG");
        intent.putExtra("EXTRA_TRIG_MODE", activate ? 1 : 2);
        super.webView.getContext().sendBroadcast(intent);
    }

    private void goodReadLed(Boolean activate) {
        Intent intent = new Intent ("ACTION_BAR_SCANCFG");
        intent.putExtra("EXTRA_SCAN_NOTY_LED", activate ? 1 : 0);
        super.webView.getContext().sendBroadcast(intent);
    }

    private void goodReadSound(Boolean activate) {
        Intent intent = new Intent ("ACTION_BAR_SCANCFG");
        intent.putExtra("EXTRA_SCAN_NOTY_SND", activate ? 1 : 0);
        super.webView.getContext().sendBroadcast(intent);
    }
}