public class Complexity {

    // =========================
    // TC-1: Linear Search
    // =========================

    // Best Case:
    // Target = 8, which is the first element.
    // Only 1 comparison is needed.
    // Time Complexity = O(1)

    // Worst Case:
    // Target = 0, which is the 6th element.
    // We may have to check all N elements.
    // Time Complexity = O(N)

    // Average Case:
    // Target can be at any random position.
    // On average, about N/2 elements are checked.
    // Time Complexity = O(N)


    // =========================
    // TC-2: Binary Search
    // =========================

    // Array: {0, 2, 3, 4, 8, 61}
    // Target = 4
    //
    // Step 1:
    // low = 0, high = 5
    // mid = 2 -> array[2] = 3
    // 4 > 3, so search right half.
    //
    // Step 2:
    // low = 3, high = 5
    // mid = 4 -> array[4] = 8
    // 4 < 8, so search left half.
    //
    // Step 3:
    // low = 3, high = 3
    // mid = 3 -> array[3] = 4
    // Target found.
    //
    // Each step divides the search space by 2.
    // Number of steps ≈ log2(N)
    // Time Complexity = O(log N)


    // =========================
    // TC-3: Merge Sort
    // =========================

    // Array: {8, 61, 2, 3, 4, 0}
    //
    // Split:
    //              {8,61,2,3,4,0}
    //              /             \
    //          {8,61,2}        {3,4,0}
    //           /    \           /   \
    //        {8}   {61,2}     {3}  {4,0}
    //              /   \             / \
    //            {61}  {2}         {4} {0}
    //
    // At every level, merging takes O(N) work.
    // Number of levels = O(log N)
    //
    // Total:
    // O(N) × O(log N)
    //
    // Time Complexity = O(N log N)


    // =========================
    // SC-1: Linear Search
    // =========================

    // Linear Search uses only a few variables such as
    // index and target.
    // It does not require extra memory proportional to N.
    //
    // Auxiliary Space Complexity = O(1)


    // =========================
    // SC-2: Binary Search
    // =========================

    // Iterative Binary Search uses variables such as
    // low, high and mid.
    // No extra array is created.
    //
    // Auxiliary Space Complexity = O(1)


    // =========================
    // SC-3: Merge Sort
    // =========================

    // Merge Sort requires extra memory while merging
    // the divided subarrays.
    //
    // For N elements, extra memory of approximately N
    // elements is required.
    //
    // Auxiliary Space Complexity = O(N)
    //
    // In-place algorithms such as Insertion Sort generally
    // use O(1) auxiliary space.
    // Quick Sort usually uses O(log N) auxiliary space
    // because of its recursion stack.
}