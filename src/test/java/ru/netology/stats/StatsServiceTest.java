package ru.netology.stats;
// создание пакета ru.netology.stats

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//создание теста 1

class StatsServiceTest {
    //создание класса StatsServiceTest
    @Test
    void shouldTestCalculateSum() {
//создание теста под названием testCalculateSum
        StatsService service = new StatsService();
        //класс StatsService с экземпляром service на основе его создаем метод new StatsService()
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //назначаю массив продаж
        int expected = 180;
        //ожидаемый результат
        int actual = service.calculateSum(sales);
        //вычисление с помощью класса который прописан в StatsService
        assertEquals(expected, actual);
        // проверка ожидаемого результата и фактического
    }

    @Test
    void shouldTestAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageAmount(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldTestMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTestMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTestBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateBelowAverage(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldTestAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAboveAverage(sales);

        assertEquals(expected, actual);
    }
}