package esi.mobg5.g44422.boardverse.model;

import androidx.annotation.Nullable;

public class MinGame {

    private Integer game_id;

    private String game_thumbnail_url;

    private String game_name;

    private Float game_score;

    @Nullable
    public Integer get_game_id() {
        return game_id;
    }

    @Nullable
    public String get_game_thumbnail_url() {
        return game_thumbnail_url;
    }

    @Nullable
    public String get_game_name() {
        return game_name;
    }

    @Nullable
    public Float get_game_score() {
        return game_score;
    }

}
