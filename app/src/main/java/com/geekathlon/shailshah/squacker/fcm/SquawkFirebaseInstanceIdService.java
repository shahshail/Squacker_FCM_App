package com.geekathlon.shailshah.squacker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by shailshah on 10/24/17.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();


    @Override
    public void onTokenRefresh() {
        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(LOG_TAG,"Refreshed Token"  + refreshToken);
        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationtoServer(refreshToken);

    }

    private void sendRegistrationtoServer(String refreshToken) {
        // This method is blank, but if you were to build a server that stores users token
        // information, this is where you'd send the token to the server.
    }
}
