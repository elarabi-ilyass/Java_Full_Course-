package ProblemSolving;

public class Client {
    private String firstName;
    private String lastName;
    private double soldBank;
    private String code;
    private int id;
    private static int idCounter = 0; // For automatic ID generation

    // Constructors
    public Client(String firstName, String lastName, double soldBank, String code) {
        this.id = ++idCounter; // Auto-increment ID
        this.firstName = firstName;
        this.lastName = lastName;
        this.soldBank = soldBank;
        this.code = code;
    }

    public Client(String firstName, String lastName, String code) {
        this(firstName, lastName, 0.0, code); // Default soldBank to 0
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public double getSoldBank() { return soldBank; }
    public String getCodeBank() { return code; }
    public int getId() { return id; }

    // Setters
    public void setSoldBank(double soldBank) {
        this.soldBank = soldBank;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCode(String code) {
        this.code = code;
    }








}