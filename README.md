<p align="center">
  <img src="https://img.shields.io/badge/React_Native-61DAFB?style=flat-square&logo=react&logoColor=black" alt="React Native"/>
  <img src="https://img.shields.io/badge/TypeScript-3178C6?style=flat-square&logo=typescript&logoColor=white" alt="TypeScript"/>
  <img src="https://img.shields.io/badge/ASP.NET_Core-512BD4?style=flat-square&logo=dotnet&logoColor=white" alt="ASP.NET Core"/>
  <img src="https://img.shields.io/badge/C%23-239120?style=flat-square&logo=csharp&logoColor=white" alt="C#"/>
  <img src="https://img.shields.io/badge/PostgreSQL-316192?logo=postgresql&logoColor=white" alt="postgresql"/>
  <img src="https://img.shields.io/badge/Redis-DC382D?style=flat-square&logo=redis&logoColor=white" alt="Redis"/>
  <img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white" alt="Docker"/>
  <img src="https://img.shields.io/badge/Figma-F24E1E?style=flat-square&logo=figma&logoColor=white" alt="Figma"/>
</p>

# Sunflower Grocery App

Приложение для заказа продуктов питания и поиска рецептов
. Приложение предоставляет пользователям удобный интерфейс для просмотра каталога товаров, управления корзиной и поиска кулинарных рецептов.


## Скриншоты и Интерфейс

<p align="center">
  <!-- Экран Входа -->
  <img width="250" alt="Авторизация" src="https://github.com/user-attachments/assets/7b63b58f-d777-4fcb-8ab3-0e7c17c0dc2a" />
  
  <!-- Экран Каталога и Главный экран -->
  <img width="250" alt="Каталог" src="https://github.com/user-attachments/assets/70d86c8b-9974-4205-ba32-db50a9276fcb" />

  <!-- Экран Рецептов -->
  <img width="250" alt="Рецепты" src="https://github.com/user-attachments/assets/5c8721ec-92a2-4e75-9846-951f9f7ea3b3" />
</p>

<p align="center">
  <!-- Карточка Товара -->
  <img width="250" alt="Карточка товара" src="https://github.com/user-attachments/assets/d1bb0a55-09eb-452e-bae7-11818321ed2c" />

  <!-- Детали Рецепта и Корзина -->
  <img width="250" alt="Карточка рецепта" src="https://github.com/user-attachments/assets/1512c213-434a-4968-a859-326fa1b1fde7" />
  <img width="250" alt="Корзина" src="https://github.com/user-attachments/assets/94d7e9b8-e454-4ee2-a3ba-dc880416ec61" />
</p>

## Основной функционал

### Каталог и Поиск Товаров
*   **Поиск по товарам:** Удобная строка поиска.
*   **Категории:** Быстрый доступ к разделам (Фрукты, Овощи и др.).
*   **Акции и Предложения:** Рекламные баннеры (например, "Скидка 20% на все фрукты").
*   **Сетка товаров:** Отображение популярных товаров с ценой, весом и кнопкой добавления в корзину.

### Рецепты и Кулинария
*   **Поиск по рецептам:** Отдельная строка поиска для кулинарных рецептов.
*   **Список рецептов:** Карточки с названием, кратким описанием, КБЖУ, ценой за порцию и быстрым добавлением ингредиентов в корзину.
*   **Добавление в Избранное:** Возможность сохранять понравившиеся рецепты.
*   **Детали рецепта:** Подробное описание, КБЖУ на порцию, список ингредиентов с ценами и галочками выбора.

### Управление Корзиной и Заказом
*   **Простая корзина:** Отображение товаров в корзине с возможностью изменять количество.
*   **Кнопка "В корзину":** Кнопка на экране деталей товара для быстрого добавления.
*   **Расчёт КБЖУ:** Автоматический расчёт калорий, белков, жиров и углеводов для товаров.

## Технологический стек

Проект находится на этапе проектирования и активной разработки. В архитектуру приложения заложен следующий стек технологий:

*   **Mobile Frontend:** React Native (TypeScript) — кроссплатформенная мобильная разработка.
*   **Backend API:** C# / .NET 8 (ASP.NET Core Web API) — обработка бизнес-логики, REST API и сервисов.
*   **Database:** PostgreSQL<img width="412" height="1000" alt="Корзина" src="https://github.com/user-attachments/assets/13a83f85-e282-49f6-a467-39758f2d912e" />
<img width="412" height="1000" alt="Корзина" src="https://github.com/user-attachments/assets/78556916-38be-4ef0-bffa-a2a24eeeb6ba" />
 / Entity Framework Core — хранение пользователей, каталога товаров, рецептов и заказов.
*   **Caching & Sessions:** Redis — кэширование частых запросов к каталогу, хранение сессий и временных данных.
*   **DevOps & Infrastructure:** Docker & Docker Compose — контейнеризация бэкенд-сервисов, базы данных и Redis для быстрого разворачивания и CI/CD.
*   **UI/UX Prototyping:** Figma — проектирование макетов, интерактивных прототипов и пользовательских сценариев.
