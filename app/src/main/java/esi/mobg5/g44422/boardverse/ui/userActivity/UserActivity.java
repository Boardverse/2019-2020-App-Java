package esi.mobg5.g44422.boardverse.ui.userActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import java.util.List;

import esi.mobg5.g44422.boardverse.R;
import esi.mobg5.g44422.boardverse.domain.repository.Repository;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.MinUser;
import esi.mobg5.g44422.boardverse.model.Response;
import esi.mobg5.g44422.boardverse.model.User;
import esi.mobg5.g44422.boardverse.ui.minGameCarouselFragment.MinGameCarouselFragment;
import esi.mobg5.g44422.boardverse.ui.minUserCarouselFragment.MinUserCarouselFragment;
import retrofit2.Call;
import retrofit2.Callback;

public class UserActivity extends AppCompatActivity {

    private UserActivityViewModel userActivityViewModel;

    private ImageView user_activity_user_icon;

    private TextView user_activity_user_name;

    private TextView user_activity_user_games_owned_count;

    private TextView user_activity_user_games_reviewed_count;

    private TextView user_activity_user_games_wishlisted_count;

    private Button user_activity_user_add_friend_button;

    private MinGameCarouselFragment user_activity_user_games_played;

    private MinGameCarouselFragment user_activity_user_games_reviewed;

    private MinGameCarouselFragment user_activity_user_games_wishlisted;

    private MinUserCarouselFragment user_activity_user_friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userActivityViewModel = ViewModelProviders.of(this).get(UserActivityViewModel.class);

        setContentView(R.layout.activity_user);

        user_activity_user_icon = findViewById(R.id.user_activity_user_icon);
        user_activity_user_name = findViewById(R.id.user_activity_user_name);
        user_activity_user_games_owned_count = findViewById(R.id.user_activity_user_games_owned_count);
        user_activity_user_games_reviewed_count = findViewById(R.id.user_activity_user_games_reviewed_count);
        user_activity_user_games_wishlisted_count = findViewById(R.id.user_activity_user_games_wishlisted_count);
        user_activity_user_add_friend_button = findViewById(R.id.user_activity_user_add_friend_button);
        user_activity_user_games_played = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.user_activity_user_games_played);
        user_activity_user_games_reviewed = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.user_activity_user_games_reviewed);
        user_activity_user_games_wishlisted = (MinGameCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.user_activity_user_games_wishlisted);
        user_activity_user_friends = (MinUserCarouselFragment) getSupportFragmentManager().findFragmentById(R.id.user_activity_user_friends);

        userActivityViewModel.getUser().observe(this, user -> {
            if(user.get_user_icon_url() != null) {
                Glide
                    .with(this)
                    .load(user.get_user_icon_url())
                    .centerCrop()
                    .placeholder(R.drawable.loading_spinner)
                    .into(user_activity_user_icon);
            }
            user_activity_user_name.setText(user.get_user_name() == null ? "Unnamed User" : user.get_user_name());
            user_activity_user_games_owned_count.setText(user.get_games_owned().toString());
            user_activity_user_games_reviewed_count.setText(user.get_games_reviewed().toString());
            user_activity_user_games_wishlisted_count.setText(user.get_games_wishlisted().toString());
        });

        userActivityViewModel.getGamesPlayed().observe(this, minGames -> user_activity_user_games_played.getMinGameCarouselFragmentViewModel().setMinGames(minGames));
        user_activity_user_games_played.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.user_Activity_games_played));

        userActivityViewModel.getGamesReviewed().observe(this, minGames -> user_activity_user_games_reviewed.getMinGameCarouselFragmentViewModel().setMinGames(minGames));
        user_activity_user_games_reviewed.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.user_activity_games_reviewed));

        userActivityViewModel.getGamesWishlisted().observe(this, minGames -> user_activity_user_games_wishlisted.getMinGameCarouselFragmentViewModel().setMinGames(minGames));
        user_activity_user_games_wishlisted.getMinGameCarouselFragmentViewModel().setTitle(getResources().getString(R.string.user_activity_games_wishlisted));

        userActivityViewModel.getFriends().observe(this, friends -> user_activity_user_friends.getMinUserCarouselFragmentViewModel().setMinUsers(friends));
        user_activity_user_friends.getMinUserCarouselFragmentViewModel().setTitle(getResources().getString(R.string.user_activity_friends));

        Repository.boardverseAPI.user("1"/*userActivityViewModel.getUser().getValue().get_user_id().toString()*/).enqueue(new Callback<Response<User>>() {
            @Override
            public void onResponse(Call<Response<User>> call, retrofit2.Response<Response<User>> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL NETWORK LEVEL 1", Toast.LENGTH_LONG).show();
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL DATA LEVEL", Toast.LENGTH_LONG).show();
                    return;
                }
                userActivityViewModel.setUser(response.body().getData());
            }

            @Override
            public void onFailure(Call<Response<User>> call, Throwable t) {
                Toast.makeText(getApplication().getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        Repository.boardverseAPI.played("1"/*userActivityViewModel.getUser().getValue().get_user_id().toString()*/).enqueue(new Callback<Response<List<MinGame>>>() {
            @Override
            public void onResponse(Call<Response<List<MinGame>>> call, retrofit2.Response<Response<List<MinGame>>> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL NETWORK LEVEL 1", Toast.LENGTH_LONG).show();
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL DATA LEVEL", Toast.LENGTH_LONG).show();
                    return;
                }
                userActivityViewModel.setGamesPlayed(response.body().getData());
            }

            @Override
            public void onFailure(Call<Response<List<MinGame>>> call, Throwable t) {
                Toast.makeText(getApplication().getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        Repository.boardverseAPI.reviewed("1"/*userActivityViewModel.getUser().getValue().get_user_id().toString()*/).enqueue(new Callback<Response<List<MinGame>>>() {
            @Override
            public void onResponse(Call<Response<List<MinGame>>> call, retrofit2.Response<Response<List<MinGame>>> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL NETWORK LEVEL 1", Toast.LENGTH_LONG).show();
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL DATA LEVEL", Toast.LENGTH_LONG).show();
                    return;
                }
                userActivityViewModel.setGamesReviewed(response.body().getData());
            }

            @Override
            public void onFailure(Call<Response<List<MinGame>>> call, Throwable t) {
                Toast.makeText(getApplication().getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        Repository.boardverseAPI.wishlist("1"/*userActivityViewModel.getUser().getValue().get_user_id().toString()*/).enqueue(new Callback<Response<List<MinGame>>>() {
            @Override
            public void onResponse(Call<Response<List<MinGame>>> call, retrofit2.Response<Response<List<MinGame>>> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL NETWORK LEVEL 1", Toast.LENGTH_LONG).show();
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL DATA LEVEL", Toast.LENGTH_LONG).show();
                    return;
                }
                userActivityViewModel.setGamesWishlisted(response.body().getData());
            }

            @Override
            public void onFailure(Call<Response<List<MinGame>>> call, Throwable t) {
                Toast.makeText(getApplication().getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        Repository.boardverseAPI.friends("1"/*userActivityViewModel.getUser().getValue().get_user_id().toString()*/).enqueue(new Callback<Response<List<MinUser>>>() {
            @Override
            public void onResponse(Call<Response<List<MinUser>>> call, retrofit2.Response<Response<List<MinUser>>> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL NETWORK LEVEL 1", Toast.LENGTH_LONG).show();
                    return;
                }
                if (response.body().getErrors() != null || response.body().getData() == null) {
                    Toast.makeText(getApplication().getApplicationContext(), "FAIL DATA LEVEL", Toast.LENGTH_LONG).show();
                    return;
                }
                userActivityViewModel.setFriends(response.body().getData());

            }

            @Override
            public void onFailure(Call<Response<List<MinUser>>> call, Throwable t) {
                Toast.makeText(getApplication().getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
