## Приложение "Get Bonus For Refill"

### Краткое описание

На основе технического задания было создано приложение "Get Bonus For Refill". 
Приложение начисляет определенное количество бонусов за пополнение счета. Начисление идет по формуле 1 бонус за 100 рублей при пополнении счета от 1000 рублей.
Переменные используемы в приложении:
- ClientBillStart - начальный остаток на счете в рублях;
- ClientBill - конечный остаток на счете в рублях;
- Refill - сумма пополнения;
- TotalBonus - количество начисленных бонусов;
- TotalBonus1 - округленная сумма бонусов до нижнего целого значения.

### Описание использованных тестов

При тестировании приложения использовалось функциональное тестирование методом эквивалетных значений.

Для проверки были взяты следующие данные для Refill: 0, 999, 1000, 1001, -1000/

### Результаты проверки.

При Refill=0 полученный результат TotalBonus1=0 ClientBill=100.
При Refill=999 полученный результат TotalBonus1=0 ClientBill=1099.
При Refill=1000 полученный результат TotalBonus1=10 ClientBill=1000.
При Refill=1001 полученный результат TotalBonus1=10 ClientBill=1001.
При Refill=-1000 полученный результат TotalBonus1=0 ClientBill=-900.

Приложение проверку прошло

https://github.com/BerezovTimur/HW3-Task2/issues/1

### Общие рекомендации

- реализовать проверку на отрицательное число в Refill и вывод об этой ошибке.