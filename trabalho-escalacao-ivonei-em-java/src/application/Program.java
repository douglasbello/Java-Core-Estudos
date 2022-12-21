package application;
import entities.Jogador;

import java.io.*;
import java.util.*;

public class Program {
    public static void main (String[] args){
        Scanner input = null;
        List<Jogador> escalados = new ArrayList<>();
        List<Jogador> jogadores = new ArrayList<>();
        List<Jogador> reservas = new ArrayList<>();
        List<String> numeros = new ArrayList<>();
        String path = "C:\\Users\\napst\\IdeaProjects\\Escalacao\\src\\application\\convocados.txt";
        File arquivo = new File(path);
        try {
            input = new Scanner(arquivo);
            while (input.hasNextLine()) {
                String[] lista = input.nextLine().split(":");
                String numero = lista[0];
                String nome = lista[1];
                String posicao = lista[2];
                jogadores.add(new Jogador(numero,nome,posicao));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
        Menu(jogadores,escalados,reservas,numeros);
    }
    static void Escalar(List<Jogador> jogadores,List<Jogador> escalados,List<Jogador> reservas,List<String> numeros) {
        Scanner sc = new Scanner(System.in);
        while (escalados.size() < 11) {
            System.out.println("Digite o número do jogador escalado: ");
            String numeroEscalado = sc.nextLine();
            for (Jogador jogador : jogadores) {
                if (numeroEscalado.equals(jogador.getNumero())) {
                    jogador.setParticipouPartida(true);
                    escalados.add(jogador);
                    numeros.add(jogador.getNumero());
                }
            }
            for (Jogador jogador : jogadores) {
                for (String numero : numeros) {
                    if (!numero.equals(jogador.getNumero())) {
                        reservas.add(jogador);
                    }
                }
            }
        }

    }
    static void Substituir(List<Jogador> escalados,List<Jogador> reservas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do jogador a ser substituído: ");
        String substituido = sc.nextLine();
        System.out.println("Digite o número do jogador que vai entrar na partida: ");
        String substituto = sc.nextLine();
        for (Jogador escalado : escalados) {
            if (escalado.getNumero().equals(substituido)) {
                reservas.add(escalado);
                break;
            }
        }
        for (Jogador reserva : reservas) {
            if (reserva.getNumero().equals(substituto)) {
                reserva.setParticipouPartida(true);
                escalados.add(reserva);
                reservas.remove(reserva);
                break;
            }
        }
        ;
    }
    static void Expulsar(List<Jogador> escalados, List<Jogador> reservas) {
        Scanner sc = new Scanner(System.in);
        String expulso = sc.nextLine();
        System.out.println("Digite o número do jogador a ser expulso: ");
        for (Jogador escalado : escalados) {
            if (expulso.equals(escalado.getNumero())) {
                reservas.add(escalado);
                escalados.remove(escalado);
                escalado.setSituacao("EXPULSO");
            }

        }


    }
    static void ImprimirEscalacao(List<Jogador> escalados,List<Jogador> reservas) {
        Scanner filereader = null;
        File filee = new File("C:\\Users\\napst\\IdeaProjects\\Escalacao\\src\\application\\todosjogadores.txt");
        try {
            File arquivo = new File("C:\\Users\\napst\\IdeaProjects\\Escalacao\\src\\application\\todosjogadores.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }

        } catch (IOException io) {
            System.out.println("Um erro ocorreu.");
            io.printStackTrace();
        }
        try {
            FileWriter writter = new FileWriter("C:\\Users\\napst\\IdeaProjects\\Escalacao\\src\\application\\todosjogadores.txt");
            for (Jogador escalado : escalados) {
                writter.write(escalado.getNumero()+":"+escalado.getNomeJogador()+":"+escalado.getPosicao()+"\n");
            }
            for (Jogador reserva : reservas) {
                if (reserva.getParticipouPartida()) {
                    writter.write(reserva.getNumero()+":"+reserva.getNomeJogador()+":"+reserva.getPosicao()+"\n");
                }
            }
        } catch (IOException io2) {
            System.out.println("Erro no writter.");
            io2.printStackTrace();
        }
        try {
            filereader = new Scanner(filee);
            while (filereader.hasNextLine()) {
                System.out.println(filereader.nextLine());
            }
        } catch (IOException io4) {
            io4.printStackTrace();
        } finally {
            if (filereader != null ) {
                filereader.close();
            }
        }
        try {
            File file = new File("C:\\Users\\napst\\IdeaProjects\\Escalacao\\src\\application\\todosjogadores.txt");
            if (file.delete()) {
                System.out.println("Arquivo deletado. " + file);
            } else {
                System.out.println("Erro ao deletar arquivo.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void Menu(List<Jogador> jogadores,List<Jogador> escalados,List<Jogador> reservas,List<String> numeros) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==============================");
            System.out.println("            MENU");
            System.out.println("==============================");
            System.out.println("1- Ler escalação");
            System.out.println("2- Escalar time");
            System.out.println("3- Realizar substituição");
            System.out.println("4- Expulsão");
            System.out.println("5- Imprimir escalação");
            System.out.println("Escolha:");
            String escolha = sc.nextLine();
            if (escolha.equals("2")) {
                Escalar(jogadores,escalados,reservas,numeros);
            }
            if (escolha.equals("3")) {
                Substituir(escalados,reservas);
            }
            if (escolha.equals("4")) {
                Expulsar(escalados,reservas);
            }
            if (escolha.equals("5")) {
                ImprimirEscalacao(escalados,reservas);
                sc.close();
                break;
            }
        }
    }
}
