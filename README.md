# Hands-on_Lecture_2
This repository contains the code that can solve the leetcode problems Pascal's Triangle and Spiral Matrix.

In Pascal's Triangle, we solve this problem by taking on two approaches. The bruteforce solution calculates each value directly. 
The improved solution uses memoization to store previously computed values which reduces redudant work. Both approaches are 
O(n^2) in space and time, however, the memoization improves efficiency by getting values already calculated.

For spiral matrix, we solve this problem by using variables that hold the current boundary and then iterating through the elements
within the boundary. I don't believe there is a more optimized version of this problem that would be faster as we will always have 
to iterate through all the elements in O(n) time and the space complexity will always be O(n)