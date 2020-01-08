package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.minGameFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import java.util.Locale;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.ui.gameActivity.GameActivity;

public class MinGameFragment extends Fragment {

    private MinGameFragmentViewModel minGameFragmentViewModel;

    private ImageView game_icon;

    private TextView game_name;

    private TextView game_score;

    public MinGameFragment() {

    }

    public static MinGameFragment newInstance() {
        return new MinGameFragment();
    }

    public MinGameFragmentViewModel getMinGameFragmentViewModel() {
        return minGameFragmentViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        minGameFragmentViewModel = ViewModelProviders.of(this).get(MinGameFragmentViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.min_game_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.setOnClickListener(v -> startActivity(new Intent(getActivity(), GameActivity.class)));
        // TODO pass intent to know which game to open

        game_icon = view.findViewById(R.id.min_game_fragment_game_icon);

        game_name = view.findViewById(R.id.min_game_fragment_game_name);

        game_score = view.findViewById(R.id.min_game_fragment_game_score);

        minGameFragmentViewModel.getMinGame().observe(this, minGame -> {
            if(minGame.get_game_thumbnail_url() != null) {
                Glide
                    .with(view)
                    .load(minGame.get_game_thumbnail_url())
                    .centerCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(this.game_icon);
            }
            game_name.setText(minGame.get_game_name() == null ? "Unnamed Game" : minGame.get_game_name());
            game_score.setText(minGame.get_game_score() == null ? "?" : String.format(Locale.getDefault(), "%f", minGame.get_game_score()));
        });
    }
}
