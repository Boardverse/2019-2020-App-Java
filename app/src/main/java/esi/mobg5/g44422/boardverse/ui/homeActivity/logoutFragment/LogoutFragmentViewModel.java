package esi.mobg5.g44422.boardverse.ui.homeActivity.logoutFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LogoutFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LogoutFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Logout fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
