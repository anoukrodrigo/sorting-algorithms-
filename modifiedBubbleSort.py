def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        # Track if any swaps were made during this pass
        swapped = False
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                # Swap the elements
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        # If no swaps were made, the array is already sorted
        if not swapped:
            break


def main():
    # Get user input
    user_input = input("Enter numbers separated by spaces: ")

    # Convert input string to a list of integers
    arr = list(map(int, user_input.split()))

    # Perform bubble sort
    bubble_sort(arr)

    # Print the sorted array
    print("Sorted array:", arr)


if __name__ == "__main__":
    main()
