## Адаптер

Адаптер — это структурный паттерн проектирования, который позволяет объектам с несовместимыми интерфейсами работать вместе.

#### Применимость

* Когда вы хотите использовать сторонний класс, но его интерфейс не соответствует остальному коду приложения.
* Когда вам нужно использовать несколько существующих подклассов, но в них не хватает какой-то общей функциональности, причём расширить суперкласс вы не можете.

#### Pros and Cons

* Отделяет и скрывает от клиента подробности преобразования различных интерфейсов.

минусы:

* Усложняет код программы из-за введения дополнительных классов.