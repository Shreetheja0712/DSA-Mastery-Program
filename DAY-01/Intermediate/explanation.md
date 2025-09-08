Approach/Logic :

->Start from the first element of the list.
->Compare it with the next element.
->If the first one is bigger, swap them.
->Move to the next pair and repeat until the end of the list.
->After the first round, the largest number moves to the last position (like a bubble rising to the top).
->Repeat the process for the remaining elements, but each time stop one step earlier (since the last elements are already sorted).
->Continue until no swaps are needed → list is sorted.
->In every round, the biggest number “bubbles” to the end.
->After n-1 rounds, the whole list becomes sorted.