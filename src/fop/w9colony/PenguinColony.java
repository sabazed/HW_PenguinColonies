package fop.w9colony;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class PenguinColony {

    private HashSet<Penguin> penguins;

    public PenguinColony(HashSet<Penguin> penguins) {
        this.penguins = penguins;
    }

    public HashSet<Penguin> getPenguins() {
        return penguins;
    }

    public void setPenguins(HashSet<Penguin> penguins) {
        this.penguins = penguins;
    }

    public void uniteColonies(PenguinColony otherColony) {
        Iterator<Penguin> iterator = otherColony.penguins.iterator();
        while (iterator.hasNext()) {
            penguins.add(iterator.next());
            iterator.remove();
        }
    }

    public PenguinColony splitColony(Predicate<? super Penguin> pred) {
        PenguinColony newColony = new PenguinColony(new HashSet<>());
        HashSet<Penguin> oldPenguins = new HashSet<>();

        Iterator<Penguin> iterator = penguins.iterator();
        Penguin penguin;

        while (iterator.hasNext()) {
            penguin = iterator.next();
            if (pred.test(penguin)) newColony.penguins.add(penguin);
            else oldPenguins.add(penguin);
        }

        setPenguins(oldPenguins);
        return newColony;
    }

    public Penguin findFirstFriend(LinkedList<Penguin> penguinFriends) {
        Iterator<Penguin> iterator = penguinFriends.iterator();
        Penguin penguin;
        while (iterator.hasNext()) {
            penguin = iterator.next();
            if (penguins.contains(penguin)) return penguin;
        }
        return null;
    }

    public boolean canFeedPenguinsWithProperty(Predicate<? super Penguin> pred, Set<Fish> fishes) {
        Iterator<Penguin> iterator = penguins.iterator();
        Penguin penguin = null;
        while (iterator.hasNext()) {
            penguin = iterator.next();
            if (pred.test(penguin)) {
                boolean canEat = false;
                for (Fish fish : fishes) if (penguin.getFavoriteFish() == fish) canEat = true;
                if (canEat == false) return false;
            }
        }
        return true;
    }

    public int computeSum(Function<? super Penguin, Integer> fun) {
        final int[] sum = new int[1];
        penguins.stream().forEach(penguin -> sum[0] += fun.apply(penguin));
        return sum[0];
    }

}
