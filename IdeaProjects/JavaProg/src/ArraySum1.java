public class ArraySum1 {
    public static void main(String[] args){
        float[] fa={3.3f,4.4f,5.5f};

        float fa2=fa[2];
        System.out.println("fa2="+fa2);

        int faLen=fa.length;
        System.out.println("faLen="+faLen);

        float ans=0f;
        for(int i=0;i<fa.length;i++){
            float item=fa[i];
            ans=ans+item;
        }
        System.out.println("ans="+ans);
    }
}
