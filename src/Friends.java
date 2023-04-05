import java.util.Objects;

public class Friends implements Comparable {
    private String name;
    private boolean family;
    private int yearsKnown;
    private int friendShipLevel;

    public Friends(String name, boolean family, int yearsKnown, int friendShipLevel) {
        this.name = name;
        this.family = family;
        this.yearsKnown = yearsKnown;
        this.friendShipLevel = friendShipLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFamily() {
        return family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public int getYearsKnown() {
        return yearsKnown;
    }

    public void setYearsKnown(int yearsKnown) {
        this.yearsKnown = yearsKnown;
    }

    public int getFriendShipLevel() {
        return friendShipLevel;
    }

    public void setFriendShipLevel(int friendShipLevel) {
        this.friendShipLevel = friendShipLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // if (o == null || getClass() != o.getClass()) return false;
        //Friend friend = (Friend) o;
        if (!(o instanceof Friends friends)) return false;
        return family == friends.family &&
                yearsKnown == friends.yearsKnown &&
                friendShipLevel == friends.friendShipLevel &&
                name.equals(friends.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, yearsKnown, friendShipLevel);
    }

    @Override
    public String toString() {
        return "Friends{" +
                "name='" + name + '\'' +
                ", family=" + family +
                ", yearsKnown=" + yearsKnown +
                ", friendShipLevel=" + friendShipLevel +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
