## Optimized Singly Linked List (Having Start and End References)

in the previous code the insert at the end method have the complexity of O(n) so to resolve this issue in this code i will add an extra reference of end node 

so this is the code of singly linkedlist having start and end reference:
- so by the end reference we will have directly access of end node and we can insert the next node by using end reference
- but still there is the O(n) complexity int the delete at end method