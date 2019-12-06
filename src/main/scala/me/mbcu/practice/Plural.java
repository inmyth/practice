package me.mbcu.practice;

import java.util.Scanner;


public class Plural {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while(sc.hasNext()){
            String in = sc.nextLine();
            String res = rec(in);
            System.out.println(res);
        }

    }
    /*
    ・末尾が s, sh, ch, o, x のいずれかである英単語の末尾に es を付ける
・末尾が f, fe のいずれかである英単語の末尾の f, fe を除き、末尾に ves を付ける
・末尾の1文字が y で、末尾から2文字目が a, i, u, e, o のいずれでもない英単語の末尾の y を除き、末尾に ies を付ける
・上のいずれの条件にも当てはまらない英単語の末尾には s を付ける
    */
    static String rec(String in){
        String res = null;
        int length = in.length();
        if (in.endsWith("s") || in.endsWith("sh") || in.endsWith("ch") || in.endsWith("o") || in.endsWith("x")){
            res = in + "es";
        }
        else if(in.endsWith("f")){
            res = in.substring(0, length - 1) + "ves";

        }
        else if(in.endsWith("fe")) {
            res = in.substring(0, length - 2) + "ves";
        }

        else if(in.endsWith("y")){
            char secFL = in.charAt(length - 2);

            if(secFL == 'a' || secFL == 'i' || secFL == 'u' || secFL == 'e' || secFL == 'o'){
                res = in + "s";
            }
            else {
                res = in.substring(0, length - 1) + "ies";
            }

        }
        else {
            res = in + "s";
        }
        return res;
    }
}
