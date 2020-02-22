## Фабричный метод

Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.

#### Применимость

* Когда заранее неизвестны типы и зависимости объектов, с которыми должен работать ваш код.
* Когда вы хотите дать возможность пользователям расширять части вашего фреймворка или библиотеки.
* Когда вы хотите экономить системные ресурсы, повторно используя уже созданные объекты, вместо порождения новых.

#### Pros and Cons

* You avoid tight coupling between the creator and the concrete products.
* Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
* Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

* The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

