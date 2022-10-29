class company {
    int pro_id;
    String pro_name;

    public company(int a, String name) {
        pro_id = a;
        pro_name = name;
    }

    public void display() {
        System.out.println("\tProduct_ID = " + pro_id + " \tProduct_NAME = " + pro_name);
    }
}
public class ArrayObj {
        public static void main(String[] args) {
            company[] obj = new company[5];
            obj[0] = new company(3134,"Dell");
            obj[1] = new company(5345,"Asus");
            obj[2] = new company(4646,"HP");
            obj[3] = new company(3458,"MSI");
            obj[4] = new company(6787,"Xiaomi");
            for (int i = 0; i < obj.length; ++i){
                System.out.println("\t Details of company "+(i+1));
                obj[i].display();
            }

        }

    }
