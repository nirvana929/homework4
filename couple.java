public class couple {
    private int count =0;
    public int Count(int n){
        for (int i = 1; i <= n; i++) {
            this.count+=i;
        }
        return n;
    }
    public int getCount(){
        int ret=this.count;
        this.count=0;
        return ret;
    }
    public int  fb(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fb(n-1) + fb (n - 2);
        }
    }
}
