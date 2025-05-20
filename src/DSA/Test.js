function main() {
    console.log("Hello World");
}

main();
numbersList = [1, 2, 3, 4, 5];

const evenNumbers = numbersList.filter((number) => number % 2 === 0);

/**
 * @description This function takes an array as input and returns a new array with the elements in reverse order.
 * @param array
 * @returns {[]}
 */
function reversedArray(array) {
    let numbersList = [];

    for  (let i = numbersList.length - 1; i >= 0; i--) {
        numbersList.push(numbersList[i]);
    }
    return numbersList;
}

const reversedNumbers = reversedArray(numbersList)
console.log(reversedNumbers);
console.log(Math.max( 3, 4, 5));
const findMax = (a,b) => Math.max(a,b);

console.log(findMax(3, 9));
