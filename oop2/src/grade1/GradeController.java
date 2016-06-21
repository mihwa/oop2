package grade1;
/**
 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점,
 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A
 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
 * [단]switch-case 문으로 해결하세요
 */
import javax.swing.JOptionPane;
public class GradeController {
	
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 0종료")) {
			case "1":
				String spec[]=JOptionPane.showInputDialog("이름,국어,영어,수학").split(",");//이름과목별점수입력
				String check= service.gradeCheck(Integer.parseInt(spec[1]),
						Integer.parseInt(spec[2]), Integer.parseInt(spec[3]));//과목별점수체크
						
				if (check=="재입력") {
					JOptionPane.showMessageDialog(null, "1~100사이에 점수만 입력해주세요");
					continue;
				}
				service.gradeInit(spec[0], Integer.parseInt(spec[1]), //이름,과목별 점수GradeBean클래스에저장
						Integer.parseInt(spec[2]), Integer.parseInt(spec[3]));
				service.gradeTotal();//총점계산
				service.gradeAvg();//평균계산
				//학점계산끝
				JOptionPane.showMessageDialog(null,service.gradeResult(service.gradeRank()));
				break;
			case "0":JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");return;
			default:JOptionPane.showMessageDialog(null, "1,0만 입력가능합니다");continue;//1,0외에 출력값입력시 출력
			}
		}
	}
}		
	
