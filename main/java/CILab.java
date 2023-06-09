public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString == null || myString.isEmpty()) {
            return true;
        }

        boolean isFirstCapital = Character.isUpperCase(myString.charAt(0));
        boolean isAllCapital = true;
        boolean isAllLowerCase = true;

        for (int i = 1; i < myString.length(); i++) {
            if (Character.isUpperCase(myString.charAt(i))) {
                isAllLowerCase = false;
            } else {
                isAllCapital = false;
            }
        }

        return isFirstCapital && (isAllCapital || isAllLowerCase);
    }
}
