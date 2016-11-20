// Warmup Problem #1
// Prime numbers
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
