class Check_diff_lareven_smaodd_pal
{public static void main(String args[])
{
int lareven=0,smalodd=0,diff,temp,rem,res=0;
for(int i=249;i>=23;i--)
{
    if(i%2==0)
    {
        lareven=i;
    }
}
for(int i=23;i<=249;i++)
{
    if(i%2!=0)
    {
        smalodd=i;
    }
}
 diff=lareven-smalodd;
 temp=diff;
 while(diff!=0)
 {
    rem=diff%10;
    res=res*10+rem;
    diff=diff/10;
 }
 if(temp==res)
 {
    System.out.println("Difference is pallindrome");
 }
 else{
    System.out.println("Difference is not pallindrome");
 }
 }


}
