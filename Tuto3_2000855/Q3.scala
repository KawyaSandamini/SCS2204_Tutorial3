@main
def run():Unit={
    println("Volume of a sphere with radius 5: ")
    volume(5.0)
}
def volume(r:Double):Unit=println((4*math.Pi*r*r*r)/3)