void main() {
  print("Hello World from dart");
  List<int> nums = [1, 2, 3, 4, 5];
  List<int> reversedList = reverseList(nums);
  print("list : $nums");
  print("list reversedList  : $reversedList");
  int max = maxValue(nums);
  print("max value : $max");
  print("sumToN : ${sumToN(8)}");
}

/** * a function that takes a list of integers and returns a new list with the elements in reverse order.
 *
 */
List<int> reverseList(List<int> nums) {
  List<int> reversedNums = [];
  for (int i = nums.length - 1; i >= 0; i--) {
    reversedNums.add(nums[i]);
  }
  return reversedNums;
}
/**
 * A function that takes a list of integers and returns the maximum value in the list.
 * For example, if the list is [1, 2, 3, 4, 5], the function should return 5.
 */
int maxValue(List<int> nums) {
  int max = nums[0];
  for (int i in nums) {
    if (i > max) {
      max = i;
    }
  }
  return max;
}

/**
 * A function that takes an integer n and returns the sum of all integers from 1 to n.
 * For example, if n is 5, the function should return 15 (1 + 2 + 3 + 4 + 5).
 */
int sumToN(int n){
  int numValue = n;
  int totalValue = 0;
  while (numValue>=1){
      totalValue += numValue;
      numValue--;
  }
  return totalValue;
}

