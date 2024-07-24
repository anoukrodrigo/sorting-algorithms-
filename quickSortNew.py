def partition(arr, low, high):
    pivot = arr[(low + high) // 2]  # Choose the middle element as the pivot

    while low <= high:
        while arr[low] < pivot:
            low += 1
        while arr[high] > pivot:
            high -= 1

        if low <= high:
            arr[low], arr[high] = arr[high], arr[low]
            low += 1
            high -= 1

    return low

def quickSort(arr, low, high):
    if low < high:
        middle = partition(arr, low, high)

        # Recursively sort the subarrays
        quickSort(arr, low, middle - 1)
        quickSort(arr, middle, high)

# Take the size of the array
size = int(input("Enter the size of the array: "))

# Initialize an empty array
array = []

# Loop to take array elements as input
for i in range(size):
    el = int(input(f"Enter element {i + 1}: "))
    array.append(el)

print("Original array:", array)

quickSort(array, 0, size - 1)
print("Sorted array:", array)
