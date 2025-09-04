package viikko1;
//Salasanayritykset, oikea salasana on java123. Tarkista enintään kolme ensimmäistä yritystä

public class PasswordAttempts {
    public static String login(String[] tries) {
        String login = "java123";
        int max = Math.min(3, tries.length);
        
        for (int i = 0; i < max; i++){
            if(login.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}
