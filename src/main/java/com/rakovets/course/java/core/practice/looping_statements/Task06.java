package com.rakovets.course.java.core.practice.looping_statements;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Разработать программу для фитнес браслета.
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startDistance = 1000;
        int finishDistance = 40000;
        double dailyProgress = 5.0;

        double totalDistance = calculateTotalDistance(startDistance, finishDistance, dailyProgress);
        System.out.printf("Result: %f", totalDistance);
    }

    /**
     * Рассчитывает пробег (т.е дистанцию, которую пробежал спортсмен за все тренировки), который совершит спортсмен
     * при подготовке к марафону.
     *
     * @param startDistance             дистанция которую пробегает спортсмен до начала тренировки
     * @param finishDistance            дистанция которую желает пробежать спортсмен после окончания тренировок
     * @param dailyProgressAsPercentage ежедневный прогресс в процентах по отношению к предыдущему забегу
     * @return пробег, с точностью до 2 знаков после десятичного разделителя:
     * <code>NumberUtil.roundValueToTwoDigitsForMantissa(value)</code>
     */
    static double calculateTotalDistance(int startDistance, int finishDistance, double dailyProgressAsPercentage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        if (startDistance > finishDistance || startDistance == 0) {
            return 0.0;
        }
        double everyDayDistancePercent = dailyProgressAsPercentage / 100.0;
        double currentDistance = startDistance;
        double totalDistance = currentDistance;
        while (currentDistance < finishDistance) {
            currentDistance = currentDistance * (1.0 + everyDayDistancePercent);
            totalDistance += currentDistance;
        }
        return NumberUtil.roundValueToTwoDigitsForMantissa(totalDistance - startDistance);
    }
}
