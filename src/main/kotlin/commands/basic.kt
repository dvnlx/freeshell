package commands

import t

fun about(version: String){
    var devs = arrayOf("dvnlx", "mkukiro", "Arna13", "Havoc")

    t.println("'########:'########::'########:'########::'######::'##::::'##:'########:'##:::::::'##:::::::\n" +
            " ##.....:: ##.... ##: ##.....:: ##.....::'##... ##: ##:::: ##: ##.....:: ##::::::: ##:::::::\n" +
            " ##::::::: ##:::: ##: ##::::::: ##::::::: ##:::..:: ##:::: ##: ##::::::: ##::::::: ##:::::::\n" +
            " ######::: ########:: ######::: ######:::. ######:: #########: ######::: ##::::::: ##:::::::\n" +
            " ##...:::: ##.. ##::: ##...:::: ##...:::::..... ##: ##.... ##: ##...:::: ##::::::: ##:::::::\n" +
            " ##::::::: ##::. ##:: ##::::::: ##:::::::'##::: ##: ##:::: ##: ##::::::: ##::::::: ##:::::::\n" +
            " ##::::::: ##:::. ##: ########: ########:. ######:: ##:::: ##: ########: ########: ########:\n" +
            "..::::::::..:::::..::........::........:::......:::..:::::..::........::........::........::")
    t.println("freeshell $version");
    t.println("by ${devs.joinToString(", ")}");
}

fun help(version: String) {
    t.println("Freeshell $version");
    t.println("Commands:");
    t.println("exit: Exits the shell");
    t.println("fs about: About freeshell");
}