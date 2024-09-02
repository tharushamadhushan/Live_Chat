package lk.ijse.liveChat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server  {
    private List<ClientHandler> clients;

    public Server(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            clients = new ArrayList<>();
            System.out.println("Server started on port ");
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("New client connected: " + socket);
                    ClientHandler clientHandler = new ClientHandler(socket,this);
                    clients.add(clientHandler);
                    clientHandler.start();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcastMessage(ClientHandler clientHandler, String message) {
        for (ClientHandler client : clients) {
            if (client != clientHandler) {
                client.sendMessage(message);
            }
        }
    }

    public void removeClient(ClientHandler client) {
        clients.remove(client);
    }

    public static void main(String[] args) {
        Server server = new Server(3000);
    }
}
