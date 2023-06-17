import kotlin.math.*

/* Problem:
   The point (x1,0) is equidistant from the points (x2, y2) and (x2, y3). 
   Find missing x. Using Cartesian Plane Distance Formula.
   */

fun cpdf(y1: Double, x2: Double, y2: Double, x3: Double, y3: Double){
    val x1 = 0
    val a = (x2 - x1).pow(2) + (y2 - y1).pow(2)
    val b = (x3 - x1).pow(2) + (y3 - y1).pow(2)
    val divideBothBy = (x3 * 2) - (x2 * 2)
    val solution = (b.toInt() - a.toInt()) / divideBothBy
    
    // Square both sides:
    val squareBothSides = "x² - ${x2.toInt() * 2}x + ${a.toInt()} = x² - ${x3.toInt() * 2}x + ${b.toInt()}"
    println("Square both sides:\n${squareBothSides}")
    
    // Simplify:
    println("Simplify:\n-${x2.toInt() * 2}x + ${a.toInt()} = -${x3.toInt() * 2}x + ${b.toInt()}")
    
    // Move n to the right side:
    println("Move ${a.toInt()}x to the right side:\n-${x2.toInt() * 2}x = -${x3.toInt() * 2}x + ${b.toInt() - a.toInt()}")
    
    // Move n2 to the left side:
    println("Move ${x3.toInt() * 2}x to the left side:\n${(x3.toInt() * 2) - (x2.toInt() * 2)}x = ${b.toInt() - a.toInt()}")
    
    // Divide both sides:
    print("Divide both sides by ${divideBothBy}:")
    if (solution.isInfinite()) {
            print("\nx = No solution for Infinity")
        } else {
            print("\nx = $solution")
    }
}

fun main(){
    var counter = 0
    val inputInfo = listOf("y1", "x2", "y2", "x3", "y3")
    val c = mutableListOf<Double>()
    println("Enter co-ordinates to find missing x (i.e y1 = 0, x2 = 1 etc..)")
    repeat(5){
        print("${inputInfo[counter]}= ")
        val input = readln().toDouble()
        c.add(input)
        counter++
    }
    cpdf(c[0],c[1],c[2],c[3],c[4])
}
