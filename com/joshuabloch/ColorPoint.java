package joshuabloch;

public class ColorPoint{
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint)){
            return false;
        }
        return true;
    }
}
