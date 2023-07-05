package lecture_05;

public class MultiChecker {
    int arg;

    String check(int n){
        if(n % arg==0){
            return arg + "の倍数である";
        }else{
            return arg + "の倍数ではない";
        }
    }
}
