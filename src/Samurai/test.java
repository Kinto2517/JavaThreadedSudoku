package Samurai;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class test extends Thread{


    public static void main(String[] args) throws Exception {


    }


    static class Thread1 extends Thread{
        public boolean running = true;
        private int[][] a;





        public Thread1(int [][] a){
            this.a=a;
        }



        public void run(){
            double startTime = System.nanoTime();
            double sureSaniye=0;
            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCoz1(a,0,9,0,9)){
                        double endTime = System.nanoTime();
                         sureSaniye= (endTime - startTime) / 1000000000;
                        Thread.sleep(100);
                        sd();
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sureSaniye+"--------------------");

        }
        public void sd(){
            running = false;
        }

    }


    static class Thread1T extends Thread{
        public boolean running = true;
        private int[][] a;

        public Thread1T(int [][] a){
            this.a=a;

        }


        public void run(){
            double startTime = System.nanoTime();

            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCozT(a,0,9,0,9)){
                        double endTime = System.nanoTime();
                        double sureSaniye = (endTime - startTime) / 1000000000;

                        Thread.sleep(100);

                        sd();
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }


    }

    static class Thread3 extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread3(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCoz1(a,12,21,0,9)){
                        sd();
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }

    static class Thread2 extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread2(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){

            try {
                Thread.sleep(10);
                if(sudokuCoz1(a,0,9,12,21)){
                    sd();
                };
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
        }

    static class Thread4 extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread4(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){

                try {
                    Thread.sleep(10);
                    if(sudokuCoz1(a,12,21,12,21)){
                        sd();
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }

    static class Thread5 extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread5(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){

                try {
                    Thread.sleep(10);
                    if(sudokuCoz1(a,6,15,6,15)){
                        sd();
                    };
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }

    static class Thread2T extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread2T(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCozT(a,0,9,12,21)){
                        sd();
                    };
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }

    static class Thread3T extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread3T(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCozT(a,12,21,0,9)){
                        sd();
                    };
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }

    static class Thread4T extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread4T(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCozT(a,12,21,12,21)){
                        sd();
                    };
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }

        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }

    static class Thread5T extends Thread{
        public boolean running = true;
        private int[][] a;
        private List<Hamle> hamleler;
        private static int scs;
        public long baslangic, bitis;
        private int kare;
        private int[][] aaa;
        private static int scst;

        public Thread5T(int [][] a){
            this.a=a;
            hamleler = new ArrayList<>();
        }
        public void run(){
            while(running){
                try {

                    Thread.sleep(10);
                    if(sudokuCozT(a,6,15,6,15)){
                        sd();
                    };
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }
        }
        public void sd(){
            running = false;
        }
        public void hamleleriYazdir(int[][] a) {
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println(getName() + " Hamleleri");
            int i = 0;
            for (Hamle hamle : hamleler) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(hamle + "\t");
                i++;
            }
            System.out.println();
            System.out.println("Sudokunun son durumu: ");
            sudokuYazdir(a);
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            //  dosyayaHamleleriYaz();
        }
    }





    @Override
    public void run() {

    }


    private static void sudokuYazdir(int[][] sudoku) {

        for (int  i= 0;  i< 21; i++) {
            for (int k = 0; k < 21; k++) {
                System.out.print(sudoku[i][k]);
            }
            System.out.println(" ");
        }
        }


    private static boolean sayiSiradaMi(int[][] sudoku, int sayi, int row, int j, int jj) {
        for (int i = j; i < jj; i++) {
            if (sudoku[row][i] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean sayiKolondaMi(int[][] sudoku, int sayi, int column, int i,int ii) {
        for (int a = i; a < ii; a++) {
            if (sudoku[a][column] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean sayi3X3teMi(int[][] sudoku, int sayi, int row, int column) {
        int sayiKutuSira = row - row % 3;
        int sayiKutuKolon = column - column % 3;

        for (int i = sayiKutuSira; i < sayiKutuSira+3; i++) {
            for (int j = sayiKutuKolon; j < sayiKutuKolon+3; j++) {
                if (sudoku[i][j] == sayi) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sayiTekrarsizMi(int[][] sudoku, int sayi, int row, int column, int i, int ii, int j, int jj) {
        return !sayiSiradaMi(sudoku, sayi, row, j, jj) &&
                !sayiKolondaMi(sudoku, sayi, column, i, ii) &&
                !sayi3X3teMi(sudoku, sayi, row, column);
    }




    public static void thread5Yaz(String b) throws IOException {

             File dosya = new File("5ThreadHamleler.txt");
            FileWriter fw = new FileWriter(dosya,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(b);
            bw.close();

    }
    public static void thread10Yaz(String b) throws IOException {

        File dosya = new File("10ThreadHamleler.txt");
        FileWriter fw = new FileWriter(dosya,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(b);
        bw.close();

    }


    private static boolean sudokuCoz1(int[][] sudoku,int i,int ii,int j,int jj) {

        for (int row = i; row < ii; row++) {
            for (int column = j; column <  jj; column++) {

                if (sudoku[row][column] == 0) {

                    for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {

                        if (sayiTekrarsizMi(sudoku, numberToTry, row, column, i,ii,j,jj)) {
                            sudoku[row][column] = numberToTry;



                            if (sudokuCoz1(sudoku,i,ii,j,jj)) {
                                return true;
                            }
                            else {
                                sudoku[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean sayiSiradaMiT(int[][] sudoku, int sayi, int row, int j, int jj) {
        for (int i = j; i < jj; i++) {
            if (sudoku[row][i] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean sayiKolondaMiT(int[][] sudoku, int sayi, int column, int i,int ii) {
        for (int a = i; a < ii; a++) {
            if (sudoku[a][column] == sayi) {
                return true;
            }
        }
        return false;
    }

    private static boolean sayi3X3teMiT(int[][] sudoku, int sayi, int row, int column) {
        int sayiKutuSira = row - row % 3;
        int sayiKutuKolon = column - column % 3;

        for (int i = sayiKutuSira; i < sayiKutuSira+3; i++) {
            for (int j = sayiKutuKolon; j < sayiKutuKolon+3; j++) {
                if (sudoku[i][j] == sayi) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean sayiTekrarsizMiT(int[][] sudoku, int sayi, int row, int column, int i, int ii, int j, int jj) {
        return !sayiSiradaMiT(sudoku, sayi, row, j, jj) &&
                !sayiKolondaMiT(sudoku, sayi, column, i, ii) &&
                !sayi3X3teMiT(sudoku, sayi, row, column);
    }


    private static boolean sudokuCozT(int[][] sudoku, int i, int ii, int j, int jj) throws IOException {
        for (int row = (ii-1); row >= i; row--) {
            for (int column = (jj-1); column >=  j; column--) {

                if (sudoku[row][column] == 0) {

                    for (int numberToTry = 9; numberToTry >= 1; numberToTry--) {

                        if (sayiTekrarsizMiT(sudoku, numberToTry, row, column, i,ii,j,jj)) {
                            sudoku[row][column] = numberToTry;


                            if (sudokuCozT(sudoku,i,ii,j,jj)) {

                                return true;
                            }
                            else {
                                sudoku[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }


}
