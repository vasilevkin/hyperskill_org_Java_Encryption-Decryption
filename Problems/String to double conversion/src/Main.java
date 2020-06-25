class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        double result;

        try {
            result = Double.parseDouble(input);
        } catch (Exception exception) {
            result = 0;
        }

        return result;
    }
}
