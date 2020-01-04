package esi.mobg5.g44422.boardverse.ui.homeActivity.homeFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.MinGame;

public class HomeFragmentViewModel extends ViewModel {

    private Repository repository;

    private MutableLiveData<List<MinGame>> popularGames;

    private MutableLiveData<List<MinGame>> newGames;

    private MutableLiveData<List<MinGame>> gamesPlayedByFriends;

    private MutableLiveData<List<MinGame>> gamesLovedByFriends;

    private MutableLiveData<List<MinGame>> gamesRandomTheme;

    private MutableLiveData<List<MinGame>> gamesRandomType;

    private MutableLiveData<List<MinGame>> gamesRandomPublisher;


    public HomeFragmentViewModel() {
        repository = new Repository();
    }

    public MutableLiveData<List<MinGame>> getPopularGames() {
        if(popularGames == null) {
            popularGames = new MutableLiveData<>();
            // TODO
        }
        return popularGames;
    }

    public void setPopularGames(List<MinGame> popularGames) {
        this.popularGames.setValue(popularGames);
    }

    public MutableLiveData<List<MinGame>> getNewGames() {
        if(newGames == null) {
            newGames = new MutableLiveData<>();
            // TODO
        }
        return newGames;
    }

    public void setNewGames(List<MinGame> newGames) {
        this.newGames.setValue(newGames);
    }

    public MutableLiveData<List<MinGame>> getGamesPlayedByFriends() {
        if(gamesPlayedByFriends == null) {
            gamesPlayedByFriends = new MutableLiveData<>();
            // TODO
        }
        return gamesPlayedByFriends;
    }

    public void setGamesPlayedByFriends(List<MinGame> gamesPlayedByFriends) {
        this.gamesPlayedByFriends.setValue(gamesPlayedByFriends);
    }

    public MutableLiveData<List<MinGame>> getGamesLovedByFriends() {
        if(gamesLovedByFriends == null) {
            gamesLovedByFriends = new MutableLiveData<>();
            // TODO
        }
        return gamesLovedByFriends;
    }

    public void setGamesLovedByFriends(List<MinGame> gamesLovedByFriends) {
        this.gamesLovedByFriends.setValue(gamesLovedByFriends);
    }

    public MutableLiveData<List<MinGame>> getGamesRandomTheme() {
        if(gamesRandomTheme == null) {
            gamesRandomTheme = new MutableLiveData<>();
            // TODO
        }
        return gamesRandomTheme;
    }

    public void setGamesRandomTheme(List<MinGame> gamesRandomTheme) {
        this.gamesRandomTheme.setValue(gamesRandomTheme);
    }

    public MutableLiveData<List<MinGame>> getGamesRandomTypes() {
        if(gamesRandomType == null) {
            gamesRandomType = new MutableLiveData<>();
            // TODO
        }
        return gamesRandomType;
    }

    public void setGamesRandomType(List<MinGame> gamesRandomType) {
        this.gamesRandomTheme.setValue(gamesRandomType);
    }

    public MutableLiveData<List<MinGame>> getGamesRandomPublisher() {
        if(gamesRandomPublisher == null) {
            gamesRandomPublisher = new MutableLiveData<>();
            // TODO
        }
        return gamesRandomPublisher;
    }

    public void setGamesRandomPublisher(List<MinGame> gamesRandomPublisher) {
        this.gamesRandomTheme.setValue(gamesRandomPublisher);
    }

}