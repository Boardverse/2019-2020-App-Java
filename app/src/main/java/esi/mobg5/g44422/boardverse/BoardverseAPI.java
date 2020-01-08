package esi.mobg5.g44422.boardverse;

import java.util.List;

import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.GamePublisher;
import esi.mobg5.g44422.boardverse.model.GameScore;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.MinUser;
import esi.mobg5.g44422.boardverse.model.Response;
import esi.mobg5.g44422.boardverse.model.User;
import esi.mobg5.g44422.boardverse.model.UserAchievement;
import esi.mobg5.g44422.boardverse.ui.userActivity.UserActivity;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BoardverseAPI {

    /**
     * Returns all games
     */
    @GET("games")
    Call<Response<List<MinGame>>> games();

    /**
     * Returns the new games
     */
    @GET("games/new")
    Call<Response<List<MinGame>>> newGames();

    /**
     * Returns the popular games
     */
    @GET("games/popular")
    Call<Response<List<MinGame>>> popularGames();

    /**
     * Returns games from a random publisher
     */
    @GET("games/randomPublisher")
    Call<Response<List<MinGame>>> randomPublisher();

    /**
     * Returns games from a random theme
     */
    @GET("games/randomTheme")
    Call<Response<List<MinGame>>> randomTheme();

    /**
     * Returns games from a random type
     */
    @GET("games/randomType")
    Call<Response<List<MinGame>>> randomType();

    /**
     * Returns games that players of this game also play
     */
    @GET("games/{game}/alsoPlaying")
    Call<Response<List<MinGame>>> alsoPlaying(@Path("game") String game_id);

    /**
     * Returns the publishers of the game
     */
    @GET("games/{game}/publishers")
    Call<Response<GamePublisher>> publishers(@Path("game") String game_id);

    /**
     * Returns games made by the same publisher
     */
    @GET("games/{game}/samePublisher")
    Call<Response<List<MinGame>>> samePublisher(@Path("game") String game_id);

    /**
     * Returns games from the same theme
     */
    @GET("games/{game}/sameTheme")
    Call<Response<List<MinGame>>> sameTheme(@Path("game") String game_id);

    /**
     * Returns games from the same type
     */
    @GET("games/{game}/sameType")
    Call<Response<List<MinGame>>> sameType(@Path("game") String game_id);

    /**
     * returns the different scores of this game
     */
    @GET("games/{game}/scores")
    Call<Response<List<GameScore>>> scores(@Path("game") String game_id);

    /**
     * Returns games similar to this one
     */
    @GET("games/{game}/similar")
    Call<Response<List<MinGame>>> similar(@Path("game") String game_id);

    /**
     * Returns a game
     */
    @GET("games/{game}")
    Call<Response<Game>> game(@Path("game") String game_id);

    /**
     * Returns the achievements of a user
     */
    @GET("users/{user}/achievements")
    Call<Response<List<UserAchievement>>> achievements(@Path("user") String user_id);

    /**
     * Returns the activities of a user
     */
    @GET("users/{user}/activity")
    Call<Response<List<UserActivity>>> activity(@Path("user") String user_id);

    /**
     * Returns the games in the users' collection
     */
    @GET("users/{user}/collection")
    Call<Response<List<MinGame>>> collection(@Path("user") String user_id);

    /**
     * Returns the fiends of the user
     */
    @GET("users/{user}/friends")
    Call<Response<List<MinUser>>> friends(@Path("user") String user_id);

    /**
     * Returns the games the user has ever played
     */
    @GET("users/{user}/played")
    Call<Response<List<MinGame>>> played(@Path("user") String user_id);

    /**
     * Returns the score the user gave to every game
     */
    @GET("users/{user}/reviews")
    Call<Response<List<GameScore>>> reviews(@Path("user") String user_id);

    /**
     * Returns the games the user has reviewed
     */
    @GET("users/{user}/reviewed")
    Call<Response<List<MinGame>>> reviewed(@Path("user") String user_id);

    /**
     * Returns the game in the user's whitelist
     */
    @GET("users/{user}/wishlist")
    Call<Response<List<MinGame>>> wishlist(@Path("user") String user_id);

    /**
     * Returns an user
     */
    @GET("users/{user}")
    Call<Response<User>> user(@Path("user") String user_id);

}
