package java7.collections;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		// start();
		// addPlayerObjects();
		usingGenerics();
	}

	private static void start() {
		// LISTS RETAIN INSERTION ORDER
		// LISTS ALLOWS MULTIPLE NULLS
		ArrayList players = new ArrayList();
		players.add("Rambo");
		players.add("John");
		players.add(null);
		players.add("John");
		players.add(null);
		System.out.println(players);

	}

	private static void addPlayerObjects() {
		ArrayList players = new ArrayList();
		Player player = new Player();
		player.id = 1;
		player.name = "Bill";
		players.add(player);

		Player player1 = new Player();
		player1.id = 2;
		player1.name = "Gates";
		players.add(player1);

		players.add("Dhoni");
		players.add(2);
		System.out.println(players);
	}

	private static void usingGenerics() {
		ArrayList<Player> players = new ArrayList();
		Player player = new Player();
		player.id = 1;
		player.name = "Bill";
		players.add(player);

		Player player1 = new Player();
		player1.id = 2;
		player1.name = "Gates";
		players.add(player1);

//		players.add("Dhoni");
//		players.add(2);
		System.out.println(players);
	}
}

class Player {
	int id;
	String name;

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

}
