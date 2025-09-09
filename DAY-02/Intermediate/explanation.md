Approach/Logic :

->Start from the first element of the list.
->Look at the entire list and find the smallest element.
->Swap that smallest element with the first element.
->Now, move to the second position.
->Again, search the rest of the list for the smallest element, and swap it with the second element.
->Repeat this for every position until the last one.
->At the end, the list is sorted.
->In each round, we select the smallest element from the unsorted part and put it in its correct position.
->After n-1 rounds, the list is sorted.