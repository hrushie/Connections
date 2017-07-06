package com.hrushie.connections.profilepage;

import com.hrushie.connections.BasePresenter;
import com.hrushie.connections.BaseView;

/**
 * Created by hrushie on 6/29/2017.
 */

public interface ProfilePageContract {

    interface View extends BaseView<Presenter>{

        void setPresenter(ProfilePageContract.Presenter presenter);

        void setName (String name);

        void setEmail (String email);
        void setBio (String bio);
        void setInterest (String interest);
        void setProfilePhotoUrl(String profilePhotoUrl);
        void setDefaultProfilePhoto();
//        void startPhotoActivity ();
//        void startDetailAcivity ();
        void showLogoutSnackbar ();
//        void startProfileSettingsActivity ();
        void startLoginActivity ();
        void setThumbnailLoadingIndicator();
        void setDetailLoadingIndicator();


    }
    interface Presenter extends BasePresenter{

        void onThumbnailClick();

        void onEditProfileClick();

        void onLogoutClick();

        void onLogoutConfirm();

        void onAccountsSettingsClick();

        void onThumbnailLoaded();


    }
}
