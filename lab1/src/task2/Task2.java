package task2;

public class Task2 {

    static public boolean checkUpArrea(int x, int y){
        if (y <= 5 && y >= 0 && x <= 4 && x >= - 4)
            return true;
        else
            return false;
    }

    static public boolean checkBottomArrea(int x, int y){
        if (y < 0 && y >= -3 && x <= 6 && x >= - 6)
            return true;
        else
            return false;
    }

    static public boolean checkAllArrea(int x, int y){
        return checkUpArrea(x,y) || checkBottomArrea(x,y);
    }


}
