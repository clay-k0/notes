package perks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Requirements {

    private Map<Perk, List<Perk>> perkDependencies = new HashMap<>();

    public Requirements() {
    }

    public Set<Perk> allPerks() {
        return new HashSet<>(perkDependencies.keySet());
    }

    public void addPerk(Perk perk) {
        perkDependencies.putIfAbsent(perk, new LinkedList<>());
    }

    public void addDependency(Perk perk, Perk dependency) {
        addPerk(perk);
        addPerk(dependency);
        perkDependencies.get(perk).add(dependency);
    }

    public Perk getPerk(String name) {
        return perkDependencies.keySet().stream()
                .filter(perk -> perk.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public boolean canSelect(Perk perk, Set<Perk> selectedPerks) {
        List<Perk> dependencies = perkDependencies.get(perk);
        if (dependencies == null) {
            return false;
        }
        for (Perk dependency : dependencies) {
            if (!selectedPerks.contains(dependency)) {
                return false;
            }
        }
        return true;
    }

    public int numberOfPerks() {
        return perkDependencies.size();
    }
}
