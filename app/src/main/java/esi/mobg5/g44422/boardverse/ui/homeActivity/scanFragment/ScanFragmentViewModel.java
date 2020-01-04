package esi.mobg5.g44422.boardverse.ui.homeActivity.scanFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScanFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ScanFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Scan fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}