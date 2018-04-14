/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbage;


public class Student{
    int a;
    int b;
    
public void setData(int c,int d){
	a=c;
	b=d;
}

public void showData(){
    System.out.println("Value of a = "+a);
    System.out.println("Value of a = "+b);
}

public static void main (String args[]){
    try{
    Student s1 = new Student();
    Student s2 = new Student();
    s1.setData(1,2);
    s2.setData(3,4);
    s1.showData();
    s2.showData();
    Student s3; // Line 20
    s3=s2;		// Line 21
    s3.showData();	// Line 22
    s2=null;	//Line 23
    s3.showData();	//Line 24
    s3=null;	//Line 25
    s3.showData();	// Line 26
    }
    catch(Exception e){
        System.out.println("errorr is : " + e);
    }
}


}
