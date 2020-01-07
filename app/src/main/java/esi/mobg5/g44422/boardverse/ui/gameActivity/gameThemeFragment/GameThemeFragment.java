package esi.mobg5.g44422.boardverse.ui.gameActivity.gameThemeFragment;

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

public class GameThemeFragment extends Fragment {

    private GameThemeFragmentViewModel gameThemeFragmentViewModel;

    private Button game_theme_fragment_text;

    public static GameThemeFragment newInstance() {
        return new GameThemeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameThemeFragmentViewModel = ViewModelProviders.of(this).get(GameThemeFragmentViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.game_theme_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        game_theme_fragment_text = view.findViewById(R.id.game_theme_fragment_text);
        gameThemeFragmentViewModel.getGameTheme().observe(this, gameTheme -> game_theme_fragment_text.setText(gameTheme.get_game_theme_name()));
    }
}
