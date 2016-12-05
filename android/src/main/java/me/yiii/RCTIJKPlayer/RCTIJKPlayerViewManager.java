package me.yiii.RCTIJKPlayer;

import android.app.Activity;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.SimpleViewManager;

public class RCTIJKPlayerViewManager extends SimpleViewManager<RCTIJKPlayerView> {
    private static final String REACT_CLASS = "RCTIJKPlayer";

    public RCTIJKPlayerViewManager(){

    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RCTIJKPlayerView createViewInstance(ThemedReactContext context) {
        return new RCTIJKPlayerView(context);
    }

}
