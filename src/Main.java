import java.util.*;
import java.awt.Desktop;
import java.net.URI;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int sw = 0;
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||  //////      ///////      ///////       ///////    ///////   //      //////");
        System.out.println("|||  //          //   //      //   //       //         //   //   //      //");
        System.out.println("|||  //          //   //      //   //       ///////    //   //   //      /////");
        System.out.println("|||  //          //   //      //   //            //    //   //   //      //");
        System.out.println("|||  //          //   //      //   //            //    //   //   //      //");
        System.out.println("|||  /////       ///////      //   //       ///////    ///////   /////   /////");
        System.out.println("|||                                                              Gleb30ru v1.1");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| ");
        System.out.println("Что вы хотите сделать?");
        System.out.println("[1]Играть (доступна только премиум-пользователям)");
        System.out.println("[2]Увидеть моды для Minecraft forge 1.16.5");
        System.out.println("[3]Википедия");
        System.out.println("[4]Github разработчика");
        System.out.println("[5]Выйти");
        System.out.println("Выбор:");
        sw = scn.nextInt();

        switch (sw) {
            case 1:
                play();
                break;
            case 2:
                mods();
                break;
            case 3:
                coming_soon();
                break;
            case 4:
                openUrl("https://github.com/Gleb30ru");
                main(new String[0]);
                break;
            case 5:
                System.exit(0);
            default:
                main(new String[0]);
                break;

        }

    }


    public static void play() {
        System.out.println("Это команда доступна только премиум-пользователям. Введите пароль для активации команды:");
        String password = scn.next();

        if (password.equals("2008")) {
            System.out.println("Извини но игра не готова( есть сложности в создании игры");
            System.out.println("Напиши 1 чтобы вернуться назад");
            int one = scn.nextInt();
            if (one == 1) {
                main(new String[0]);
            } else {
                main(new String[0]);
            }
        } else {
            System.out.println("Неверно! Введите ещё раз.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Как мне стать премиум-пользователям? Где получить пароль??");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Всё есть в 3-ой вкладке консоли");
            System.out.println("Введите 1 чтобы вести пароль ещё раз|Введите цифру 2 чтобы вернуться в главное меню");
            int exit = scn.nextInt();
            switch (exit) {
                case 1:

                    play();
                    break;
                case 2:
                    main(new String[0]);
                    break;
                default:
                main(new String[0]);
                    break;

            }

        }
    }
        public static void mods() {

                System.out.println("Моды разработчика Gleb30ru");
                System.out.println("------------------------------------------");
                System.out.println("[1]Wooden_floor|Деревянный пол");
                System.out.println("-----------------------------------------");
                System.out.println("Хотите скачать мод?");
                System.out.println("Залетайте в 4-ую вкладку консоли");
                System.out.println("---------------------------------------");
                System.out.println("Напиши 1 чтобы вернуться назад");
                int one = scn.nextInt();
                if (one == 1) {
                    main(new String[0]);
                } else {
                    main(new String[0]);

                }
            }
        public static void coming_soon() {
            int one = 0;
            System.out.println("Привет,здесь есть маленькая википедия о консоли! Что хочешь выбрать?");
            System.out.println("-------------------------------------");
            System.out.println("[1]Что это за консоль?... ");
            System.out.println("[2]Что там в игре????");
            System.out.println("[3]Как мне стать премиум-пользователем???");
            System.out.println("-------------------------------------");
            System.out.println("Напиши 4 чтобы вернуться назад");
            one = scn.nextInt();
            switch (one) {
                case 1:
                    console();
                    break;
                case 2:
                    whatplay();
                    break;
                case 3:
                    user();
                    break;
                case 4:
                    main(new String[0]);
                    break;
                default:
                    System.out.println("Ты выбор видешь?...");
                    main(new String[0]);
                    break;
            }
        }

        public static void console() {
        System.out.println("Рад что ты спросил!)"
        + "В этой консоли просто скучно!"
        + "Но это не-так!");
        System.out.println("Всего лишь... Интересная игра!!!"
        + "В которой ты уделишь всё своё внимание!"
        + "Вот так)");
        System.out.println("Введи 4 чтобы вернуться назад");
            int one = scn.nextInt();
            if (one == 4) {

                coming_soon();
            }else {
                coming_soon();
            }
        }
        public static void whatplay() {
        System.out.println("В игре не всё доделано");
        System.out.println("Ну а если жанр то"
        + " ты игрок который должен выбирать события которые повлияют на твоё приключение)");
            System.out.println("Напиши 4 чтобы вернуться назад");
            int one = scn.nextInt();
            if (one == 4) {
              coming_soon();
            } else {
                main(new String[0]);
            }
        }
        public static void user() {
        System.out.println("Тебе всего лишь надо пойти на github ");
        System.out.println("Там найдёшь бота который выдаст пароль(он пока не работает!!!!!)");
            System.out.println("Напиши 4 чтобы вернуться назад");
            int one = scn.nextInt();
            if (one == 4){
               coming_soon();
            }else {
                main(new String[0]);
            }
        }

        public static void openUrl(String url) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    if (desktop.isSupported(Desktop.Action.BROWSE)) {
                        desktop.browse(new URI(url));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
    }
}