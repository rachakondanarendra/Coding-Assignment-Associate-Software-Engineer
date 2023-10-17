const array = [2,15,20,18,14,16,15];

array.sort(function(a, b) 
{
    return b - a;
});

console.log("Sorted Array in Descending Order: " + array)
