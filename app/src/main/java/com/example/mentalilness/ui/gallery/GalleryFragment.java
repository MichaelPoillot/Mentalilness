package com.example.mentalilness.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.mentalilness.R;
import com.example.mentalilness.ui.home.HomeViewModel;

public class GalleryFragment extends Fragment {

    private HomeViewModel sendViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        sendViewModel=
                ViewModelProviders.of ( this ).get ( HomeViewModel.class );
        View root=inflater.inflate ( R.layout.fragment_gallery, container, false );
        return root;
    }
}
