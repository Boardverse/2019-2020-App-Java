package esi.mobg5.g44422.boardverse.ui.homeActivity.homeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeFragmentViewModel = ViewModelProviders.of(this).get(HomeFragmentViewModel.class);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        home_activity_game_popular = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.home_activity_game_popular);
        home_activity_game_popular.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.home_activity_game_popular));
        homeFragmentViewModel.getPopularGames().observe(this, minGames -> home_activity_game_popular.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

        home_activity_game_new = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.home_activity_game_new);
        home_activity_game_new.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.home_activity_game_new));
        homeFragmentViewModel.getNewGames().observe(this, minGames -> home_activity_game_new.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

        home_activity_game_your_friend_also_play = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.home_activity_game_your_friend_also_play);
        home_activity_game_your_friend_also_play.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.home_activity_game_your_friend_also_play));
        homeFragmentViewModel.getGamesPlayedByFriends().observe(this, minGames -> home_activity_game_your_friend_also_play.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

        game_activity_games_friends_love = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.game_activity_games_friends_love);
        game_activity_games_friends_love.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.home_activity_game_your_friends_love));
        homeFragmentViewModel.getGamesLovedByFriends().observe(this, minGames -> game_activity_games_friends_love.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

        home_activity_game_random_theme = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.home_activity_game_random_theme);
        home_activity_game_random_theme.getMinGameCarouselFragmentViewModel().setTitle(String.format(getResources().getString(R.string.home_activity_game_random_theme), (homeFragmentViewModel.getGameTheme().getValue() == null) ? "" : homeFragmentViewModel.getGameTheme().getValue().get_game_theme_name()));
        homeFragmentViewModel.getGamesRandomTheme().observe(this, minGames -> home_activity_game_random_theme.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

        home_activity_game_random_type = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.home_activity_game_random_type);
        home_activity_game_random_type.getMinGameCarouselFragmentViewModel().setTitle(String.format(getResources().getString(R.string.home_activity_game_random_type), (homeFragmentViewModel.getGameType().getValue() == null) ? "" : homeFragmentViewModel.getGameType().getValue().get_game_type_name()));
        homeFragmentViewModel.getGamesRandomType().observe(this, minGames -> home_activity_game_random_type.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

        home_activity_game_famous_publisher = (MinGameCarouselFragment) getChildFragmentManager().findFragmentById(R.id.home_activity_game_famous_publisher);
        home_activity_game_famous_publisher.getMinGameCarouselFragmentViewModel().setTitle(String.format(getResources().getString(R.string.home_activity_game_famous_publisher), (homeFragmentViewModel.getGamePublisher().getValue() == null) ? "publisher" : homeFragmentViewModel.getGamePublisher().getValue().get_game_publisher_name()));
        homeFragmentViewModel.getGamesRandomPublisher().observe(this, minGames -> home_activity_game_famous_publisher.getMinGameCarouselFragmentViewModel().setMinGames(minGames));

    }
}