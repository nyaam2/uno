package org.example;

import org.example.card.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("how many?");
        int n=sc.nextInt();
        Player players[]=new Player[n];
        for(int i=0;i<n;i++){
            players[i]=new Player();
        }
        Stack<Card>submitPile=new Stack<>();


        System.out.println("deck shuffle");

        List<Card> deck=new ArrayList<Card>();
        for(int i=1;i<=4;i++){
            deck.add(new GeneralCard("RED",i));
        }
        for(int i=1;i<=4;i++){
            deck.add(new GeneralCard("BLUE",i));
        }
        for(int i=1;i<=4;i++){
            deck.add(new GeneralCard("YELLOW",i));
        }
        for(int i=1;i<=4;i++){
            deck.add(new GeneralCard("GREEN",i));
        }
        for(int i=1;i<=4;i++){
            deck.add(new ReverseCard("GREEN"));
        }
        for(int i=0;i<=4;i++){
            deck.add(new DrawCard("GREEN",2));
        }
        for(int i=1;i<=4;i++){
            deck.add(new GeneralWild("GREEN"));
        }
        for(int i=1;i<=4;i++){
            deck.add(new SkipCard("GREEN"));
        }
        for(int i=1;i<=4;i++){
            deck.add(new WildCard("GREEN"));
        }

        Collections.shuffle(deck);

        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++) {
                players[i].hand.add(deck.get(0));
                deck.remove(0);
            }
        }
        submitPile.add(deck.get(0));
        deck.remove(0);

        int turn=0;
        boolean uno=false;
        boolean uno_penalty=false;
        boolean flow=true;

        while(true){
            System.out.print("top card : ");
            System.out.println(submitPile.peek());
            for(int i=0;i<n;i++){
                if(players[i].hand.size()==0){
                    System.out.println("끝");
                    return;
                }
            }
            System.out.println("card cnt");
            for(int i=0;i<n;i++){
                System.out.print(players[i].hand.size()+" ");

            }
            System.out.println();
            System.out.print("remain card : ");
            for(int i=0;i<players[turn].hand.size();i++){

                System.out.print(players[turn].hand.get(i)+" ");

            }

            System.out.println();
            if(uno_penalty){

            }
            else{
                System.out.println("what card do you want to neda?");

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String input=br.readLine();
                StringTokenizer st=new StringTokenizer(input,"/");


                    if(submitPile.peek().getColor().equals("ALL")){

                    }else{
                        int cnt=Integer.parseInt(st.nextToken())-1;
                        String type=st.nextToken();
                        if(submitPile.peek().getColor().equals(st.nextToken())){
                            if(type.equals("dc")){
                                String color=st.nextToken();
                                String num=st.nextToken();
                                submitPile.add(new DrawCard(color,Integer.parseInt(num)));
                            }else if(type.equals("gc")){
                                String color=st.nextToken();
                                String num=st.nextToken();
                                submitPile.add(new GeneralCard(color,Integer.parseInt(num)));
                            }
                            else if(type.equals("gw")){
                                String color=st.nextToken();
                                submitPile.add(new GeneralWild(color));
                            }
                            else if(type.equals("rc")){
                                String color=st.nextToken();
                                String num=st.nextToken();
                                submitPile.add(new ReverseCard(color));

                            }else if(type.equals("sc")){
                                String color=st.nextToken();
                                String num=st.nextToken();
                                submitPile.add(new SkipCard(color));
                            }
                            else if(type.equals("wc")){
                                String color=st.nextToken();
                                submitPile.add(new WildCard(color));
                            }
                        }
                        players[turn].hand.remove(cnt);
                    }
            }
            if(flow){
                if(turn==n-1) turn=0;
                else turn++;
            }
            else{
                if(turn==0) turn=n-1;
                else turn--;
            }





        }







    }


}