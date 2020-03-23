
public class ozgen{

    public String reverse(String str) {
        String result = "";
        for (int i = str.length(); i >= 0; i--) {

            result += "" + str.charAt(i);

        }
        return result;
    }


}
