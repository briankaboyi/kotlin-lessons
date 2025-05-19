void main(){
  print("Hello World from dart");
  List<int> nums = [1, 2, 3, 4, 5];
  List<int> reversedList = reverseList(nums);
  print("list : $nums");
  print("list reversedList  : $reversedList");
  int max = maxValue(nums);
  print("max value : $max");

}
/** * a function that takes a list of integers and returns a new list with the elements in reverse order.
 *
 */
List<int> reverseList(List<int> nums) {
  List<int> reversedNums = [];
for(int i = nums.length-1; i >= 0; i--){
    reversedNums.add(nums[i]);
  }
  return reversedNums;
}

int maxValue(List<int> nums){
  int max = nums[0];
  for(int i in nums){
    if(i > max){
      max = i;
    }
  }
  return max;
}

