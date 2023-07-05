package lecture_08;

public class Club {
    private String clubName;
    private Member[] members;

    public Club(String clubname){
        this.clubName=clubname;
        members=new Member[70];
    }

    public void join(Member member){
        for(int i=0;i<70;i++){
            if(members[i]==null){
                members[i]=member;
                break;
            }
        }
    }

    public void print(){
        int i=0;
        System.out.println(clubName);
        while(true){
            members[i].print();
            i++;
            if(members[i]==null){
                break;
            }
        }
    }

}
