# Задание 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

## Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.

`Идея: описать некоторое количество компонент, например:`

- модель человека

- компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.

- компонент для проведения исследований

- дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека

*`Под “проведением исследования” можно понимать получение всех детей выбранного человека.`*

# Реализация:

* В классе `Person` описана модель человека с полями имя и фамилия
* В классе enum `Relation` перечислен список родственных связей
* В классе `Link` описываются родственные связи двух людей в обе стороны
* В классе `Tree` эти связи хранятся
* В классе `Research` определяются методы исследования генеалогического дерева
* В классе `App` содержится тело программы и точка входа, перечислены несколько человек и прописаны их связи. Отсюда же запускается `UI`
* В классе `UI` осуществляется вызов функций исследования с приглашением к вводу имени человека

# Что улучшить:
- Все методы в классе `Research` очень похожи друг на друга. Отличается только вид связи, которую мы ищем между 2 людьми. И немного отлчиается сообщение выводимое на экран. Логика у этих методов одинаковая, много повторяющегося кода
- Можно дописать загрузку и сохранение в файл
- Получение\построение отдельных моделей человека
