package studinfo;

public class encap {
	private int STUDENT_ID;
	private String STUDENT_NAME;
	private String STUDENT_DOB;
	private String STUDENT_DOJ;
	





	public int getStudentID() {
		return STUDENT_ID;
	}




	public void setStudentID(int studentID) {
		this.STUDENT_ID = studentID;
	}




	public String getStudentName() {
		return STUDENT_NAME;
	}




	public void setStudentName(String studentName) {
		this.STUDENT_NAME = studentName;
	}




	public String getStudentDOB() {
		return STUDENT_DOB;
	}




	public void setStudentDOB(String studentPhone) {
		this.STUDENT_DOB = studentPhone;
	}




	public String getStudentDOJ() {
		return STUDENT_DOJ;
	}




	public void setStudentDOJ(String studentdoj) {
		this.STUDENT_DOJ = studentdoj;
	}




	public encap(int studentID, String studentName, String studentdob, String studentdoj) {
		super();
		this.STUDENT_ID = studentID;
		this.STUDENT_NAME = studentName;
		this.STUDENT_DOB = studentdob;
		this.STUDENT_DOJ = studentdoj;
	}




	public encap(String studentName, String studentdob, String studentdoj, int studentID) {
		super();
		this.STUDENT_ID= studentID;
		this.STUDENT_NAME = studentName;
		this.STUDENT_DOB = studentdob;
		this.STUDENT_DOJ = studentdoj;
	}




	public encap() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Student [studentID=" + STUDENT_ID + ", studentName=" + STUDENT_NAME + ", studentdob=" + STUDENT_DOB
				+ ", studentdoj=" + STUDENT_DOJ + "]";
	}
	
	
	
	
}

;