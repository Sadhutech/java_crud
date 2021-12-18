package studinfo;
import java.sql.*;

public class studentdao {
	public static boolean insertStudentRecordToDB(encap st) {
		boolean f = false;
		try {
			Connection con = studinfo.createc();
			String query = "insert into student(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setLong(1, st.getStudentID());
			pstmt.setString(2, st.getStudentName());
			pstmt.setString(3, st.getStudentDOB());
			pstmt.setString(4, st.getStudentDOJ());
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception in insertStudentRecordToDB:"+e);
		}
		return f;
	}


	public static boolean deleteStudentRecordFromDB(int userID) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = studinfo.createc();
			String query = "delete from student where STUDENT_NO=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, userID);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception in deleteStudentRecordFromDB:"+e);
		}
		return f;
	}


	public static void showAllStudentRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = studinfo.createc();
			String query = "select * from student";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String STUDENT_NAME = set.getString(2);
				String STUDENT_DOB = set.getString(3);
				String STUDENT_DOJ = set.getString(4);
				
				System.out.println("Student ID: " + id + " \n Student Name: " + STUDENT_NAME + " \nStudent dob: " + STUDENT_DOB + " \nStudent city: " + STUDENT_DOJ);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception in showAllStudentRecords:"+e);
		}
		
	}


	public static boolean updateStudentRecord(int val,String toUpdate,int id,encap st) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection con = studinfo.createc();
			 if(val == 1) {
					//Update Name
					
						String query = "update student set STUDENT_NAME=? where STUDENT_NO=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, id);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update Phone
					String query = "update student set STUDENT_DOB=? where STUDENT_NO=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update City
					String query = "update student set STUDENT_DOJ=? where STUDENT_NO=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
}

;