// Warmup Problem #1
// Prime numbers
// Some helpful hints:
//  You may need to write helper functions in some solutions that are not explicitly named
// here.
//  You should use recursive solutions, no looping/iterating allowed!
//  Recall the way that pattern matching in a list works in Scala – this should be very helpful
// in a good solution. For full credit, you should use pattern matching over if-else statements
// where possible.
//  As in any language, adopt a “write once, use often” mentality. If there is something you
// need to do several times, write a function for it and use it appropriately.
//  Test each function you write incrementally within the Scala worksheet to make sure it
//  works correctly.
def prime (n: Int) : Boolean = {
  var isPrime: Boolean = false
  if (n.equals(1))
    isPrime = false
  else if (n.equals(2))
    isPrime = true
  else {
    for (a <- 3 to n) {
      if ((n % a).equals(0)) {
        isPrime = true
      }
      else
        isPrime = false
    }
  }
  isPrime
}
val n = 4
prime(n)




// Warmup Problems #2
// Twin Primes



// Warmup Problem #3
// Twin Primes List


// Warmup Problem #4
// Goldbach's Conjecture
