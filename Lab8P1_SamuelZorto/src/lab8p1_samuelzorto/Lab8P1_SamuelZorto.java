package lab8p1_samuelzorto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab8P1_SamuelZorto {

    // merezco mi punto extra, venci a memo
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menunu();
    }

    public static void menunu() {
        Scanner entrada = new Scanner(System.in);
        boolean menu = true;

        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Ingrese el ejercicio que desea ejecutar: ");
            System.out.println("[1] Pocket Monsters");
            System.out.println("[2] Dc vrs Marvel");
            System.out.println("[3] Salir");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int menunu = entrada.nextInt();
            switch (menunu) {
                case 1:
                    PKMN();
                    break;
                case 2:
                    sh();
                    break;
                default:
                    menu = false;
                    break;
            }
        } while (menu);
    }

    public static void PKMN() {
        pokemon pkmn1 = new pokemon("", 0, 0, 0);
        pokemon pkmn2 = new pokemon("", 0, 0, 0);
        pokemon pkmn3 = new pokemon("", 0, 0, 0);
        pokemon pkmn4 = new pokemon("", 0, 0, 0);
        pokemon pkmn5 = new pokemon("", 0, 0, 0);
        pokemon pkmn6 = new pokemon("", 0, 0, 0);
        Scanner entrad = new Scanner(System.in);
        Scanner entra = new Scanner(System.in);
        ArrayList<pokemon> poke = new ArrayList<pokemon>();
        dame(pkmn1, pkmn2, pkmn3, pkmn4, pkmn5, pkmn6, poke);
        System.out.println("");
        for (pokemon i : poke) {
            System.out.println(i.getNomb() + "  Vida: " + i.getHitP() + "  Ataque: " + i.getAtk() + "  Suerte: " + i.getLck());
        }
        int ronda = 1;
        boolean gana = true;
        do {
            if (pkmn1.hitP > 0) {
                if (pkmn4.hitP > 0) {
                    if (pkmn1.lck > pkmn4.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn1.nomb + " ataca a Primero: " + pkmn1.hitP + "puntos de vida y " + pkmn1.lck + " de suerte");
                        System.out.println(pkmn4.nomb + " ataca a Segundo: " + pkmn4.hitP + "puntos de vida y " + pkmn4.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn1.hitP -= pkmn4.atk;
                        pkmn4.hitP -= pkmn1.atk;
                        System.out.println(pkmn1.nomb + " tiene " + pkmn1.hitP + " restantes");
                        System.out.println(pkmn4.nomb + " tiene " + pkmn4.hitP + " restantes");
                    } else if (pkmn1.lck < pkmn4.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn4.nomb + " ataca a Primero: " + pkmn4.hitP + "puntos de vida y " + pkmn4.lck + " de suerte");
                        System.out.println(pkmn1.nomb + " ataca a Segundo: " + pkmn1.hitP + "puntos de vida y " + pkmn1.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn1.hitP -= pkmn4.atk;
                        pkmn4.hitP -= pkmn1.atk;
                        System.out.println(pkmn4.nomb + " tiene " + pkmn4.hitP + " restantes");
                        System.out.println(pkmn1.nomb + " tiene " + pkmn1.hitP + " restantes");
                    }
                } else if (pkmn5.hitP > 0) {
                    if (pkmn1.lck > pkmn5.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn1.nomb + " ataca a Primero: " + pkmn1.hitP + "puntos de vida y " + pkmn1.lck + " de suerte");
                        System.out.println(pkmn5.nomb + " ataca a Segundo: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn1.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn1.atk;
                        System.out.println(pkmn1.nomb + " tiene " + pkmn1.hitP + " restantes");
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                    } else if (pkmn1.lck < pkmn5.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn5.nomb + " ataca a Primero: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println(pkmn1.nomb + " ataca a Segundo: " + pkmn1.hitP + "puntos de vida y " + pkmn1.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn1.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn1.atk;
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                        System.out.println(pkmn1.nomb + " tiene " + pkmn1.hitP + " restantes");
                    }
                } else if (pkmn6.hitP > 0) {
                    if (pkmn1.lck > pkmn6.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn1.nomb + " ataca a Primero: " + pkmn1.hitP + "puntos de vida y " + pkmn1.lck + " de suerte");
                        System.out.println(pkmn6.nomb + " ataca a Segundo: " + pkmn6.hitP + "puntos de vida y " + pkmn6.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn1.hitP -= pkmn6.atk;
                        pkmn6.hitP -= pkmn1.atk;
                        System.out.println(pkmn1.nomb + " tiene " + pkmn1.hitP + " restantes");
                        System.out.println(pkmn6.nomb + " tiene " + pkmn6.hitP + " restantes");
                    } else if (pkmn1.lck < pkmn6.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn5.nomb + " ataca a Primero: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println(pkmn1.nomb + " ataca a Segundo: " + pkmn1.hitP + "puntos de vida y " + pkmn1.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn1.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn1.atk;
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                        System.out.println(pkmn1.nomb + " tiene " + pkmn1.hitP + " restantes");
                    }
                } else {
                    gana = false;
                }
            } else if (pkmn2.hitP > 0) {
                if (pkmn4.hitP > 0) {
                    if (pkmn2.lck > pkmn4.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn2.nomb + " ataca a Primero: " + pkmn2.hitP + "puntos de vida y " + pkmn2.lck + " de suerte");
                        System.out.println(pkmn4.nomb + " ataca a Segundo: " + pkmn4.hitP + "puntos de vida y " + pkmn4.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn2.hitP -= pkmn4.atk;
                        pkmn4.hitP -= pkmn2.atk;
                        System.out.println(pkmn2.nomb + " tiene " + pkmn2.hitP + " restantes");
                        System.out.println(pkmn4.nomb + " tiene " + pkmn4.hitP + " restantes");
                    } else if (pkmn2.lck < pkmn4.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn4.nomb + " ataca a Primero: " + pkmn4.hitP + "puntos de vida y " + pkmn4.lck + " de suerte");
                        System.out.println(pkmn2.nomb + " ataca a Segundo: " + pkmn2.hitP + "puntos de vida y " + pkmn2.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn2.hitP -= pkmn4.atk;
                        pkmn4.hitP -= pkmn2.atk;
                        System.out.println(pkmn4.nomb + " tiene " + pkmn4.hitP + " restantes");
                        System.out.println(pkmn2.nomb + " tiene " + pkmn2.hitP + " restantes");
                    }
                } else if (pkmn5.hitP > 0) {
                    if (pkmn2.lck > pkmn5.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn2.nomb + " ataca a Primero: " + pkmn2.hitP + "puntos de vida y " + pkmn2.lck + " de suerte");
                        System.out.println(pkmn5.nomb + " ataca a Segundo: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn2.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn2.atk;
                        System.out.println(pkmn2.nomb + " tiene " + pkmn2.hitP + " restantes");
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                    } else if (pkmn2.lck < pkmn5.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn5.nomb + " ataca a Primero: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println(pkmn2.nomb + " ataca a Segundo: " + pkmn2.hitP + "puntos de vida y " + pkmn2.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn2.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn2.atk;
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                        System.out.println(pkmn2.nomb + " tiene " + pkmn2.hitP + " restantes");
                    }
                } else if (pkmn6.hitP > 0) {
                    if (pkmn2.lck > pkmn6.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn2.nomb + " ataca a Primero: " + pkmn2.hitP + "puntos de vida y " + pkmn2.lck + " de suerte");
                        System.out.println(pkmn6.nomb + " ataca a Segundo: " + pkmn6.hitP + "puntos de vida y " + pkmn6.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn2.hitP -= pkmn6.atk;
                        pkmn6.hitP -= pkmn2.atk;
                        System.out.println(pkmn2.nomb + " tiene " + pkmn2.hitP + " restantes");
                        System.out.println(pkmn6.nomb + " tiene " + pkmn6.hitP + " restantes");
                    } else if (pkmn2.lck < pkmn6.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn6.nomb + " ataca a Primero: " + pkmn6.hitP + "puntos de vida y " + pkmn6.lck + " de suerte");
                        System.out.println(pkmn2.nomb + " ataca a Segundo: " + pkmn2.hitP + "puntos de vida y " + pkmn2.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn2.hitP -= pkmn6.atk;
                        pkmn6.hitP -= pkmn2.atk;
                        System.out.println(pkmn6.nomb + " tiene " + pkmn6.hitP + " restantes");
                        System.out.println(pkmn2.nomb + " tiene " + pkmn2.hitP + " restantes");
                    }
                } else {
                    gana = false;
                }
            } else if (pkmn3.hitP > 0) {
                if (pkmn4.hitP > 0) {
                    if (pkmn3.lck > pkmn4.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn3.nomb + " ataca a Primero: " + pkmn3.hitP + "puntos de vida y " + pkmn3.lck + " de suerte");
                        System.out.println(pkmn4.nomb + " ataca a Segundo: " + pkmn4.hitP + "puntos de vida y " + pkmn4.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn3.hitP -= pkmn4.atk;
                        pkmn4.hitP -= pkmn3.atk;
                        System.out.println(pkmn3.nomb + " tiene " + pkmn3.hitP + " restantes");
                        System.out.println(pkmn4.nomb + " tiene " + pkmn4.hitP + " restantes");
                    } else if (pkmn3.lck < pkmn4.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn4.nomb + " ataca a Primero: " + pkmn4.hitP + "puntos de vida y " + pkmn4.lck + " de suerte");
                        System.out.println(pkmn3.nomb + " ataca a Segundo: " + pkmn3.hitP + "puntos de vida y " + pkmn3.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn3.hitP -= pkmn4.atk;
                        pkmn4.hitP -= pkmn3.atk;
                        System.out.println(pkmn4.nomb + " tiene " + pkmn4.hitP + " restantes");
                        System.out.println(pkmn3.nomb + " tiene " + pkmn3.hitP + " restantes");
                    }
                } else if (pkmn5.hitP > 0) {
                    if (pkmn3.lck > pkmn5.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn3.nomb + " ataca a Primero: " + pkmn3.hitP + "puntos de vida y " + pkmn3.lck + " de suerte");
                        System.out.println(pkmn5.nomb + " ataca a Segundo: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn3.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn3.atk;
                        System.out.println(pkmn3.nomb + " tiene " + pkmn3.hitP + " restantes");
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                    } else if (pkmn3.lck < pkmn5.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn5.nomb + " ataca a Primero: " + pkmn5.hitP + "puntos de vida y " + pkmn5.lck + " de suerte");
                        System.out.println(pkmn3.nomb + " ataca a Segundo: " + pkmn3.hitP + "puntos de vida y " + pkmn3.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn3.hitP -= pkmn5.atk;
                        pkmn5.hitP -= pkmn3.atk;
                        System.out.println(pkmn5.nomb + " tiene " + pkmn5.hitP + " restantes");
                        System.out.println(pkmn3.nomb + " tiene " + pkmn3.hitP + " restantes");
                    }
                } else if (pkmn6.hitP > 0) {
                    if (pkmn3.lck > pkmn6.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn3.nomb + " ataca a Primero: " + pkmn3.hitP + "puntos de vida y " + pkmn3.lck + " de suerte");
                        System.out.println(pkmn6.nomb + " ataca a Segundo: " + pkmn6.hitP + "puntos de vida y " + pkmn6.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn3.hitP -= pkmn6.atk;
                        pkmn6.hitP -= pkmn3.atk;
                        System.out.println(pkmn3.nomb + " tiene " + pkmn3.hitP + " restantes");
                        System.out.println(pkmn6.nomb + " tiene " + pkmn6.hitP + " restantes");
                    } else if (pkmn3.lck < pkmn6.lck) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Ronda ? ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println(pkmn6.nomb + " ataca a Primero: " + pkmn6.hitP + "puntos de vida y " + pkmn6.lck + " de suerte");
                        System.out.println(pkmn3.nomb + " ataca a Segundo: " + pkmn3.hitP + "puntos de vida y " + pkmn3.lck + " de suerte");
                        System.out.println("** Puntos Restantes **");
                        pkmn3.hitP -= pkmn6.atk;
                        pkmn6.hitP -= pkmn3.atk;
                        System.out.println(pkmn6.nomb + " tiene " + pkmn6.hitP + " restantes");
                        System.out.println(pkmn3.nomb + " tiene " + pkmn3.hitP + " restantes");
                    } else {
                        gana = false;
                    }
                } else {

                }

            }
        } while (gana);
        if (gana == true) {
            System.out.println("GANO 1er JUGADOR");
        } else {
            System.out.println("GANO 2do JUGADOR");
        }
    }

    public static ArrayList dame(pokemon pkmn1, pokemon pkmn2, pokemon pkmn3, pokemon pkmn4, pokemon pkmn5, pokemon pkmn6, ArrayList poke) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrad = new Scanner(System.in);
        char resp1 = 's';
        char resp2 = 's';
        int cont1 = 0;
        int cont2 = 0;
        System.out.println("Jugador 1 ingresa sus pokemones");
        System.out.println("");
        do {
            if (cont1 == 0) {
                System.out.print("Agregue a un pokemon: ");
                String nomb = entrada.nextLine();
                pkmn1.setNomb(nomb);
                System.out.print("Agregue sus puntos de vida (debe ser 300 o menos): ");
                int hitP;
                do {
                    hitP = entrad.nextInt();
                    pkmn1.setHitP(hitP);
                    if (hitP >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (hitP >= 300);

                System.out.print("Agregue su poder de ataque (debe ser 300 o menos): ");
                int atk;
                do {
                    atk = entrad.nextInt();
                    pkmn1.setAtk(atk);
                    if (atk >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (atk >= 300);
                int lck = new Random().nextInt((5 - 1) + 1) + 1;
                pkmn1.setLck(lck);
                poke.add(pkmn1);
                System.out.print("Desea seguir ingresando mas pokemones[s/n]: ?");
                resp1 = entrad.next().charAt(0);
                if (resp1 == 'S' || resp1 == 's') {
                    cont1 += 1;
                } else {
                    resp1 = 'n';
                }
            } else if (cont1 == 1) {
                System.out.print("Agregue a un pokemon: ");
                String nomb = entrada.nextLine();
                pkmn2.setNomb(nomb);
                System.out.print("Agregue sus puntos de vida (debe ser 300 o menos): ");
                int hitP;
                do {
                    hitP = entrad.nextInt();
                    pkmn2.setHitP(hitP);
                    if (hitP >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (hitP >= 300);

                System.out.print("Agregue su poder de ataque (debe ser 300 o menos): ");
                int atk;
                do {
                    atk = entrad.nextInt();
                    pkmn2.setAtk(atk);
                    if (atk >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (atk >= 300);
                int lck = new Random().nextInt((5 - 1) + 1) + 1;
                pkmn2.setLck(lck);
                poke.add(pkmn2);
                System.out.print("Desea seguir ingresando mas pokemones[s/n]: ?");
                resp1 = entrad.next().charAt(0);
                if (resp1 == 'S' || resp1 == 's') {
                    cont1 += 1;
                } else {
                    resp1 = 'n';
                }
            } else if (cont1 == 2) {
                System.out.print("Agregue a un pokemon: ");
                String nomb = entrada.nextLine();
                pkmn3.setNomb(nomb);
                System.out.print("Agregue sus puntos de vida (debe ser 300 o menos): ");
                int hitP;
                do {
                    hitP = entrad.nextInt();
                    pkmn3.setHitP(hitP);
                    if (hitP >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (hitP >= 300);

                System.out.print("Agregue su poder de ataque (debe ser 300 o menos): ");
                int atk;
                do {
                    atk = entrad.nextInt();
                    pkmn3.setAtk(atk);
                    if (atk >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (atk >= 300);
                int lck = new Random().nextInt((5 - 1) + 1) + 1;
                pkmn3.setLck(lck);
                poke.add(pkmn3);
                System.out.print("Desea seguir ingresando mas pokemones[s/n]: ?");
                resp1 = entrad.next().charAt(0);
                if (resp1 == 'S' || resp1 == 's') {
                    cont1 += 1;
                } else {
                    resp1 = 'n';
                }
            } else {
                resp1 = 'n';
            }
        } while (resp1 == 's' || resp1 == 'S');
        System.out.println("Jugador 2 ingresa sus pokemones");
        System.out.println("");
        do {
            if (cont2 == 0) {
                System.out.print("Agregue a un pokemon: ");
                String nomb = entrada.nextLine();
                pkmn4.setNomb(nomb);
                System.out.print("Agregue sus puntos de vida (debe ser 300 o menos): ");
                int hitP;
                do {
                    hitP = entrad.nextInt();
                    pkmn4.setHitP(hitP);
                    if (hitP >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (hitP >= 300);

                System.out.print("Agregue su poder de ataque (debe ser 300 o menos): ");
                int atk;
                do {
                    atk = entrad.nextInt();
                    pkmn4.setAtk(atk);
                    if (atk >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (atk >= 300);
                int lck = new Random().nextInt((5 - 1) + 1) + 1;
                pkmn4.setLck(lck);
                poke.add(pkmn4);
                System.out.print("Desea seguir ingresando mas pokemones[s/n]: ?");
                resp2 = entrad.next().charAt(0);
                if (resp2 == 'S' || resp2 == 's') {
                    cont2 += 1;
                } else {
                    resp2 = 'n';
                }
            } else if (cont2 == 1) {
                System.out.print("Agregue a un pokemon: ");
                String nomb = entrada.nextLine();
                pkmn2.setNomb(nomb);
                System.out.print("Agregue sus puntos de vida (debe ser 300 o menos): ");
                int hitP;
                do {
                    hitP = entrad.nextInt();
                    pkmn5.setHitP(hitP);
                    if (hitP >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (hitP >= 300);

                System.out.print("Agregue su poder de ataque (debe ser 300 o menos): ");
                int atk;
                do {
                    atk = entrad.nextInt();
                    pkmn5.setAtk(atk);
                    if (atk >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (atk >= 300);
                int lck = new Random().nextInt((5 - 1) + 1) + 1;
                pkmn5.setLck(lck);
                poke.add(pkmn5);
                System.out.print("Desea seguir ingresando mas pokemones[s/n]: ?");
                resp2 = entrad.next().charAt(0);
                if (resp2 == 'S' || resp2 == 's') {
                    cont2 += 1;
                } else {
                    resp2 = 'n';
                }
            } else if (cont2 == 2) {
                System.out.print("Agregue a un pokemon: ");
                String nomb = entrada.nextLine();
                pkmn6.setNomb(nomb);
                System.out.print("Agregue sus puntos de vida (debe ser 300 o menos): ");
                int hitP;
                do {
                    hitP = entrad.nextInt();
                    pkmn6.setHitP(hitP);
                    if (hitP >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (hitP >= 300);

                System.out.print("Agregue su poder de ataque (debe ser 300 o menos): ");
                int atk;
                do {
                    atk = entrad.nextInt();
                    pkmn6.setAtk(atk);
                    if (atk >= 300) {
                        System.out.println("El poder de ataque debe ser menor a 300!!");
                    }
                } while (atk >= 300);
                int lck = new Random().nextInt((5 - 1) + 1) + 1;
                pkmn6.setLck(lck);
                poke.add(pkmn6);
                System.out.print("Desea seguir ingresando mas pokemones[s/n]: ?");
                resp2 = entrad.next().charAt(0);
                if (resp2 == 'S' || resp2 == 's') {
                    cont2 += 1;
                } else {
                    resp2 = 'n';
                }
            } else {
                resp2 = 'n';
            }
        } while (resp2 == 's' || resp2 == 'S');
        return (poke);

    }

    public static void sh() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<sh> marvel = new ArrayList<sh>();
        ArrayList<sh> dc = new ArrayList<sh>();

        marvel.add(new sh("Scarlet Witch", "Wanda Maximoff", "Sokovia", "Marvel"));
        marvel.add(new sh("Hawkeye", "Clint Barton", "Waverly", "Marvel"));
        marvel.add(new sh("Hawkeye", "Clint Barton", "Waverly", "Marvel"));
        marvel.add(new sh("Winter Soldier", "Bucky Barnes", "Shelbyville", "Marvel"));
        marvel.add(new sh("Falcon", "Sam Wilson", "Delacroix", "Marvel"));
        marvel.add(new sh("Capitan America", "Steve Rogers", "Brooklyn", "Marvel"));
        marvel.add(new sh("Iron Man", "Tony Stark", "Manhattan", "Marvel"));
        marvel.add(new sh("Spider Man", "Peter Parker", "Forest Hills", "Marvel"));
        marvel.add(new sh("Black Widow", "Natasha Romanoff", "Stalingrad", "Marvel"));
        marvel.add(new sh("Black Panther", "King T'Challa", "Wakanda", "Marvel"));
        dc.add(new sh("Batman", "Bruce Wayne", "Gotham", "DC"));
        dc.add(new sh("Superman", "Kal-El", "Kryptonopolis", "DC"));
        dc.add(new sh("El Flash", "Barry Allen", "Central City", "DC"));
        dc.add(new sh("Cyborg", "Victor Stone", "Gotham", "DC"));
        dc.add(new sh("Linterna Verde", "Guy Gardner", "Baltimore", "DC"));
        dc.add(new sh("Supergirl", "Kara Zor-El", "Kryptonopolis", "DC"));
        dc.add(new sh("Shazam", "Billy Batson", "Zumbrota", "DC"));
        dc.add(new sh("Batgirl", "Barbara Gordon", "Gotham", "DC"));
        dc.add(new sh("Blue Beetle", "Ted Kord", "El Paso", "DC"));
        dc.add(new sh("Robin", "Damiam Wayne", "Gotham", "DC"));
        boolean nnn = true;
        String m = "Marvel";
        String mm = "DC";
        do {
            System.out.print("Buscar o Agregar: ");
            String ala = entrada.nextLine();
            if(ala.equals("Agregar")){
                System.out.print("Ingrese el nombre de heroe: ");
                String nombre = entrada.nextLine();
                System.out.print("Ingrese el nombre real del heroe: ");
                String nomb = entrada.nextLine();
                System.out.print("Ingrese la ciudad de donde vienen: ");
                String ciudad = entrada.nextLine();
                System.out.print("Ingrese la franquisia: ");
                String Franquisia = entrada.nextLine();
                if(Franquisia.equals(mm)){
                    dc.add(new sh(nombre, nomb, ciudad, Franquisia));
                }else if(Franquisia.equals(m)){
                    marvel.add(new sh(nombre, nomb, ciudad, Franquisia));
                }
            }else if(ala.equals("Buscar")){
                System.out.print("Ingrese un nombre: ");
                String nombre = entrada.nextLine();
                for (sh object : dc) {
                    if(object.getNomb().equals(nombre)){
                        System.out.println("Nombre de super héroe: " + object.getNomb());
                        System.out.println("Nombre real: " + object.getNombreal());
                        System.out.println("Ciudad de origen: " + object.getCiudad());
                        System.out.println("Franquicia: " + object.getNose());
                        System.out.println("");
                    }
                }
            }else{
                nnn = false;
            }
        }while(nnn);
    }
}
