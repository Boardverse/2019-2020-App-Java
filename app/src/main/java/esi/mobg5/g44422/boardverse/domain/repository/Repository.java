package esi.mobg5.g44422.boardverse.domain.repository;

import esi.mobg5.g44422.boardverse.BoardverseAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Repository {

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://boardverse.ascor.ml/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static BoardverseAPI boardverseAPI = retrofit.create(BoardverseAPI.class);

}
