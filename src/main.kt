//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity by $x people”
// where x is the number of people exceeding its capacity
//-identity() : Prints out the color, make and model in the following format e.g:  “I am a white subaru legacy”
//-calculate ParkingFees(hours: Int) : Calculates and returns the parking fees by multiplying the hours by 20

 fun main(){
     var subaru=Car("probox", "porche", "black", 14)
     subaru.carry(24)
     subaru.identity()
     subaru.calculateParkingFees(5)

     var nissan=Bus("toyota", "Lambogini", "Blue", 8)
     nissan.maxTripFare(200.50)
     nissan.calculateParkingFees(7)




 }
open class Car (var make:String, var model:String, var color:String, var capacity:Int){

    fun carry(people:Int){
        var x=people-capacity
       if(people <5)
        println("Carrying $people passengers")
        else{
            println("Over capacity by $x people")
        }

    }
    fun identity (){
        println("i am a $color, $make, $model ")

    }
    open fun calculateParkingFees(hours:Int):Int {
        var parkingFees = hours * 20
        println(parkingFees)
        return parkingFees

    }
   }



//create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per trip.(2 points)
//The bus’calculateParkingFees method returns the product of hours and the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes

class Bus( make:String, model:String, color:String,  capacity:Int):Car(make, model, color, capacity) {


    fun maxTripFare(fare: Double): Double {
        var pay = fare * capacity
        println(pay)
      return pay
    }
    override fun calculateParkingFees(hours: Int):Int {
        var me=hours*capacity
        println(me)
        return me


    }
}



