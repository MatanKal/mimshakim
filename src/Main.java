import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        getVehicleFromUser();
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
    public static Vehicle[] getVehicleFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount of vehicles.");
        int v = scanner.nextInt();
        Vehicle arr[] = new Vehicle[v];

        for(int i=0; i<v;i++){
            System.out.println("please choose vehicle type:\n J-jeep \n B - Boat \n H - Hoverboard \n X - Exit");
            String vec = scanner.nextLine();
            System.out.println("please enter name:");
            String name = scanner.nextLine();
            System.out.println("please enter max amount of passengers");
            int pass = scanner.nextInt();
            System.out.println("please enter speed:");
            int speed = scanner.nextInt();
            if(vec=="X"){
                return null;
            }
            if(vec=="J"){
                System.out.println("please enter number of wheels");
                int now = scanner.nextInt();
                Vehicle ve = new Jeep(pass,name,speed,now);
                arr[i] = ve;
            }
            if(vec=="H") {
                System.out.println("please enter number of wheels");
                int now = scanner.nextInt();
                Vehicle ve = new Hovercraft(pass,name,speed,now);
                arr[i] = ve;
            }
            if(vec=="B"){
                Vehicle ve = new Boat(pass,name,speed);
            }
            System.out.println("Vehicle added: ", arr[i].getDetails());
            }
            return ve;
            }
    public static double getTravelTime(VehicleInSpace[] vehicles, int source_x, int source_y, int dest_x, int dest_y, int passengers, boolean land) {
        double dist, destsqrt = Math.sqrt(Math.pow(dest_x - source_x, 2) + Math.pow(dest_y - source_y, 2));
        VehicleInSpace[] vehicelviv =new VehicleInSpace[vehicles.length];
        int counter = 0;
        double minT = -1;
        for (VehicleInSpace destdestdest : vehicles) {
            if (destdestdest instanceof LandVehicle && land || destdestdest instanceof SeaVessel && !land) {
                vehicelviv[counter] = destdestdest;
                counter++;
            }
        }
        for (int i = 0; i < vehicelviv.length; i++) {
            if ((((Vehicle) vehicelviv[i]).getMaxPassengers() >= passengers) && vehicelviv[i] instanceof Vehicle) {
                dist = (Math.sqrt(Math.pow(vehicelviv[i].getX() - source_x, 2) + Math.pow(vehicelviv[i].getY() - source_y, 2)) + destsqrt);
                dist = (double) dist / ((Vehicle) vehicelviv[i]).getMaxSpeed();
                if (minT == -1 || dist  < minT) {
                    minT = dist;
                }
            }
        }
        return minT;


    }

}
