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
//возвращение суммы из количества элементов из массива деленное на кол-во месяцев

    }

    public int calculateMaxMonth(int[] sales) {
        int monthmax=0;
        int currentMax = sales[0];
        for (int i=0;i<sales.length;i++) {
            if (currentMax <= sales[i]) {
                currentMax = sales[i];
                monthmax = i+1;
            }
            }
        return monthmax;
    }

    public int calculateMinMonth(int[] sales) {
        int monthmin=0;
        int currentMin = sales[0];
        for (int i=0;i<sales.length;i++) {
            if (currentMin >= sales[i]) {
                currentMin = sales[i];
                monthmin = i+1;
            }
        }
        return monthmin;


    }

    public int calculateBelowAverage(int[] sales) {
// создание метода "Кол-во месяцев, в которых продажи были ниже среднего " в котором массив  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18] продаж с типом данных int
        int monthAverage = calculateAverageAmount(sales);
// создаем переменную средний месяц и приравниваем ее к расчету где он рассчитывался т.е п 2
        int count = 0;
        for (int sale : sales) {
//цикл foreache тип int одной продажи из массива [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
            if (sale < monthAverage){
//если одна продажа меньше средней продаже
                count++;
//тогда прибавляем к счетчику единицу
        }
    }
        return count;
    }

    public int calculateAboveAverage (int[] sales) {
// создание метода "Кол-во месяцев, в которых продажи были ниже среднего " в котором массив  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18] продаж с типом данных int
        int monthAverage = calculateAverageAmount(sales);
// создаем переменную средний месяц и приравниваем ее к расчету где он рассчитывался т.е п 2
        int count = 0;
// обьявляем счетчик
        for (int sale : sales) {
//цикл foreache тип int одной продажи из массива [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
            if (sale > monthAverage){
//если одна продажа больше средней продаже
                count++;
// тогда прибавляем к счетчику единицу
            }
        }
        return count;
}}


