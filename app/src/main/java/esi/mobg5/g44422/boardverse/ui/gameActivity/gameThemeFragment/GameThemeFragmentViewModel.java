package esi.mobg5.g44422.boardverse.ui.gameActivity.gameThemeFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import esi.mobg5.g44422.boardverse.model.GameTheme;

public class GameThemeFragmentViewModel extends ViewModel {

    private MutableLiveData<GameTheme> gameTheme;

    public GameThemeFragmentViewModel() {
        gameTheme = new MutableLiveData<>();
        init();
    }

    public MutableLiveData<GameTheme> getGameTheme() {
        return gameTheme;
    }

    public void setGameTheme(GameTheme gameTheme) {
        this.gameTheme.setValue(gameTheme);
    }

    private void init() {
        // TODO
    }

}
