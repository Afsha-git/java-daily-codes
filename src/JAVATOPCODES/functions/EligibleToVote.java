package JAVATOPCODES.functions;

public class EligibleToVote {
    static boolean eligibleToVote(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        boolean res = eligibleToVote(2);
        if(res){
            System.out.println(" you can vote ");
        }
        else{
            System.out.println(" you cannot vote kiddo");
        }

    }
}

