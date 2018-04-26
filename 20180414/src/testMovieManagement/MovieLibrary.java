package testMovieManagement;

import java.util.Scanner;

public class MovieLibrary {
	Movie[] movies = new Movie[10];
	Scanner input = new Scanner(System.in);

	public void addMoive() {
		Movie newMovie = new Movie();
		System.out.println("请输入电影名：");
		newMovie.name = input.next();
		for (int i = 0; i < movies.length; i++) {
			if (movies[i]!=null) {
				if (movies[i].name.equals(newMovie.name)) {
					System.out.println();
					System.out.println("============================");
					System.out.println("该电影名已被录入，请重新输入！");
					System.out.println("============================");
					addMoive();
				}
			}
		}
		System.out.println("请输入电影导演：");
		newMovie.director = input.next();
		System.out.println("请输入电影主演：");
		newMovie.actors = input.next();
		System.out.println("请输入电影时长：");
		newMovie.duration = input.next();
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] == null) {
				movies[i] = newMovie;
				break;
			}
		}
		System.out.println();
		System.out.println("============================");
		System.out.println("操作成功，请输入‘0’返回主菜单。");
		System.out.println("============================");
		reZreo();
	}

	public void checkMoive() {
		if (movies[0] == null) {
			System.out.println();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("很抱歉，当前并没有录入任何电影信息。请输入‘0’返回主菜单。");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			reZreo();
		} else {
			System.out.println("电影名\t\t导演\t主演\t时长");
			for (int i = 0; i < movies.length; i++) {
				if (movies[i] == null) {
					break;
				}
				System.out.println(movies[i].name + "\t" + movies[i].director + "\t" + movies[i].actors + "\t"
						+ movies[i].duration);
			}
			System.out.println();
			System.out.println("============================");
			System.out.println("操作成功，请输入‘0’返回主菜单。");
			System.out.println("============================");
			reZreo();
		}
	}

	public void deleteMoive() {
		if (movies[0] == null) {
			System.out.println();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("很抱歉，当前并没有录入任何电影信息。请输入‘0’返回主菜单。");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			reZreo();
		} else {
			System.out.println("已录入的电影名：");
			for (int i = 0; i < movies.length; i++) {
				if (movies[i] == null) {
					break;
				}
				System.out.println("[" + (i + 1) + "]" + " " + movies[i].name);
			}
			System.out.println("请输入需要删除的电影名：");
			String delMovieName = input.next();
			int indexDelMovieName = -1;

			for (int i = 0; i < movies.length; i++) {
				if (movies[i].name.equals(delMovieName)) {
					indexDelMovieName = i;
					break;
				}
			}
			if (indexDelMovieName == -1) {
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("很抱歉，输入的电影名与现有电影名不吻合，请重新输入。");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				deleteMoive();
			}
			for (int j = indexDelMovieName; j < movies.length - 1; j++) {
				movies[j] = movies[j + 1];
			}
			movies[movies.length - 1] = null;

			System.out.println();
			System.out.println("============================");
			System.out.println("操作成功，请输入‘0’返回主菜单。");
			System.out.println("============================");
			reZreo();
		}
	}
	

	public void UI() {
		System.out.println("=============");
		System.out.println("横店影视管理系统");
		System.out.println("=============");
		System.out.println("1、新增电影");
		System.out.println("2、查看电影");
		System.out.println("3、删除电影");
		System.out.println("4、退出");
		System.out.println("=============");
		System.out.println("请选择：");
		int flg = input.nextInt();
		switch (flg) {
		case 1:
			addMoive();
			break;
		case 2:
			checkMoive();
			break;
		case 3:
			deleteMoive();
			break;
		case 4:
			System.out.println("==============");
			System.out.println("已成功退出本系统！");
			System.out.println("==============");
			break;
		default:
			System.out.println("!!!!!!!!!!!!!!!!!!");
			System.out.println("输入错误，请重新输入！");
			System.out.println("!!!!!!!!!!!!!!!!!!");
			UI();
		}
	}

	public void reZreo() {
		String e = input.next();
		if (e.equals("0")) {
			UI();
		} else {
			System.out.println();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("输入错误，请输入‘0’返回主菜单。");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			reZreo();
		}
	}
}