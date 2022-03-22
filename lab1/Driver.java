package labs.lab1;

public class Driver {


    public static void main(String[] args) {
        Model model1 = new Model("Susan", "Smith", 70, 120.0, false, true);
        System.out.println(model1.getFirstName());
        System.out.println(model1.getLastName());
        System.out.println(model1.getHeightInches());
        System.out.println(model1.getWeight());
        System.out.println(model1.getTraveler());
        System.out.println(model1.getSmoker());


        Model model2 = new Model("Tiger", "Woods", 72, 190.0, true, false);
        System.out.println(model2.getFirstName());
        System.out.println(model2.getLastName());
        System.out.println(model2.getHeightInches());
        System.out.println(model2.getWeight());
        System.out.println(model2.getTraveler());
        System.out.println(model2.getSmoker());

    }

}


