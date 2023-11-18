package baseball.util;

public enum GameProgress {

    START, RETRY, QUIT;

    public static boolean isQuit(GameProgress gameProgress) {
        return gameProgress == QUIT;
    }

    public static GameProgress judgeEnd(int number) {
        if (number == 1) {
            return START;
        }
        return QUIT;
    }
}
