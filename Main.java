package Orchester;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Nastroj> nastrojList = new ArrayList<>();
        ArrayList<Hrac> hracList = new ArrayList<>();
        File f = new File("orchester.txt");

        try (Scanner reader = new Scanner(f, "UTF-8")) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] p = line.split(",");

                if (p[0].equals("S")) {
                    SlacikovyNastroj sln = new SlacikovyNastroj(
                            p[1],
                            Double.parseDouble(p[2]),
                            p[3],
                            Integer.parseInt(p[4]),
                            Integer.parseInt(p[5]),
                            p[6],
                            p[7]);
                    nastrojList.add(sln);
                } else if (p[0].equals("s")) {
                    StrunovyNastroj sn = new StrunovyNastroj(
                            p[1],
                            Double.parseDouble(p[2]),
                            p[3],
                            Integer.parseInt(p[4]),
                            Integer.parseInt(p[5]),
                            p[6]);
                    nastrojList.add(sn);
                } else if (p[0].equals("r")) {
                    RytmickyNastroj rn = new RytmickyNastroj(
                            p[1],
                            Double.parseDouble(p[2]),
                            p[3],
                            Integer.parseInt(p[4]),
                            Integer.parseInt(p[5]));
                    nastrojList.add(rn);
                } else if (p[0].equals("d")) {
                    DychovyNastroj dn = new DychovyNastroj(
                            p[1],
                            Double.parseDouble(p[2]),
                            p[3],
                            Integer.parseInt(p[4]),
                            Integer.parseInt(p[5]),
                            p[6]);
                    nastrojList.add(dn);
                } else if (p[0].equals("k")) {
                    KlavesovyNastroj kn = new KlavesovyNastroj(
                            p[1],
                            Double.parseDouble(p[2]),
                            p[3],
                            Integer.parseInt(p[4]),
                            Integer.parseInt(p[5]));
                    nastrojList.add(kn);
                } else if (p[0].equals("l")) {
                    Lod lod = new Lod(
                            p[1],
                            Double.parseDouble(p[2]),
                            p[3],
                            Integer.parseInt(p[4]),
                            p[5]);
                    nastrojList.add(lod);
                } else if (p[0].equals("u")) {
                    Hrac h = new Hrac(
                            p[1],
                            p[2],
                            p[3],
                            Double.parseDouble(p[4]));
                    hracList.add(h);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Menu.showMenu(nastrojList, hracList);

    }
}