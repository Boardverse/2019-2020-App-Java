package esi.mobg5.g44422.boardverse.ui.game;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.User;


public class GameActivityViewModel extends ViewModel {

    private MutableLiveData<Game> game;

    private MutableLiveData<List<User>> friendsOwningGame;

    private MutableLiveData<List<User>> friendsLikingGame;

    private MutableLiveData<List<MinGame>> gamesFromSameEditor;

    private MutableLiveData<List<MinGame>> gamesSameType;

    private MutableLiveData<List<MinGame>> gameSameTheme;

    private MutableLiveData<List<MinGame>> gamesOwedByOtherOwners;

    public MutableLiveData<Game> getGame() {
        return game;
    }

    public MutableLiveData<List<User>> getFriendsOwningGame() {
        return friendsOwningGame;
    }

    public MutableLiveData<List<User>> getFriendsLikingGame() {
        return friendsLikingGame;
    }

    public MutableLiveData<List<MinGame>> getGamesFromSameEditor() {
        return gamesFromSameEditor;
    }

    public MutableLiveData<List<MinGame>> getGamesSameType() {
        return gamesSameType;
    }

    public MutableLiveData<List<MinGame>> getGameSameTheme() {
        return gameSameTheme;
    }

    public MutableLiveData<List<MinGame>> getGamesOwedByOtherOwners() {
        return gamesOwedByOtherOwners;
    }
}
