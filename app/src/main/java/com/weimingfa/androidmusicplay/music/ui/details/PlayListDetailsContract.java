package com.weimingfa.androidmusicplay.music.ui.details;


import com.weimingfa.androidmusicplay.music.data.model.PlayList;
import com.weimingfa.androidmusicplay.music.data.model.Song;
import com.weimingfa.androidmusicplay.music.ui.base.BasePresenter;
import com.weimingfa.androidmusicplay.music.ui.base.BaseView;

/**
 * Created with Android Studio.
 * User: ryan.hoo.j@gmail.com
 * Date: 9/14/16
 * Time: 2:32 AM
 * Desc: PlayListDetailsContract
 */
public interface PlayListDetailsContract {

    interface View extends BaseView<Presenter> {

        void showLoading();

        void hideLoading();

        void handleError(Throwable e);

        void onSongDeleted(Song song);
    }

    interface Presenter extends BasePresenter {

        void addSongToPlayList(Song song, PlayList playList);

        void delete(Song song, PlayList playList);
    }
}
