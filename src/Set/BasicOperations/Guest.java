package Set.BasicOperations;

import java.util.Objects;

public class Guest {
    private String name;
    private int codeInvitation;
    
    public Guest(String name, int codeInvitation) {
        this.name = name;
        this.codeInvitation = codeInvitation;
    }

    public String getName() {
        return name;
    }

    public int getCodeInvitation() {
        return codeInvitation;
    }

    @Override
    public String toString() {
        return "Guest [name=" + name + ", codeInvitation=" + codeInvitation + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getCodeInvitation() == guest.getCodeInvitation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodeInvitation());
    } 

    
    
}
