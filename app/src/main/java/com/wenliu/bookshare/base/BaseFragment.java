package com.wenliu.bookshare.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.wenliu.bookshare.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    private MaterialDialog mMaterialDialog;

    public void isShowLoading(boolean isShow) {
        if (isShow) {
            if (mMaterialDialog == null) {
                mMaterialDialog = new MaterialDialog.Builder(this.getContext())
                        .content(R.string.please_wait)
                        .progress(true, 0)
                        .show();
            } else {
                mMaterialDialog.show();
            }
        } else {
            mMaterialDialog.dismiss();
        }
    }

}
