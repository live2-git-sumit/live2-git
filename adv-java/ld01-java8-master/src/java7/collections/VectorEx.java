package java7.collections;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// start();
		// addPlayerObjects();
		usingGenerics();
	}

	private static void start() {
		// LISTS RETAIN INSERTION ORDER
		// LISTS ALLOWS MULTIPLE NULLS
		Vector players = new Vector();
		players.add("Rambo");
		players.add("John");
		players.add(null);
		players.add("John");
		players.add(null);
		System.out.println(players);

	}

	private static void addPlayerObjects() {
		Vector players = new Vector();
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
		Vector<Player> players = new Vector();
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
