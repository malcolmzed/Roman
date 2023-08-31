

public
class TestRoman {

    public static
    void main(String[] args) {

        String  outcome;
        int     returnVal;
        boolean ok;

        int     good = 0;
        int     bad  = 0;
        class TestData {
            String romanString;
            int expectedDecimal;

            TestData(String roman, int decimal) {
                romanString = roman;
                expectedDecimal = decimal;
            }
        }

        TestData[] testData = new TestData[7];

        testData[0] = new TestData("D",        500);
        testData[1] = new TestData("C",        100);
        testData[2] = new TestData("IX",         9);
        testData[3] = new TestData("LXIX",      69);
        testData[4] = new TestData("XLIII",     43);
        testData[5] = new TestData("CXXII",    122);
        testData[6] = new TestData("MMCXLIV", 2144);

        for (int i = 0; i < testData.length; i++) {

            returnVal = Roman.convertToDecimal(testData[i].romanString);

            ok = (returnVal == testData[i].expectedDecimal);

            if ( ! ok ) bad++;

            outcome = ( ok ) ? " OK" : "NOK";

            System.out.printf("Test %d [%9s %4d] %4d  >> %s%n",
                              i+1,
                              testData[i].romanString,
                              testData[i].expectedDecimal,
                              returnVal,
                              outcome
            );

        }
    System.out.printf("%n>>> %d tests  %d failures%n", testData.length, bad);
    }
}