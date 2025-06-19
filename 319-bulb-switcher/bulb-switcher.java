class Solution {
    public int bulbSwitch(int n) {
     int s=0;
     int e=n;
     int ans=0;
     while(s<=e){
        int mid=(s+e)/2;
        if((long)mid*mid<n){
            s=mid+1;
            ans=mid;

        }else if((long)mid*mid>n){
            e=mid-1;
        }else{
            ans=mid;
            break;
           
        }
     }  return ans; 
    }
}