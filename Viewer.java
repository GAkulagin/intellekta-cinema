package cinema;

public class Viewer {
	private String nickname;
	private int age;
	private int viewedFilmsCount;
	
	public String getNickname() {
		return nickname;
	}
	public int getAge() {
		return age;
	}
	public int getViewedFilmsCount() {
		return viewedFilmsCount;
	}
	
	public void setNickname(String nickname) {
		this.nickname = (nickname == null || nickname == "")? "user" : nickname;
	}
	public void setAge(int age) {
		this.age = (age < 0)? 18 : age;
	}
	public void setViewedFilmsCount(int count) {
		this.viewedFilmsCount = (count < 0)? 0 : count;
	}
	
	public Viewer(String nickname, int age, int viewedFilmsCount) {
		setNickname(nickname);
		setAge(age);
		setViewedFilmsCount(viewedFilmsCount);
	}
}
