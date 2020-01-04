package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.MinGame;

public class MinGameCarouselFragmentViewModel extends ViewModel {

    private Repository repository;

    private MutableLiveData<String> title;

    private MutableLiveData<List<MinGame>> minGames;

    public MinGameCarouselFragmentViewModel() {
        repository = new Repository();
    }

    public MutableLiveData<String> getTitle() {
        if(title == null) {
            this.title = new MutableLiveData<>();
        }
        return title;
    }

    public void setTitle(String title) {
        this.title.setValue(title);
    }

    public MutableLiveData<List<MinGame>> getMinGames() {
        if(minGames == null) {
            minGames = new MutableLiveData<>();
            // TODO
        }
        return minGames;
    }

    public void setMinGames(List<MinGame> minGames) {
        this.minGames.setValue(minGames);
    }

}
