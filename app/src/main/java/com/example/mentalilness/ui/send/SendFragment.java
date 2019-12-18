package com.example.mentalilness.ui.send;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.mentalilness.R;
import com.example.mentalilness.ui.home.HomeViewModel;

public class SendFragment extends PreferenceFragmentCompat  {

    private HomeViewModel sendViewModel;


    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource ( R.xml.preferences,rootKey );
    }
}