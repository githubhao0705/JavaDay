package testMovieManagement;

import java.util.Scanner;

public class MovieLibrary {
	Movie[] movies = new Movie[10];
	Scanner input = new Scanner(System.in);

	public void addMoive() {
		Movie newMovie = new Movie();
		System.out.println("�������Ӱ����");
		newMovie.name = input.next();
		for (int i = 0; i < movies.length; i++) {
			if (movies[i]!=null) {
				if (movies[i].name.equals(newMovie.name)) {
					System.out.println();
					System.out.println("============================");
					System.out.println("�õ�Ӱ���ѱ�¼�룬���������룡");
					System.out.println("============================");
					addMoive();
				}
			}
		}
		System.out.println("�������Ӱ���ݣ�");
		newMovie.director = input.next();
		System.out.println("�������Ӱ���ݣ�");
		newMovie.actors = input.next();
		System.out.println("�������Ӱʱ����");
		newMovie.duration = input.next();
		for (int i = 0; i < movies.length; i++) {
			if (movies[i] == null) {
				movies[i] = newMovie;
				break;
			}
		}
		System.out.println();
		System.out.println("============================");
		System.out.println("�����ɹ��������롮0���������˵���");
		System.out.println("============================");
		reZreo();
	}

	public void checkMoive() {
		if (movies[0] == null) {
			System.out.println();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("�ܱ�Ǹ����ǰ��û��¼���κε�Ӱ��Ϣ�������롮0���������˵���");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			reZreo();
		} else {
			System.out.println("��Ӱ��\t\t����\t����\tʱ��");
			for (int i = 0; i < movies.length; i++) {
				if (movies[i] == null) {
					break;
				}
				System.out.println(movies[i].name + "\t" + movies[i].director + "\t" + movies[i].actors + "\t"
						+ movies[i].duration);
			}
			System.out.println();
			System.out.println("============================");
			System.out.println("�����ɹ��������롮0���������˵���");
			System.out.println("============================");
			reZreo();
		}
	}

	public void deleteMoive() {
		if (movies[0] == null) {
			System.out.println();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("�ܱ�Ǹ����ǰ��û��¼���κε�Ӱ��Ϣ�������롮0���������˵���");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			reZreo();
		} else {
			System.out.println("��¼��ĵ�Ӱ����");
			for (int i = 0; i < movies.length; i++) {
				if (movies[i] == null) {
					break;
				}
				System.out.println("[" + (i + 1) + "]" + " " + movies[i].name);
			}
			System.out.println("��������Ҫɾ���ĵ�Ӱ����");
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
				System.out.println("�ܱ�Ǹ������ĵ�Ӱ�������е�Ӱ�����Ǻϣ����������롣");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				deleteMoive();
			}
			for (int j = indexDelMovieName; j < movies.length - 1; j++) {
				movies[j] = movies[j + 1];
			}
			movies[movies.length - 1] = null;

			System.out.println();
			System.out.println("============================");
			System.out.println("�����ɹ��������롮0���������˵���");
			System.out.println("============================");
			reZreo();
		}
	}
	

	public void UI() {
		System.out.println("=============");
		System.out.println("���Ӱ�ӹ���ϵͳ");
		System.out.println("=============");
		System.out.println("1��������Ӱ");
		System.out.println("2���鿴��Ӱ");
		System.out.println("3��ɾ����Ӱ");
		System.out.println("4���˳�");
		System.out.println("=============");
		System.out.println("��ѡ��");
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
			System.out.println("�ѳɹ��˳���ϵͳ��");
			System.out.println("==============");
			break;
		default:
			System.out.println("!!!!!!!!!!!!!!!!!!");
			System.out.println("����������������룡");
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
			System.out.println("������������롮0���������˵���");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			reZreo();
		}
	}
}