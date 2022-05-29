package cinema;

import java.util.ArrayList;

public class Viewer {
	private String nickname;
	private int age;
	private ArrayList<Cinema> viewedFilmsList;
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
	public void setViewedFilmsList(ArrayList<Cinema> films) {
		if(films != null) {
			for(Cinema film : films) {
				if(film != null) this.viewedFilmsList.add(film);
			}
		}
	}
	
	public Viewer(String nickname, int age) {
		setNickname(nickname);
		setAge(age);
		this.viewedFilmsList = new ArrayList<Cinema>();
		this.viewedFilmsCount = this.viewedFilmsList.size();
	}
}
