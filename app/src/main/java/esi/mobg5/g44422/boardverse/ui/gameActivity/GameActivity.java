package esi.mobg5.g44422.boardverse.ui.gameActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.Response;
import esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.MinGameCarouselFragment;
import retrofit2.Call;
import retrofit2.Callback;

public class GameActivity extends AppCompatActivity {

    private GameActivityViewModel gameActivityViewModel;

    private ImageView game_activity_game_icon;

    private TextView game_activity_game_name;

    private TextView game_activity_game_publisher;

    private Button game_activity_button_game_owned;

    private RatingBar game_activity_button_game_rate;

    private Button game_activity_button_game_played;

    private Button game_activity_button_game_wishlist;

    private TextView game_activity_game_score;

    private TextView game_activity_game_players_count;

    private TextView game_activity_game_players_age;

    private TextView game_activity_game_duration;

    private TextView game_activity_game_publishing_date;

    private TextView game_activity_game_description;

    private LinearLayout game_activity_game_themes_container;

    private LinearLayout game_activity_game_types_container;

    private LinearLayout game_activity_game_pictures_container;

    private MinGameCarouselFragment game_activity_games_same_type;

    private MinGameCarouselFragment game_activity_games_same_theme;

    private MinGameCarouselFragment game_activity_games_same_publisher;

    private MinGameCarouselFragment game_activity_games_friends_owning;

    private MinGameCarouselFragment game_activity_games_friends_loving;

    private MinGameCarouselFragment game_activity_games_others_owning_playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameActivityViewModel = ViewModelProviders.of(this).get(GameActivityViewModel.class);

        setContentView(R.layout.activity_game);

        game_activity_game_icon = findViewById(R.id.game_activity_game_icon);
        game_activity_game_name = findViewById(R.id.game_activity_game_name);
        game_activity_game_publisher = findViewById(R.id.game_activity_game_publisher);
        game_activity_button_game_owned = findViewById(R.id.game_activity_button_game_owned);
        game_activity_button_game_rate = findViewById(R.id.game_activity_button_game_rate);
        game_activity_button_game_played = findViewById(R.id.game_activity_button_game_played);
        game_activity_button_game_wishlist = findViewById(R.id.game_activity_button_game_wishlist);
        game_activity_game_score = findViewById(R.id.game_activity_game_score);
        game_activity_game_players_count = findViewById(R.id.game_activity_game_players_count);
        game_activity_game_players_age = findViewById(R.id.game_activity_game_players_age);
        game_activity_game_duration = findViewById(R.id.game_activity_game_duration);
        game_activity_game_publishing_date = findViewById(R.id.game_activity_game_publishing_date);
        game_activity_game_description = findViewById(R.id.game_activity_game_description);
        game_activity_game_themes_container = findViewById(R.id.game_activity_game_themes_container);
        game_activity_game_types_container = findViewById(R.id.game_activity_game_types_container);
        game_activity_game_pictures_container = findViewById(R.id.game_activity_game_pictures_container);
        game_activity_games_same_type = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.game_activity_games_same_type);
        game_activity_games_same_theme = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.game_activity_games_same_theme);
        game_activity_games_same_publisher = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.game_activity_games_same_publisher);
        game_activity_games_friends_owning = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.game_activity_games_friends_owning);
        game_activity_games_friends_loving = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.game_activity_games_friends_loving);
        game_activity_games_others_owning_playing = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.game_activity_games_others_owning_playing);


        gameActivityViewModel.getFriendsLikingGame().observe(this, users -> {

        });
        gameActivityViewModel.getFriendsOwningGame().observe(this, users -> {

        });
        gameActivityViewModel.getGame().observe(this, game -> {
            if(game.get_game_thumbnail_url() != null) {
                Glide
                    .with(this)
                    .load(game.get_game_thumbnail_url())
                    .centerCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(game_activity_game_icon);
            }
            game_activity_game_name.setText(game.get_game_name() == null ? "Unnamed game" : game.get_game_name());
            game_activity_game_publisher.setText(game.get_game_publishers().isEmpty() ? "Unknown publisher" : (game.get_game_publishers().get(0).get_game_publisher_name() == null ? "Unnamed publisher" : game.get_game_publishers().get(0).get_game_publisher_name()));
            game_activity_game_score.setText(game.get_game_score() == null ? "?" : game.get_game_score().toString());
            game_activity_game_players_count.setText(
                String.format(Locale.getDefault(), "%s - %s - %s p",
                    (game.get_game_min_player() == null) ? "?" : game.get_game_min_player().toString(),
                    (game.get_game_recommended_player() == null) ? "?" : game.get_game_recommended_player().toString(),
                    (game.get_game_max_player() == null) ? "?" : game.get_game_max_player().toString()
                )
            );
            game_activity_game_players_age.setText(
                String.format(Locale.getDefault(), "%s - %s - %s y",
                        (game.get_game_min_age() == null) ? "?" : game.get_game_min_age().toString(),
                        (game.get_game_recommended_age() == null) ? "?" : game.get_game_recommended_age().toString(),
                        (game.get_game_max_age() == null) ? "?" : game.get_game_max_age().toString()
                )
            );
            game_activity_game_duration.setText(
                String.format(Locale.getDefault(), "%s - %s - %s min",
                        (game.get_game_min_duration() == null) ? "" : game.get_game_min_duration().toString(),
                        (game.get_game_average_duration() == null) ? "" : game.get_game_average_duration().toString(),
                        (game.get_game_max_duration() == null) ? "" : game.get_game_max_duration().toString()
                )
            );
            GregorianCalendar c = new GregorianCalendar();
            if(game.get_game_publishing_date() != null) {
                c.setTimeInMillis(game.get_game_publishing_date());
            }
            game_activity_game_publishing_date.setText(
                game.get_game_publishing_date() == null ? "?" : new SimpleDateFormat("yyyy - MMM - dd", Locale.getDefault()).format(c.getTime())
            );
            game_activity_game_description.setText(game.get_game_description() == null ? "No description" : game.get_game_description());
            game_activity_game_pictures_container.removeAllViews();
            for(String url : game.get_game_pictures()) {
                ImageView i = new ImageView(getApplicationContext());
                Glide
                    .with(this)
                    .load(url)
                    .centerCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(i);
                game_activity_game_pictures_container.addView(i);
            }

        });
        gameActivityViewModel.getGamesSameTheme().observe(this, minGames -> {
            try {
                game_activity_games_same_theme.getMinGameCarouselFragmentViewModel().setMinGames(minGames);
            } catch (Exception e) {
                Toast.makeText(getApplication().getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        gameActivityViewModel.getGamesFromSameEditor().observe(this, minGames -> {
           try {
               game_activity_games_same_publisher.getMinGameCarouselFragmentViewModel().setMinGames(minGames);
           } catch (Exception e) {
               Toast.makeText(getApplication().getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
           }
        });
        gameActivityViewModel.getGamesSameType().observe(this, minGames -> {
            try {
                game_activity_games_same_type.getMinGameCarouselFragmentViewModel().setMinGames(minGames);
            } catch (Exception e) {
                Toast.makeText(getApplication().getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        gameActivityViewModel.getGamesOwedByOtherOwners().observe(this, minGames -> {
            try {
                game_activity_games_others_owning_playing.getMinGameCarouselFragmentViewModel().setMinGames(minGames);
            } catch (Exception e) {
                Toast.makeText(getApplication().getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        Repository.boardverseAPI.game("1").enqueue(new Callback<Response<Game>>() {
            @Override
            public void onResponse(Call<Response<Game>> call, retrofit2.Response<Response<Game>> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL NETWORK LEVEL 1", Toast.LENGTH_LONG).show();
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL DATA LEVEL", Toast.LENGTH_LONG).show();
                    return;
                }
                gameActivityViewModel.setGame(response.body().getData());
            }

            @Override
            public void onFailure(Call<Response<Game>> call, Throwable t) {
                Toast.makeText(getApplication().getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable View parent, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

}