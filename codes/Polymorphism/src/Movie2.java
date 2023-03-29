import java.util.Scanner;

public class Movie2 {
    private String name;

    public Movie2(String name) {
        this.name = name;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a %s film%n", name, instanceType);
    }

    public static Movie2 getMovie(String type, String name) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(name);
            case 'C' -> new Comedy(name);
            case 'S' -> new Scifi(name);
            default -> new Movie2(name);
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type (A for adventure, C for comedy, S for Scifi) : ");
            String type = sc.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            Movie2 movie = getMovie(type, name);
            movie.watchMovie();
        }
        sc.close();
    }
}

class Adventure extends Movie2 {
    public Adventure(String name) {
        super(name);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3), "pleasant scene", "scary music", "something bad happens");
    }
}

class Comedy extends Movie2 {
    public Comedy(String name) {
        super(name);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3), "funny scene", "dramatic music", "everyone laughed");
    }
}

class Scifi extends Movie2 {
    public Scifi(String name) {
        super(name);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3), "scientific concept", "slow music", "an Alien came");
    }
}
