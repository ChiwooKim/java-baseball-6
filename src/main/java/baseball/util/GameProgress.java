package baseball.util;

public enum GameProgress {

    START, RETRY, QUIT;

    private static final int RETRY_NUMBER = 1;

    public static boolean isQuit(GameProgress gameProgress) {
        return gameProgress == QUIT;
    }

    public static GameProgress judgeEnd(int number) {
        if (number == RETRY_NUMBER) {
            return START;
        }
        return QUIT;
    }
}
