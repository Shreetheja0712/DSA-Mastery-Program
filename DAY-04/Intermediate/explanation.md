Approach / Logic
    
    ->Divide:
        If the list has more than one element, split it into two halves.
    
    ->Conquer (Recursion):
        Recursively apply Merge Sort on each half until each sub-list has only one element (which is naturally sorted).
    
    ->Merge:
        Combine the two sorted halves into one sorted list.
    
    ->While merging, compare elements from both halves and pick the smaller one first.