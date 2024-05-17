class car {
  public car(){
    System.out.println("Class car");
  }
  public void vehicle_type(){
    System.out.println("Vehicle type: Car");
  }
}
class Maruti extends car{
  public Maruti(){
    System.out.println("Class Maruti");
  }
  public void brand(){
    System.out.println("brand: Maruti");
  }
  public void speed(){
    System.out.println("speed: 80kmph");
  }
}
public class Program6 extends Maruti{
  public Program6(){
    System.out.println("maruti model:800");
  }
  public void speed(){
    System.out.println("speed: 100kmph");
  }
  public static void main(String[] args){
    Program6 m = new Program6();
    m.vehicle_type();
    m.brand();
    m.speed();
  }
}