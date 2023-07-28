package src.com.game;

public class Game {
    private String name;
    private int noOfPlayers;

    private String popularIn;

    //Empty Constructor
    public Game(){

    }

    //Constructor with only 2 out of 3 variables.
    public Game(String name,int noOfPlayers){
        this.name = name;
        this.noOfPlayers = noOfPlayers;

    }

    //Constructor with all 3 variables
    public Game(String name,int noOfPlayers,String popularIn){
        this.name = name;
        this.noOfPlayers = noOfPlayers;
        this.popularIn = popularIn;
    }

    //Getter for Name
    public String getName() {
        return name;
    }

    //Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for Number of Players
    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    //Setter for Number of Players
    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }
    //Getter for Popular In
    public String getPopularIn() {
        return popularIn;
    }
    //Setter for Popular In

    public void setPopularIn(String popularIn) {
        this.popularIn = popularIn;
    }

    //Method returning boolean of whether the Number of Players in 2 different games same or different
    private static boolean isNoOfPlayersSame(Game g1,Game g2){
        return g1.getNoOfPlayers() == g2.getNoOfPlayers();
    }

    //Method returning a message string

    private String message(){
        return "Would you join our "+this.name+" team?";
    }
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.name = "Tennis";
        g1.noOfPlayers = 4;
        g1.popularIn = "Everywhere in the world";

        System.out.println(g1.name+" is a  game usually played with "+g1.noOfPlayers+" players.It is popular "+g1.popularIn+".");

        Game g2 = new Game("Kabaddi",7,"India");

        System.out.println(g2.name+" is a game usually played with "+g2.noOfPlayers+" players. It is popular mostly in "+g2.popularIn+".");

        System.out.println("If you say number of players in "+g1.name+" and "+g2.name+" is same. That is a "+isNoOfPlayersSame(g1,g2)+" statement.");

        System.out.println(g1.message()+" OR, "+g2.message());



    }

}
