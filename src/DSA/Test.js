function main(){
    console.log("Hello World");
}
main();
numbersList = [1, 2, 3, 4, 5];
let newNumberList = [];
for (let i = numbersList.length-1; i >= 0; i--) {
   newNumberList.push(numbersList[i]);
}
console.log(newNumberList);
const evenNumbers = newNumberList.filter((number) => number % 2 === 0);