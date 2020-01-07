package esi.mobg5.g44422.boardverse;

import java.util.List;

import esi.mobg5.g44422.boardverse.model.Game;
import esi.mobg5.g44422.boardverse.model.GamePublisher;
import esi.mobg5.g44422.boardverse.model.MinGame;
import esi.mobg5.g44422.boardverse.model.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BoardverseAPI {

    @GET("games")
    Call<Response<List<MinGame>>> games();

    @GET("games/new")
    Call<Response<List<MinGame>>> newGames();

    @GET("games/popular")
    Call<Response<List<MinGame>>> popularGames();

    @GET("games/randomPublisher")
    Call<Response<List<MinGame>>> randomPublisher();

    @GET("games/randomTheme")
    Call<Response<List<MinGame>>> randomTheme();

    @GET("games/randomType")
    Call<Response<List<MinGame>>> randomType();

    @GET("games/{game}/alsoPlaying")
    Call<Response<List<MinGame>>> alsoPlaying(@Path("game") String game_id);

    @GET("games/{game}/publisher")
    Call<Response<GamePublisher>> publisher(@Path("game") String game_id);

    @GET("games/{game}/samePublisher")
    Call<Response<List<MinGame>>> samePublisher(@Path("game") String game_id);

    @GET("games/{game}/sameTheme")
    Call<Response<List<MinGame>>> sameTheme(@Path("game") String game_id);

    @GET("games/{game}/sameType")
    Call<Response<List<MinGame>>> sameType(@Path("game") String game_id);

    @GET("games/{game}")
    Call<Response<Game>> game(@Path("game") String game_id);

}
