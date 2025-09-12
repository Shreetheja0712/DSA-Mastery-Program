Approach / Logic

    Choose a Pivot:
        ->Pick one element from the list (commonly the first, last, or middle) as the pivot.

    Partition:
        ->Rearrange the list so that:
        ->All elements smaller than pivot are on the left.
        ->All elements greater than pivot are on the right.

    Recursion:
        ->Recursively apply Quick Sort on the left and right sublists.

    Base Case:
        ->If the list has only 1 or 0 elements, it’s already sorted.