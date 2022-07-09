package tasks;


import tasks.task028.Task028;

public class Main {
    public static void main(String[] args)  {
        Object[][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        Object[][] twoDimArray2 = {{"eee","fff"}, {"ttt","ww"}, {"ppp","rr"}};
        Task028.iteratorDV(3,4,twoDimArray);
        Task028.iteratorDV(3,2,twoDimArray2);
    }
}

