def hanoi(n, source, target, auxiliary):
    if n == 1:
        print(f"Move disk 1 from {source} to {target}")
        return
    hanoi(n - 1, source, auxiliary, target)
    print(f"Move disk {n} from {source} to {target}")
    hanoi(n - 1, auxiliary, target, source)

# Example usage
n = int(input("Enter the number of disks: "))
source = input("Enter the name of the source rod: ")
target = input("Enter the name of the target rod: ")
auxiliary = input("Enter the name of the auxiliary rod: ")

hanoi(n, source, target, auxiliary)
