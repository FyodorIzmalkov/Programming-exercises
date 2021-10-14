package hackerrank.unsorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {

    String whatsYourName() {
        return "I have many names and types.";
    }

}

class Jasmine extends Flower {

    @Override
    String whatsYourName() {
        return "hackerrank.unsorted.Jasmine";
    }
}

class Lily extends Flower {

    @Override
    String whatsYourName() {
        return "hackerrank.unsorted.Lily";
    }
}

class Region {

    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {

    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {

    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}


public class Covariant1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "hackerrank.unsorted.WestBengal":
                region = new WestBengal();
                break;
            case "hackerrank.unsorted.AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}