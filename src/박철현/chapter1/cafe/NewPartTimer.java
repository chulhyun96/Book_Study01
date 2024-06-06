package 박철현.chapter1.cafe;


public class NewPartTimer implements Cashier{

    @Override
    public String takeOrder(Barista barista, String menuName) {
        String result = "";
        if (barista instanceof ProfessionalBarista professionalBarista) {
             result = professionalBarista.makeCoffee(menuName)
                    .orElse(professionalBarista.refuse());
        }
        if (barista instanceof NewPartTimer2 newPartTimer2) {
            result = newPartTimer2.makeCoffee(menuName)
                    .orElse(newPartTimer2.refuse());
        }
        return result;
    }
}
