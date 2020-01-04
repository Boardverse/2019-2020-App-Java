package esi.mobg5.g44422.boardverse.ui.homeActivity.achievementsFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementsFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AchievementsFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Achievements fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}