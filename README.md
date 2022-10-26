# Test
WhiteSoft test solution

## Задание<br/>
В одной крупной компании произошел сбой! Злоумышленники нашли уязвимость и испортили сообщения пользователей! К счастью, аналитики смогли обнаружить, какие изменения были произведены. Но неизвестно для каких сообщений! Ваша задача написать консольное приложение, которое восстановит исходные сообщения. Аналитики также смогли выяснить, что измененная однажды часть сообщения больше не модицифировалась!<br/>

## Входные данные<br/>
- replacment.json. Путь к файлу с изменениями нужно указать в классе **RepJsonParser** в переменную _**REPLACEMENT_FILE_PATH**_<br/>
- data.json. Файл c изменненым текстом получается получен с указанного [API](https://raw.githubusercontent.com/thewhitesoft/student-2022-assignment/main/data.json) с использованием HTTP GET запроса<br/>

## Выходные данные<br/>
-result.json. Содержит исправленные сообщения и содержать массив строк. Создается в одной директории с проектом.
