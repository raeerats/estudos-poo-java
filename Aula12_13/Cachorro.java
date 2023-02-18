package Aula12_13;

public class Cachorro extends Lobo {

    public void reagir(String frase) {
        if(frase.equals("toma comida") || frase.equals("ola")){
            System.out.println("abanando rabo e latindo");
        }else{
            System.out.println("rosnando");
        }
    }
    public void reagir(int hora) {
        if(hora <12){
            System.out.println("abanando rabo");
        }else if(hora >= 18){
            System.out.println("ignorando");
        }else{
            System.out.println("abanando rabo e latindo");
        }

    }
    public void reagir(boolean dono) {
        if(dono){
            System.out.println("abanando rabo");
        }else{
            System.out.println("rosnando e latindo");
        }
    }
    public void reagir(int idade, double peso) {
        if(idade<5){
            if(peso<10) {
                System.out.println("abanando rabo");
            }else{
                System.out.println("latindo");
            }
        }else{
            if(peso<10){
                System.out.println("rosnando");
            }else{
                System.out.println("ignorando");
            }
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au au");
    }
}
