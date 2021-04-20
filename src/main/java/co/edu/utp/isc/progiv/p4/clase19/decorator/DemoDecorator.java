/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.clase19.decorator;

import co.edu.utp.isc.progiv.p4.clase19.decorator.decorators.CompressionDecorator;
import co.edu.utp.isc.progiv.p4.clase19.decorator.decorators.DataSource;
import co.edu.utp.isc.progiv.p4.clase19.decorator.decorators.DataSourceDecorator;
import co.edu.utp.isc.progiv.p4.clase19.decorator.decorators.EncryptionDecorator;
import co.edu.utp.isc.progiv.p4.clase19.decorator.decorators.FileDataSource;

/**
 *
 * @author cdiaz
 */
public class DemoDecorator {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        var encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);

        var plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
