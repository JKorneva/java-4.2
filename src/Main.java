public class Main {
  public static void main(String[] args){
     BodyMassIndex service= new BodyMassIndex();
     float Height = 0.40F;
     float Weight = 3.7F;
     float BodyMass = service.Calculate(Weight,Height);
     System.out.print("Индекс массы тела:"+BodyMass);

      //System.out.print("Индекс массы тела:"+new BodyMassIndex().calculate(3.7F,0.4F));
  }

    }

