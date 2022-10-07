/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import model.Answer;
import model.IntOK;
import model.ObjectOK;
import model.StringOK;
import model.Student;

/**
 *
 * @author 503
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Socket client = new Socket("10.170.46.188", 11000);
        ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());
        Student sv = new Student("B19DCCN121", "Đỗ Đăng Dũng", "10.170.46.124", 6);
        String request = dis.readUTF();
//        String req[] = request.split(";");
//        for (String line : req) {
//            System.out.println(line);
//            dos.writeUTF(line);
//        }
        
        dos.writeUTF(sv.getMaSV());
        StringOK s1 = (StringOK) ois.readObject();
        oos.writeObject(sv);
        ObjectOK o1 = (ObjectOK) ois.readObject();
        dos.writeUTF("Đỗ Đăng Dũng");
        StringOK stringOK1 = (StringOK) ois.readObject();
        dos.writeInt(6);
        IntOK intOK = (IntOK) ois.readObject();
        Answer answer = (Answer) ois.readObject();
        oos.writeObject(o1);
        System.out.println(s1);
        oos.close();
        dos.close();
        ois.close();
        dis.close();
    }
}
