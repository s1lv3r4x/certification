
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class laptopMaine {

    public static void main(String args[]) {
        // создание множества и добавление туда ноутбуков

        laptop Laptop_1 = new laptop("ModelA", "8", "512", "windows", "black");
        laptop Laptop_2 = new laptop("ModelB", "16", "256", "windows", "silver");
        laptop Laptop_3 = new laptop("ModelC", "8", "1024", "linux", "black");
        laptop Laptop_4 = new laptop("ModelD", "4", "512", "macOS", "white");
        laptop Laptop_5 = new laptop("ModelE", "8", "256", "windows", "red");
        laptop Laptop_6 = new laptop("ModelF", "16", "512", "linux", "silver");
        laptop Laptop_7 = new laptop("ModelG", "32", "1024", "windows", "black");
        laptop Laptop_8 = new laptop("ModelH", "8", "128", "macOS", "white");
        laptop Laptop_9 = new laptop("ModelI", "4", "256", "linux", "black");
        laptop Laptop_10 = new laptop("ModelJ", "8", "512", "windows", "blue");
       
        Set<laptop> laptops = new HashSet<>();
        laptops.add(Laptop_1);
        laptops.add(Laptop_2);
        laptops.add(Laptop_3);
        laptops.add(Laptop_4);
        laptops.add(Laptop_5);
        laptops.add(Laptop_6);
        laptops.add(Laptop_7);
        laptops.add(Laptop_8);
        laptops.add(Laptop_9);
        laptops.add(Laptop_10);
        

        //Coplfybt Map с критериями

        Map<Integer, String> criteriaMap = new HashMap<>();
        criteriaMap.put(1, "ram");
        criteriaMap.put(2, "hdd");
        criteriaMap.put(3, "os");
        criteriaMap.put(4, "color");
        

        //Создание множетва с фильрами
        Map<String, String> filter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Параметры доступные для фильтрации : ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - параметров уже достаточно");
        
        System.out.println("Введите цифру, соответствующую необходимому параметру: ");
        int criterion = scanner.nextInt();
            
            if (criterion == 5) {
                break;
            } 
            else if (criteriaMap.containsKey(criterion)) {
                System.out.println("Введите  предпочтительное значение для указанного критерия на английском с маленькой буквы: ");
                String criterionValue = scanner.next();

                String criterionKey = criteriaMap.get(criterion);
                filter.put(criterionKey, criterionValue);

            }

            else {
                System.out.println("Введен некорректный критерий, выберите из списка: ");

            }
        }
        scanner.close();

       PrintFilt(laptops, filter);
       System.out.println("Если ничего не нашлось вы можете обратиться к администратору офлайнмагазина и оставить заявку на интересующую модель");
        
       }
    
       public static void PrintFilt(Set<laptop>laptops,Map<String, String> filter){
        HashSet<String> lap = new HashSet<>();
        for (laptop laptop : laptops) {
            
            lap.add(laptop.getColor());
            lap.add(laptop.getModel());
            lap.add(laptop.getOS());
            lap.add(laptop.getHDD());
            lap.add(laptop.getRAM());
            
            if (lap.containsAll(filter.values())){
                System.out.println(laptop);
            }
            
            lap.clear();
        
            }

       }
    }
