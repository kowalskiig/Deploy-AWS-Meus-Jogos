package project.games.personal.entity.factory;


import project.games.personal.entities.Games;

public final class GameFactory {

    private GameFactory(){}

    public static Games criarGameComTodosOsCampos() {

        return Games.builder()
                .id(1L)
                .title("The Legend of Java")
                .year(2024)
                .genre("RPG")
                .score(4.9)
                .platforms("PC, PS5")
                .imgUrl("http://example.com/image.jpg")
                .shortDescription("Uma breve descrição do jogo.")
                .longDescription("Uma descrição bem mais longa e detalhada.")
                .build();

    }
}
