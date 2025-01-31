package classes;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadXmlFile {
    public static void main(String[] args) throws Exception {
        try {
            File file = new File("C:\\Users\\ADMIN\\IdeaProjects\\prac\\practice\\src\\classes\\abc.Xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("TRANSACTION");

            List<String> list = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nNode = nodeList.item(i);
                System.out.println("\nNode Name :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("TRANSACTION id : "
                            + eElement.getAttribute("id"));
                    Employee employee = new Employee();
                    employee.setEpmId(Integer.parseInt(eElement.getElementsByTagName("EMPLOYEE_ID")
                            .item(0).getTextContent()));
                    employee.setEmail(eElement.getElementsByTagName("EMAIL")
                            .item(0).getTextContent());
                    employee.setPhoneNumber(Long.parseLong(eElement.getElementsByTagName("PHONE_NUMBER")
                            .item(0).getTextContent()));
                    employee.setSalary(Double.parseDouble(eElement.getElementsByTagName("SALARY")
                    .item(0).getTextContent()));
                    list.add(employee.toString());
                    System.out.println(list);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
            throw new RuntimeException(e);
        }

    }
}
