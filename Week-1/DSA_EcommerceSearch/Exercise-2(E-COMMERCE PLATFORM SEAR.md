Exercise-2(E-COMMERCE PLATFORM SEARCH FUNCTION)

Step 1 — Understanding Asymptotic Notation

Big O notation is a way of describing how the running time (or memory use) of an algorithm grows as the size of its input, usually called n, grows. Instead of measuring exact seconds, it focuses on the rate of growth — how much slower the algorithm gets as you feed it more data. This matters because the same algorithm might run on 10 items today and 10 million tomorrow; Big O tells you what to expect at scale, independent of the specific machine or programming language used.

It helps in analyzing algorithms in a few concrete ways:

Predicting scalability — an O(n) algorithm and an O(log n) algorithm might both feel fast on 100 products, but on 10 million products the difference becomes huge.

Comparing algorithms fairly — it strips away hardware speed, compiler optimizations, and other noise, leaving just the algorithm's inherent efficiency.

Worst-case guarantees — it tells you the upper bound on how bad things can get, which is critical for performance-sensitive systems like an e-commerce search feature.


Best, average, and worst case for search operations:


For linear search (checking each product one by one):

Best case — O(1): the item you're searching for happens to be the first one checked.

Average case — O(n): on average, you'll scan through about half the list before finding (or not finding) the item.

Worst case — O(n): the item is last, or doesn't exist, so every element gets checked.



For binary search (repeatedly halving a sorted list):

Best case — O(1): the item is right in the middle on the first check.

Average case — O(log n): each comparison eliminates half the remaining products, so it converges quickly.

Worst case — O(log n): even in the worst case, you only need about log₂(n) comparisons — for 1 million products, that's roughly 20 comparisons instead of up to 1,000,000.

This is exactly why binary search is the better choice for a large, frequently-searched product catalog — but only once the data is sorted, which is its one precondition.


Step 4: Analysis

Linear search is O(n) — worst case checks every product. Binary search is O(log n) — worst case checks only \~20 items even for a 1,000,000-product catalog, but needs the data pre-sorted.

Binary search is more suitable for the platform since searches happen constantly and the catalogue can be sorted once, reused many times. It only works on the sorted field though (e.g. productId) — searching by name/category would need a different structure like a hash map.





