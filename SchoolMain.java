package codingmentor.java.buoi5homework;
import java.util.ArrayList;

public class SchoolMain {
	public static void main(String[] args) {
		
		SchoolYear schoolYear1 = new SchoolYear(1, "2022-2023");
		
		Semester semester1 = new Semester(1, "Semester 1", 1);
		Semester semester2 = new Semester(1, "Semester 2", 2);
		
		semester1.setSchoolYearId(schoolYear1.getId());
		semester2.setSchoolYearId(schoolYear1.getId());
		
		Subject subjectT = new Subject(1, "Toan", 2);
		Subject subjectV = new Subject(2, "Van", 2);
		Subject subjectA = new Subject(3, "Anh", 1);
		
		Exam examM = new Exam(1, "KT Mieng", 1);
		Exam exam15Min = new Exam(2, "KT 15 phut", 1);
		Exam exam45Min = new Exam(3, "KT 1 tiet", 2);
		Exam examFinal = new Exam(4, "KT cuoi ki", 3);
		
		Student student1 = new Student(1, "Nguyen Van A", 1);
		
		PointSheet studentAExam1 = new PointSheet(1, 1, 1, 1, 6.00);
		PointSheet studentAExam2 = new PointSheet(1, 1, 1, 2, 2.00);
		PointSheet studentAExam3 = new PointSheet(1, 1, 1, 3, 4.00);
		PointSheet studentAExam4 = new PointSheet(1, 1, 1, 4, 4.00);
		PointSheet studentAExam5 = new PointSheet(1, 2, 1, 1, 5.00);
		PointSheet studentAExam6 = new PointSheet(1, 2, 1, 2, 7.00);
		PointSheet studentAExam7 = new PointSheet(1, 2, 1, 3, 3.00);
		PointSheet studentAExam8 = new PointSheet(1, 2, 1, 4, 3.00);
		PointSheet studentAExam9 = new PointSheet(1, 3, 1, 1, 2.00);
		PointSheet studentAExam10 = new PointSheet(1, 3, 1, 2, 8.00);
		PointSheet studentAExam11 = new PointSheet(1, 3, 1, 3, 5.00);
		PointSheet studentAExam12 = new PointSheet(1, 3, 1, 4, 5.00);
		PointSheet studentAExam13 = new PointSheet(1, 1, 2, 1, 4.00);
		PointSheet studentAExam14 = new PointSheet(1, 1, 2, 2, 7.00);
		PointSheet studentAExam15 = new PointSheet(1, 1, 2, 3, 8.00);
		PointSheet studentAExam16 = new PointSheet(1, 1, 2, 4, 8.00);
		PointSheet studentAExam17 = new PointSheet(1, 2, 2, 1, 9.00);
		PointSheet studentAExam18 = new PointSheet(1, 2, 2, 2, 2.00);
		PointSheet studentAExam19 = new PointSheet(1, 2, 2, 3, 6.00);
		PointSheet studentAExam20 = new PointSheet(1, 2, 2, 4, 6.00);
		PointSheet studentAExam21 = new PointSheet(1, 3, 2, 1, 1.00);
		PointSheet studentAExam22 = new PointSheet(1, 3, 2, 2, 9.00);
		PointSheet studentAExam23 = new PointSheet(1, 3, 2, 3, 2.00);
		PointSheet studentAExam24 = new PointSheet(1, 3, 2, 4, 2.00);		
		
		RoomLocation roomD = new RoomLocation(1, "101A Dewing");
		RoomLocation roomH = new RoomLocation(2, "102B Hicks Center");
		
		Class class1A = new Class(1, "Class 1A", 1);
		Class class1B = new Class(2, "Class 2B", 2);
		
		Teacher teacherA = new Teacher (1, "Luong Van A", 'Y');
		Teacher teacherB = new Teacher (2, "Luong Van B", 'Y');
		Teacher teacherC = new Teacher (3, "Luong Van C", 'N');
		
		class1A.setPrimaryTeacherId(teacherA.getId());
		class1B.setPrimaryTeacherId(teacherB.getId());

		TeachingProfile profileA1 = new TeachingProfile(1, 1);
		TeachingProfile profileA2 = new TeachingProfile(1, 2);
		TeachingProfile profileB1 = new TeachingProfile(2, 3);
		TeachingProfile profileC1 = new TeachingProfile(3, 2);
		
		Leave leaveA1 = new Leave(1, 1, "20/11/2022");
		Leave leaveA2 = new Leave(2, 1, "20/12/2022");
		Leave leaveB1 = new Leave(2, 1, "10/11/2022");
		
		Salary salaryA = new Salary(1, 1, 400);
		Salary salaryB = new Salary(2, 2, 500);
		Salary salaryC = new Salary(3, 3, 600);
		
		
		SchoolYear[] schoolYears = {schoolYear1};
		Semester[] semesters = {semester1, semester2};
		Subject[] subjects = {subjectT, subjectV, subjectA};
		Exam[] exams = {examM, exam15Min, exam45Min, examFinal};
		PointSheet[] pointSheets = {studentAExam1, studentAExam2, studentAExam3, studentAExam4, studentAExam5, studentAExam6, studentAExam7, studentAExam8, studentAExam9, studentAExam10, studentAExam11, studentAExam12, studentAExam13, studentAExam14, studentAExam15, studentAExam16, studentAExam17, studentAExam18, studentAExam19, studentAExam20, studentAExam21, studentAExam22, studentAExam23, studentAExam24};
		Class[] classes = {class1A, class1B};
		Student[] students = {student1};
		Teacher[] teachers = {teacherA, teacherB, teacherC};
		
		
		String studentName = "Nguyen Van A";
		int studentId = getStudentIdByName(studentName, students);
		int heSoK1 = semester1.getMultiplication(); 
		int heSoK2 = semester2.getMultiplication();
		int heSoNam = heSoK1 + heSoK2;
		
		int heSoT = subjectT.getMultiplication();
		int heSoA = subjectA.getMultiplication();
		int heSoV = subjectV.getMultiplication();
		int tongHeSoMon = heSoT + heSoA + heSoV;


		
		/*
		 *  CONSOLE LOG PROGRAM POINTSHEET:
		 */
		System.out.println("POINT SHEET");
		System.out.printf("Student: %s \n", studentName);
		System.out.println("School Year: 2022-2023" );
		System.out.printf("Class: %s\n", getClassNameByStudentName(studentName, students, classes));
		System.out.printf("Primary Teacher: %s\n", getPrimaryTeacherByStudentName(studentName, students, classes, teachers));
		System.out.println("|| SUBJECT ||                           SEMESTER 1                      ||                           SEMESTER 2                      || AVERAGE ||");
		System.out.println("||---------||-----------------------------------------------------------||-----------------------------------------------------------||---------||");
		System.out.print("|| TOAN    ||");
		double semester1AverageM = printStudentPointSheet(studentId, 1, 1, pointSheets, exams);
		double semester2AverageM = printStudentPointSheet(studentId, 2, 1, pointSheets, exams);
		double yearAveragePointM = printAveragePointSubject(semester1AverageM, semester2AverageM, heSoK1, heSoK2, heSoNam);
		System.out.print("|| ANH     ||");
		double semester1AverageA = printStudentPointSheet(studentId, 1, 2, pointSheets, exams);
		double semester2AverageA = printStudentPointSheet(studentId, 2, 2, pointSheets, exams);
		double yearAveragePointA = printAveragePointSubject(semester1AverageA, semester2AverageA, heSoK1, heSoK2, heSoNam);
		
		System.out.print("|| VAN     ||");
		double semester1AverageV = printStudentPointSheet(studentId, 1, 3, pointSheets, exams);
		double semester2AverageV = printStudentPointSheet(studentId, 2, 3, pointSheets, exams);
		double yearAveragePointV = printAveragePointSubject(semester1AverageV, semester2AverageV, heSoK1, heSoK2, heSoNam);
		
		System.out.println("==================================================================================================================================================");
		double studentAveragePointByYear = printStudentAveragePointByYear(yearAveragePointM, yearAveragePointA, yearAveragePointV, heSoT, heSoA, heSoV,  tongHeSoMon);
		
		
		
	}
	
	
	/***
	 * 
	 * @param studentName
	 * @param students
	 * @return Id of student by class name
	 */
	public static int getStudentIdByName(String studentName, Student[] students) {
		for (Student student : students) {
			if(student.getName().equals(studentName)) {
				return student.getId();
			}
		}
		return 0;
	}
	
	/**
	 * 
	 * @param studentName
	 * @param students
	 * @return id of the class the student is taking
	 */
	public static int getClassIdByStudentName(String studentName, Student[] students) {
		for (Student student : students) {
			if(student.getName().equals(studentName)) {
				return student.getClassId();
			}
		}
		return 0;
	}
	
	
	/***
	 *  
	 * @param studentName => name of student
	 * @param classes => list of available classes
	 * @return Name of the class student is assigned to
	 */
	public static String getClassNameByStudentName (String studentName, Student[] students, Class[] classes) {
		int studentClassId = getClassIdByStudentName(studentName, students);
		
		for (Class c : classes) {
			if (c.getId() == studentClassId) {
				return c.getName();
			}
		}
		return null; 
	}

	
	/***
	 * 
	 * @param studentName
	 * @param students
	 * @param classes
	 * @return Id of the primary teacher teaching the student's class
	 */
	public static int getPrimaryTeacherIdFromStudentName(String studentName, Student[] students, Class[] classes) {
		int studentClassId = getClassIdByStudentName(studentName, students);
		
		for (Class c : classes) {
			if (c.getId() == studentClassId) {
				return c.getPrimaryTeacherId();
			}
		}
		return 0;
	}
	
	/***
	 * 
	 * @param studentName
	 * @param students
	 * @param classes
	 * @param teachers
	 * @return Name of primary teacher from student name
	 */
	
	public static String getPrimaryTeacherByStudentName(String studentName, Student[] students, Class[] classes, Teacher[] teachers) {
		int primaryTeacherId =  getPrimaryTeacherIdFromStudentName(studentName, students, classes);
		
		for (Teacher teacher : teachers) {
			if (teacher.getId() ==  primaryTeacherId) {
				return teacher.getName();
			}
		}
		return null;
	}
	
	
	public static int getExamMultiplicationByExamId(int examId, Exam exams[]) {
		for (Exam exam: exams) {
			if(exam.getId() == examId) {
				return exam.getMultiplication();
			}
		}
		return 0;
	}
	
	public static double printStudentPointSheet(int studentId, int semesterId, int subjectId, PointSheet[] pointSheets, Exam[] exams) {
		double examPointMultiSum = 0; 
		double multiplicationSum = 0;
		for (PointSheet pointSheet : pointSheets ) {
			if (pointSheet.getStudentId() == studentId && pointSheet.getSemesterId() == semesterId && pointSheet.getSubjectId() == subjectId) {
				int examId = pointSheet.getExamId();
				double examPoint = pointSheet.getPoint();
				int examMulti = getExamMultiplicationByExamId(examId, exams);
				multiplicationSum += examMulti;
				System.out.printf(" %.2f (HeSo%d) |",  examPoint, examMulti);
				double examPointMulti = examPoint * examMulti;
				examPointMultiSum += examPointMulti;
			}
		}
		System.out.print("|");
		double averagePointSemester = examPointMultiSum/multiplicationSum; 	
	    double roundedAveragePointSemester = Math.round(averagePointSemester * 10.0) / 10.0;
		return roundedAveragePointSemester;
	}
	
	public static double printAveragePointSubject (double averageSem1, double averageSem2, int hesoK1, int hesoK2, int heSoSemester) {
		double finalAverageSubjectPoint =  (averageSem1 * hesoK1 + averageSem2 * hesoK2)/heSoSemester;
		double roundedfinalAverageSubjectPoint = Math.round(finalAverageSubjectPoint * 10.0) / 10.0;
		System.out.printf("   %.2f  ||",roundedfinalAverageSubjectPoint);
		System.out.println("");
		
		return roundedfinalAverageSubjectPoint;
	}
	
	public static double printStudentAveragePointByYear(double averageM, double averageA, double averageV, int heSoT, int heSoA, int heSoV, int tongHeSoMon) {
		double studentAveragePointByYear = (averageM * heSoT + averageA * heSoA + averageV * heSoV) /tongHeSoMon;
		double roundedfinalAverageSubjectPoint = Math.round(studentAveragePointByYear * 10.0) / 10.0;
		System.out.printf("Average Point:   %.2f  ", roundedfinalAverageSubjectPoint);
		return roundedfinalAverageSubjectPoint;
	}
}
