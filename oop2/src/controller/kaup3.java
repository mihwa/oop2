/**
 * 
 */
package controller;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :kaup.java
 * @story  :
*/
public class kaup3 {
	String name, height, weight;

	public void setName(String name) {// write
		this.name = name;
	}

	public void setheight(String height) {
		this.height = height;
	}

	public void setweight(String weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;

	}

	public String getHeight() {
		return this.height;
	}

	public String getWeight() {
		return this.weight;
	}

public void execute() { 
//------------------init----------------------------- 

String result=""; 
double bmi = 0.0, height = Double.parseDouble(this.height),  
					weight = Double.parseDouble(this.weight); 
							 
//------------------op------------------------------ 


bmi = weight / (height/100) / (height/100); 

if (bmi < 18.5) { 
result = "저체중"; 
} else if(18.5<=bmi && bmi <= 22.9){ 
	 
	result = "정상체중"; 
} else if(bmi >= 23.0 && bmi <= 24.9){ 
	 
	result = "위험체중"; 
} else if(bmi >= 25.0 && bmi <= 29.9){ 
	 
	result = "비만 1단계"; 
} else if(bmi >= 30.0 && bmi <= 39.9){ 
	 
	result = "비만 2단계"; 
} else if(bmi >= 40){ 
	 
result = "비만 3단계"; 
}
}}

// double d = Double.parseDouble(String.format("%.2f", bmi));
// return name+"님은 BMI지수는 "+ d +
// "이고, "+result+"이다 ";
	