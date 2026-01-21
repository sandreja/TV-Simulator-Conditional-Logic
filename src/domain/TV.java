package domain;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TV {
    Scanner scanner= new Scanner(System.in);
    private boolean status;
    private int jacina;
    private int broj;

    public void ukljuci() {
        this.status = true;
    }

    public void iskljuci() {
        this.status = false;
    }

    public int getJacina() {
        return jacina;
    }

    public void pojacajTon() {
        if (status == true && jacina < 10) {
            jacina++;
        } else if (status == true && jacina >= 10) {
            System.out.println("TV je vec pojacan do maksimuma");
        } else System.out.println("TV je iskljucen");

    }

    public void smanjiTon() {
        if (status == true && jacina > 0) {
            jacina--;
        } else if (status == true && jacina <= 0) {
            System.out.println("TV je vec smanjen do minimuma");
        } else System.out.println("TV je iskljucen");
    }
    public void mute() {
        if (status == true && jacina > 0) {
            jacina = 0;
        }
        else if(status == true && jacina == 0){
            System.out.println("TV je vec mutiran.");
        }
        else System.out.println("TV je iskljucen");
    }
    public void ispis() {
        if (status == true) {
            System.out.println("Trenutna jacina zvuka je: " + getJacina());
        }
        else System.out.println("TV je iskljucen");
    }
    public void pojacajTonZa(int x){
        if(status == true && jacina+x<=10){
            jacina += x;
            if(status == true && jacina+x>10){
                jacina = 10;
            }
            else System.out.println("TV je iskljucen");
        }
    }
    public void pojacajTonZaSkener(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Unesite za koliko zelite da pojacate");
        int x = scanner.nextInt();
        if(status == true && jacina<=10){
            jacina= jacina + x;
            if(status == true && jacina+x>10){
                jacina = 10;
                System.out.println("Maksimalna jacina je 10.");
            }
            else System.out.println("TV je iskljucen");
        }
    }

}

