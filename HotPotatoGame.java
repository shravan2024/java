package collections;

 
	import java.util.ArrayDeque;
	import java.util.Queue;

	public class HotPotatoGame {
	    public static void main(String[] args) {
	        // Create a queue to represent players
	        Queue<String> players = new ArrayDeque<>();

	        // Add player names to the queue (you can modify this list as needed)
	        players.add("Alice");
	        players.add("Bob");
	        players.add("Charlie");
	        players.add("David");
	        players.add("Emily");

	        // Simulation loop
	        while (players.size() > 1) {
	            // Number of times to pass the potato (randomize as needed)
	            int passes = 3; // For example, pass 3 times

	            // Perform passes
	            for (int i = 0; i < passes; i++) {
	                // Dequeue the player at the front and enqueue at the rear
	                String currentPlayer = players.poll();
	                players.offer(currentPlayer);
	            }

	            // Player removed (the one at the front)
	            String removedPlayer = players.poll();
	            System.out.println("Player removed: " + removedPlayer);
	        }

	        // Last player remaining
	        String winner = players.poll();
	        System.out.println("Winner: " + winner);
	    }
	}
