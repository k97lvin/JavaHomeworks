package Day10;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 1, n2=2, n3=3;
        if (n1==n2&&n2==n3){
            System.out.println("all equal");
        } else if (n1==n2){
            System.out.println("n1&n2 are equal");
        } else if (n2==n3){
            System.out.println("n2&n3 are equal");
        }else if (n3==n1){
            System.out.println("n3&n1 are equal");
        }else {
            System.out.println("none of them are equal");
        }
    }
}
/*
Create a class called EqualNumbers, and write a program
that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */