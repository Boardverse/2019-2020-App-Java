package esi.mobg5.g44422.boardverse.ui.home;

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
            popularGames.setValue();
        }
        return popularGames;
    }

}