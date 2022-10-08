package ru.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tusk 1" + "\n");

        int[] mass1 = new int[]{1, 2, 3};
        double[] mass2 = {1.57, 7.654, 9.986};
        String[] mass3 = {"a", "b", "c"};

        System.out.println("Tusk 2" + "\n");

        for (int i = 0; i < mass1.length; i++) {
            if (i != mass1.length - 1) {
                System.out.print(mass1[i] + " , ");
            } else {
                System.out.println(mass1[i]);
            }
        }

            for (int j = 0; j < mass2.length; j++) {
                if (j != mass2.length - 1) {
                    System.out.print(mass2[j] + " , ");
                } else {
                    System.out.println(mass2[j]);
                }
            }
                for (int k = 0; k < mass3.length; k++) {
                    if (k != mass3.length - 1) {
                        System.out.print(mass3[k] + " , ");
                    } else {
                        System.out.println(mass3[k]);
                    }
                }

                System.out.println("\n" + "Tusk 3" + "\n");

                for (int i1 = mass1.length-1; i1 >=0 ; i1--) {
                    if (i1 != 0) {
                        System.out.print(mass1[i1] + " , ");
                    } else {
                        System.out.println(mass1[i1]);
                    }
                }
                for (int j1 = mass2.length-1; j1 >=0 ; j1--) {
                    if (j1 != 0) {
                        System.out.print(mass2[j1] + " , ");
                    } else {
                        System.out.println(mass2[j1]);
                    }
                }
                for (int k1 = mass3.length-1; k1 >=0 ; k1--) {
                    if (k1 != 0) {
                        System.out.print(mass3[k1] + " , ");
                    } else {
                        System.out.println(mass3[k1]);
                    }
                }

                System.out.println("\n" + "Tusk 4" + "\n");
                for (int n = 0; n <= mass1.length-1; n++) {
                    if (mass1[n] % 2 != 0) {
                        mass1[n] = mass1[n] + 1;
                    }
                }
                    for (int n1 = 0; n1 <= mass1.length-1; n1++) {
                        if (n1 != mass1.length - 1) {
                            System.out.print(mass1[n1] + " , ");
                        } else {
                            System.out.println(mass1[n1]);
                        }
                    }
                }

            }




