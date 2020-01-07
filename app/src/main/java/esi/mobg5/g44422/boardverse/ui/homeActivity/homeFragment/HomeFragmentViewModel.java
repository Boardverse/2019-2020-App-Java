package esi.mobg5.g44422.boardverse.ui.homeActivity.homeFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.GamePublisher;
import esi.mobg5.g44422.boardverse.model.GameTheme;
import esi.mobg5.g44422.boardverse.model.GameType;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.Response;
import retrofit2.Call;
import retrofit2.Callback;

public class HomeFragmentViewModel extends ViewModel {

    private MutableLiveData<List<MinGame>> popularGames;

    private MutableLiveData<List<MinGame>> newGames;

    private MutableLiveData<List<MinGame>> gamesPlayedByFriends;

    private MutableLiveData<List<MinGame>> gamesLovedByFriends;

    private MutableLiveData<List<MinGame>> gamesRandomTheme;

    private MutableLiveData<GameTheme> gameTheme;

    private MutableLiveData<List<MinGame>> gamesRandomType;

    private MutableLiveData<GameType> gameType;

    private MutableLiveData<List<MinGame>> gamesRandomPublisher;

    private MutableLiveData<GamePublisher> gamePublisher;


    public HomeFragmentViewModel() {
        popularGames = new MutableLiveData<>();
        newGames = new MutableLiveData<>();
        gamesPlayedByFriends = new MutableLiveData<>();
        gamesLovedByFriends = new MutableLiveData<>();
        gamesRandomTheme = new MutableLiveData<>();
        gameTheme = new MutableLiveData<>();
        gamesRandomType = new MutableLiveData<>();
        gameType = new MutableLiveData<>();
        gamesRandomPublisher = new MutableLiveData<>();
        gamePublisher = new MutableLiveData<>();
        init();
    }

    public MutableLiveData<List<MinGame>> getPopularGames() {
        return popularGames;
    }

    public void setPopularGames(List<MinGame> popularGames) {
        this.popularGames.setValue(popularGames);
    }

    public MutableLiveData<List<MinGame>> getNewGames() {
        return newGames;
    }

    public void setNewGames(List<MinGame> newGames) {
        this.newGames.setValue(newGames);
    }

    public MutableLiveData<List<MinGame>> getGamesPlayedByFriends() {
        return gamesPlayedByFriends;
    }

    public void setGamesPlayedByFriends(List<MinGame> gamesPlayedByFriends) {
        this.gamesPlayedByFriends.setValue(gamesPlayedByFriends);
    }

    public MutableLiveData<List<MinGame>> getGamesLovedByFriends() {
        return gamesLovedByFriends;
    }

    public void setGamesLovedByFriends(List<MinGame> gamesLovedByFriends) {
        this.gamesLovedByFriends.setValue(gamesLovedByFriends);
    }

    public MutableLiveData<List<MinGame>> getGamesRandomTheme() {
        return gamesRandomTheme;
    }

    public void setGamesRandomTheme(List<MinGame> gamesRandomTheme) {
        this.gamesRandomTheme.setValue(gamesRandomTheme);
    }

    public MutableLiveData<GameTheme> getGameTheme() {
        return gameTheme;
    }

    public void setGameTheme(GameTheme gameTheme) {
        this.gameTheme.setValue(gameTheme);
    }

    public MutableLiveData<List<MinGame>> getGamesRandomType() {
        return gamesRandomType;
    }

    public void setGamesRandomType(List<MinGame> gamesRandomType) {
        this.gamesRandomTheme.setValue(gamesRandomType);
    }

    public MutableLiveData<GameType> getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType.setValue(gameType);
    }

    public MutableLiveData<List<MinGame>> getGamesRandomPublisher() {
        return gamesRandomPublisher;
    }

    public void setGamesRandomPublisher(List<MinGame> gamesRandomPublisher) {
        this.gamesRandomTheme.setValue(gamesRandomPublisher);
    }

    public MutableLiveData<GamePublisher> getGamePublisher() {
        return gamePublisher;
    }

    public void setGamePublisher(GamePublisher gamePublisher) {
        this.gamePublisher.setValue(gamePublisher);
    }

    private void init() {
        Repository.boardverseAPI.popularGames().enqueue(new Callback<Response<List<MinGame>>>() {
            @Override
            public void onResponse(@NotNull Call<Response<List<MinGame>>> call, @NotNull retrofit2.Response<Response<List<MinGame>>> response) {
                if (!response.isSuccessful()) {
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    return;
                }
                popularGames.setValue(response.body().getData());
            }

            @Override
            public void onFailure(@NotNull Call<Response<List<MinGame>>> call, @NotNull Throwable t) {
                popularGames.setValue(new ArrayList<>());
            }
        });
    }

}