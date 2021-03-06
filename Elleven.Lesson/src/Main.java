import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Main {

	public static void main(String[] args) {
		
		List<Element> list = new ArrayList<>();
		
		Document dom;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			dom = db.parse("test.xml");
		} catch (Exception e){
			System.out.println("fhjg");
			return;
		}
		
		org.w3c.dom.Element root = dom.getDocumentElement();
		System.out.println("ROOT = "  + root.getTagName());
		
		NodeList nameNodeList = root.getElementsByTagName("name");
		Node nameNode = nameNodeList.item(0);
		System.out.println("NAME TAG = " + nameNode.getNodeName());
		System.out.println("nameID  = " + nameNode.getAttributes().getNamedItem("id"));
		
		String fileName = nameNode.getFirstChild().getNodeValue();
		System.out.println("NAME = " + fileName);
		
		NodeList peopleList = root.getElementsByTagName("people");
		Node peopleNode = peopleList.item(0);
		System.out.println("PEOPLE TAG = " + peopleNode.getNodeName());
		
		NodeList elementsNodeList = peopleNode.getChildNodes();
		for (int i=0; i<elementsNodeList.getLength(); i++) {
			Node item = elementsNodeList.item(i); 
			if (item.getNodeType() != Node.ELEMENT_NODE) {
				continue;
			}
			
			Element myElement = new Element();
			org.w3c.dom.Element nameE1 = (org.w3c.dom.Element)item;
			
			//name
			NodeList nameList = nameE1.getElementsByTagName("name");
			org.w3c.dom.Element nameElement = (org.w3c.dom.Element) nameList.item(0);
			String nameString = nameElement.getFirstChild().getNodeValue();
			// System.out.println("name = " + nameString);
			myElement.setName(nameString);
			
			//surname
			String surname = nameE1
					.getElementsByTagName("surname")
					.item(0)
					.getTextContent();
			// System.out.println("surname = " + surname);
			myElement.setSurname(surname);
			
			//age
			String age = nameE1
					.getElementsByTagName("age")
					.item(0)
					.getTextContent();
			// System.out.println("age = " + age);
			myElement.setAge(Integer.valueOf(age));
			
			//degree
			String degree = nameE1
					.getElementsByTagName("isDegree")
					.item(0)
					.getTextContent();
			// System.out.println("degree = " + degree);
			myElement.setDegree (Boolean.valueOf(degree));
			
			//id
			String id = nameE1
					.getElementsByTagName("id")
					.item(0)
					.getTextContent();
			// System.out.println("id = " + id);
			myElement.setId(Integer.valueOf(id)); 
			
			// GetAtribute
			
			
			
			list.add(myElement);
			// System.out.println("=====================================");
			
		}
		System.out.println(list.toString());
	


		
	}

}
