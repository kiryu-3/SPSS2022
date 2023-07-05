package lecture_08;

public class Club2 {
    private String clubName;

    private Member2[] members;

    private Member2 adviser;

    public Club2(String clubName,String adviser) {

        this.clubName = clubName;

        this.adviser = new Member2("顧問",adviser);


        this.members = new Member2[70];

    }

    public void join(Member2 member) {
        for (int i = 0; i < 70; i++) {
            if (members[i] == null){
                members[i] = member;
                break;
            }



        }
    }

    public void print(){
        for(int j = 0;j < 70;j++){
            if(members[j] == null){
                break;
            }else{
                System.out.print(members[j].gakuseki + ",");
                System.out.println(members[j].shimei);

            }
        }
    }

    public void taibu(String gakuseki){
        for(int k = 0;k < 70;k++) {
            if (members[k] == null) {
                break;
            } else {
                if (gakuseki.equals(members[k].gakuseki)) {
                    members[k] = null;
                    System.arraycopy(members,k+1,members,k,69-k);
                }


            }
        }




    }


}
