public class Associaltivity {
    public static void main(String[] args) {
        //precedence and associativity is most important topics
        //int a = 6*5 - 34/2;
        //according to BODMAS answere will be 13;
        // but in java BODMAS doent work, associativity and precedence works here;
        /*
        precedence means ki pehle konsa execute hoga. just like maths BODMAS rule;
        */
//        int b = 60/12 - 17*2;
//        System.out.println(b);
        //in java / & * has same associativity and it execute left to right; heense answer will be -29; in java associativity works
        // we have cheat seet of assciativity and its works according to that;

        //quiz--
        //(1)
        int x = 6;
        int y = 7;
        int z = x * y/2;
        System.out.println(z); //no need to add perenthesis in x*y because we know * and / associativity towards L-R ;

        //(2)
        int a = 2;
        int b = 3;
        int c = 5;
        int ex_ans = b*b - (4*a*c)/(2*a);
        System.out.println(ex_ans);

    }
}
