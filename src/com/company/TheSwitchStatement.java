package com.company;

public class TheSwitchStatement {

    public static void main(String[] args) {
    char firstChar='F';
    switch(firstChar){
        case 'A': case'B': case 'C': case 'D': case 'E':
            System.out.println("Char was " + firstChar );
            break;
        default:
            System.out.println("Not found");
            break;
    }


    }
}
