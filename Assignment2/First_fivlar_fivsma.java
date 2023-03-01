class First_fivlar_fivsma {
    public static void main(String args[]) {
        int count1 = 0, count2 = 0;
    System.out.println("The First five largest even number in between 23 to 249 is:");
        for (int i = 249; i >= 23; i--) {
            if (i % 2 == 0) {
               System.out.print(i+",");
               count1++;
            }
            if(count1==5)
            break;
        }
        System.out.println("\nThe First five smallest even number in between 23 to 249 is:");
        for (int i = 23; i <= 249; i++) {
            if (i % 2 != 0) {
                System.out.print(i+",");
                count2++;
            }
            if(count2==5)
            break;
        }
    }
}