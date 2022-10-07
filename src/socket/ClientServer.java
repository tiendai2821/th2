/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Answer;
import model.Student;

/**
 *
 * @author DungSobin
 */
public class ClientServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2003);
        System.out.println("Server Running....");
        while (true) {
            Socket conn = server.accept();
            System.out.println(conn);
            ObjectInputStream ois = new ObjectInputStream(conn.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(conn.getOutputStream());
            DataInputStream dis = new DataInputStream(conn.getInputStream());
            try {
                Student sv = (Student) ois.readObject();
                String msv = dis.readUTF();
                String hoTen = dis.readUTF();
                int nhom = dis.readInt();
                System.out.println(sv);
                System.out.println(msv);
                System.out.println(hoTen);
                System.out.println(nhom);
                oos.writeObject(new Answer(sv));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClientServer.class.getName()).log(Level.SEVERE, null, ex);
            }

            oos.close();
            dis.close();
            ois.close();
        }
    }
}
