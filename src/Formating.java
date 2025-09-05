public class Formating {


    public String removeLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) ans.append(s.charAt(i));
        }
        return ans.toString();
    }

    public String formatString(String s) {
        StringBuilder noSpace = new StringBuilder();
        s = s.replace("\n", "");
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) noSpace.append(s.charAt(i));
        }
        return noSpace.toString();
    }
}
