package com.hrushie.connections;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hrushie on 7/5/2017.
 */

public class FragmentTemplate extends Fragment implements Contract.View {

    private Contract.Presenter presenter;


    public FragmentTemplate() {
        // Required empty public constructor
    }

    public void setPresenter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRetainInstance(true);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile_page, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (presenter == null){
            presenter = new Prestenter();
        }

        presenter.subscribe();
    }

    @Override
    public void onDestroy() {
        presenter.onSubscribe();
        super.onDestroy();
    }
}