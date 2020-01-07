package esi.mobg5.g44422.boardverse.ui.gameActivity.gameTypeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;

public class GameTypeFragment extends Fragment {

    private GameTypeFragmentViewModel gameTypeFragmentViewModel;

    private Button game_type_fragment_text;

    public static GameTypeFragment newInstance() {
        return new GameTypeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameTypeFragmentViewModel = ViewModelProviders.of(this).get(GameTypeFragmentViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.game_type_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        game_type_fragment_text = view.findViewById(R.id.game_type_fragment_text);
        gameTypeFragmentViewModel.getGameType().observe(this, gameType -> game_type_fragment_text.setText(gameType.get_game_type_name()));
    }

}
