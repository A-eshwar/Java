/*chcking weather the given argument through command line arguments is String ot integer*/
class CheckingStringORInt
 {    
     public static void main(String[] args)
    {
         String s=args[0];
        try
        {
            Integer.parseInt(s);
            System.out.println("The given input is an integer");
        }
         catch(NumberFormatException e) 
         {
            System.out.println("The given input is a string");
        }
    }
}
/*
output:
CheckingStringORInt hello
The given input is a string

The given input is a string 2
The given input is an integer
*/