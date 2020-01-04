package esi.mobg5.g44422.boardverse.model;

public class User extends MinUser {

    private Integer games_owned;
    private Integer games_reviewed;
    private Integer games_wishlisted;

    public Integer get_games_owned() {
        return games_owned;
    }

    public Integer get_games_reviewed() {
        return games_reviewed;
    }

    public Integer get_games_wishlisted() {
        return games_wishlisted;
    }

}
