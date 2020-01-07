package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.model.MinGame;

public class MinGameCarouselFragmentViewModel extends ViewModel {

    private MutableLiveData<String> title;

    private MutableLiveData<List<MinGame>> minGames;

    public MinGameCarouselFragmentViewModel() {
        title = new MutableLiveData<>();
        minGames = new MutableLiveData<>();
    }

    public MutableLiveData<String> getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setValue(title);
    }

    public MutableLiveData<List<MinGame>> getMinGames() {
        return minGames;
    }

    public void setMinGames(List<MinGame> minGames) {
        this.minGames.setValue(minGames);
    }

}
