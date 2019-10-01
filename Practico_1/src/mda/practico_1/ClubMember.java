package mda.practico_1;

public class ClubMember {
    private static int  mNextID = 1;
    private int         mID;
    private String      mName;

    public int GetID() {
        return mID;
    }
    public String GetName() {
        return mName;
    }
    public void SetName(String mName) {
        this.mName = mName;
    }


    public ClubMember(){
        mID = mNextID;
        mNextID ++;
        mName = "";
    }

    public ClubMember(String pName){
        mID = mNextID;
        mNextID ++;
        mName = pName;
    }


}
