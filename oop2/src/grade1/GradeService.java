package grade1;

public interface GradeService {
	public void gradeInit(String name,int kor,int eng,int math);
	public String gradeCheck(int kor,int eng,int math);
	public int gradeTotal();
	public int gradeAvg();
	public String gradeRank();
	public String gradeResult(String result);
	
}
