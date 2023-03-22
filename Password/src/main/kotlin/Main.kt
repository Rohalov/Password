fun main() {
    while (true) {
        print("Введіть пароль: ")
        //приймаємо ввід від користувача
        val userInput = readlnOrNull()
        //перевіряємо довжину рядка
        if (userInput == null || userInput.length <= 8) {
            println("пароль має бути довшим за 8 символів")
        //перевірка на наявність цифри
        } else if (!haveDigit(userInput)) {
            println("пароль має містити хоча б одну цифру")
        //перевірка на наявність букви
        } else if (!haveLetter(userInput)) {
            println("пароль має містити хоча б одну букву")
        } else {
            //успішний ввід
            println("Пароль успішно встановлено. Ваш пароль $userInput")
            break
        }
    }
}

/**
 * Ця функція приймає строку та перевіряє її на наявність цифри
 * @return true якщо в рядку є цифра або false якщо її немає
 */
fun haveDigit(line: String): Boolean {
    for (char in line) {
        if (char.isDigit()) {
            return true
        }
    }
    return false;
}

/**
 * Ця функція приймає строку та перевіряє її на наявність літер
 * @return true якщо в рядку є літера або false якщо її немає
 */
fun haveLetter(line: String): Boolean {
    for (char in line) {
        if (char.isLetter()) {
            return true
        }
    }
    return false
}
