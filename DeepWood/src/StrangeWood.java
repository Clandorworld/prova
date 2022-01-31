import java.util.Scanner;

public class StrangeWood {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    String playerName;
    int choice;

    int silverRing;

    public static void main(String[] args) {

        StrangeWood clandor;
        clandor = new StrangeWood();

        clandor.playerSetUp();
        clandor.roadWood();
    }

    public void playerSetUp() {

        System.out.println("Welcome! Please enter your name:");

        playerName = myScanner.nextLine();

        System.out.println("Hello " + playerName + ", let's start the adventure!");

    }

    public void roadWood() {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are walking down the road of the Strange Wood. You're looking for a cure for your sick father");
        System.out.println("Suddenly a tree on your right says: Hello!");
        System.out.println("What do you want to do?");
        System.out.println("1: Talk to the tree");
        System.out.println("2: Leave");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            if (silverRing == 1) {
                ending2();
            } else {
                System.out.println("Tree: Hello there, stranger. So your name is " + playerName
                        + "? What are you doing alone in this strange forest?");
                enterScanner.nextLine();
                toTree();
            }

        } else if (choice == 2) {
            System.out.println(
                    "Tree: Sorry if I scared you! If you go deep into the wood, beware of the dulkurs!");
            enterScanner.nextLine();
            blackWood();
        } else {
            roadWood();
        }
    }

    public void toTree() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("What do you answer to the tree?");
        System.out.println("1: I am going to look for the wellon flower, to cure my father.");
        System.out.println("2: I have to find a flower, but the forest is too much for me. I'll come back home!");
        System.out.println("3: I am not going to speak to a tree. My purposes belong to me!");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            treeAdvice();
        } else if (choice == 2) {
            byFather();
        } else if (choice == 3) {
            blackWood();
        } else {
            blackWood();
        }
    }

    public void treeAdvice() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Tree: There is a river ahead, deep in the wood. Walk along the banks to the east, you will find a bridge. Cross the bridge and you will find a monument. If you meet the dulkurs, clap your hands!");
        System.out.println("\n\n1:You head for the deep wood.");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            blackWood();
        } else {
            treeAdvice();
        }
    }

    public void byFather() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You come home. After a week your father dies.");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            roadWood();
        } else {
            roadWood();
        }
    }

    public void blackWood() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("With heavy breathing you head into the deep forest");
        System.out.println("The road seems to get lost when darkness seems to prevail");
        System.out.println("Strange creatures come out of the bushes. They have red eyes, deer horns, and bodies resembling a bipedal goat. What do you do?");
        System.out.println("1: Run away!");
        System.out.println("2: Try to say something...");
        System.out.println("3: Clap your hands!");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            runAway();
        } else if (choice == 2) {
            saySomething();
        } else if (choice == 3) {
            theDulkurs();
        } else {
            blackWood();
        }
    }

    public void runAway() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Run as fast as you can...");
        System.out.println("...After a few minutes, you feel like you are in the same place");
        System.out.println("\n1: Go on!");
        System.out.println("2: Run Away!");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            blackWood();
        } else if (choice == 2) {
            runAway();
        } else {
            ending2();
        }
    }

    public void saySomething() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("With a shaky voice you try to say something, but what comes out is just a scream!");
        System.out.println("...the creatures called dulkurs, approach with ferality!");
        System.out.println("\n1: Try to escape!");
        System.out.println("2: See what happens...");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            blackWood();
        } else if (choice == 2) {
            ending2();
        } else {
            ending2();
        }
    }

    public void ending2() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Creatures attack you, you get scratched multiple times. Then you disappear into the bushes with them.");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n------------------------------------------------------------------\n");

    }

    public void theDulkurs() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("The creatures seem to be smiling joyfully at you...");
        System.out.println("Dulkurs: Welcome to our forest" + playerName + "!");
        System.out.println("Dulkurs: We know you are looking for a flower for a cure. Reach the river and skirt the east bank. You will find a bridge, cross it and when you reach the monument, caress it!");
        System.out.println("\n1: You thank the dulkurs and head to the river.");
        System.out.println("2: You head for the river.");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            toRiver();
        } else if (choice == 2) {
            toRiver();
        } else {
            ending2();
        }
    }
    public void toRiver() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Get to the river. What do you do?");
        System.out.println("1: I follow the side of the West River");
        System.out.println("2: I follow the side of the East River");
        System.out.println("3: I try to cross the river (which is 30m wide)");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            ending3();
        } else if (choice == 2) {
            afterBridge();
        } else if (choice == 3) {
            ending4();
        } else {
            toRiver();
        }
    }
    public void ending3() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Go along the river, until you reach the sea after days...");
        System.out.println("You manage to go home, but your mother tells you:" + playerName + ", your father is gone");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");
    }
    public void ending4() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Try to face the river. The current is really strong!");
        System.out.println("The current takes you away! A few minutes later you drown!");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");
    }
    public void afterBridge() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("After a few minutes you can find a bridge. You go through it.");
        System.out.println("On the other side you see a monument, it is the statue of a pretty elven girl, holding a bowl. What do you do?");
        System.out.println("1: I fill the bowl with water");
        System.out.println("2: I caress the statue");
        System.out.println("3: I try to drop the statue");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            afterBridge();
        } else if (choice == 2) {
            ending6();
        } else if (choice == 3) {
            ending5();
        } else {
            afterBridge();
        }
    }
    public void ending5() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("The statue falls. The flower you were looking for is under it.");
        System.out.println("You come home and prepare the infusion. The fumes permeate the farmhouse. Toxic fumes end up killing you, your father and your mother!");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");
    }
    public void ending6() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("The statue's eyes light up. A large and beautiful blue flower appears on the bowl.");
        System.out.println("The statue: Hi " + playerName + ". Take this flower and use it for a good purpose!");
        System.out.println("Take the flower and go home. You make an infusion and make your father drink it. Your mother gives a kiss. After a few kings your father looks like new. Congratulations!.");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n------------------------------------------------------------------\n");
    }
}
