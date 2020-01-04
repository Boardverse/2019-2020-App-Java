package esi.mobg5.g44422.boardverse.ui.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.User;

public class GameActivity extends AppCompatActivity {

    private ImageView game_activity_game_icon;

    private TextView game_activity_game_name;

    private TextView game_activity_game_publisher;

    private Button game_activity_button_game_owned;

    private RatingBar game_activity_button_game_rate;

    private Button game_activity_button_game_played;

    private Button game_activity_button_game_wishlist;

    private TextView game_activity_game_score;

    private TextView game_activity_game_players_count;

    private TextView game_activity_game_minimum_age;

    private TextView game_activity_game_duration;

    private TextView game_activity_game_publishing_date;

    private LinearLayout game_activity_game_themes_container;

    private LinearLayout game_activity_game_types_container;

    private LinearLayout game_activity_game_pictures_container;

    private View game_activity_games_same_type;

    private View game_activity_games_same_theme;

    private View game_activity_games_same_publisher;

    private View game_activity_games_friends_owning;

    private View game_activity_games_friends_loving;

    private View game_activity_games_others_owning_playing;


    private GameActivityViewModel gameActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.game_activity_game_icon = findViewById(R.id.game_activity_game_icon);
        this.game_activity_game_name = findViewById(R.id.game_activity_game_name);
        this.game_activity_game_publisher = findViewById(R.id.game_activity_game_publisher);
        this.game_activity_button_game_owned = findViewById(R.id.game_activity_button_game_owned);
        this.game_activity_button_game_rate = findViewById(R.id.game_activity_button_game_rate);
        this.game_activity_button_game_played = findViewById(R.id.game_activity_button_game_played);
        this.game_activity_button_game_wishlist = findViewById(R.id.game_activity_button_game_wishlist);
        this.game_activity_game_score = findViewById(R.id.game_activity_game_score);
        this.game_activity_game_players_count = findViewById(R.id.game_activity_game_players_count);
        this.game_activity_game_minimum_age = findViewById(R.id.game_activity_game_minimum_age);
        this.game_activity_game_duration = findViewById(R.id.game_activity_game_duration);
        this.game_activity_game_publishing_date = findViewById(R.id.game_activity_game_publishing_date);
        this.game_activity_game_themes_container = findViewById(R.id.game_activity_game_themes_container);
        this.game_activity_game_types_container = findViewById(R.id.game_activity_game_types_container);
        this.game_activity_game_pictures_container = findViewById(R.id.game_activity_game_pictures_container);
        this.game_activity_games_same_type = findViewById(R.id.game_activity_games_same_type);
        this.game_activity_games_same_theme = findViewById(R.id.game_activity_games_same_theme);
        this.game_activity_games_same_publisher = findViewById(R.id.game_activity_games_same_publisher);
        this.game_activity_games_friends_owning = findViewById(R.id.game_activity_games_friends_owning);
        this.game_activity_games_friends_loving = findViewById(R.id.game_activity_games_friends_loving);
        this.game_activity_games_others_owning_playing = findViewById(R.id.game_activity_games_others_owning_playing);

        this.gameActivityViewModel = ViewModelProviders.of(this).get(GameActivityViewModel.class);

        this.gameActivityViewModel.getFriendsLikingGame().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {

            }
        });
        this.gameActivityViewModel.getFriendsOwningGame().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {

            }
        });
        this.gameActivityViewModel.getGame().observe(this, new Observer<Game>() {
            @Override
            public void onChanged(Game game) {

            }
        });
        this.gameActivityViewModel.getGameSameTheme().observe(this, new Observer<List<MinGame>>() {
            @Override
            public void onChanged(List<MinGame> minGames) {

            }
        });
        this.gameActivityViewModel.getGamesFromSameEditor().observe(this, new Observer<List<MinGame>>() {
            @Override
            public void onChanged(List<MinGame> minGames) {

            }
        });
        this.gameActivityViewModel.getGamesSameType().observe(this, new Observer<List<MinGame>>() {
            @Override
            public void onChanged(List<MinGame> minGames) {

            }
        });
        this.gameActivityViewModel.getGamesOwedByOtherOwners().observe(this, new Observer<List<MinGame>>() {
            @Override
            public void onChanged(List<MinGame> minGames) {

            }
        });

    }
}
