package tools.ysapps.com.locationdemoapp;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by B.E.L on 18/11/2015.
 */
public class Constatnts {
    public static final String PACKAGE_NAME = "tools.ysapps.com.locationdemoapp";
    public static final String BROADCAST_ACTION = PACKAGE_NAME + ".BROADCAST_ACTION";
    public static final String ACTIVITY_EXTRA = PACKAGE_NAME + ".ACTIVITY_EXTRA";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";
    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 1; // 1 mile, 1.6 km


    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<>();

    static {
        BAY_AREA_LANDMARKS.put("WORK", new LatLng(32.0604473, 34.7821697));
        BAY_AREA_LANDMARKS.put("HOME", new LatLng(32.485669, 35.004026));
    }
}