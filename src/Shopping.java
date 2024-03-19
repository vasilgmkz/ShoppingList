import java.util.Scanner;
import java.util.ArrayList;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");
        ArrayList<String> shoppingList = new ArrayList<>();
        int productCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список!!!!");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");
            int actionNumber = scanner.nextInt();
            switch (actionNumber) {
                case 1:
                    String product = scanner.next();
                    boolean checkProduct = shoppingList.contains(product);
                    if (checkProduct) {
                        System.out.println("Товар есть в списке");
                    } else {
                        shoppingList.add(productCount, product);
                        ++productCount;
                        System.out.println("Товар " + shoppingList.get(productCount - 1) + " добавлен в список под номером " + productCount);
                    }
                    break;
                case 2:
                    if (productCount == 0) {
                        System.out.println("Список пуст");
                    } else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println(i + 1 + " - " + shoppingList.get(i));
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < shoppingList.size(); i++) {
                        shoppingList.remove(i);
                    }
                    productCount = 0;
                    System.out.println("Список пуст");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неизвестная команда!");
                    break;
            }
        }
    }
}