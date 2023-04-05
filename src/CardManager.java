import java.util.*;

public class CardManager {
    public static void removeDuplicates(List<PostCard> postCards) {
        Set<PostCard> uniqueCards = new HashSet<>(postCards);
        postCards.clear();
        postCards.addAll(uniqueCards);

        for (PostCard card : uniqueCards) {
            int frequency = Collections.frequency(postCards, card);
            if (frequency > 1) {
                System.out.println("Duplicate postcards for " + card.getCountry() + ": " + frequency);
            }
        }
        List<PostCard> duplicates = new ArrayList<>();
        Set<PostCard> set = new HashSet<>();
        for (PostCard card : postCards) {
            if (!set.add(card)) {
                duplicates.add(card);
            }
        }
        postCards.removeAll(duplicates);
        System.out.println("Nr duplicates: " + duplicates.size());
    }
}
