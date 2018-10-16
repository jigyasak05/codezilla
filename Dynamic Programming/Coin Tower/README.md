     PROBLEM STATEMENT
  
A and B are playing a new game today . They form a tower of N coins and make a move in alternate turns . B being the God plays first . In one move player can remove 1 or X or Y coins from the tower . The person to make the last move wins the Game . Find out who wins the game!


Input Format :
Contains three value N,X,Y as mentioned in the problem statement

Output Format :
A string containing the name of the winner like “A” or “B” 

STEPS:

1.Create an array to store the results.
2.dp[i] will depend on dp[i-1], dp[i-x], dp[i-y].
3.If a person wins at the ith position, then he loses atleast at one of the positions among i-1, i-x, or i-y.
4.Take xor at every step and calculate the results.