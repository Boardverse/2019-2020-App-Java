package esi.mobg5.g44422.boardverse.ui.gameActivity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.User;


public class GameActivityViewModel extends ViewModel {

    private Repository repository;

    private MutableLiveData<Game> game;

    private MutableLiveData<List<User>> friendsOwningGame;

    private MutableLiveData<List<User>> friendsLikingGame;

    private MutableLiveData<List<MinGame>> gamesFromSameEditor;

    private MutableLiveData<List<MinGame>> gamesSameType;

    private MutableLiveData<List<MinGame>> gamesSameTheme;

    private MutableLiveData<List<MinGame>> gamesOwedByOtherOwners;

    public GameActivityViewModel() {
        repository = new Repository();
        game = new MutableLiveData<>();
        friendsOwningGame = new MutableLiveData<>();
        friendsLikingGame = new MutableLiveData<>();
        gamesFromSameEditor = new MutableLiveData<>();
        gamesFromSameEditor = new MutableLiveData<>();
        gamesSameType = new MutableLiveData<>();
        gamesSameTheme = new MutableLiveData<>();
        gamesOwedByOtherOwners = new MutableLiveData<>();
    }

    public MutableLiveData<Game> getGame(/*Integer game_id*/) {
        return game;
    }

    public void setGame(Game game) {
        this.game.setValue(game);
    }

    public MutableLiveData<List<User>> getFriendsOwningGame() {
        return friendsOwningGame;
    }

    public void setFriendsOwningGame(List<User> users) {
        friendsOwningGame.setValue(users);
    }

    public MutableLiveData<List<User>> getFriendsLikingGame() {
        return friendsLikingGame;
    }

    public void setFriendsLikingGame(List<User> users) {
        friendsLikingGame.setValue(users);
    }

    public MutableLiveData<List<MinGame>> getGamesFromSameEditor() {
        return gamesFromSameEditor;
    }

    public void setGamesFromSameEditor(List<MinGame> games) {
        gamesFromSameEditor.setValue(games);
    }

    public MutableLiveData<List<MinGame>> getGamesSameType() {
        return gamesSameType;
    }

    public void setGamesSameType(List<MinGame> games) {
        gamesSameType.setValue(games);
    }

    public MutableLiveData<List<MinGame>> getGamesSameTheme() {
        return gamesSameTheme;
    }

    public void setGamesSameTheme(List<MinGame> games) {
        gamesSameTheme.setValue(games);
    }

    public MutableLiveData<List<MinGame>> getGamesOwedByOtherOwners() {
        return gamesOwedByOtherOwners;
    }

    public void setGamesOwedByOtherOwners(List<MinGame> games) {
        gamesOwedByOtherOwners.setValue(games);
    }

}
