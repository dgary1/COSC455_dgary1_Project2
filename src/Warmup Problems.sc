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
def prime(n: Int): Boolean = {
  val counter : Int = 1
  val factor: Int = 0
  isPrime(n, counter, factor) match {
    case true => true
    case false => false
  }
}
// helper method
def isPrime(n: Int, counterPara: Int, factorPara: Int) : Boolean = {
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
prime(1)
prime(2)
prime(3)
prime(9)
prime(71)
prime(121)

// Warmup Problems #2
// Twin Primes
def twinprimes(p1: Int, p2: Int): Boolean = {
  if (prime(p1) == true && prime(p1) == true && (p2 - p1) == 2)
    true
  else
    false
}
twinprimes(41, 43)
twinprimes(41, 47)
twinprimes(11, 13)

// Warmup Problem #3
// Twin Primes List
def twinprimeslist(n: Int) : List[Int] = {
  twin(twinList(n).reverse)
}
def twinList(n: Int) : List[Int] = {
  if(twinprimes(n, n - 2))
    n :: n + 2 :: twinList(n - 2)
  else
    twinList(n - 1)
}
def twin(someList: List[Int]) : List[Int] = {
  someList match {
    case Nil => Nil
    case n :: List() => List(n)
    case n :: tail if(n == tail.head) => twin(tail)
    case n :: tail => n :: twin(tail)
  }
}
// twinprimeslist(25)

// Warmup Problem #4
// Goldbach's Conjecture

def goldbach(g: Int) : Unit = {
  g match {
    case (g) if (g <= 2) => println("Integer has to be greater than 2 to be considered.")
    case (g) if (g % 2 == 1) => println("Integer entered must be even")
    case (g) if (g % 2 == 0) => {
      val g1 = 1
      goldbachFinder(g, g1)
    }
  }
}
def goldbachFinder(g: Int, g1: Int) : Unit = {
  val a : Int = g
  val b : Int = g1
  b match {
    case 2 => goldbachFinder(a, b)
    case (b) if (prime(a - b)) => {
      println(b + " + " + (a - b) + " = " + a)
    }
    case _ => goldbachFinder(a, b)
  }
}
goldbach(28)
