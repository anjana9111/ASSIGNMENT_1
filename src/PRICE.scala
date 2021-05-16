object PRICE extends  App {
  val x=60

  def cost(x : Int):Double=24.95*60/100+3+0.75*(x-50)
  print("price is=")
  println(cost(x))
}
