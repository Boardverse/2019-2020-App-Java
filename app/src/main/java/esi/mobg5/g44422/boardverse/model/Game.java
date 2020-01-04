package esi.mobg5.g44422.boardverse.model;

import java.util.List;

public class Game extends MinGame {

    private Integer game_publishing_date;
    private Integer game_min_player;
    private Integer game_recommended_player;
    private Integer game_max_player;
    private Integer game_min_duration;
    private Integer game_average_duration;
    private Integer game_max_duration;
    private Integer game_min_age;
    private Integer game_recommended_age;
    private Integer game_max_age;
    private List<GameType> game_types;
    private List<GameTheme> game_themes;
    private String game_description;
    private List<String> game_pictures;
    private List<GamePublisher> game_publishers;
    private List<GameAuthor> game_authors;
    private List<GameLanguage> game_languages;
    private List<GameAward> game_awards;

    public Integer get_game_publishing_date() {
        return game_publishing_date;
    }

    public Integer get_game_min_player() {
        return game_min_player;
    }

    public Integer get_game_recommended_player() {
        return game_recommended_player;
    }

    public Integer get_game_max_player() {
        return game_max_player;
    }

    public Integer get_game_min_duration() {
        return game_min_duration;
    }

    public Integer get_game_average_duration() {
        return game_average_duration;
    }

    public Integer get_game_max_duration() {
        return game_max_duration;
    }

    public Integer get_game_min_age() {
        return game_min_age;
    }

    public Integer get_game_recommended_age() {
        return game_recommended_age;
    }

    public Integer get_game_max_age() {
        return game_max_age;
    }

    public List<GameType> get_game_types() {
        return game_types;
    }

    public List<GameTheme> get_game_themes() {
        return game_themes;
    }

    public String get_game_description() {
        return game_description;
    }

    public List<String> get_game_pictures() {
        return game_pictures;
    }

    public List<GamePublisher> get_game_publishers() {
        return game_publishers;
    }

    public List<GameAuthor> get_game_authors() {
        return game_authors;
    }

    public List<GameLanguage> get_game_languages() {
        return game_languages;
    }

    public List<GameAward> get_game_awards() {
        return game_awards;
    }

}
