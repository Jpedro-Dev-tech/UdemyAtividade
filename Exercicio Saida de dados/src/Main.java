public static void main(String[] args) {
    String product1 = "Computer";
    String product2 = "Office desk";
    Locale.setDefault(Locale.US);
    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.234567;

    System.out.println("Products:");
    System.out.println(product1 + ", whitch price is $ " + price1);
    System.out.println(product2 + ", whitch price is $ " + price2);
    System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

    System.out.println("Measue with eight decimal places: " + measure);
    System.out.println("Rouded (three decimal places): " + measure);
    System.out.println("US decimal point: " + measure);
}