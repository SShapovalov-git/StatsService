package ru.netology.stats;

// создание пакета ru.netology.stats
public class StatsService {
    //создание класса StatsService
    public int calculateSum(int[] sales) {
// создание метода "Сумму всех продаж" в котором массив  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18] продаж с типом данных int
        int sum = 0;
// начинаем суммировать с нуля
        for (int sale : sales) {
// цикл foreache тип int одной продажи из массива [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
            sum += sale;
// sum=sum+sale
        }
        return sum;
//возвращение суммы из количества элементов из массива
    }

    public int calculateAverageAmount(int[] sales) {
// создание метода "Среднюю сумму продаж в месяц" в котором массив  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18] продаж с типом данных int
        int averageAmount = calculateSum(sales) / 12;
//обьявляем новую переменную и приравниваем с методом calculateSum деленное на кол-во месяцев
        return averageAmount;
//возвращение суммы из количества элементов из массива 

    }

    public int calculateMaxMonth(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales)
            if (currentMax < sale) {
                currentMax = sale;
            }
        return currentMax;
    }

    public int calculateMinMonth(int[] sales) {
        int currentMin = sales[0];
        for (int sale : sales)
            if (currentMin > sale) {
                currentMin = sale;
            }
        return currentMin;


    }

    public int calculateBelowAverage(int[] sales) {
// создание метода "Кол-во месяцев, в которых продажи были ниже среднего " в котором массив  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18] продаж с типом данных int
        int monthAverage = calculateAverageAmount(sales);
// создаем переменную средний месяц и приравниваем ее к расчету где он рассчитывался т.е п 2
        for (int sale : sales) {
//цикл foreache тип int одной продажи из массива [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
            if (sale <= monthAverage) {
//если одна продажа меньше или равно средней продаже

                ///не понимаю как дальше

            }


        }
    }
}
