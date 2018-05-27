class car(var type:String,
          var model:Int,
          var price:Double,
          var milesDrive:Int,
          var owner:String)
{
    init{
        println("type : $type")
        println("model : $model")
        println("price : $price")
        println("milesDrive : $milesDrive")
        println("owner : $owner")
        }
}
fun main(args:Array<String>)
{
    val huCar= car type: "BMW", model: 2015, price:10000.0, milesDrive:105, owner:"Reaz"
    println("hucar: "+ huCar.model)
    val jeCar= car type:"ka", model:2017, prie:1000.0, milesFrive:1, owner:"reaz"
}