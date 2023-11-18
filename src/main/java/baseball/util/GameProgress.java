package baseball.util;

public enum GameProgress {

    START, RETRY, QUIT;

    public static boolean isRetry(GameProgress gameProgress) {
        return gameProgress == RETRY;
    }

    public static boolean isQuit(GameProgress gameProgress) {
        return gameProgress == QUIT;
    }
}
