package esi.mobg5.g44422.boardverse.ui.minUserCarouselFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.model.MinUser;

public class MinUserCarouselFragmentViewModel extends ViewModel {

    private MutableLiveData<String> title;

    private MutableLiveData<List<MinUser>> minUsers;

    public MinUserCarouselFragmentViewModel() {
        title = new MutableLiveData<>();
        minUsers = new MutableLiveData<>();
    }

    public MutableLiveData<String> getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setValue(title);
    }

    public MutableLiveData<List<MinUser>> getMinUsers() {
        return minUsers;
    }

    public void setMinUsers(List<MinUser> minUsers) {
        this.minUsers.setValue(minUsers);
    }

}
