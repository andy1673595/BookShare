package com.wenliu.bookshare.api;

import com.wenliu.bookshare.object.GoogleBook.Item;

/**
 * Created by wen on 2018/5/3.
 */

public interface GetBookDataCallback {
    public void onCompleted(Item bookData);
    public void onError(String errorMessage);
}
