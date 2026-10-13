package estruturas;

import java.util.Scanner;

public class forPara {

    public static void main(String[] args){

        //for (var i = 0; i < args.length; i++){
          //  System.out.println(args[i]);

        for(var i = 0; i < args.length;i++){
            System.out.println((i+1) + " - " + args[i]);
        }
    }

}