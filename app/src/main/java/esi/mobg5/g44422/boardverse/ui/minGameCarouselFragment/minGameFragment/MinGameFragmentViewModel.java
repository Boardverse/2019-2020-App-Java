package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.minGameFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.MinGame;

public class MinGameFragmentViewModel extends ViewModel {

    private Repository repository;

    private MutableLiveData<MinGame> minGame;

    public MutableLiveData<MinGame> getMinGame() {
        if(minGame == null) {
            minGame = new MutableLiveData<>();
            // TODO
        }
        return minGame;
    }

    public void setMinGame(MinGame minGame) {
        this.minGame.setValue(minGame);
    }

    // TODO: Implement the ViewModel
}
