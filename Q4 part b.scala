def main(args: Array[String])={

    println(totIncome(30));
}

def additional(x:Int):Int=(x-15)/5
def totAttend(x:Int):Int=120+((-20)*additional(x))
def AtendenceCost(x:Int):Double=totAttend(x)*3
def totCost(x:Int):Double=AtendenceCost(x)+500
def income(x:Int):Double=x*totAttend(x)
def totIncome(x:Int):Double=income(x)-totCost(x)