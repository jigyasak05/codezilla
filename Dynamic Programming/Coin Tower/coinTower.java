public class coinTower {

	public static void main(String[] args) {
	int n=4;
	int x=2;
	int y=3;
	System.out.println(solve(n,x,y));

	}
	  public static String solve(int n,int x,int y){
			
		   int[] dp= new int[n+1];
		    dp[1]=1;
		    dp[x]=1;
		    dp[y]=1;
		    for(int i=1;i<=n;i++){
		    int option1 =Integer.MIN_VALUE;
		    int option2= Integer.MIN_VALUE;
		    int option3= Integer.MIN_VALUE;
		      if(i-1>=0){
		        option1=1^dp[i-1]; // B can remove 1 coin and be at (i-1)th position
		      }
		      if(i-x>=0){
		        option2=1^dp[i-x]; // B can remove x coins and be at (i-x)th position
		      }
		      if(i-y>=0){
		        option3=1^dp[i-y]; // B can remove x coins and be at (i-y)th position
		      }
		      dp[i]= Math.max(option1,Math.max(option2,option3));
		    }
		    return dp[n]==1?"B":"A";
			}

}