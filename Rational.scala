// vim: set ts=4 sw=4 et:

package chp1-9

class Rational(n: Int, d: Int) {
  
  // require non-zero denom 
  require(d != 0)

  // always initialize with the reduced form of the input rational
  private val g = gcd(n.abs, d.abs)
  val numer = n/g
  val denom = d/g

  // auxillary constructor for whole rationals
  def this(n: Int) = this(n,1)

  // add method
  def + (that: Rational): Rational = 
    new Rational(numer * that.denom + that.numer * denom, that.denom * denom)

  def + (i: Int): Rational = 
    new Rational(numer + i * denom, denom)

  // subtract method
  def - (that: Rational): Rational = 
    new Rational(numer * that.denom - that.numer * denom, that.denom * denom)

  def - (i: Int): Rational = 
    new Rational(numer - i * denom, denom)
    
  // multiply method
  def * (that: Rational): Rational = 
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational = 
    new Rational(numer * i, denom)

  // divide method
  def / (that: Rational): Rational = 
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational = 
    new Rational(numer, denom * i)

  // override the Object.toString return value used in the REPL to show more clearly what value is stored in new Rationals
  override def toString = n +"/"+ d

  // find the global common denominator, private only
  private def gcd(a: Int, b: Int): Int = 
    if (b == 0) a else gcd(b, a%b)

}
