package com.example.hongv.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

/**
 * Created by hongv on 2/27/2018.
 */

public class YourLocation extends Fragment {
    View myView;
    Spinner your_location_sp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.your_location, container, false);
        return myView;
    }

}
