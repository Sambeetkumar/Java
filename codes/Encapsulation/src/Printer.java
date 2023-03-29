public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount < 0 || tempAmount > 100) {
            return -1;
        } else {
            tonerLevel = tempAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int sheets = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += sheets;
        return sheets;
    }

    public int getPagesprinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
