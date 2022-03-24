public class AssociationPrincipleStory {
    public static void main(String args[])
    {
        Restaurant restaurantObj = new Restaurant();
        Movie movieObj = new Movie();
        restaurantObj.entertainment(movieObj);
        //Feedback feedback1 = new Feedback();
        //feedbackObj.enterFeedback("we are giving feedback");
        //System.out.println(feedbackObj);
        GasBill1 gasObj = restaurantObj.useGas("Gas bill is Rs.");
        System.out.println(gasObj);

    }
}
class Restaurant
{
    String inputGasPipe;
    AirConditioner acObj = new AirConditioner();    //hasA
    Aquarium AqObj = new Aquarium();                //hasA
    Branch branchObj = new Branch();                //hasA
    Feedback feedbackObj = new Feedback();          //hasA

    GasBill1 useGas(String inputGasPipe)            //producesA
    {
        this.inputGasPipe = inputGasPipe;
        GasBill1 gasBillObj = new GasBill1(inputGasPipe);
        System.out.println(gasBillObj);
        return gasBillObj;
    }

    void entertainment(Movie m)
    {

    }

}
class Branch
{

}
class Movie
{

}
class KFC extends Restaurant                           //isA
{

}
class AirConditioner
{

}
class Aquarium
{

}
class Feedback {
//    String a;;
//    public Feedback(String a)
//    {
//        this.a = a;
//        System.out.println("in String constructor");
//    }
//
//     @Override
//    public String toString() {
//        return "Feedback{" +
//                "a='" + a + '\'' +
//                '}';
//    }
}
class GasBill1
{
    String gasPipe;
    public GasBill1(String gasPipe)
    {
        this.gasPipe = gasPipe;
        System.out.println("in GasBill constructor");
    }

    @Override
    public String toString() {
        return "GasBill1{" +
                "gasPipe=" + gasPipe +
                '}';
    }
}
class Person
{
    
}
