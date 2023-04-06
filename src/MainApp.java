import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

    //your cards
    PostCard belgium = new PostCard("Belgium", "Europe");
    PostCard france = new PostCard("France", "Europe");
    PostCard japan = new PostCard("Japan", "Asia");
    PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
    PostCard southKorea = new PostCard("South Korea", "Asia");
    PostCard belgium2 = new PostCard("Belgium", "Europe");
    PostCard southAfrica = new PostCard("South Africa", "Africa");
    PostCard france2 = new PostCard("France", "Europe");
    PostCard belgium3 = new PostCard("Belgium", "Europe");
    PostCard usa = new PostCard("United States of America", "North America");
    PostCard canada = new PostCard("Canada", "North America");
    PostCard peru = new PostCard("Peru", "South America");
    PostCard samoa = new PostCard("Samoa", "Oceania");
    PostCard belgium4 = new PostCard("Belgium", "Europe");
    PostCard france3 = new PostCard("France", "Europe");


    List<PostCard> yourPostCardList = new ArrayList();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);


    //your friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");


    List<PostCard> yourFriendsPostCardList = new ArrayList();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);


    //your friends
    Friends bobby = new Friends("Bobby",false, 3, 5);
    Friends melissa = new Friends("Melissa",false, 1, 6);
    Friends darla = new Friends("Darla",true, 14, 2);
    Friends bert = new Friends("Bert",false, 10, 4);
    Friends grandma = new Friends("Nana",true, 12, 7);
    Friends fester = new Friends("Fester",false, 1, 2);
    Friends anna = new Friends("Anna",false, 8, 4);
//oef1
    PostCard yourPostCard = yourPostCardList.get(4);
    PostCard friendPostCard = yourFriendsPostCardList.get(2);
    int yourPostCardIndex = yourPostCardList.indexOf(yourPostCard);
    int friendPostCardIndex = yourFriendsPostCardList.indexOf(friendPostCard);
        yourPostCardList.set(yourPostCardIndex, friendPostCard);
        yourFriendsPostCardList.set(friendPostCardIndex, yourPostCard);

        System.out.println("After changing cards:");
        System.out.println("My postcards: " + yourPostCardList+"\n");
        System.out.println("My friend's postcards: " + yourFriendsPostCardList+"\n");

        Comparator <PostCard> postCardComperator = Comparator.comparing(PostCard::getCountry);
        yourPostCardList.sort(postCardComperator);
        yourFriendsPostCardList.sort(postCardComperator);
//oef2
        System.out.println("Postcards by country: ");
        for (PostCard postCard : yourPostCardList) {
            System.out.println(postCard);
        }
        System.out.println("My friends postcards by country: ");
        for (PostCard postCard : yourFriendsPostCardList) {
            System.out.println(postCard);
        }
//oef 3
        System.out.println("\n");
        CardManager.removeDuplicates(yourPostCardList);
        CardManager.removeDuplicates(yourFriendsPostCardList);
//oef4
        PriorityQueue<Friends> sortedFriends = new PriorityQueue<>();

        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);
        System.out.println("\n");
        sortedFriends.stream()
                .sorted(Comparator.comparing(Friends::isFamily).reversed())
                .sorted(Comparator.comparing(Friends::getFriendShipLevel).reversed())
                .sorted(Comparator.comparing(Friends::getYearsKnown).reversed())
                .forEach(System.out::println);

    }
}
