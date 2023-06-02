package console;

import console.command.FirstCommandChoice;
import entity.Concepteur;
import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConsole {

    private Scanner scanner = new Scanner(System.in);
    public static boolean isUp = true;

    private List<Employee> employeeList = new ArrayList<>();

    private FirstCommandChoice firstCommandChoice = new FirstCommandChoice();

    public void runConsole(){
        employeeList.add(new Concepteur(1,"AKRAM","Youssoufi","1999/10/10",10));
        while(this.isUp){
            firstCommandChoice.choiceCommand(scanner,employeeList);
        }
    }
}
