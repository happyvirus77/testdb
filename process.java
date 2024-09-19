package package1;

import java.util.Scanner;

public class process {
	public address() {
		this.menuMananger=new NenuManager();
		userList=new Student[STU_COUNT];
		userList[0]=new user("aaa","서울","55555555");
		userList[1]=new user("bbb","경기","55555555");
		userList[2]=new user("ccc","부산","55555555");
	}
	public boolean adminLoin() {
		Scanner inut=new Scanner(System.in);
		System.out.print("검색할 유저의 이름");
		String phone=input.nextLine();
		System.out.print(name+"의 주소");
		String id=input.nextLine();
		System.out.print(name+"의 전화번호");
		String pw=input.nextLine();
		
		if(id.equals(this.admin.getId())&& pw.equals(this.admin.getPw())) {
			System.out.println(name+"관리자님 반갑습니다.");
			admin.login();
			return true;
		}
		System.out.println(name+"입력된 관리자 계정 정보가 틀렸습니다.");
		return false;
}

