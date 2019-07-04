/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;

public class MyCordovaPlugin extends CordovaPlugin {
  private static final String TAG = "MyCordovaPlugin";

  @Override
  public void onDestroy() {
      
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("init")) {
      String smartlookAPIKey = args.getString(0);
      init(smartlookAPIKey);
      return true;
    } 
    
    return true;
  }

  private void init(String apiKey) {
    Smartlook.init(apiKey);
  }

  private void initPassive(String apiKey) {
    Smartlook.initPassive(apiKey);
  }

}
