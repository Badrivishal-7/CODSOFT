import java.util.Scanner;
public class studentsmarks 
{
  public static void main(String[] args) 
    {
        char grade;
        System.out.println("enter number of subjects");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks = new int[n];
        int totalMarks = 0;
             
             // Entering marks for each subject
        for (int i = 0; i <n ; i++) 
        {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // if marks not entered between 1 to 100
            while (marks[i] < 0 || marks[i] > 100)
             {
                System.out.print("Invalid input. Please enter marks between 0 and 100: ");
                marks[i] = sc.nextInt();
             }

            totalMarks += marks[i];
        }

        // Calculating average marks
        double averageMarks = totalMarks / (double) n;

        // Determining  grades
        
        if (averageMarks >= 90) 
        {
            grade='O';
        }
        else if(averageMarks >=80)
        {
            grade='A';
        }
        else if(averageMarks >=70)
        {
            grade='B';
        }
        else if(averageMarks >=60)
        {
           grade='C'; 
        }
        else if(averageMarks >=50)
        {
          grade='D';
        }
        else if(averageMarks >=40)
        {
            grade='E';
        }
        else 
        {
           grade= 'F';
        }


        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}