import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreditDatabase implements Serializable, PrintInfo {
    private List<Credit> credits;

    public CreditDatabase() {
        credits = new ArrayList<>();
    }

    public void addCredit(Credit credit) {
        credits.add(credit);
    }

    public float getSumOfCreditsByShopName(String shopName) throws Exception {
        float sum = 0.0f;
        for (Credit credit : credits) {
            if (credit.getShop().getName().equals(shopName)) {
                Credit tempCredit = credit;
                List<Float> pricesToPay = tempCredit.getPricesToPay();
                for (Float price : pricesToPay) {
                    sum += price;
                }
            }

        }
        if (sum == 0.0)
            throw new Exception(shopName
                    + " - taki sklep nie istnieje w naszej bazie, lub klient nie wziął kredytu na zakup towaru w tym sklepie");
        return sum;
    }

    public float getSumOfCreditsByShopCity(String shopCity) throws Exception {
        float sum = 0.0f;
        for (Credit credit : credits) {
            if (credit.getShop().getCity().equals(shopCity)) {
                Credit tempCredit = credit;
                List<Float> pricesToPay = tempCredit.getPricesToPay();
                for (Float price : pricesToPay) {
                    sum += price;
                }
            }

        }
        if (sum == 0.0)
            throw new Exception(shopCity
                    + " - nie mamy sklepów znajdujących się w takim mieście, lub klient nie wziął kredytu na zakup towaru w tym sklepie");
        return sum;
    }

    public float getSumOfCreditsByClientID(String clientID) throws Exception {
        float sum = 0.0f;
        for (Credit credit : credits) {
            if (credit.getClient().getID().equals(clientID)) {
                Credit tempCredit = credit;
                List<Float> pricesToPay = tempCredit.getPricesToPay();
                for (Float price : pricesToPay) {
                    sum += price;
                }
            }

        }
        if (sum == 0.0)
            throw new Exception(
                    clientID + " - nie mamy w bazie klienta o danym ID, lub nie wziął kredytu na zakup towaru");
        return sum;
    }

    @Override
    public void info() {
        System.out.println("Baza kredytów.");
        System.out.println("W bazie znajdują się: " + credits.size() + " kredytów");
    }
}
