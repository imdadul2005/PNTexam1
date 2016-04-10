package xml.parser;

import com.sun.org.apache.xerces.internal.impl.xs.XSModelImpl;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Imdadul on 4/10/2016.
 */
public class Result {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        List<Student> listStudent = new LinkedList<Student>();
        XmlReader xml = new XmlReader();
        String qtpStudent = System.getProperty("user.dir") + "\\src\\xml\\parser\\qtp.xml";
        String SeleniumStudent = System.getProperty("user.dir") + "\\src\\xml\\parser\\selenium.xml";

        listStudent = xml.parseData("id",qtpStudent);
        printList(listStudent);

    }

    public static void printList(List<Student> arrayTest) {
        for (Student student: arrayTest)
            System.out.println(student  + " ");
        System.out.println();
    }
}


