/*
@Author: Surina Arora 
@Date: December 7th 2023 
@Description: 
This program displays the average monthly weather in a chart 
*/

class MonthlyWeatherSurinaArora{
   public static void main (String[] args){

//print out the months 

String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

//highest averages 

int[] avgHigh = {25, 28, 32, 40, 50, 65, 75, 78, 70, 55, 40, 30};
         
// lowest averages 

int[] avgLow = {-8, -8, -3, 3, 9, 14, 17, 17, 13, 7, 2, -4};      
         
// rain averages 

double[] avgRain = {71.3, 56, 58.9, 78, 80.6, 90, 86.8, 77.5, 81, 83.7, 75, 71.3};
 
// snow averages 

int[] avgSnowDays = {22, 19, 13, 3, 0, 0, 0, 0, 0, 0, 6, 17};
 
//header 

System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Month", "Avg High", "Avg Low", "Avg Rain cm", "Avg Days of snow");
System.out.println();

//single if statement 

for (int i = 0; i < months.length; i++) {
            System.out.printf("%-20s%-20d%-20d%-20.2f%-20d%n", months[i], avgHigh[i], avgLow[i], avgRain[i], avgSnowDays[i]);
        }
        
    }
}
