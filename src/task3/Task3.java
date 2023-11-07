package task3;

public class Task3 {

    static public String generateTanTable(double a, double b,double h)
    {
        String table = "\n|   x   |   y   |\n";
        for (double i = a; i <= b; i+=h){
            table += "| " +  String.format("%.3f",(i)) + " | " + String.format("%.3f",Math.tan(i)) + " |\n";
        }
        return table;
    }
}
