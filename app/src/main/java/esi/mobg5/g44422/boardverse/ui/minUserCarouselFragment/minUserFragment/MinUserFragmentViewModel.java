package esi.mobg5.g44422.boardverse.ui.minUserCarouselFragment.minUserFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import esi.mobg5.g44422.boardverse.model.MinUser;

public class MinUserFragmentViewModel extends ViewModel {

    private MutableLiveData<MinUser> minUser;

    public MinUserFragmentViewModel() {
        minUser = new MutableLiveData<>();
    }

    public MutableLiveData<MinUser> getMinUser() {
        return minUser;
    }

    public void setMinUser(MinUser minUser) {
        this.minUser.setValue(minUser);
    }
}
