class Solution {
    public void rotate(int[][] matrix) {
int n=matrix.length;
for(int i=0; i<n; i++){
    for(int j=i+1; j<n; j++){
   int temp=matrix[i][j];
   matrix[i][j]=matrix[j][i];
   matrix[j][i]=temp;}

    }
    for(int i=0; i<n; i++){
        int li=0;
        int ri=n-1;
        while(li<ri){
            int temp=matrix[i][li];
            matrix[i][li]=matrix[i][ri];
            matrix[i][ri]=temp;
            li++;
            ri--;
        }
    }
}}