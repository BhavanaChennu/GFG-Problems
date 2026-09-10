<h2><a href="https://www.geeksforgeeks.org/problems/pair-the-minimum5535/1">Minimize Max Pair Sum</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18.6667px;">Given an array <strong>arr[]</strong> of size <strong>2 × n</strong>, where n is a positive integer, partition the elements into <strong>n pairs</strong> such that every element belongs to exactly one pair.</span></p>
<p><span style="font-size: 18.6667px;">Among all possible pairings, minimize the maximum pair sum, where the sum of a pair is the sum of its two elements.</span></p>
<p><span style="font-size: 18.6667px;">Return the minimum possible value of the maximum pair sum.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input :</strong> arr[] = [5, 8, 3, 9] 
<strong>Output :</strong> 13
<strong>Explanation: </strong>Possible pairs:
Case 1: (8, 9), (3, 5) -&gt; max sum: 17
Case 2: (5, 9), (3, 8) -&gt; max sum: 14
Case 3: (3, 9), (5, 8) -&gt; max sum: 13
The minimum of these maximum sums is 13. Hence, the answer is 13.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input :</strong> arr[] = [1, 6, 5, 9]<strong>
Output :</strong> 11<br><strong>Explanation</strong>: Possible pairs:
Case 1: (6, 9), (1, 5) -&gt; max sum: 15
Case 2: (5, 9), (1, 6) -&gt; max sum: 14
Case 3: (1, 9), (5, 6) -&gt; max sum: 11
The minimum of these maximum sums is 11. Hence, the answer is 11.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size()≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;