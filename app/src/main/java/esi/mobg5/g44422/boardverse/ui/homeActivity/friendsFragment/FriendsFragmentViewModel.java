package esi.mobg5.g44422.boardverse.ui.homeActivity.friendsFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FriendsFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FriendsFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Friends fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}