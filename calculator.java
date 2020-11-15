import java.util.Scanner;

public class calculator {
        public int a;
        public String op;
        public int b;
        public void input(){
            String s;
            Scanner scanner=new Scanner (System.in);
            s=scanner.nextLine ();
            String []s1=s.split (" ",3);
            this.a=Integer.parseInt (s1[0]);
            this.b=Integer.parseInt (s1[2]);
            this.op=s1[1];
        }
        public int calculate(){
            int ret=0;
            switch (op){
                case "+":ret=a+b;break;
                case "-":ret=a-b;
                case "*":ret=a*b;
                case "/":ret=a/b;
            }
            return ret;
        }
}
