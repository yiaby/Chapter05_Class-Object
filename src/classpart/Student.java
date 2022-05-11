package classpart;

public class Student {
	//멤버변수
	int studentID;			//학번
	String studentName;		//학생이름                 
	int grade;				//학년
	String address;  		//사는곳
 
    //메서드=>(function)함수의 한 종류
	
	//학생의 이름과 주소를 반환하는 메서드
	public void showStudenInfo() {
	 System.out.println(studentName + "," + address); //이름 주소 출력
 }
	//학생의 이름을 반환하는 메서드
    public String getStudentName() {
    	return studentName;
    }
    public void setStudentName(String name) {
    	 studentName = name;
    }
    
    public static void main(String[]args) {
	       Student studentAhn = new Student();
	       studentAhn.studentName = "안연수";
	       
	       System.out.println(studentAhn.studentName);
	       System.out.println(studentAhn.getStudentName());
	}
}
