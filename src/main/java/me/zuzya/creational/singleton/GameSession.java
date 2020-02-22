package me.zuzya.creational.singleton;

public class GameSession {

    private static volatile GameSession instance;

    private GameSession() {

        super();
    }

    /**
     * Singleton
     * 
     * @return
     */
    public static GameSession getInstance() {

        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        //
        // Больше об этой проблеме можно почитать здесь:
        // https://refactoring.guru/ru/java-dcl-issue
        GameSession result = instance;
        if (result != null) {
            return result;
        }

        synchronized (GameSession.class) {

            if (instance == null) {

                return new GameSession();
            }

            return instance;
        }

    }
}
