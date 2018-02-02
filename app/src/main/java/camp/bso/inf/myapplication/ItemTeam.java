package camp.bso.inf.myapplication;

/**
 * Created by MUL17 on 2/2/2018.
 */

public class ItemTeam {
    private int mId;
    private String teamHome;
    private String teamAway;

    public ItemTeam() {}


    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public String getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(String teamAway) {
        this.teamAway = teamAway;
    }
}
