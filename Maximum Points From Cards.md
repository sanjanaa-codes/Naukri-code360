## Maximize Card Points

### Problem Statement

You are given an integer array `cardPoints` and an integer `k`.
You can take cards from either the beginning or the end of the array, one at a time.
Your goal is to maximize the total points you can obtain after taking exactly `k` cards.

### Approach

Instead of checking all combinations, use a **sliding window** technique:

1. Take the sum of the first `k` cards — that’s the initial score.
2. Gradually shift the window by removing cards from the left and adding cards from the right.
3. Track the maximum score possible at each step.

This ensures all combinations are considered efficiently without brute force.

### Algorithm

1. Compute the sum of the first `k` cards (`lsum`).
2. Initialize `maxsum = lsum`.
3. Move one card at a time from the left end to the right end:

   * Subtract the last taken left card.
   * Add a card from the right end.
   * Update `maxsum` if a higher sum is found.
4. Return `maxsum` after all shifts.

### Complexity

* **Time Complexity:** `O(2N)` ≈ `O(N)`
* **Space Complexity:** `O(1)`

### Code

```java
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0, rsum = 0;

        // Sum of first k cards
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        int maxsum = lsum;
        int rindex = cardPoints.length - 1;

        // Slide window from left to right
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex--];
            maxsum = Math.max(maxsum, lsum + rsum);
        }

        return maxsum;
    }
}
```

### Example

**Input:**
`cardPoints = [1,2,3,4,5,6,1], k = 3`
**Output:**
`12`
**Explanation:**
Take cards `[1,2,6,1]` → max sum is `12`.

---

### Simplified Code

```java
public class Solution {
    public static int maxPoints(int []arr , int K){
        int total = 0;
        int n = arr.length;
        int rindex = n-1;
        for(int i=0;i<K;i++){
            total += arr[i];
        }
        int maxsum = total;
        for(int j=K-1;j>=0;j--){
            total -= arr[j];
            total += arr[rindex--];
            maxsum = Math.max(maxsum, total);
        }
        return maxsum;

    }
}
```

