
// Name: Deepmala Bhomi          Date Assigned: 03/27/2020
//
// Course: CSCI 2003 42733       Date Due: 04/1/2020
//
// Instructor: Ms. Greer
//
// File name: GymnastScores.java
//
/* Program Description: This program allows user to search through the resulting  
                        scores from a gymnastic competition. This program read in 
                        the data from a file and stors it in a 2D array. The users
                        can choose which data they want to see. This program gets
                        the information from array and displays data according to  
                        the user's choice. */ 



//importing Scanner class, File and  File Not Found Exception
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
 * Stimulates a search program for the resulting scores from a gymnastic competition
 */

public class GymnastScores
{

   /**
    * Creating main method
      @param args stores command line arguments
    */

   public static void main (String[] args) throws FileNotFoundException
   {
      //creating a new file object
      File myFile = new File("scores.txt");
      
      
      //creatinga new Scanner object which reads in from the file 
      Scanner in = new Scanner(myFile);
      
      
      //initilizing variables to use later in the program
      String line = "";
      int rows = 3;
      int columns = 5;
      int userInput;
      
   
      //creating a new 2D array
      String [] [] myArray = new String [rows] [columns];
   
   
      //iteriting for loop to store data on the rows of the array 
      for (int i = 0; i < rows; i++)
      {
          
          //iteriting for loop to store data on the columns of the array  
         for (int j = 0; j < columns; j++)
         
         {
            //reads in the data from the file and stores in variable  
            line = in.next();
            
            //stores data read in from file in the 2D array
            myArray [i][j] = line;
            
               
         }
      
      
      }
       
       
       
      //closing file 
      in.close();
        
      
      
      //displays header  
      System.out.println("Competition Results"); 
      System.out.println("==================="); 
      
      
      
      //using do while loop to repeat the program until user choses option 6
      do{
        
        //displaying option menu
         System.out.println("\nMenu"); 
         System.out.println("====");
         System.out.println("1. Display All");
         System.out.println("2. Display Vault");
         System.out.println("3. Display Bars");
         System.out.println("4. Display Beam");
         System.out.println("5. Display Floor");
         System.out.println("6. Quit\n");
         
         
         
        //creating new Scanner object to ran in user's input
         Scanner input = new Scanner(System.in);
         
         
         
         //asking user for input and storing it in a variable  
         System.out.print("Enter choice (1 - 6): ");
         userInput = input.nextInt();
         
         
         System.out.println();
         System.out.println();
        
        
        
         if (userInput == 1)
         {
            //displaying table header
            System.out.printf("%-16s %-10s %-10s %-10s %-10s \n", "Gymnast", "Vault","Bars","Beam","Floor");
            System.out.println("-------------------------------------------------------");
            
            
         
            //using nested for loop to get information from array and display it
            for (int i = 0; i < rows; i++)
            {
               
               
               for (int j = 0; j < columns; j++)
               
               {
                   
                  if ( j == 0)
                  {
                     System.out.printf("%-16s ", myArray[i][j]);   
                  }
                  
                  else
                  {
                     System.out.printf("%-10s ", myArray[i][j]);
                  }  
               }
               System.out.println();
            
            }
         }       // end else if
         
         
         
         
         else if (userInput == 2)
         {
            //displaying table header
            System.out.printf("%-16s %-10s \n", "Gymnast", "Vault");
            System.out.println("----------------------");
            
            for (int i = 0; i < rows; i++)
            {
            
               for (int j = 0; j < 2; j++)
               
               {
                  // using if else loop to display only the data stored in column 0 and 1
                  if ( j == 0)
                  {
                     System.out.printf("%-16s ", myArray[i][j]);   
                  }
                  else
                  {
                  
                     System.out.printf("%-10s ", myArray[i][j]);
                  }
                 
               }
               System.out.println();
            
            }
            
         }    //end else if
         
         
         
         
         else if (userInput == 3)
         
         {
            //displaying table header
            System.out.printf("%-16s %-10s \n", "Gymnast", "Bars");
            System.out.println("---------------------");
            
            for (int i = 0; i < rows; i++)
            {
            
               for (int j = 0; j < 3; j++)
               
               {
                  // using if else loop to display only the data stored in column 0 and 2
                  if (j % 2 == 0)
                  {
                     if ( j == 0)
                     {
                        System.out.printf("%-16s ", myArray[i][j]);   
                     }
                     else
                     {
                        System.out.printf("%-10s ", myArray[i][j]);
                     }
                    
                  }
               }
               System.out.println();
            
            }
            
         }     //end else if
         
         
         
         
         
         else if (userInput == 4)
         {  
            //displaying table header
            System.out.printf("%-16s %-10s \n", "Gymnast", "Beam");
            System.out.println("---------------------");
            for (int i = 0; i < rows; i++)
            {
            
               for (int j = 0; j < 4; j++)
               
               {  
                  // using if else loop to display only the data stored in column 0 and 3
                  if (j%3 == 0)
                  {
                     if ( j == 0)
                     {
                        System.out.printf("%-16s ", myArray[i][j]);   
                     }
                     else
                     {
                        System.out.printf("%-10s ", myArray[i][j]);
                     }
                  } 
               }
               System.out.println();
            
            }
            
         }   // end else if
         
         
         
         
         
         else if (userInput == 5)
         {
            //displaying table header
            System.out.printf("%-16s %-10s \n", "Gymnast", "Floor");
            System.out.println("----------------------");
            for (int i = 0; i < rows; i++)
            {
            
               for (int j = 0; j < 5; j++)
               
               {
                  // using if else loop to display only the data stored in column 0 and 4
                  if (j % 4 == 0)
                  {
                     if ( j == 0)
                     {
                        System.out.printf("%-16s ", myArray[i][j]);   
                     }
                     else
                     {
                        System.out.printf("%-10s ", myArray[i][j]);
                     } 
                  } 
               }
               System.out.println();
            
            }
         
         }  // end else if
         
          
      
      } // end of do while 
      
      while(userInput !=6);
      
      
      
      
      // displaying endnote.
      System.out.println("Goodbye!");
   
   
   
   
   }        // end main
   
}     // end class

