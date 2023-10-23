function Descending(array) {
    for (var i = 0; i < array.length; i++) {
      for (var j = i + 1; j < array.length; j++) {
        if (array[j] > array[i]) {
          var temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
}
var array = [3,5,1,2,7,6,5,9]
var resultarray = Descending(array);
console.log(resultarray);