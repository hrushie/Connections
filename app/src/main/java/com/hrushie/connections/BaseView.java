package com.hrushie.connections;

import android.support.annotation.StringRes;

/**
 * Created by hrushie on 7/5/2017.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);

    void makeToast(@StringRes int stringId);

    void makeToast(String message);
}
