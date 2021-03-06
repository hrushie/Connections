package com.hrushie.connections.profilepage;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hrushie.connections.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfilePageFragment extends Fragment implements ProfilePageContract.View {


    private Contract.Presenter presenter;


    public ProfilePageFragment() {
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

    @Override
    public void makeToast(@StringRes int stringId) {

    }

    @Override
    public void makeToast(String message) {

    }

    @Override
    public void setPresenter(ProfilePageContract.Presenter presenter) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public void setBio(String bio) {

    }

    @Override
    public void setInterest(String interest) {

    }

    @Override
    public void setProfilePhotoUrl(String profilePhotoUrl) {

    }

    @Override
    public void setDefaultProfilePhoto() {

    }

    @Override
    public void showLogoutSnackbar() {

    }

    @Override
    public void startLoginActivity() {

    }

    @Override
    public void setThumbnailLoadingIndicator() {

    }

    @Override
    public void setDetailLoadingIndicator() {

    }
}
