def mergeSort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left_half = mergeSort(arr[:mid])
    right_half = mergeSort(arr[mid:])

    return merge(left_half, right_half)

def merge(left, right):
    sorted_arr = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_arr.append(left[i])
            i += 1
        else:
            sorted_arr.append(right[j])
            j += 1

    sorted_arr.extend(left[i:])
    sorted_arr.extend(right[j:])

    return sorted_arr

def get_user_input():
    arr = input("Enter the numbers separated by spaces: ").split()
    arr = [int(i) for i in arr]
    return arr

def main():
    arr = get_user_input()
    print("Given array is:", arr)
    sorted_arr = mergeSort(arr)
    print("Sorted array is:", sorted_arr)

if __name__ == "__main__":
    main()
