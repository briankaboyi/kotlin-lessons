void main(){
  print("Hello World from dart");
  List<int> nums = [1, 2, 3, 4, 5];
  List<int> reversedList = reverseList(nums);
  print("list : $nums");
  print("list reversedList  : $reversedList");

}
List<int> reverseList(List<int> nums) {

  List<int> reversedNums = [];
for(int i = nums.length-1; i >= 0; i--){
    reversedNums.add(nums[i]);
  }
  return reversedNums;
}
