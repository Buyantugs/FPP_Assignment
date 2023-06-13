package assignment8.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Marketing> campaignList=new ArrayList<>();

        // Adding objects to the Marketing list
        campaignList.add(new Marketing("Bold","Laptop",123));
        campaignList.add(new Marketing("Dorj","PC",234));
        campaignList.add(new Marketing("Tugs","PD",1200));
        campaignList.add(new Marketing("Tsatsaa","Book",200));
        campaignList.add(new Marketing("Burmaa","Food",12));
        campaignList.add(new Marketing("Tuya","Car",10000));

        // Printing the size of the list
        System.out.println("Size of the list: " + campaignList.size());

        // Printing the contents of the list using the toString() method
        for (Marketing marketing : campaignList) {
            System.out.println(marketing.toString());
        }

        // Removing an object from the list
        campaignList.remove(new Marketing("Burmaa", "Food", 12));

        // Sorting the list in natural order based on salesAmount using Comparator interface
        campaignList.sort(Comparator.comparingDouble(Marketing::getSalesAmount));

        System.out.println("After sorting by salesAmount:");
        for (Marketing marketing : campaignList) {
            System.out.println(marketing.toString());
        }

        //Retrieve campaign list from array who made sales more tha $1000

        List<Marketing> shortList=listMoreThan1000(campaignList);
        // Sorting the list in natural order based on salesAmount using Comparator interface
        shortList.sort(Comparator.comparing(Marketing::getEmployeeName));

        // Print the shorted list ordered by employeeName
        System.out.println("Print the shorted list ordered by employeeName");
        for (Marketing marketing : shortList) {
            System.out.println(marketing.toString());
        }

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        // Implement a body
        List<Marketing> listMore1000=new ArrayList<>();

        for (Marketing obj: list) {
            if(obj.getSalesAmount()>1000)
                listMore1000.add(obj);
        }

        return listMore1000;
    }
}
