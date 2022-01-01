package ru.netology.domain.description;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canPublishFreeCopy;
    private String placeholder; // Ссылка на пост-заглушку
    private String editMode; //Возможные значения:
    // all — всю информацию о VK Donut.
    // Duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
}
