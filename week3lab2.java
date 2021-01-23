public class week3lab2 {

//LAB2 WEEK 3
     
    // write a method in Java that take three numbers (int) and print the greatest number

    public static void main(String args[]) {
    int T1=100; 
    int T2=50;
    int T3=250;
        
        if(T1 > T2 && T1 > T3)
        {
            System.out.println("Largest number is:" +T1);
        }
        else if(T2 > T3)
        {
            System.out.println("Largest number is:" +T2);
        }
        else
        {
            System.out.println("Largest number is:" +T3);
        }
    }
    
}
