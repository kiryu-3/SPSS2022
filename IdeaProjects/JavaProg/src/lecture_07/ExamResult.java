package lecture_07;

public class ExamResult {
        private String name;
        private int point;

        public ExamResult(String name,int point){
                this.name=name;
                this.point=point;
        }

        public void setPoint(int point) {
                if(point>=0 && point<=100){
                        this.point = point;
                }else{
                        this.point = 0;
                }

        }

        public String decide(int border){
                if(this.point>=border){
                        return "合格";
                }
                else{
                        return "不合格";
                }
        }
}
