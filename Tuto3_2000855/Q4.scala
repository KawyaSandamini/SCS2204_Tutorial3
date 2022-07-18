@main
def run():Unit={
    println("Total wholesale for 60 copies:")
    println(bookPrice(60)-discount(bookPrice(60))+ShippingCost(60))
}
//Total amount for 60 books
def bookPrice(x:Int):Double=x*24.95
//Discount
def discount(amount:Double):Double=amount*0.4
//Shipping cost
def ShippingCost(x:Int):Double={if(x<=50) 3*x else (3*x+(x-50)*0.75)}
