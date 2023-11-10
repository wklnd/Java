import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[][] game = {
                {
                        "-", "-", "-", "-", "-", "-", "-", "-", "-",  "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|\n"
                },
                {
                        "-", "-", "-", "-", "-", "-", "-", "-", "-",  "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-\n"
                }
        };
        LinkedList<LinkedList<String>> world = new LinkedList();
        LinkedList<String> inventory = new LinkedList();
        int[] playerpos = {8, 0};
        // for (int x = 0; x < 20; x++) {
        //   for (int y = 0; y < 47; y++) {
        //     print(game[x][y], "blue");
        //   }
        // }
        clear();
        type("Welcome to JavaCraft! This game is a Minecraft clone using ASCII.  Press enter to start the game.", "orange");
        scan.nextLine();
        for (int c = 0; c < 15; c++) {
            world.add(c, new LinkedList<String>());
            for (int s = 0; s < rand.nextInt(3) + 7; s++) {
                world.get(c).addLast("stone");
            }
            for (int d = 0; d < rand.nextInt(3) + 6; d++) {
                world.get(c).addLast("dirt");
            }
            world.get(c).addLast("grass");
            for (int a = 0; a < 25 - world.get(c).size(); a++){
                world.get(c).addLast("air");
            }
            if (c == 8) {
                world.get(c).remove(world.get(c).indexOf("grass") + 1);
                world.get(c).add(world.get(c).indexOf("grass") + 1, "player");
                playerpos[0] = 8;
                playerpos[1] = world.get(c).indexOf("player");
            }
        }
        game = update(world, game);
        clear();
        boolean jumpedOnce = false;
        while (true) {
            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 47; y++) {
                    if (game[x][y].equalsIgnoreCase("G")) {
                        print(game[x][y], "green");
                    }
                    else if (game[x][y].equalsIgnoreCase("D")) {
                        print(game[x][y], "brown");
                    }
                    else if (game[x][y].equalsIgnoreCase("S")) {
                        print(game[x][y], "gray");
                    }
                    else {
                        print(game[x][y], "blue");
                    }
                }
            }
            print(playerpos[0] + "," + playerpos[1], "orange");
            print("\nInventory = " + inventory, "orange");
            print("\n", "");
            boolean canMoveLeft = false;
            boolean canMoveRight = false;
            boolean canJumpUp = false;
            boolean canBreakLeft = false;
            boolean canBreakRight = false;
            boolean canBreakUp = false;
            boolean canBreakDown = false;
            boolean canPlaceLeft = false;
            boolean canPlaceRight = false;
            boolean canPlaceUp = false;
            boolean canPlaceDown = false;
            if (!(playerpos[0] == 0)) {
                if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("air")) {
                    print(" L. Move left", "orange");
                    canMoveLeft = true;
                }
            }
            if (!(playerpos[0] == 14)) {
                if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("air")) {
                    print(" R. Move right", "orange");
                    canMoveRight = true;
                }
            }
            if (!(playerpos[1] == 18)) {
                if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("air") && jumpedOnce == false) {
                    print(" J. Jump up", "orange");
                    canJumpUp = true;
                }
            }
            if (!(playerpos[0] == 0)) {
                if (!world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("air")) {
                    print(" BL. Break left block", "orange");
                    canBreakLeft = true;
                }
            }
            if (!(playerpos[0] == 14)) {
                if (!world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("air")) {
                    print(" BR. Break right block", "orange");
                    canBreakRight = true;
                }
            }
            if (!(playerpos[1] == 18)) {
                if (!world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("air")) {
                    print(" BU. Break block up", "orange");
                    canBreakUp = true;
                }
            }
            if (!(playerpos[1] == 13)) {
                if (!world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    print(" BD. Break block down", "orange");
                    canBreakDown = true;
                }
            }
            if (!(playerpos[1] == 13)) {
                if (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air") && inventory.size() > 0) {
                    print(" PD. Place block down", "orange");
                    canPlaceDown = true;
                }
            }
            if (!(playerpos[1] == 18)) {
                if (world.get(playerpos[0]).get(playerpos[1]+1).equalsIgnoreCase("air") && inventory.size() > 0) {
                    print(" PU. Place block up", "orange");
                    canPlaceUp = true;
                }
            }
            if (!(playerpos[0] == 14)) {
                if (world.get(playerpos[0]+1).get(playerpos[1]).equalsIgnoreCase("air") && inventory.size() > 0) {
                    print(" PR. Place right block", "orange");
                    canPlaceRight = true;
                }
            }
            if (!(playerpos[0] == 0)) {
                if (world.get(playerpos[0]-1).get(playerpos[1]).equalsIgnoreCase("air") && inventory.size() > 0) {
                    print(" PL. Place left block", "orange");
                    canPlaceLeft = true;
                }
            }
            type("\nEnter your input:\n", "orange");
            String move = scan.nextLine();
            if (move.equalsIgnoreCase("L") && canMoveLeft == true) {
                jumpedOnce = false;
                world.get(playerpos[0]).remove(playerpos[1]);
                world.get(playerpos[0]).add(playerpos[1], "air");
                world.get(playerpos[0]-1).remove(playerpos[1]);
                world.get(playerpos[0]-1).add(playerpos[1], "player");
                playerpos[0] -= 1;
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("R") && canMoveRight == true) {
                jumpedOnce = false;
                world.get(playerpos[0]).remove(playerpos[1]);
                world.get(playerpos[0]).add(playerpos[1], "air");
                world.get(playerpos[0]+1).remove(playerpos[1]);
                world.get(playerpos[0]+1).add(playerpos[1], "player");
                playerpos[0] += 1;
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("J") && canJumpUp == true) {
                jumpedOnce = true;
                world.get(playerpos[0]).remove(playerpos[1]);
                world.get(playerpos[0]).add(playerpos[1], "air");
                world.get(playerpos[0]).remove(playerpos[1]+1);
                world.get(playerpos[0]).add(playerpos[1]+1, "player");
                playerpos[1] += 1;
            }
            if (move.equalsIgnoreCase("BL") && canBreakLeft == true) {
                jumpedOnce = false;
                inventory.add("dirt");
                world.get(playerpos[0]-1).remove(playerpos[1]);
                world.get(playerpos[0]-1).add(playerpos[1], "air");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("BR") && canBreakRight == true) {
                jumpedOnce = false;
                inventory.add("dirt");
                world.get(playerpos[0]+1).remove(playerpos[1]);
                world.get(playerpos[0]+1).add(playerpos[1], "air");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("BU") && canBreakUp == true) {
                jumpedOnce = false;
                inventory.add("dirt");
                world.get(playerpos[0]).remove(playerpos[1]+1);
                world.get(playerpos[0]).add(playerpos[1]+1, "air");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("BD") && canBreakDown == true) {
                jumpedOnce = false;
                inventory.add("dirt");
                world.get(playerpos[0]).remove(playerpos[1]-1);
                world.get(playerpos[0]).add(playerpos[1]-1, "air");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("PU") && canPlaceUp == true) {
                jumpedOnce = false;
                inventory.remove("dirt");
                world.get(playerpos[0]).remove(playerpos[1]+1);
                world.get(playerpos[0]).add(playerpos[1]+1, "dirt");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("PR") && canPlaceRight == true) {
                jumpedOnce = false;
                inventory.remove("dirt");
                world.get(playerpos[0]+1).remove(playerpos[1]);
                world.get(playerpos[0]+1).add(playerpos[1], "dirt");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("PL") && canPlaceLeft == true) {
                jumpedOnce = false;
                inventory.remove("dirt");
                world.get(playerpos[0]-1).remove(playerpos[1]);
                world.get(playerpos[0]-1).add(playerpos[1], "dirt");
                while (world.get(playerpos[0]).get(playerpos[1]-1).equalsIgnoreCase("air")) {
                    world.get(playerpos[0]).remove(playerpos[1]);
                    world.get(playerpos[0]).add(playerpos[1], "air");
                    world.get(playerpos[0]).remove(playerpos[1]-1);
                    world.get(playerpos[0]).add(playerpos[1]-1, "player");
                    playerpos[1] -= 1;
                }
            }
            if (move.equalsIgnoreCase("PD") && canPlaceDown == true) {
                jumpedOnce = false;
                inventory.remove("dirt");
                world.get(playerpos[0]).remove(playerpos[1]-1);
                world.get(playerpos[0]).add(playerpos[1]-1, "dirt");
            }
            clear();
            game = update(world, game);
        }
    }
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void sleep(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        }
        catch (Exception e) {

        }
    }
    public static void type(String output, String color) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            if (color.equalsIgnoreCase("blue")) {
                System.out.print("\33[0;34m" + c);
            }
            else if (color.equalsIgnoreCase("red")) {
                System.out.print("\033[0;31m" + c);
            }
            else if (color.equalsIgnoreCase("cyan")) {
                System.out.print("\033[1;36m" + c);
            }
            else if (color.equalsIgnoreCase("green")) {
                System.out.print("\033[0;32m" + c);
            }
            else if (color.equalsIgnoreCase("orange")) {
                System.out.print("\033[0;33m" + c);
            }
            else if (color.equalsIgnoreCase("brown")) {
                System.out.print("\033[38;5;131m" + c);
            }
            else if (color.equalsIgnoreCase("gray")) {
                System.out.print("\033[0;30m" + c);
            }
            else {
                System.out.print("\u001b[0m" + c);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            }
            catch (Exception e) {

            }
        }
    }
    public static void print(String output, String color) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            if (color.equalsIgnoreCase("blue")) {
                System.out.print("\33[0;34m" + c);
            }
            else if (color.equalsIgnoreCase("red")) {
                System.out.print("\033[0;31m" + c);
            }
            else if (color.equalsIgnoreCase("cyan")) {
                System.out.print("\033[1;36m" + c);
            }
            else if (color.equalsIgnoreCase("green")) {
                System.out.print("\033[0;32m" + c);
            }
            else if (color.equalsIgnoreCase("orange")) {
                System.out.print("\033[0;33m" + c);
            }
            else if (color.equalsIgnoreCase("brown")) {
                System.out.print("\033[38;5;131m" + c);
            }
            else if (color.equalsIgnoreCase("gray")) {
                System.out.print("\033[0;30m" + c);
            }
            else {
                System.out.print("\u001b[0m" + c);
            }
        }
    }
    public static String[][] update(LinkedList<LinkedList<String>> blocks, String[][] gameboard) {
        String[][] air = {
                {
                        " ", " ", " "
                },
                {
                        " ", " ", " "
                },
                {
                        " ", " ", " "
                }
        };
        String[][] grass = {
                {
                        "G", "G", "G"
                },
                {
                        "D", "D", "D"
                },
                {
                        "D", "D", "D"
                }
        };
        String[][] dirt = {
                {
                        "D", "D", "D"
                },
                {
                        "D", "D", "D"
                },
                {
                        "D", "D", "D"
                }
        };
        String[][] stone = {
                {
                        "S", "S", "S"
                },
                {
                        "S", "S", "S"
                },
                {
                        "S", "S", "S"
                }
        };
        String[][] player = {
                {
                        " ", "O", " "
                },
                {
                        "\\", "|", "/"
                },
                {
                        "/", " ", "\\"
                }
        };
        for (int x = 0; x < 15; x++) {
            for (int y = 13; y < 18; y++) {
                if (blocks.get(x).get(y).equalsIgnoreCase("grass")) {
                    if (y == 13) {
                        gameboard[16][x * 3 + 1] = grass[0][0];
                        gameboard[16][x * 3 + 2] = grass[0][1];
                        gameboard[16][x * 3 + 3] = grass[0][2];
                        gameboard[17][x * 3 + 1] = grass[1][0];
                        gameboard[17][x * 3 + 2] = grass[1][1];
                        gameboard[17][x * 3 + 3] = grass[1][2];
                        gameboard[18][x * 3 + 1] = grass[2][0];
                        gameboard[18][x * 3 + 2] = grass[2][1];
                        gameboard[18][x * 3 + 3] = grass[2][2];
                    }
                    else if (y == 14) {
                        gameboard[13][x * 3 + 1] = grass[0][0];
                        gameboard[13][x * 3 + 2] = grass[0][1];
                        gameboard[13][x * 3 + 3] = grass[0][2];
                        gameboard[14][x * 3 + 1] = grass[1][0];
                        gameboard[14][x * 3 + 2] = grass[1][1];
                        gameboard[14][x * 3 + 3] = grass[1][2];
                        gameboard[15][x * 3 + 1] = grass[2][0];
                        gameboard[15][x * 3 + 2] = grass[2][1];
                        gameboard[15][x * 3 + 3] = grass[2][2];
                    }
                    else if (y == 15) {
                        gameboard[10][x * 3 + 1] = grass[0][0];
                        gameboard[10][x * 3 + 2] = grass[0][1];
                        gameboard[10][x * 3 + 3] = grass[0][2];
                        gameboard[11][x * 3 + 1] = grass[1][0];
                        gameboard[11][x * 3 + 2] = grass[1][1];
                        gameboard[11][x * 3 + 3] = grass[1][2];
                        gameboard[12][x * 3 + 1] = grass[2][0];
                        gameboard[12][x * 3 + 2] = grass[2][1];
                        gameboard[12][x * 3 + 3] = grass[2][2];
                    }
                    else if (y == 16) {
                        gameboard[7][x * 3 + 1] = grass[0][0];
                        gameboard[7][x * 3 + 2] = grass[0][1];
                        gameboard[7][x * 3 + 3] = grass[0][2];
                        gameboard[8][x * 3 + 1] = grass[1][0];
                        gameboard[8][x * 3 + 2] = grass[1][1];
                        gameboard[8][x * 3 + 3] = grass[1][2];
                        gameboard[9][x * 3 + 1] = grass[2][0];
                        gameboard[9][x * 3 + 2] = grass[2][1];
                        gameboard[9][x * 3 + 3] = grass[2][2];
                    }
                    else if (y == 17) {
                        gameboard[4][x * 3 + 1] = grass[0][0];
                        gameboard[4][x * 3 + 2] = grass[0][1];
                        gameboard[4][x * 3 + 3] = grass[0][2];
                        gameboard[5][x * 3 + 1] = grass[1][0];
                        gameboard[5][x * 3 + 2] = grass[1][1];
                        gameboard[5][x * 3 + 3] = grass[1][2];
                        gameboard[6][x * 3 + 1] = grass[2][0];
                        gameboard[6][x * 3 + 2] = grass[2][1];
                        gameboard[6][x * 3 + 3] = grass[2][2];
                    }
                    else {
                        gameboard[1][x * 3 + 1] = grass[0][0];
                        gameboard[1][x * 3 + 2] = grass[0][1];
                        gameboard[1][x * 3 + 3] = grass[0][2];
                        gameboard[2][x * 3 + 1] = grass[1][0];
                        gameboard[2][x * 3 + 2] = grass[1][1];
                        gameboard[2][x * 3 + 3] = grass[1][2];
                        gameboard[3][x * 3 + 1] = grass[2][0];
                        gameboard[3][x * 3 + 2] = grass[2][1];
                        gameboard[3][x * 3 + 3] = grass[2][2];
                    }
                }
                else if (blocks.get(x).get(y).equalsIgnoreCase("dirt")) {
                    if (y == 13) {
                        gameboard[16][x * 3 + 1] = dirt[0][0];
                        gameboard[16][x * 3 + 2] = dirt[0][1];
                        gameboard[16][x * 3 + 3] = dirt[0][2];
                        gameboard[17][x * 3 + 1] = dirt[1][0];
                        gameboard[17][x * 3 + 2] = dirt[1][1];
                        gameboard[17][x * 3 + 3] = dirt[1][2];
                        gameboard[18][x * 3 + 1] = dirt[2][0];
                        gameboard[18][x * 3 + 2] = dirt[2][1];
                        gameboard[18][x * 3 + 3] = dirt[2][2];
                    }
                    else if (y == 14) {
                        gameboard[13][x * 3 + 1] = dirt[0][0];
                        gameboard[13][x * 3 + 2] = dirt[0][1];
                        gameboard[13][x * 3 + 3] = dirt[0][2];
                        gameboard[14][x * 3 + 1] = dirt[1][0];
                        gameboard[14][x * 3 + 2] = dirt[1][1];
                        gameboard[14][x * 3 + 3] = dirt[1][2];
                        gameboard[15][x * 3 + 1] = dirt[2][0];
                        gameboard[15][x * 3 + 2] = dirt[2][1];
                        gameboard[15][x * 3 + 3] = dirt[2][2];
                    }
                    else if (y == 15) {
                        gameboard[10][x * 3 + 1] = dirt[0][0];
                        gameboard[10][x * 3 + 2] = dirt[0][1];
                        gameboard[10][x * 3 + 3] = dirt[0][2];
                        gameboard[11][x * 3 + 1] = dirt[1][0];
                        gameboard[11][x * 3 + 2] = dirt[1][1];
                        gameboard[11][x * 3 + 3] = dirt[1][2];
                        gameboard[12][x * 3 + 1] = dirt[2][0];
                        gameboard[12][x * 3 + 2] = dirt[2][1];
                        gameboard[12][x * 3 + 3] = dirt[2][2];
                    }
                    else if (y == 16) {
                        gameboard[7][x * 3 + 1] = dirt[0][0];
                        gameboard[7][x * 3 + 2] = dirt[0][1];
                        gameboard[7][x * 3 + 3] = dirt[0][2];
                        gameboard[8][x * 3 + 1] = dirt[1][0];
                        gameboard[8][x * 3 + 2] = dirt[1][1];
                        gameboard[8][x * 3 + 3] = dirt[1][2];
                        gameboard[9][x * 3 + 1] = dirt[2][0];
                        gameboard[9][x * 3 + 2] = dirt[2][1];
                        gameboard[9][x * 3 + 3] = dirt[2][2];
                    }
                    else if (y == 17) {
                        gameboard[4][x * 3 + 1] = dirt[0][0];
                        gameboard[4][x * 3 + 2] = dirt[0][1];
                        gameboard[4][x * 3 + 3] = dirt[0][2];
                        gameboard[5][x * 3 + 1] = dirt[1][0];
                        gameboard[5][x * 3 + 2] = dirt[1][1];
                        gameboard[5][x * 3 + 3] = dirt[1][2];
                        gameboard[6][x * 3 + 1] = dirt[2][0];
                        gameboard[6][x * 3 + 2] = dirt[2][1];
                        gameboard[6][x * 3 + 3] = dirt[2][2];
                    }
                    else {
                        gameboard[1][x * 3 + 1] = dirt[0][0];
                        gameboard[1][x * 3 + 2] = dirt[0][1];
                        gameboard[1][x * 3 + 3] = dirt[0][2];
                        gameboard[2][x * 3 + 1] = dirt[1][0];
                        gameboard[2][x * 3 + 2] = dirt[1][1];
                        gameboard[2][x * 3 + 3] = dirt[1][2];
                        gameboard[3][x * 3 + 1] = dirt[2][0];
                        gameboard[3][x * 3 + 2] = dirt[2][1];
                        gameboard[3][x * 3 + 3] = dirt[2][2];
                    }
                }
                else if (blocks.get(x).get(y).equalsIgnoreCase("stone")) {
                    if (y == 13) {
                        gameboard[16][x * 3 + 1] = stone[0][0];
                        gameboard[16][x * 3 + 2] = stone[0][1];
                        gameboard[16][x * 3 + 3] = stone[0][2];
                        gameboard[17][x * 3 + 1] = stone[1][0];
                        gameboard[17][x * 3 + 2] = stone[1][1];
                        gameboard[17][x * 3 + 3] = stone[1][2];
                        gameboard[18][x * 3 + 1] = stone[2][0];
                        gameboard[18][x * 3 + 2] = stone[2][1];
                        gameboard[18][x * 3 + 3] = stone[2][2];
                    }
                    else if (y == 14) {
                        gameboard[13][x * 3 + 1] = stone[0][0];
                        gameboard[13][x * 3 + 2] = stone[0][1];
                        gameboard[13][x * 3 + 3] = stone[0][2];
                        gameboard[14][x * 3 + 1] = stone[1][0];
                        gameboard[14][x * 3 + 2] = stone[1][1];
                        gameboard[14][x * 3 + 3] = stone[1][2];
                        gameboard[15][x * 3 + 1] = stone[2][0];
                        gameboard[15][x * 3 + 2] = stone[2][1];
                        gameboard[15][x * 3 + 3] = stone[2][2];
                    }
                    else if (y == 15) {
                        gameboard[10][x * 3 + 1] = stone[0][0];
                        gameboard[10][x * 3 + 2] = stone[0][1];
                        gameboard[10][x * 3 + 3] = stone[0][2];
                        gameboard[11][x * 3 + 1] = stone[1][0];
                        gameboard[11][x * 3 + 2] = stone[1][1];
                        gameboard[11][x * 3 + 3] = stone[1][2];
                        gameboard[12][x * 3 + 1] = stone[2][0];
                        gameboard[12][x * 3 + 2] = stone[2][1];
                        gameboard[12][x * 3 + 3] = stone[2][2];
                    }
                    else if (y == 16) {
                        gameboard[7][x * 3 + 1] = stone[0][0];
                        gameboard[7][x * 3 + 2] = stone[0][1];
                        gameboard[7][x * 3 + 3] = stone[0][2];
                        gameboard[8][x * 3 + 1] = stone[1][0];
                        gameboard[8][x * 3 + 2] = stone[1][1];
                        gameboard[8][x * 3 + 3] = stone[1][2];
                        gameboard[9][x * 3 + 1] = stone[2][0];
                        gameboard[9][x * 3 + 2] = stone[2][1];
                        gameboard[9][x * 3 + 3] = stone[2][2];
                    }
                    else if (y == 17) {
                        gameboard[4][x * 3 + 1] = stone[0][0];
                        gameboard[4][x * 3 + 2] = stone[0][1];
                        gameboard[4][x * 3 + 3] = stone[0][2];
                        gameboard[5][x * 3 + 1] = stone[1][0];
                        gameboard[5][x * 3 + 2] = stone[1][1];
                        gameboard[5][x * 3 + 3] = stone[1][2];
                        gameboard[6][x * 3 + 1] = stone[2][0];
                        gameboard[6][x * 3 + 2] = stone[2][1];
                        gameboard[6][x * 3 + 3] = stone[2][2];
                    }
                    else {
                        gameboard[1][x * 3 + 1] = stone[0][0];
                        gameboard[1][x * 3 + 2] = stone[0][1];
                        gameboard[1][x * 3 + 3] = stone[0][2];
                        gameboard[2][x * 3 + 1] = stone[1][0];
                        gameboard[2][x * 3 + 2] = stone[1][1];
                        gameboard[2][x * 3 + 3] = stone[1][2];
                        gameboard[3][x * 3 + 1] = stone[2][0];
                        gameboard[3][x * 3 + 2] = stone[2][1];
                        gameboard[3][x * 3 + 3] = stone[2][2];
                    }
                }
                else if (blocks.get(x).get(y).equalsIgnoreCase("player")) {
                    if (y == 13) {
                        gameboard[16][x * 3 + 1] = player[0][0];
                        gameboard[16][x * 3 + 2] = player[0][1];
                        gameboard[16][x * 3 + 3] = player[0][2];
                        gameboard[17][x * 3 + 1] = player[1][0];
                        gameboard[17][x * 3 + 2] = player[1][1];
                        gameboard[17][x * 3 + 3] = player[1][2];
                        gameboard[18][x * 3 + 1] = player[2][0];
                        gameboard[18][x * 3 + 2] = player[2][1];
                        gameboard[18][x * 3 + 3] = player[2][2];
                    }
                    else if (y == 14) {
                        gameboard[13][x * 3 + 1] = player[0][0];
                        gameboard[13][x * 3 + 2] = player[0][1];
                        gameboard[13][x * 3 + 3] = player[0][2];
                        gameboard[14][x * 3 + 1] = player[1][0];
                        gameboard[14][x * 3 + 2] = player[1][1];
                        gameboard[14][x * 3 + 3] = player[1][2];
                        gameboard[15][x * 3 + 1] = player[2][0];
                        gameboard[15][x * 3 + 2] = player[2][1];
                        gameboard[15][x * 3 + 3] = player[2][2];
                    }
                    else if (y == 15) {
                        gameboard[10][x * 3 + 1] = player[0][0];
                        gameboard[10][x * 3 + 2] = player[0][1];
                        gameboard[10][x * 3 + 3] = player[0][2];
                        gameboard[11][x * 3 + 1] = player[1][0];
                        gameboard[11][x * 3 + 2] = player[1][1];
                        gameboard[11][x * 3 + 3] = player[1][2];
                        gameboard[12][x * 3 + 1] = player[2][0];
                        gameboard[12][x * 3 + 2] = player[2][1];
                        gameboard[12][x * 3 + 3] = player[2][2];
                    }
                    else if (y == 16) {
                        gameboard[7][x * 3 + 1] = player[0][0];
                        gameboard[7][x * 3 + 2] = player[0][1];
                        gameboard[7][x * 3 + 3] = player[0][2];
                        gameboard[8][x * 3 + 1] = player[1][0];
                        gameboard[8][x * 3 + 2] = player[1][1];
                        gameboard[8][x * 3 + 3] = player[1][2];
                        gameboard[9][x * 3 + 1] = player[2][0];
                        gameboard[9][x * 3 + 2] = player[2][1];
                        gameboard[9][x * 3 + 3] = player[2][2];
                    }
                    else if (y == 17) {
                        gameboard[4][x * 3 + 1] = player[0][0];
                        gameboard[4][x * 3 + 2] = player[0][1];
                        gameboard[4][x * 3 + 3] = player[0][2];
                        gameboard[5][x * 3 + 1] = player[1][0];
                        gameboard[5][x * 3 + 2] = player[1][1];
                        gameboard[5][x * 3 + 3] = player[1][2];
                        gameboard[6][x * 3 + 1] = player[2][0];
                        gameboard[6][x * 3 + 2] = player[2][1];
                        gameboard[6][x * 3 + 3] = player[2][2];
                    }
                    else {
                        gameboard[1][x * 3 + 1] = player[0][0];
                        gameboard[1][x * 3 + 2] = player[0][1];
                        gameboard[1][x * 3 + 3] = player[0][2];
                        gameboard[2][x * 3 + 1] = player[1][0];
                        gameboard[2][x * 3 + 2] = player[1][1];
                        gameboard[2][x * 3 + 3] = player[1][2];
                        gameboard[3][x * 3 + 1] = player[2][0];
                        gameboard[3][x * 3 + 2] = player[2][1];
                        gameboard[3][x * 3 + 3] = player[2][2];
                    }
                }
                else if (blocks.get(x).get(y).equalsIgnoreCase("air")) {
                    if (y == 13) {
                        gameboard[16][x * 3 + 1] = air[0][0];
                        gameboard[16][x * 3 + 2] = air[0][1];
                        gameboard[16][x * 3 + 3] = air[0][2];
                        gameboard[17][x * 3 + 1] = air[1][0];
                        gameboard[17][x * 3 + 2] = air[1][1];
                        gameboard[17][x * 3 + 3] = air[1][2];
                        gameboard[18][x * 3 + 1] = air[2][0];
                        gameboard[18][x * 3 + 2] = air[2][1];
                        gameboard[18][x * 3 + 3] = air[2][2];
                    }
                    else if (y == 14) {
                        gameboard[13][x * 3 + 1] = air[0][0];
                        gameboard[13][x * 3 + 2] = air[0][1];
                        gameboard[13][x * 3 + 3] = air[0][2];
                        gameboard[14][x * 3 + 1] = air[1][0];
                        gameboard[14][x * 3 + 2] = air[1][1];
                        gameboard[14][x * 3 + 3] = air[1][2];
                        gameboard[15][x * 3 + 1] = air[2][0];
                        gameboard[15][x * 3 + 2] = air[2][1];
                        gameboard[15][x * 3 + 3] = air[2][2];
                    }
                    else if (y == 15) {
                        gameboard[10][x * 3 + 1] = air[0][0];
                        gameboard[10][x * 3 + 2] = air[0][1];
                        gameboard[10][x * 3 + 3] = air[0][2];
                        gameboard[11][x * 3 + 1] = air[1][0];
                        gameboard[11][x * 3 + 2] = air[1][1];
                        gameboard[11][x * 3 + 3] = air[1][2];
                        gameboard[12][x * 3 + 1] = air[2][0];
                        gameboard[12][x * 3 + 2] = air[2][1];
                        gameboard[12][x * 3 + 3] = air[2][2];
                    }
                    else if (y == 16) {
                        gameboard[7][x * 3 + 1] = air[0][0];
                        gameboard[7][x * 3 + 2] = air[0][1];
                        gameboard[7][x * 3 + 3] = air[0][2];
                        gameboard[8][x * 3 + 1] = air[1][0];
                        gameboard[8][x * 3 + 2] = air[1][1];
                        gameboard[8][x * 3 + 3] = air[1][2];
                        gameboard[9][x * 3 + 1] = air[2][0];
                        gameboard[9][x * 3 + 2] = air[2][1];
                        gameboard[9][x * 3 + 3] = air[2][2];
                    }
                    else if (y == 17) {
                        gameboard[4][x * 3 + 1] = air[0][0];
                        gameboard[4][x * 3 + 2] = air[0][1];
                        gameboard[4][x * 3 + 3] = air[0][2];
                        gameboard[5][x * 3 + 1] = air[1][0];
                        gameboard[5][x * 3 + 2] = air[1][1];
                        gameboard[5][x * 3 + 3] = air[1][2];
                        gameboard[6][x * 3 + 1] = air[2][0];
                        gameboard[6][x * 3 + 2] = air[2][1];
                        gameboard[6][x * 3 + 3] = air[2][2];
                    }
                    else {
                        gameboard[1][x * 3 + 1] = air[0][0];
                        gameboard[1][x * 3 + 2] = air[0][1];
                        gameboard[1][x * 3 + 3] = air[0][2];
                        gameboard[2][x * 3 + 1] = air[1][0];
                        gameboard[2][x * 3 + 2] = air[1][1];
                        gameboard[2][x * 3 + 3] = air[1][2];
                        gameboard[3][x * 3 + 1] = air[2][0];
                        gameboard[3][x * 3 + 2] = air[2][1];
                        gameboard[3][x * 3 + 3] = air[2][2];
                    }
                }
                else {

                }
            }
        }
        return gameboard;
    }
}