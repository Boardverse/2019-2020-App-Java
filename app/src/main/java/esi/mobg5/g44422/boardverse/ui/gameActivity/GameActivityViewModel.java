package esi.mobg5.g44422.boardverse.ui.gameActivity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.MinUser;
import esi.mobg5.g44422.boardverse.model.User;


public class GameActivityViewModel extends ViewModel {

    private Repository repository;

    private MutableLiveData<Game> game;

    private MutableLiveData<List<MinUser>> friendsOwningGame;

    private MutableLiveData<List<MinUser>> friendsLikingGame;

    private MutableLiveData<List<MinGame>> gamesFromSamePublisher;

    private MutableLiveData<List<MinGame>> gamesSameType;

    private MutableLiveData<List<MinGame>> gamesSameTheme;

    private MutableLiveData<List<MinGame>> gamesOwedByOtherOwners;

    public GameActivityViewModel() {
        repository = new Repository();
        game = new MutableLiveData<>();
        friendsOwningGame = new MutableLiveData<>();
        friendsLikingGame = new MutableLiveData<>();
        gamesFromSamePublisher = new MutableLiveData<>();
        gamesFromSamePublisher = new MutableLiveData<>();
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

    public MutableLiveData<List<MinUser>> getFriendsOwningGame() {
        return friendsOwningGame;
    }

    public void setFriendsOwningGame(List<MinUser> users) {
        friendsOwningGame.setValue(users);
    }

    public MutableLiveData<List<MinUser>> getFriendsLikingGame() {
        return friendsLikingGame;
    }

    public void setFriendsLikingGame(List<MinUser> users) {
        friendsLikingGame.setValue(users);
    }

    public MutableLiveData<List<MinGame>> getGamesFromSamePublisher() {
        return gamesFromSamePublisher;
    }

    public void setGamesFromSamePublisher(List<MinGame> games) {
        gamesFromSamePublisher.setValue(games);
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
