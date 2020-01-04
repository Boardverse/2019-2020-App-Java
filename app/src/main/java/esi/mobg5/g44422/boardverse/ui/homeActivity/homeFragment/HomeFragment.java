package esi.mobg5.g44422.boardverse.ui.homeActivity.homeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.MinGameCarouselFragment;

public class HomeFragment extends Fragment {

    private HomeFragmentViewModel homeFragmentViewModel;

    private MinGameCarouselFragment home_activity_game_popular;

    private MinGameCarouselFragment home_activity_game_new;

    private MinGameCarouselFragment home_activity_game_your_friend_also_play;

    private MinGameCarouselFragment game_activity_games_friends_love;

    private MinGameCarouselFragment home_activity_game_random_theme;

    private MinGameCarouselFragment home_activity_game_random_type;

    private MinGameCarouselFragment home_activity_game_famous_publisher;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        homeFragmentViewModel = ViewModelProviders.of(this).get(HomeFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        // home_activity_game_popular = root.findViewById(R.id.home_activity_game_popular);
        return root;
    }
}