package com.aarushi.googlemapsusingdirectionsapi;

import java.util.List;

/**
 * Created by hp on 7/15/2017.
 */

public interface DirectionFinderListener {

    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
