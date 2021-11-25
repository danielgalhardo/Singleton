package com.company;



import java.util.HashSet;
import java.util.Set;
// instancia utilizada para a criação de um único objeto do tipo Restaurante;
// Thread-safe;
// Não pode ser modificado utilizando reflection, caso tente irá lançar uma exceção por ser um objeto ENUM;
public enum RestauranteSingletonEnum {
    INSTANCE;
    private  Set<String> reservasDisponiveis;


         RestauranteSingletonEnum() {
            this.reservasDisponiveis = new HashSet<>();
            reservasDisponiveis.add("D1");
            reservasDisponiveis.add("D2");
        }

        public boolean realizaReserva(String reserva){
            return reservasDisponiveis.remove(reserva);
        }

        public static void reservas(String reserva){
            RestauranteSingletonEnum chef = RestauranteSingletonEnum.INSTANCE;
            System.out.println(chef.realizaReserva(reserva));
    }
    }
