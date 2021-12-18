package studinfo;

import java.io.*;


import studinfo.encap;
import studinfo.studentdao;


public class begin {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello User Please Enter Your Name: \n");
		String user = br.readLine();
		System.out.println("Welcome To Student Management App" + user);
		
		
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to DELETE student");
			System.out.println("PRESS 3 to DISPLAY student");
			System.out.println("PRESS 4 to UPDATE student");
			System.out.println("PRESS 5 to EXIT App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add student
				
				System.out.println("Enter  StudentId: ");
				int STUDENT_ID = Integer.parseInt(br.readLine());
				System.out.println("Enter  STUDENT NAME: ");
				String STUDENT_NAME = br.readLine();
				System.out.println("Enter DATE OF BIRTH IN YYYY-MM-DD FORMAT: ");
				String  STUDENT_DOB= br.readLine();
				System.out.println("Enter DATE OF JOINING IN YYYY-MM-DD FORMAT: ");
				String  STUDENT_DOJ= br.readLine();
				
				//create student objectsa
				encap st = new encap(STUDENT_ID,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ);
				boolean ans = studentdao.insertStudentRecordToDB(st);
				if(ans) {
					System.out.println("Student record Inserted Successfully...");
					System.out.println("Student Record:" + st);
				}else {
					System.out.println("Some error Occured While Inserting...Please try Again!");
				}
				
			}
			else if(c == 2) {
				//Delete student
				System.out.println("Enter Student ID To Delete: ");
				int STUDENT_ID = Integer.parseInt(br.readLine());
				boolean f = studentdao.deleteStudentRecordFromDB(STUDENT_ID);
				if(f) {
					System.out.println("Student Of ID " + STUDENT_ID + " Record Deleted... ");
				}else {
					System.out.println("Something Went Wrong.. Please try Again!");
				}
			}
			else if(c == 3) {
				//Display student
				studentdao.showAllStudentRecords();
			}
			else if(c == 4) {
				//Update student
				System.out.println("PRESS 1 to UPDATE STUDENT name");
				System.out.println("PRESS 2 to UPDATE STUDENT DOB");
				System.out.println("PRESS 3 to UPDATE STUDENT DOJ");
				int val = Integer.parseInt(br.readLine());
				if(val == 1) {
					//Update Name
					System.out.println("Enter name to UPDATE...");
					String STUDENT_NAME = br.readLine();
					System.out.println("Enter ID to identify student!");
					int STUDENT_ID = Integer.parseInt(br.readLine());
					encap st = new encap();
					st.setStudentName(STUDENT_NAME);
					boolean f = studentdao.updateStudentRecord(val,STUDENT_NAME,STUDENT_ID,st);
					if(f) {
						System.out.println("Student Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 2) {
					//Update DOB
					System.out.println("Enter DOB IN YYYY-MM-DD FORMAT to UPDATE...");
					String STUDENT_DOB = br.readLine();
					System.out.println("Enter ID to identify student!");
					int STUDENT_ID = Integer.parseInt(br.readLine());
					encap st = new encap();
					st.setStudentDOB(STUDENT_DOB);
					boolean f = studentdao.updateStudentRecord(val,STUDENT_DOB,STUDENT_ID,st);
					if(f) {
						System.out.println("Student Phone Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 3) {
					//Update DOJ
					System.out.println("Enter DOJ IN YYYY-MM-DD to UPDATE...");
					String STUDENT_DOJ = br.readLine();
					System.out.println("Enter ID to identify student!");
					int STUDENT_ID = Integer.parseInt(br.readLine());
					encap st = new encap();
					st.setStudentDOJ(STUDENT_DOJ);
					boolean f = studentdao.updateStudentRecord(val,STUDENT_DOJ,STUDENT_ID,st);
					if(f) {
						System.out.println("Student City Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else {
					System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
				}
				
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + user);
				break;
			}
			else {
				
			}
			
		}
	}
	


}
