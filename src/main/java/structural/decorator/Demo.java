package structural.decorator;

import java.io.File;

import structural.decorator.decorators.CompressionDecorator;
import structural.decorator.decorators.DataSource;
import structural.decorator.decorators.DataSourceDecorator;
import structural.decorator.decorators.EncryptionDecorator;
import structural.decorator.decorators.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        try {
            String salaryRecords = "Name,Salary\nJohn,100000\nSteven,912000";
            String fileName = "OutputDemo.txt";
            File file = new File(fileName);
            file.createNewFile();
            DataSourceDecorator encoded = new CompressionDecorator(
                                            new EncryptionDecorator(
                                                new FileDataSource(fileName)));
            encoded.writeData(salaryRecords);
            DataSource plain = new FileDataSource(fileName);

            System.out.println("- Input ----------------");
            System.out.println(salaryRecords);
            System.out.println("- Encoded --------------");
            System.out.println(plain.readData());
            System.out.println("- Decoded --------------");
            System.out.println(encoded.readData());
            file.delete();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}