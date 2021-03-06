package com.wenliu.bookshare.object;

import java.io.Serializable;

/**
 * Created by wen on 2018/5/7.
 */

public class User implements Serializable {

    private String mName;
    private String mEmail;
    private String mImage;
    private String mId;
    private String mCreateTime;
    private String mStatus;

    public User() {
        mName = "";
        mEmail = "";
        mImage = "";
        mId = "";
        mCreateTime = "";
        mStatus = "";
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getCreateTime() {
        return mCreateTime;
    }

    public void setCreateTime(String createTime) {
        mCreateTime = createTime;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String mfriendStatus) {
        this.mStatus = mfriendStatus;
    }
}
