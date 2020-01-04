package esi.mobg5.g44422.boardverse.ui.gameActivity;

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

    private MutableLiveData<List<MinGame>> gamesSameTheme;

    private MutableLiveData<List<MinGame>> gamesOwedByOtherOwners;

    public MutableLiveData<Game> getGame() {
        if(game == null) {
            game = new MutableLiveData<>();
            // TODO
        }
        return game;
    }

    public void setGame(Game game) {
        this.game.setValue(game);
    }

    public MutableLiveData<List<User>> getFriendsOwningGame() {
        if(friendsOwningGame == null) {
            friendsOwningGame = new MutableLiveData<>();
            // TODO
        }
        return friendsOwningGame;
    }

    public MutableLiveData<List<User>> getFriendsLikingGame() {
        if(friendsLikingGame == null) {
            friendsLikingGame = new MutableLiveData<>();
            // TODO
        }
        return friendsLikingGame;
    }

    public MutableLiveData<List<MinGame>> getGamesFromSameEditor() {
        if(gamesFromSameEditor == null) {
            gamesFromSameEditor = new MutableLiveData<>();
            // TODO
        }
        return gamesFromSameEditor;
    }

    public MutableLiveData<List<MinGame>> getGamesSameType() {
        if(gamesSameType == null) {
            gamesSameType = new MutableLiveData<>();
            // TODO
        }
        return gamesSameType;
    }

    public MutableLiveData<List<MinGame>> getGamesSameTheme() {
        if(gamesSameTheme == null) {
            gamesSameTheme = new MutableLiveData<>();
            // TODO
        }
        return gamesSameTheme;
    }

    public MutableLiveData<List<MinGame>> getGamesOwedByOtherOwners() {
        if(gamesOwedByOtherOwners == null) {
            gamesOwedByOtherOwners = new MutableLiveData<>();
            // TODO
        }
        return gamesOwedByOtherOwners;
    }
}
