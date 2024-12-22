# Solution for task:

Proszę stworzyć klasę Account która będzie miała pola: owner, balance (typu int) oraz
accountNumber.
Klasa ta implementuje również konstruktor składający się ze wszystkich parametrów,
gettery i settery oraz metodę symulująca wykonanie przelewu z możliwością
wyrzucenia wyjątku jeśli przelew będzie większy niż wartość środków na koncie
(zdefiniowana podczas tworzenia obiektu).
Wyjątek to typ który stworzą Państwo sami np. o nazwie NotEnoughMoneyException.
W klasie z metodą main() stworzą Państwo obiekt klasy Account oraz zasymulujecie
wyrzucenie wyjątku przez wykonanie metody symulującej przelew z wartością większą
niż wartość dostępnych środków. Dodatkowo proszę o dodanie catcha który wyłapie
wszystkie inne wyjątki oraz klauzuli finally która zwróci nam aktualny stan konta.