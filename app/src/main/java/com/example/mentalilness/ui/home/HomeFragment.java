package com.example.mentalilness.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.mentalilness.R;

public class HomeFragment extends Fragment {

    private HomeViewModel sendViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        sendViewModel=
                ViewModelProviders.of ( this ).get ( HomeViewModel.class );
        View root=inflater.inflate ( R.layout.fragment_home, container, false );
        return root;
    }
}