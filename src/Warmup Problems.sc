// Worksheet #1 - Warm ups
// David Gary

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

// Warmup Problem #1
// Prime numbers
def isPrime(n: Int): Boolean = {
  val counter : Int = 1
  val factor: Int = 0
  prime(n, counter, factor) match {
    case true => true
    case false => false
  }
}
// helper method
def prime(n: Int, counterPara: Int, factorPara: Int) : Boolean = {
  factor(n, counterPara, factorPara) match {
    case 2 => true
    case _ => false
  }
}
// helper method to the helper method
def factor(n: Int, m: Int, f: Int) : AnyVal = {
  var fact : Int = f
  var counter : Int = m
  if (counter == n) {
    fact += 1
    return fact
  }
  if (counter <= n) {
    if (n % counter == 0)
      fact += 1
    counter += 1
    factor(n, counter, fact)
  }
}
// Test Cases
isPrime(1)
isPrime(2)
isPrime(3)
isPrime(9)
isPrime(71)
isPrime(121)


// Warmup Problems #2
// Twin Primes



// Warmup Problem #3
// Twin Primes List


// Warmup Problem #4
// Goldbach's Conjecture
