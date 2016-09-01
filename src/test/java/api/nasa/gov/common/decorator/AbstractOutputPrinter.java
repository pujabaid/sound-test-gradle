package api.nasa.gov.common.decorator;

/**
 * Created by pbaid on 8/31/16.
 */
abstract class AbstractOutputPrinter implements PrintObject {

    public StringBuilder createRepeatString(String repeatStr, int repeatCount) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeatCount; i++)
            stringBuilder.append(repeatStr);
        return stringBuilder;

    }

    @Override
    public void printStartTestSeparator(String str) {
        StringBuilder stringBuilder = createRepeatString("*", 50);
        System.out.println("\n\n" + stringBuilder + "\nStart " + str + "\n" + stringBuilder);

    }

    @Override
    public void printStopTestSeparator(String str) {
        StringBuilder stringBuilder = createRepeatString("*", 50);
        System.out.println(stringBuilder + "\nStop " + str + "\n" + stringBuilder + "\n\n");

    }

    @Override
    public abstract void printObject(Object object);

    @Override
    public abstract void printObjectWithHdr(Object object);
}
