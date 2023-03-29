public class App {
    public static void main(String[] args) {
        SmartKtichen kitchen = new SmartKtichen();
        /*
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);

        kitchen.getBrewMaster().brewCoffee();
        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        */
        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();
    }
}