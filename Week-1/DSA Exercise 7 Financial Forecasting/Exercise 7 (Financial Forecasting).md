Exercise 7 (Financial Forecasting)
Step 1:

Recursion is a technique where a function solves a problem by calling itself on a smaller version of the same problem, until it reaches a case simple enough to answer directly (the base case). Each recursive call breaks the problem down further, and once the base case is hit, the results are combined back up the chain of calls to produce the final answer.

Every recursive solution needs two parts:

Base case — the stopping condition that prevents infinite recursion (e.g., "if years == 0, just return the present value").

Recursive case — how the problem shrinks with each call (e.g., "apply one year of growth, then solve the same problem for years - 1").

How it simplifies problems like financial forecasting:

Predicting a future value that compounds year after year is naturally repetitive — each year's value depends only on the previous year's value and the growth rate. Recursion mirrors that structure directly: instead of writing a loop that manually tracks an accumulator variable, you express the relationship as "future value in year n = grow(future value in year n-1)", which is very close to how you'd describe the problem in plain English or in a mathematical formula. This makes the code easier to read and reason about for problems that are inherently defined in terms of themselves (like compound growth, tree traversals, or breaking a big problem into identical smaller subproblems).

The tradeoff is that recursion uses call-stack memory for each nested call, which is where the optimization discussion in Step 4 comes in (e.g., converting to an iterative loop or using tail recursion to avoid building up a large call stack for something like a 30-year forecast).

Step 4: Analysis

Time:O(n) — one recursive call per year.

Space: O(n) — each call stays on the stack until the base case returns, so large `years` values risk a stack overflow.

\*\*Optimize by:

\- Using a loop instead → O(n) time, O(1) space.

\- Using the closed-form formula presentValue \* (1+growthRate)^years` → O(1) time and space.

\- Java doesn't optimize tail recursion, so a loop/formula is the real fix, not tail-call rewriting.

\- Memoization isn't needed — no subproblem repeats.



