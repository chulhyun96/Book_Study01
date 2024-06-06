package 박철현.chapter1.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProfessionalBarista implements Barista{
    private List<String> realRecipe = new ArrayList<>();

    @Override
    public Optional<String> makeCoffee(String requiredMenu) {
        return realRecipe.stream()
                .filter(menu -> menu.contains(requiredMenu))
                .map(menu -> menu + "시럽추가")
                .findFirst();
    }
    public String refuse() {
        return "없음";
    }
}
