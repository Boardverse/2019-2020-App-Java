package esi.mobg5.g44422.boardverse.ui.gameActivity.gameTypeFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import esi.mobg5.g44422.boardverse.model.GameType;

public class GameTypeFragmentViewModel extends ViewModel {

    private MutableLiveData<GameType> gameType;

    public GameTypeFragmentViewModel() {
        gameType = new MutableLiveData<>();
        init();
    }

    public MutableLiveData<GameType> getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType.setValue(gameType);
    }

    private void init() {
        // TODO
    }

}
