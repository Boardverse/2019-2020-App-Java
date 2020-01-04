package esi.mobg5.g44422.boardverse.ui.gameType;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import esi.mobg5.g44422.boardverse.R;

public class GameTypeFragment extends Fragment {

    private GameTypeFragmentViewModel mViewModel;

    public static GameTypeFragment newInstance() {
        return new GameTypeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.game_type_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GameTypeFragmentViewModel.class);
        // TODO: Use the ViewModel
    }

}
