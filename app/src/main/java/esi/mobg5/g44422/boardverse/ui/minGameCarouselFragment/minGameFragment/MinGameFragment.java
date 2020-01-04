package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.minGameFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import esi.mobg5.g44422.boardverse.R;

public class MinGameFragment extends Fragment {

    private MinGameFragmentViewModel minGameFragmentViewModel;

    private ImageView game_icon;

    private TextView game_name;

    private TextView game_score;

    public static MinGameFragment newInstance() {
        return new MinGameFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.min_game_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.game_icon = view.findViewById(R.id.min_game_fragment_game_icon);
        this.game_name = view.findViewById(R.id.min_game_fragment_game_name);
        this.game_score = view.findViewById(R.id.min_game_fragment_game_score);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        minGameFragmentViewModel = ViewModelProviders.of(this).get(MinGameFragmentViewModel.class);

        minGameFragmentViewModel.getMinGame().observe(this, minGame -> {
            Glide
                .with(this.getView())
                .load(minGame.get_game_thumbnail_url())
                .centerCrop()
                .placeholder(R.drawable.loading_spinner)
                .into(this.game_icon);
        });
    }

}
