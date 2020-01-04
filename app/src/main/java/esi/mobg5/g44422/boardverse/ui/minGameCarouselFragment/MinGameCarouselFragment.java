package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.minGameFragment.MinGameFragment;

public class MinGameCarouselFragment extends Fragment {

    private MinGameCarouselFragmentViewModel minGameCarouselFragmentViewModel;

    private TextView title;

    private ImageButton viewAllButton;

    private LinearLayout listElements;

    public static MinGameCarouselFragment newInstance() {
        return new MinGameCarouselFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.min_game_carousel_fragment, container, false);
        this.title = root.findViewById(R.id.carousel_title);
        return root;
    }

    @Override
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        minGameCarouselFragmentViewModel = ViewModelProviders.of(this).get(MinGameCarouselFragmentViewModel.class);

        minGameCarouselFragmentViewModel.getTitle().observe(this, s -> {
            this.title.setText(s);
        });

        minGameCarouselFragmentViewModel.getMinGames().observe(this, minGames -> {
            this.listElements.removeAllViews();
            for (MinGame minGame : minGames) {
                this.listElements.addView(MinGameFragment.newInstance().getView());
            }
        });
    }

}
