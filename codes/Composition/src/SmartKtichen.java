public class SmartKtichen {
    private Coffemaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKtichen() {
        brewMaster = new Coffemaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public Coffemaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean brewMasterFlag, boolean dishWasherFlag, boolean iceBoxFlag) {
        brewMaster.setHasWorkToDo(brewMasterFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(iceBoxFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
}

class Coffemaker{
    private Boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewing coffee...");
            setHasWorkToDo(false);
        }
    }
}

class Refrigerator {
    private Boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("ordering food...");
            setHasWorkToDo(false);
        }
    }
}

class DishWasher {
    private Boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("washing dishes...");
            setHasWorkToDo(false);
        }
    }
}