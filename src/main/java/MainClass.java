import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainClass {
    static int count = 0;
    static String name = null;
    static int id = 0;
    static int persent = 0;
    static int persons = 0;
    static String position = null;
    static int workTime = 0;
    static Cleaner clianer;
    static ArrayList<Cleaner> cleanersGroup = new ArrayList<Cleaner>();
    static Driver driver;
    static ArrayList<Driver> driverGroup = new ArrayList<Driver>();
    static Tester tester;
    static ArrayList<Tester> testerGroup = new ArrayList<Tester>();
    static Programmer programmer;
    static ArrayList<Programmer> programmerGroup = new ArrayList<Programmer>();
    static TeamLeader teamLeader;
    static ArrayList<TeamLeader> teamLeaderGroup = new ArrayList<TeamLeader>();
    static Manager manager;
    static ArrayList<Manager> managerGroup = new ArrayList<Manager>();
    static ProjectManager projectManager;
    static ArrayList<ProjectManager> projectManagerGroup = new ArrayList<ProjectManager>();
    static SeniorManager seniorManager;
    static ArrayList<SeniorManager> seniorManagerGroup = new ArrayList<SeniorManager>();

    public static void main(String[] args) {

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("test.xml");
            Node staff = document.getDocumentElement();
            NodeList deaneryList = staff.getChildNodes();
            for (int i = 0; i < deaneryList.getLength(); i++) {
                // System.out.println(deaneryList.getLength() + " " + deaneryList.item(i));
                Node projectPars = deaneryList.item(i);
                if (projectPars instanceof Element && projectPars.hasChildNodes()) {
                    System.out.println(
                            "Project " + projectPars.getAttributes().getNamedItem("name").getNodeValue().toString());
                    NodeList personParse = projectPars.getChildNodes();
                    for (int j = 0; j < personParse.getLength(); j++) {
                        Node elemPersons = personParse.item(j);
                        if (elemPersons instanceof Element && elemPersons.hasChildNodes()) {
                            NodeList propPersons = elemPersons.getChildNodes();
                            for (int k = 0; k < propPersons.getLength(); k++) {
                                Node prop = propPersons.item(k);

                                if (prop instanceof Element && prop.hasChildNodes()) {
                                    if (prop.getNodeName().equals("id")) {
                                        id = Integer.parseInt(prop.getFirstChild().getNodeValue());
                                        count++;
                                    } else if (prop.getNodeName().equals("name")) {
                                        name = prop.getFirstChild().getNodeValue();
                                        count++;
                                    } else if (prop.getNodeName().equals("worktime")) {
                                        workTime = Integer.parseInt(prop.getFirstChild().getNodeValue());
                                        count++;
                                    } else if (prop.getNodeName().equals("position")) {
                                        position = prop.getFirstChild().getNodeValue();
                                        count++;
                                    } else if (prop.getNodeName().equals("persent")) {
                                        persent = Integer.parseInt(prop.getFirstChild().getNodeValue());
                                        count++;
                                    }

                                    if (count == 4) {
                                        if (position.equals("clianer")) {
                                            clianer = new Cleaner(id, name, position);
                                            clianer.payForWorkByTime(workTime);
                                            cleanersGroup.add(clianer);
                                            count = 0;
                                        } else if (position.equals("driver")) {
                                            driver = new Driver(id, name, position);
                                            driver.payForWorkByTime(workTime);
                                            driverGroup.add(driver);
                                            count = 0;
                                        } else if (position.equals("tester")) {
                                            tester = new Tester(id, name, position);
                                            tester.payForWorkByTime(workTime);
                                            testerGroup.add(tester);
                                            count = 0;
                                        } else if (position.equals("programmer")) {
                                            programmer = new Programmer(id, name, position);
                                            programmer.payForWorkByTime(workTime);
                                            programmerGroup.add(programmer);
                                            count = 0;
                                        } else if (position.equals("teamLeader")) {
                                            teamLeader = new TeamLeader(id, name, position);
                                            teamLeader.payForWorkByPersons(programmerGroup.size());
                                            teamLeaderGroup.add(teamLeader);
                                            count = 0;
                                        } else if (position.equals("manager")) {
                                            manager = new Manager(id, name, position);
                                            manager.setPayForManager(persent);
                                            managerGroup.add(manager);
                                            count = 0;
                                        } else if (position.equals("projectManager")) {
                                            projectManager = new ProjectManager(id, name, position);
                                            projectManager.setPayForManager(persent);
                                            projectManagerGroup.add(projectManager);
                                            count = 0;
                                        } else if (position.equals("seniorManager")) {
                                            seniorManager = new SeniorManager(id, name, position);
                                            seniorManager.setPayForManager(persent);
                                            seniorManagerGroup.add(seniorManager);
                                            count = 0;
                                        } else
                                            System.out.println("Unnown position");
                                    }

                                }
                            }
                        }
                    }
                }

            }
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        for (int j = 0; j < cleanersGroup.size(); j++) {
            Cleaner pers = cleanersGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < driverGroup.size(); j++) {
            Driver pers = driverGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < testerGroup.size(); j++) {
            Tester pers = testerGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < programmerGroup.size(); j++) {
            Programmer pers = programmerGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < teamLeaderGroup.size(); j++) {
            TeamLeader pers = teamLeaderGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < managerGroup.size(); j++) {
            Manager pers = managerGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < projectManagerGroup.size(); j++) {
            ProjectManager pers = projectManagerGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }
        for (int j = 0; j < seniorManagerGroup.size(); j++) {
            SeniorManager pers = seniorManagerGroup.get(j);
            System.out.println(pers.getName() + " " + pers.getPosition() + " " + pers.getZp());
        }

    }

}
