import java.util.ArrayList;
import java.util.Scanner;

public class Race {

    ArrayList<Car> cars = new ArrayList<>();

    public void InputCarsData(){

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 4; i++){

            String carName = "";

            while (carName.isEmpty())
            {
                System.out.println("— Введите название машины №" + i + ":");
                String name = scanner.next();
                name = name.trim();

                if(!name.isEmpty())
                {
                    carName = name;
                }
                else
                {
                    System.out.println("— Название машины не может быть пустым");
                }
            }

            int carSpeed = 0;

            while (carSpeed == 0)
            {
                System.out.println("— Введите скорость машины №" + i + ":");
                int speed = Integer.parseInt(scanner.next());
                if(speed >= 0 && speed <=250)
                {
                    carSpeed = speed;
                }
                else
                {
                    System.out.println("— Неправильная скорость");
                }
            }

            cars.add(new Car(carName, carSpeed));
        }
    }

    public void RaceResult()
    {
        String carName = "";
        int dist = 0;
        for (Car car: cars) {
            int carDist = 24 * car.speed;
            if(carDist > dist)
            {
                dist = carDist;
                carName = car.name;
            }
        }
        System.out.println("Самая быстрая машина: " + carName);
    }
}
