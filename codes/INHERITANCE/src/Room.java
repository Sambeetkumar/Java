    class Room {
        int length;
        int breadth;

        Room(int x, int y) {
            length = x;
            breadth = y;
        }

        public int area() {
            System.out.println("Room.area() is called");
            return length * breadth;
        }

        static class Bedroom extends Room {
            int height;

            Bedroom(int x, int y, int z) {
                super(x, y);
                height = z;
            }

            public int volume() {
                return super.length * super.breadth * height;
            }

            @Override
            public int area() {
                System.out.println("Bedroom.area() is called");
                return super.area();
            }

            public static void main(String[] args) {
                Bedroom Room1 = new Bedroom(30, 25, 15);
                int area = Room1.area();
                int vol = Room1.volume();
                System.out.println("Area = " + area);
                System.out.println("Volume = " + vol);
            }
        }
    }
