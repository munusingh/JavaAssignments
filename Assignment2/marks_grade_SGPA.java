import java.util.*;
public class marks_grade_SGPA
{
    public static void main(String args[])
    {
    int m1,m2,m3,m4,total,cd=3,v1,v2,v3,v4;
    char g;
    float per,sgpa;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter marks of c:");
    m1=sc.nextInt();
    System.out.println("Enter marks of cpp:");
    m2=sc.nextInt();
    System.out.println("Enter marks of java:");
    m3=sc.nextInt();
    System.out.println("Enter marks of python:");
    m4=sc.nextInt();
    

    if(m1>35 && m1<40) v1=4;
    else if(m1==60||m1==70||m1==80||m1==90||m1==100) v1=(int)(m1/10)-1;
    else v1=(int)(m1/10);
switch(v1)
{
    case 0:g='f';
    break;
    case 1:g='f';
    break;
    case 2:g='f';
    break;
    case 3:g='f';
    break;
    case 4:g='D';
    break;
    case 5:g='C';
    break;
    case 6:g='B';
    break;
    case 7:g='A';
    break;
    case 8:g='E';
    break;
    case 9:g='O';
    break;
    default: g='s';
        System.out.println("Mark should be in between 0 to 100.please enter valid mark");               
}
System.out.println("grade for language c is :"+g);

if(m2>35 && m2<40) v2=4;
    else if(m2==60||m2==70||m2==80||m2==90||m2==100) v2=(int)(m2/10)-1;
    else v2=(int)(m2/10);
switch(v2)
{
    case 0:g='f';
    break;
    case 1:g='f';
    break;
    case 2:g='f';
    break;
    case 3:g='f';
    break;
    case 4:g='D';
    break;
    case 5:g='C';
    break;
    case 6:g='B';
    break;
    case 7:g='A';
    break;
    case 8:g='E';
    break;
    case 9:g='O';
    break;
    default: g='s';
        System.out.println("Mark should be in between 0 to 100.please enter valid mark");
                
}
System.out.println("grade for language cpp is :"+g);

if(m3>35 && m3<40) v3=4;
    else if(m3==60||m3==70||m3==80||m3==90||m3==100) v3=(int)(m3/10)-1;
    else v3=(int)(m3/10);
switch(v3)
{
    case 0:g='f';
    break;
    case 1:g='f';
    break;
    case 2:g='f';
    break;
    case 3:g='f';
    break;
    case 4:g='D';
    break;
    case 5:g='C';
    break;
    case 6:g='B';
    break;
    case 7:g='A';
    break;
    case 8:g='E';
    break;
    case 9:g='O';
    break;
    default: g='s';
        System.out.println("Mark should be in between 0 to 100.please enter valid mark");
                
}
System.out.println("grade for language java is :"+g);


if(m4>35 && m4<40) v4=4;
    else if(m4==60||m4==70||m4==80||m4==90||m4==100) v4=(int)(m4/10)-1;
    else v4=(int)(m4/10);
switch(v4)
{
    case 0:g='f';
    break;
    case 1:g='f';
    break;
    case 2:g='f';
    break;
    case 3:g='f';
    break;
    case 4:g='D';
    break;
    case 5:g='C';
    break;
    case 6:g='B';
    break;
    case 7:g='A';
    break;
    case 8:g='E';
    break;
    case 9:g='O';
    break;
    default: g='s';
        System.out.println("Mark should be in between 0 to 100.please enter valid mark");
                
}
System.out.println("grade for language python is :"+g);
total=m1+m2+m3+m4;
System.out.println("Total mark is:"+total);
per=(float)total*100/400;
System.out.println("percentage is:"+per);
float result=v1*cd;
result+=(v2*cd);
result+=(v3*cd);
result+=(v4*cd);
sgpa=result/12;
System.out.println("SGPA is:"+sgpa);
}
}









    






