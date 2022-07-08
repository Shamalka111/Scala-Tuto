def normal(x:Double):Double=x*250
def ot(x:Double):Double=x*85
def income(x1:Double,x2:Double):Double=normal(x1)+ot(x2)
def tax(x1:Double,x2:Double):Double=income(x1,x2)*0.12
def takeHomeSal(x1:Double,x2:Double):Double=income(x1,x2)-tax(x1,x2)

def main(args: Array[String])={

    println(takeHomeSal(40,30));
}
