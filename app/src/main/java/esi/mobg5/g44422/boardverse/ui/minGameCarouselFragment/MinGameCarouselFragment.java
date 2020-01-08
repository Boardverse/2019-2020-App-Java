package esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import java.util.zip.Inflater;

import esi.mobg5.g44422.boardverse.R;

public class MinGameCarouselFragment extends Fragment {

    private MinGameCarouselFragmentViewModel minGameCarouselFragmentViewModel;

    private TextView title;

    private ImageButton viewAllButton;

    private LinearLayout listElements;

    public MinGameCarouselFragment() {

    }

    public static MinGameCarouselFragment newInstance() {
        return new MinGameCarouselFragment();
    }

    public MinGameCarouselFragmentViewModel getMinGameCarouselFragmentViewModel() {
        return minGameCarouselFragmentViewModel;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        minGameCarouselFragmentViewModel = ViewModelProviders.of(this).get(MinGameCarouselFragmentViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.min_game_carousel_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        title = view.findViewById(R.id.min_game_carousel_title);
        minGameCarouselFragmentViewModel.getTitle().observe(this, s -> title.setText(s));

        viewAllButton = view.findViewById(R.id.min_game_carousel_view_all_button);
        viewAllButton.setOnClickListener(v -> {
            CharSequence text = "View More";
            Toast toast = Toast.makeText(v.getContext(), text, Toast.LENGTH_SHORT);
            toast.show();
        });

        listElements = view.findViewById(R.id.min_game_carousel_list_elements);
/*
        minGameCarouselFragmentViewModel.getMinGames().observe(this, minGames -> {
            /*
            for (Fragment fragment : getFragmentManager().getFragments()) {
                getFragmentManager().beginTransaction().remove(fragment).commit();
            }
            listElements.removeAllViews();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // TODO

            for (MinGame minGame : minGames) {
                MinGameFragment mg = MinGameFragment.newInstance();
                getFragmentManager().beginTransaction().add(R.id.min_game_carousel_list_elements, mg).commit();
                try {
                    mg.getMinGameFragmentViewModel().setMinGame(minGame);
                } catch (Exception e) {
                    Toast.makeText(this.getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
*/
    }
}
