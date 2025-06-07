public class Player {

    private String name;
    private int score;

    public void setName(String n) {
        name = n;
    }
    public String getName () {
        return name;
    }

    public void setScore(int s) {score = s;}
    public int getScore () {return score;}

    public int bestResult(int num) {
        if (this.getScore() > num) {
            this.setScore(score);
        }
        else {
            this.setScore(num);
        }
        return this.getScore();
    }
}
