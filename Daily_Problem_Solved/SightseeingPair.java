// package Daily_Problem_Solved;

public class SightseeingPair {
    public static int maxScoreSightseeingPair(int values[]){
        int n=values.length;

        int iSite=values[0]+0;        
        int maxScore=0;
        for(int i=1; i<n; i++){
            maxScore=Math.max(maxScore, iSite+values[i]-i); // values[i]+i + values[j]-j  where i<j
            iSite=Math.max(iSite, values[i]+i);
        }


        return maxScore;
    }
    public static void main(String[] args) {
        int values[]={8,1,5,2,6};

        System.out.println(maxScoreSightseeingPair(values));
    }
}
