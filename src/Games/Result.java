package Games;

public class Result {
    private int resultCow;
    private boolean win = true;

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public Result(Result checkNums) {

    }

    public int getResultCow() {
        return resultCow;
    }

    public int getResultBull() {
        return resultBull;
    }

    private int resultBull;

    public Result(int resultCow, int resultBull) {
        this.resultCow = resultCow;
        this.resultBull = resultBull;
    }
}
