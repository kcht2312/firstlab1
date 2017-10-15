package firstlab;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Заполните массив.");
        System.out.println("Введите размер массива");
                int ArraySize = in.nextInt();
                Quarters[] quarters= new Quarters[ArraySize];
                for(int i = 0; i < quarters.length; i++) {
                    System.out.println("Какой объект создать?(1-Store/2-Stock)");
                    int enteredClass = in.nextInt();
                    System.out.println("Введите название");
                    String enteredName = in.next();
                    System.out.println("Введите адрес");
                    String enteredAddress = in.next();
                    System.out.println("Введите площадь");
                    double enteredArea = in.nextDouble();
                    System.out.println("Введите колличество стеллажей");
                    int enteredQuantityRack = in.nextInt();
                    int quantityRackOnShelf[] = new int[enteredQuantityRack];
                    System.out.println("Введите колличесство полок в стеллажах");
                    for (int a = 0; a < enteredQuantityRack; a++){
                        quantityRackOnShelf[a] = in.nextInt();
                    }
                    switch(enteredClass) {
                        case 1:
                            quarters[i] = new Store(enteredName, enteredAddress, enteredArea, enteredQuantityRack, quantityRackOnShelf);
                            break;
                        case 2:
                            quarters[i] = new Stock(enteredName, enteredAddress, enteredArea, enteredQuantityRack, quantityRackOnShelf);
                            break;
                        default:
                            System.out.println("Вариант отсутствует");
                    }
                }
        }
        System.out.println();
    }





