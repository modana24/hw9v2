import java.util.Arrays;
public class NineHomeTask {
    public static void main(String[] args) {
        //task 1
        int salary[] = new int[5];
        salary[0] = 12_000;
        salary[1] = 18_450;
        salary[2] = 27_980;
        salary[3] = 34_890;
        salary[4] = 11_654;
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();

        //task 2
        int secondSalary[] = new int[]{10_000, 11_000, 12_000, 13_000, 14_000, 15_000};
        int max = secondSalary[0];
        int min = secondSalary[0];

        for (int i = 0; i < secondSalary.length; i++) {
            if (secondSalary[i] > max) {
                max = secondSalary[i];
            }
            if (secondSalary[i] < min) {
                min = secondSalary[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        //task 3
        int weekSpending[] = new int[]{485, 987, 3577, 2398, 62};
        int weekSum = 0;
        for (int i = 0; i < weekSpending.length; i++) {
            weekSum += weekSpending[i];
        }
        double arrage = (double) weekSum / weekSpending.length;
        System.out.println("Средняя сумма трат за месяц составила " + arrage + " рублей");
        System.out.println();

        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
