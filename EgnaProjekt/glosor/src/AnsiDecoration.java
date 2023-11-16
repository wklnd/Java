/**
 * Klassen 'AnsiDecoration.java' innehåller konstanter för att lägga till färg till texten vid utskrift till konsolen.
 * Exempel på användning:
 * System.out.println(AnsiDecorations.ANSI_RED + "Denna text är röd." + Color.ANSI_RESET);
 * System.out.println(AnsiDecorations.ANSI_STRINKETHROUGH + "Denna text är överstruken." + Color.ANSI_RESET);
 */
public class AnsiDecoration {
    // Textfärger
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    // Bakgrundsfärger
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    // Texteffekter
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    public static final String ANSI_BLINK = "\u001B[5m";
    public static final String ANSI_STRIKETHROUGH = "\u001B[9m";
    public static final String ANSI_BOLD = "\u001B[1m";
}