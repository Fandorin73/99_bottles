package com.company;

public class Main {
        public static void main(String[] args) {
	    int beerNum=99;
           String word="бутылок";
	    while (beerNum>0){

	        // Склонеине слова, проверка
	        if ((beerNum%10==1)&(beerNum!=11)){
	            word="бутылка";
            }
	        else if ((beerNum%10!=0)&(beerNum%10<5)&(beerNum/10!=1)){
	            word="бутылки";
            }
            else {
                word="бутылок";
            }

            System.out.println(beerNum+" "+word+" пива на стене");
            System.out.println(beerNum+" "+word+" пива!");
            System.out.println("Возьми одну, пусти по кругу");
	        beerNum--;

	        // Склонеине слова, проверка 2

            if ((beerNum%10==1)&(beerNum!=11)){
                word="бутылка";
            }
            else if ((beerNum%10!=0)&(beerNum%10<5)&(beerNum/10!=1)){
                word="бутылки";
            }
            else {
                word="бутылок";
            }
            if (beerNum>0){
                System.out.println(beerNum+" "+word+" пива на стене");
            }
            else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}
