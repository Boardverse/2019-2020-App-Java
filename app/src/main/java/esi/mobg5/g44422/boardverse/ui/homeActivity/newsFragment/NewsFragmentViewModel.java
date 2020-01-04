package esi.mobg5.g44422.boardverse.ui.homeActivity.newsFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NewsFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the News fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}