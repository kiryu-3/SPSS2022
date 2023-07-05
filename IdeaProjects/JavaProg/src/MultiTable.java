class MultiTable {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            System.out.print(i+"の段\t");
            for(int j=1;j<=9;j++){
                int ans=i*j;
                System.out.print(ans+"\t");
            }
            System.out.println("");
        }
    }
}
