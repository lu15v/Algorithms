/**
 * 
 * print the pattern  n -5, until reach 0 or negative then print n + 5 until reach the same number
 * i.e
 *  n = 16.    16, 11, 6, 1, -4, 1, 6, 11, 16
 */

const printPat = (n, m, flag) => {
  console.log(n);
  if(!flag){
      if(n - 5 > 0){
        printPat(n -5 , m, false);
      }else{
        printPat(n -5 , m, true);
      }
  }else{
    if(n === m){
      return;
    }else{
      printPat(n + 5, m , true);
    }
  }
  
  
}


printPat(16,16,false);