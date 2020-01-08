package esi.mobg5.g44422.boardverse.ui.userActivity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.MinUser;
import esi.mobg5.g44422.boardverse.model.User;

public class UserActivityViewModel extends ViewModel {

    private MutableLiveData<User> user;

    private MutableLiveData<List<MinGame>> gamesPlayed;

    private MutableLiveData<List<MinGame>> gamesReviewed;

    private MutableLiveData<List<MinGame>> gamesWishlisted;

    private MutableLiveData<List<MinUser>> friends;

    public UserActivityViewModel() {
        user = new MutableLiveData<>();
        gamesPlayed = new MutableLiveData<>();
        gamesReviewed = new MutableLiveData<>();
        gamesWishlisted = new MutableLiveData<>();
        friends = new MutableLiveData<>();
    }

    public MutableLiveData<User> getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user.setValue(user);
    }

    public MutableLiveData<List<MinGame>> getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(List<MinGame> gamesPlayed) {
        this.gamesPlayed.setValue(gamesPlayed);
    }

    public MutableLiveData<List<MinGame>> getGamesReviewed() {
        return gamesReviewed;
    }

    public void setGamesReviewed(List<MinGame> gamesReviewed) {
        this.gamesReviewed.setValue(gamesReviewed);
    }

    public MutableLiveData<List<MinGame>> getGamesWishlisted() {
        return gamesWishlisted;
    }

    public void setGamesWishlisted(List<MinGame> gamesWishlisted) {
        this.gamesWishlisted.setValue(gamesWishlisted);
    }

    public MutableLiveData<List<MinUser>> getFriends() {
        return friends;
    }

    public void setFriends(List<MinUser> friends) {
        this.friends.setValue(friends);
    }

}
