package com.weimingfa.androidmusicplay.music.ui.local.folder;


import com.weimingfa.androidmusicplay.music.data.model.Folder;
import com.weimingfa.androidmusicplay.music.data.model.PlayList;
import com.weimingfa.androidmusicplay.music.ui.base.BasePresenter;
import com.weimingfa.androidmusicplay.music.ui.base.BaseView;

import java.io.File;
import java.util.List;

/**
 * Created with Android Studio.
 * User: ryan.hoo.j@gmail.com
 * Date: 9/10/16
 * Time: 11:34 PM
 * Desc: FolderContract
 */
/* package */ interface FolderContract {

    interface View extends BaseView<Presenter> {

        void showLoading();

        void hideLoading();

        void handleError(Throwable error);

        void onFoldersLoaded(List<Folder> folders);

        void onFoldersAdded(List<Folder> folders);

        void onFolderUpdated(Folder folder);

        void onFolderDeleted(Folder folder);

        void onPlayListCreated(PlayList playList);
    }

    interface Presenter extends BasePresenter {

        void loadFolders();

        void addFolders(List<File> folders, List<Folder> existedFolders);

        void refreshFolder(Folder folder);

        void deleteFolder(Folder folder);

        void createPlayList(PlayList playList);

        void addFolderToPlayList(Folder folder, PlayList playList);
    }
}
