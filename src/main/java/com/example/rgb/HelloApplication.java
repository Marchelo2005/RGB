package com.example.rgb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class HelloApplication  {


    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int arrayRgb[]={0,0,0}, valueR=0,valueG=0,valueB=0,iteration;
    System.out.println("Print color in rgb \n Enter value of R");
    valueR= keyboard.nextInt();
    if ((valueR>=20 && valueR<80)||(valueR>120 && valueR<140)){
        arrayRgb [0]=valueR;
    } else{
        System.out.println("ERROR 403 "+valueR);
        System.exit(0);
    }
    System.out.println("Enter value of G");
        valueG= keyboard.nextInt();
        if (valueG>0 && valueG<30){
            arrayRgb [1]=valueG;
        } else{
            System.out.println("ERROR 403 "+valueG);
            System.exit(0);
        }
        System.out.println("Enter value of B");
        valueB= keyboard.nextInt();
        if (valueB>1 && valueB<20){
            arrayRgb [2]=valueB;
        } else{
            System.out.println("ERROR 403 "+valueB);
            System.exit(0);
        }
        for (iteration=0;iteration<arrayRgb.length;iteration++){
         if (iteration==0){
             System.out.println("R: "+arrayRgb[0]);
         }else if(iteration==1){
             System.out.println("G: "+arrayRgb[1]);
         }else {
             System.out.println("B: "+arrayRgb[2]);
         }

        }
    }
}