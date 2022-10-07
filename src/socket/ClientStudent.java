package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import model.Answer;
import model.Student;

/**
 *
 * @author DungSobin
 */
public class ClientStudent {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Socket client = new Socket("10.170.46.188", 11300);
        ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
        Student sv = new Student("B19DCCN121", "Đỗ Đăng Dũng", "10.170.46.124", 6);
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        oos.writeObject(sv);
        dos.writeUTF(sv.getMaSV());
        dos.writeUTF(sv.getHovaten());
        dos.writeInt(sv.getGroup());
        Answer answer = (Answer) ois.readObject();
        System.out.println(answer.getStudent());
        oos.close();
        dos.close();
        ois.close();
    }
}
