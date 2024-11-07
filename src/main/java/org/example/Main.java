package org.example;

import org.example.receiver.MessageReceiver;
import org.example.sender.MessageSender;

public class Main {

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        MessageReceiver receiver = new MessageReceiver();

        // Отправка сообщения
        sender.sendMessage("test-queue", "HEllo world hello");

        // Получение сообщения и запись количества слов в файл
        receiver.receiveMessage("test-queue");
    }
}
