package Homework.Homework_05.Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Problem 5: Circular Tour Problem (Gas Station)
 *
 * Description: Given a set of petrol pumps with petrol and distance to the next pump,
 * determine the starting point for completing a circular tour without running out of petrol.
 *
 * Approach:
 * - Use a queue to simulate the circular tour as suggested in the hint.
 * - If at any point the current petrol balance drops below zero, dequeue pumps from the front,
 *   deducting their balance from the tour sum, and advance the start point.
 * - If total petrol across all pumps < total distance, completing the tour is impossible (return -1).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N) using Queue simulation (or O(1) auxiliary)
 */
public class CircularTour {

    public static class PetrolPump {
        int petrol;
        int distance;

        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    /**
     * Queue-based circular tour simulation
     * @return 0-based index of starting pump, or -1 if impossible
     */
    public static int findStartingPoint(PetrolPump[] pumps) {
        if (pumps == null || pumps.length == 0) {
            return -1;
        }

        int n = pumps.length;
        Queue<Integer> tourQueue = new ArrayDeque<>();
        int currentSurplus = 0;
        int totalSurplus = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int net = pumps[i].petrol - pumps[i].distance;
            totalSurplus += net;
            currentSurplus += net;
            tourQueue.offer(i);

            // If current surplus is negative, pumps in the queue cannot be part of a valid start
            while (currentSurplus < 0 && !tourQueue.isEmpty()) {
                int removedIndex = tourQueue.poll();
                currentSurplus -= (pumps[removedIndex].petrol - pumps[removedIndex].distance);
                start = i + 1;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }

    /**
     * Overloaded helper taking integer arrays
     */
    public static int findStartingPoint(int[] petrol, int[] distance) {
        if (petrol == null || distance == null || petrol.length != distance.length) {
            return -1;
        }

        int n = petrol.length;
        PetrolPump[] pumps = new PetrolPump[n];
        for (int i = 0; i < n; i++) {
            pumps[i] = new PetrolPump(petrol[i], distance[i]);
        }
        return findStartingPoint(pumps);
    }

    public static void main(String[] args) {
        System.out.println("=== Problem 5: Circular Tour Problem ===");

        // Test Case 1
        int[] petrol1 = {4, 6, 7, 4};
        int[] dist1 = {6, 5, 3, 5};
        int start1 = findStartingPoint(petrol1, dist1);
        System.out.println("Pumps: Petrol = [4, 6, 7, 4], Distance = [6, 5, 3, 5]");
        System.out.println("Starting Petrol Pump Index: " + start1); // Expected: 1

        System.out.println();

        // Test Case 2
        int[] petrol2 = {1, 2, 3, 4, 5};
        int[] dist2 = {3, 4, 5, 1, 2};
        int start2 = findStartingPoint(petrol2, dist2);
        System.out.println("Pumps: Petrol = [1, 2, 3, 4, 5], Distance = [3, 4, 5, 1, 2]");
        System.out.println("Starting Petrol Pump Index: " + start2); // Expected: 3

        System.out.println();

        // Test Case 3: Impossible tour
        int[] petrol3 = {2, 3, 4};
        int[] dist3 = {3, 4, 3};
        int start3 = findStartingPoint(petrol3, dist3);
        System.out.println("Pumps: Petrol = [2, 3, 4], Distance = [3, 4, 3]");
        System.out.println("Starting Petrol Pump Index: " + start3); // Expected: -1
    }
}
