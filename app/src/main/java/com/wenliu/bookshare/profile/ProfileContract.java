package com.wenliu.bookshare.profile;

import android.graphics.Bitmap;
import android.net.Uri;

import com.wenliu.bookshare.base.BasePresenter;
import com.wenliu.bookshare.base.BaseView;
import com.wenliu.bookshare.object.User;

import java.util.ArrayList;

/**
 * Created by wen on 2018/5/17.
 */

public interface ProfileContract {

    interface View extends BaseView<Presenter> {

        void showImageOnView(Bitmap bitmap);

        void showAddFriendDialog(boolean showAlert);

        void isShowLoading(boolean isShow);

        void isAddDialogShow(boolean isShow);

        void showFriendProfile(User friend);
    }

    interface Presenter extends BasePresenter {

        void getPhotoUri(Uri uri);

        void uploadProfileImage(Uri imageUri);


    }
}
