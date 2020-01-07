package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.minGameFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import esi.mobg5.g44422.boardverse.model.MinGame;

public class MinGameFragmentViewModel extends ViewModel {

    private MutableLiveData<MinGame> minGame;

    public MinGameFragmentViewModel() {
        minGame = new MutableLiveData<>();
    }

    public MutableLiveData<MinGame> getMinGame() {
        return minGame;
    }

    public void setMinGame(MinGame minGame) {
        this.minGame.setValue(minGame);
    }

}
