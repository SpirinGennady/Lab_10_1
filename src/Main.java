import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("c://Test/Work.txt");
        String text ="����� ���������� ��� ����������� ���� ���������!";
        writer.write(text);
        writer.close();
    }
}
