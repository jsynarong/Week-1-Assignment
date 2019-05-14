import java.util.*;
public class WeightedAverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// The six test scores and their respective weights are given in the following format: 
// 75  0.10
// 95  0.20
// 85  0.25
// 55  0.25
// 65  0.10 
// 70  0.10 

	double Weight_1 = (75*.10); 
	double Weight_2 = (95*.20);
	double Weight_3 = (85*.25); 
	double Weight_4 = (55*.25); 
	double Weight_5 = (65*.10); 
	double Weight_6 = (70*.10); 
	double Weight_average_1 = (Weight_1 + Weight_2 + Weight_3 + Weight_4 + Weight_5 + Weight_6);
		System.out.println("Average of Test Scores: " + Weight_average_1);

//The six assignment scores and their respective weights are given in the following format: 
//55  0.05
//65  0.10
//65  0.15
//60  0.25
//55  0.25 
//50  0.20

	double Weight_7 = (55*.05); 
	double Weight_8 = (65*.10);
	double Weight_9 = (65*.15); 
	double Weight_10 = (60*.25); 
	double Weight_11 = (55*.25); 
	double Weight_12 = (50*.20); 
	double Weight_average_2 = (Weight_7 + Weight_8 + Weight_9 + Weight_10 + Weight_11 + Weight_12);
		System.out.println("Average of Assignment Scores: " + Weight_average_2);

//Master Average

	double Master_Average = ((Weight_average_1 + Weight_average_2) / 2);
		System.out.println("Average of Test Scores and Assignments: " + Master_Average);

	}

}
